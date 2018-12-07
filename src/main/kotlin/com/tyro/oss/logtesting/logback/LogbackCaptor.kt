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
package com.tyro.oss.logtesting.logback

import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.AppenderBase
import com.tyro.oss.logtesting.LogCaptor
import org.junit.jupiter.api.extension.ExtensionContext
import org.slf4j.LoggerFactory
import kotlin.reflect.KClass

class LogbackCaptor : LogCaptor<ILoggingEvent> {

    private val logger: Logger
    private lateinit var appender: CapturingAppender

    constructor(loggerClass: KClass<*>) {
        logger = LoggerFactory.getLogger(loggerClass.java) as Logger
    }

    constructor(loggerClass: Class<*>) {
        logger = LoggerFactory.getLogger(loggerClass) as Logger
    }

    constructor(loggerName: String) {
        logger = LoggerFactory.getLogger(loggerName) as Logger
    }

    override fun beforeEach(context: ExtensionContext?) {
        appender = CapturingAppender()
        appender.start()
        logger.addAppender(appender)
    }

    override fun afterEach(context: ExtensionContext?) {
        logger.detachAppender(appender)
    }

    override val events: MutableList<ILoggingEvent>
        get() = appender.events

    private class CapturingAppender : AppenderBase<ILoggingEvent>() {

        val events = ArrayList<ILoggingEvent>()

        override fun append(event: ILoggingEvent) {
            events.add(event)
        }
    }
}
