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
package com.tyro.oss.logtesting.junit4.log4j

import com.tyro.oss.logtesting.LogAssert
import com.tyro.oss.logtesting.formatLogMessage
import org.apache.log4j.Level
import org.apache.log4j.spi.LoggingEvent
import org.assertj.core.error.ShouldContainCharSequence.shouldContain
import org.assertj.core.error.ShouldNotContainCharSequence.shouldNotContain
import org.assertj.core.util.Objects.areEqual
import kotlin.reflect.KClass

class Log4jAssert(actual: List<LoggingEvent>) : LogAssert<Log4jAssert, Level, LoggingEvent>(actual) {

    override fun hasInfo(): Log4jAssert =
            hasEvent(Level.INFO)

    override fun hasInfo(predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasEvent(Level.INFO, predicate)

    override fun hasInfo(message: String): Log4jAssert =
            hasEvent(Level.INFO, message)

    override fun hasInfo(message: String, throwable: Throwable): Log4jAssert =
            hasEvent(Level.INFO, message, throwable)

    override fun hasInfo(message: String, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEvent(Level.INFO, message, throwableClass)

    override fun hasInfo(message: String, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEvent(Level.INFO, message, throwableClass)

    override fun hasInfoContaining(vararg messages: String): Log4jAssert =
            hasEventContaining(Level.INFO, *messages)

    override fun hasInfoMatching(regex: Regex): Log4jAssert =
            hasEventMatching(Level.INFO, regex)

    override fun hasInfoMatching(regex: Regex, throwable: Throwable): Log4jAssert =
            hasEventMatching(Level.INFO, regex, throwable)

    override fun hasInfoMatching(regex: Regex, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEventMatching(Level.INFO, regex, throwableClass)

    override fun hasInfoMatching(regex: Regex, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEventMatching(Level.INFO, regex, throwableClass)

    override fun hasNoInfo(): Log4jAssert =
            hasNoEvent(Level.INFO)

    override fun hasNoInfo(predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasNoEvent(Level.INFO, predicate)

    override fun hasNoInfo(message: String): Log4jAssert =
            hasNoEvent(Level.INFO, message)

    override fun hasNoInfoContaining(vararg messages: String): Log4jAssert =
            hasNoEventContaining(Level.INFO, *messages)

    override fun hasNoInfoMatching(regex: Regex): Log4jAssert =
            hasNoEventMatching(Level.INFO, regex)

    override fun hasWarn(): Log4jAssert =
            hasEvent(Level.WARN)

    override fun hasWarn(predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasEvent(Level.WARN, predicate)

    override fun hasWarn(message: String): Log4jAssert =
            hasEvent(Level.WARN, message)

    override fun hasWarn(message: String, throwable: Throwable): Log4jAssert =
            hasEvent(Level.WARN, message, throwable)

    override fun hasWarn(message: String, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEvent(Level.WARN, message, throwableClass)

    override fun hasWarn(message: String, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEvent(Level.WARN, message, throwableClass)

    override fun hasWarnContaining(vararg messages: String): Log4jAssert =
            hasEventContaining(Level.WARN, *messages)

    override fun hasWarnMatching(regex: Regex): Log4jAssert =
            hasEventMatching(Level.WARN, regex)

    override fun hasWarnMatching(regex: Regex, throwable: Throwable): Log4jAssert =
            hasEventMatching(Level.WARN, regex, throwable)

    override fun hasWarnMatching(regex: Regex, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEventMatching(Level.WARN, regex, throwableClass)

    override fun hasWarnMatching(regex: Regex, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEventMatching(Level.WARN, regex, throwableClass)

    override fun hasNoWarn(): Log4jAssert =
            hasNoEvent(Level.WARN)

    override fun hasNoWarn(predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasNoEvent(Level.WARN, predicate)

    override fun hasNoWarn(message: String): Log4jAssert =
            hasNoEvent(Level.WARN, message)

    override fun hasNoWarnContaining(vararg messages: String): Log4jAssert =
            hasNoEventContaining(Level.WARN, *messages)

    override fun hasNoWarnMatching(regex: Regex): Log4jAssert =
            hasNoEventMatching(Level.WARN, regex)

    override fun hasError(): Log4jAssert =
            hasEvent(Level.ERROR)

    override fun hasError(predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasEvent(Level.ERROR, predicate)

    override fun hasError(message: String): Log4jAssert =
            hasEvent(Level.ERROR, message)

    override fun hasError(message: String, throwable: Throwable): Log4jAssert =
            hasEvent(Level.ERROR, message, throwable)

    override fun hasError(message: String, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEvent(Level.ERROR, message, throwableClass)

    override fun hasError(message: String, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEvent(Level.ERROR, message, throwableClass.java)

    override fun hasErrorContaining(vararg messages: String): Log4jAssert =
            hasEventContaining(Level.ERROR, *messages)

    override fun hasErrorMatching(regex: Regex): Log4jAssert =
            hasEventMatching(Level.ERROR, regex)

    override fun hasErrorMatching(regex: Regex, throwable: Throwable): Log4jAssert =
            hasEventMatching(Level.ERROR, regex, throwable)

    override fun hasErrorMatching(regex: Regex, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEventMatching(Level.ERROR, regex, throwableClass)

    override fun hasErrorMatching(regex: Regex, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEventMatching(Level.ERROR, regex, throwableClass.java)

    override fun hasNoError(): Log4jAssert =
            hasNoEvent(Level.ERROR)

    override fun hasNoError(predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasNoEvent(Level.ERROR, predicate)

    override fun hasNoError(message: String): Log4jAssert =
            hasNoEvent(Level.ERROR, message)

    override fun hasNoErrorContaining(vararg messages: String): Log4jAssert =
            hasNoEventContaining(Level.ERROR, *messages)

    override fun hasNoErrorMatching(regex: Regex): Log4jAssert =
            hasNoEventMatching(Level.ERROR, regex)

    override fun hasEvent(level: Level): Log4jAssert =
            hasEvent(formatLogMessage(level),
                withLevel(level))

    override fun hasEvent(level: Level, predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasEvent("$level event matching given predicate") {
                withLevel(level)(it)
                    && predicate(it) }

    override fun hasEvent(level: Level, message: String): Log4jAssert =
            hasEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it) }

    override fun hasEvent(level: Level, message: String, throwable: Throwable): Log4jAssert =
            hasEvent(formatLogMessage(level, message, throwable)) {
                withLevel(level)(it)
                    && withMessage(message)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEvent(formatLogMessage(level, message, throwableClass = throwableClass)) {
                withLevel(level)(it)
                    && withMessage(message)(it)
                    && withThrowableClass(throwableClass)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEvent(level, message, throwableClass.java)

    override fun hasEventContaining(level: Level, vararg messages: String): Log4jAssert =
            hasEvent("$level message containing ${messages.contentToString()}") {
                withLevel(level)(it)
                    && withMessageContaining(messages)(it) }

    override fun hasEventMatching(level: Level, regex: Regex): Log4jAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwable: Throwable): Log4jAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: Class<out Throwable>): Log4jAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowableClass(throwableClass)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: KClass<out Throwable>): Log4jAssert =
            hasEventMatching(level, regex, throwableClass.java)

    override fun hasNoEvent(level: Level): Log4jAssert =
            hasNoEvent(formatLogMessage(level),
                    withLevel(level))

    override fun hasNoEvent(level: Level, predicate: (LoggingEvent) -> Boolean): Log4jAssert =
            hasNoEvent("$level event matching given predicate") {
                withLevel(level)(it)
                    && predicate(it) }

    override fun hasNoEvent(level: Level, message: String): Log4jAssert =
            hasNoEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it) }

    override fun hasNoEventContaining(level: Level, vararg messages: String): Log4jAssert =
            hasNoEvent("$level message containing ${messages.contentToString()}") {
                withLevel(level)(it)
                    && withMessageContaining(messages)(it) }

    override fun hasNoEventMatching(level: Level, regex: Regex): Log4jAssert =
            hasNoEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it) }

    private fun hasEvent(description: String, predicate: (LoggingEvent) -> Boolean): Log4jAssert {
        if (!actual.any(predicate)) {
            failWithMessage(shouldContain(formatLogEvents(actual).replace("%", "%%"), description.replace("%", "%%")).create())
        }
        return this
    }

    private fun hasNoEvent(description: String, predicate: (LoggingEvent) -> Boolean): Log4jAssert {
        if (actual.any(predicate)) {
            failWithMessage(shouldNotContain(formatLogEvents(actual).replace("%", "%%"), description.replace("%", "%%")).create())
        }
        return this
    }

    private fun withLevel(level: Level): (LoggingEvent) -> Boolean =
            { event -> areEqual(event.getLevel(), level) }

    private fun withMessage(message: String): (LoggingEvent) -> Boolean =
            { event -> areEqual(event.renderedMessage, message) }

    private fun withThrowable(throwable: Throwable): (LoggingEvent) -> Boolean =
            { event -> event.throwableInformation != null && areEqual(event.throwableInformation.throwable, throwable) }

    private fun withThrowableClass(throwableClass: Class<out Throwable>): (LoggingEvent) -> Boolean =
            { event -> event.throwableInformation != null && throwableClass.isAssignableFrom(event.throwableInformation.throwable.javaClass) }

    private fun withMessageContaining(messages: Array<out String>): (LoggingEvent) -> Boolean =
            { event: LoggingEvent -> messages.all { event.renderedMessage.contains(it) } }

    private fun withMessageMatching(regex: Regex): (LoggingEvent) -> Boolean =
            { event: LoggingEvent -> event.renderedMessage.matches(regex) }

    companion object {

        @JvmStatic
        fun assertThat(events: List<LoggingEvent>): Log4jAssert = Log4jAssert(events).withRepresentation(Log4jRepresentation())

        @JvmStatic
        fun assertThat(rule: Log4jRule): Log4jAssert = assertThat(rule.events)

        fun formatLogEvent(event: LoggingEvent) = formatLogMessage(
                event.getLevel(),
                event.renderedMessage,
                event.throwableInformation?.throwable)

        fun formatLogEvents(events: List<LoggingEvent>): String = events.joinToString("\n") { formatLogEvent(it) }
    }
}
