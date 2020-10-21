/*
 * Copyright 2018 Tyro Payments Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tyro.oss.logtesting.log4j2

import com.tyro.oss.logtesting.LogCaptor
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.core.LogEvent
import org.apache.logging.log4j.core.Logger
import org.apache.logging.log4j.core.appender.AbstractAppender
import org.apache.logging.log4j.core.config.Property.EMPTY_ARRAY
import org.junit.jupiter.api.extension.ExtensionContext
import java.util.*
import kotlin.reflect.KClass

class Log4j2Captor : LogCaptor<LogEvent> {

    private val logger: Logger
    private lateinit var appender: CapturingAppender
    private lateinit var previousLevel: Level

    constructor(loggerClass: KClass<*>) {
        logger = LogManager.getLogger(loggerClass.java) as Logger
    }

    constructor(loggerClass: Class<*>) {
        logger = LogManager.getLogger(loggerClass) as Logger
    }

    constructor(loggerName: String) {
        logger = LogManager.getLogger(loggerName) as Logger
    }

    override fun beforeEach(context: ExtensionContext?) {
        previousLevel = logger.level
        appender = CapturingAppender(this.javaClass.simpleName)
        appender.start()
        logger.addAppender(appender)
        logger.level = Level.ALL
    }

    override fun afterEach(context: ExtensionContext?) {
        logger.level = previousLevel
        logger.removeAppender(appender)
        appender.stop()
    }

    override val events: MutableList<LogEvent>
        get() = appender.events

    private class CapturingAppender(name: String) : AbstractAppender(name, null, null, false, EMPTY_ARRAY) {

        val events = LinkedList<LogEvent>()

        override fun append(event: LogEvent) {
            events.add(event.toImmutable())
        }
    }
}
