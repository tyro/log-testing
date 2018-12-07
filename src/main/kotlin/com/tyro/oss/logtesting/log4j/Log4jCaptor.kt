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
package com.tyro.oss.logtesting.log4j

import com.tyro.oss.logtesting.LogCaptor
import org.apache.log4j.AppenderSkeleton
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.apache.log4j.spi.LoggingEvent
import org.junit.jupiter.api.extension.ExtensionContext
import kotlin.reflect.KClass

class Log4jCaptor : LogCaptor<LoggingEvent> {

    private val logger: Logger
    private lateinit var appender: CapturingAppender

    constructor(loggerClass: KClass<*>) {
        logger = LogManager.getLogger(loggerClass.java)
    }

    constructor(loggerClass: Class<*>) {
        logger = LogManager.getLogger(loggerClass)
    }

    constructor(loggerName: String) {
        logger = LogManager.getLogger(loggerName)
    }

    override fun beforeEach(context: ExtensionContext?) {
        appender = CapturingAppender()
        logger.addAppender(appender)
    }

    override fun afterEach(context: ExtensionContext?) {
        logger.removeAppender(appender)
    }

    override val events: MutableList<LoggingEvent>
        get() = appender.events

    private class CapturingAppender : AppenderSkeleton() {

        val events = ArrayList<LoggingEvent>()

        override fun append(event: LoggingEvent) {
            events.add(event)
        }

        override fun close() {}

        override fun requiresLayout(): Boolean {
            return false
        }
    }
}
