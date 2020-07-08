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

import ch.qos.logback.classic.Level
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.classic.spi.ThrowableProxy
import com.tyro.oss.logtesting.LogAssert
import com.tyro.oss.logtesting.formatLogMessage
import org.assertj.core.error.ShouldContainCharSequence.shouldContain
import org.assertj.core.error.ShouldNotContainCharSequence.shouldNotContain
import kotlin.reflect.KClass

class LogbackAssert(actual: List<ILoggingEvent>) : LogAssert<LogbackAssert, Level, ILoggingEvent>(actual) {

    override fun hasInfo(): LogbackAssert =
            hasEvent(Level.INFO)

    override fun hasInfo(predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasEvent(Level.INFO, predicate)

    override fun hasInfo(message: String): LogbackAssert =
            hasEvent(Level.INFO, message)

    override fun hasInfo(message: String, throwable: Throwable): LogbackAssert =
            hasEvent(Level.INFO, message, throwable)

    override fun hasInfo(message: String, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEvent(Level.INFO, message, throwableClass)

    override fun hasInfo(message: String, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEvent(Level.INFO, message, throwableClass)

    override fun hasInfoContaining(vararg messages: String): LogbackAssert =
            hasEventContaining(Level.INFO, *messages)

    override fun hasInfoMatching(regex: Regex): LogbackAssert =
            hasEventMatching(Level.INFO, regex)

    override fun hasInfoMatching(regex: Regex, throwable: Throwable): LogbackAssert =
            hasEventMatching(Level.INFO, regex, throwable)

    override fun hasInfoMatching(regex: Regex, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEventMatching(Level.INFO, regex, throwableClass)

    override fun hasInfoMatching(regex: Regex, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEventMatching(Level.INFO, regex, throwableClass)

    override fun hasNoInfo(): LogbackAssert =
            hasNoEvent(Level.INFO)

    override fun hasNoInfo(predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasNoEvent(Level.INFO, predicate)

    override fun hasNoInfo(message: String): LogbackAssert =
            hasNoEvent(Level.INFO, message)

    override fun hasNoInfoContaining(vararg messages: String): LogbackAssert =
            hasNoEventContaining(Level.INFO, *messages)

    override fun hasNoInfoMatching(regex: Regex): LogbackAssert =
            hasNoEventMatching(Level.INFO, regex)

    override fun hasWarn(): LogbackAssert =
            hasEvent(Level.WARN)

    override fun hasWarn(predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasEvent(Level.WARN, predicate)

    override fun hasWarn(message: String): LogbackAssert =
            hasEvent(Level.WARN, message)

    override fun hasWarn(message: String, throwable: Throwable): LogbackAssert =
            hasEvent(Level.WARN, message, throwable)

    override fun hasWarn(message: String, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEvent(Level.WARN, message, throwableClass)

    override fun hasWarn(message: String, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEvent(Level.WARN, message, throwableClass)

    override fun hasWarnContaining(vararg messages: String): LogbackAssert =
            hasEventContaining(Level.WARN, *messages)

    override fun hasWarnMatching(regex: Regex): LogbackAssert =
            hasEventMatching(Level.WARN, regex)

    override fun hasWarnMatching(regex: Regex, throwable: Throwable): LogbackAssert =
            hasEventMatching(Level.WARN, regex, throwable)

    override fun hasWarnMatching(regex: Regex, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEventMatching(Level.WARN, regex, throwableClass)

    override fun hasWarnMatching(regex: Regex, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEventMatching(Level.WARN, regex, throwableClass)

    override fun hasNoWarn(): LogbackAssert =
            hasNoEvent(Level.WARN)

    override fun hasNoWarn(predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasNoEvent(Level.WARN, predicate)

    override fun hasNoWarn(message: String): LogbackAssert =
            hasNoEvent(Level.WARN, message)

    override fun hasNoWarnContaining(vararg messages: String): LogbackAssert =
            hasNoEventContaining(Level.WARN, *messages)

    override fun hasNoWarnMatching(regex: Regex): LogbackAssert =
            hasNoEventMatching(Level.WARN, regex)

    override fun hasError(): LogbackAssert =
            hasEvent(Level.ERROR)

    override fun hasError(predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasEvent(Level.ERROR, predicate)

    override fun hasError(message: String): LogbackAssert =
            hasEvent(Level.ERROR, message)

    override fun hasError(message: String, throwable: Throwable): LogbackAssert =
            hasEvent(Level.ERROR, message, throwable)

    override fun hasError(message: String, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEvent(Level.ERROR, message, throwableClass)

    override fun hasError(message: String, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEvent(Level.ERROR, message, throwableClass)

    override fun hasErrorContaining(vararg messages: String): LogbackAssert =
            hasEventContaining(Level.ERROR, *messages)

    override fun hasErrorMatching(regex: Regex): LogbackAssert =
            hasEventMatching(Level.ERROR, regex)

    override fun hasErrorMatching(regex: Regex, throwable: Throwable): LogbackAssert =
            hasEventMatching(Level.ERROR, regex, throwable)

    override fun hasErrorMatching(regex: Regex, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEventMatching(Level.ERROR, regex, throwableClass)

    override fun hasErrorMatching(regex: Regex, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEventMatching(Level.ERROR, regex, throwableClass)

    override fun hasNoError(): LogbackAssert =
            hasNoEvent(Level.ERROR)

    override fun hasNoError(predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasNoEvent(Level.ERROR, predicate)

    override fun hasNoError(message: String): LogbackAssert =
            hasNoEvent(Level.ERROR, message)

    override fun hasNoErrorContaining(vararg messages: String): LogbackAssert =
            hasNoEventContaining(Level.ERROR, *messages)

    override fun hasNoErrorMatching(regex: Regex): LogbackAssert =
            hasNoEventMatching(Level.ERROR, regex)

    override fun hasEvent(level: Level): LogbackAssert =
            hasEvent(formatLogMessage(level),
                withLevel(level))

    override fun hasEvent(level: Level, predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasEvent("$level event matching given predicate") {
                withLevel(level)(it)
                    && predicate(it) }

    override fun hasEvent(level: Level, message: String): LogbackAssert =
            hasEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it) }

    override fun hasEvent(level: Level, message: String, throwable: Throwable): LogbackAssert =
            hasEvent(formatLogMessage(level, message, throwable)) {
                withLevel(level)(it)
                    && withMessage(message)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEvent(formatLogMessage(level, message, throwableClass = throwableClass)) {
                withLevel(level)(it)
                        && withMessage(message)(it)
                        && withThrowableClass(throwableClass)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEvent(level, message, throwableClass.java)

    override fun hasEventContaining(level: Level, vararg messages: String): LogbackAssert =
            hasEvent("$level message containing ${messages.contentToString()}") {
                withLevel(level)(it)
                    && withMessageContaining(messages)(it) }

    override fun hasEventMatching(level: Level, regex: Regex): LogbackAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwable: Throwable): LogbackAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: Class<out Throwable>): LogbackAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowableClass(throwableClass)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: KClass<out Throwable>): LogbackAssert =
            hasEventMatching(level, regex, throwableClass.java)

    override fun hasNoEvent(level: Level): LogbackAssert =
            hasNoEvent(formatLogMessage(level),
                    withLevel(level))

    override fun hasNoEvent(level: Level, predicate: (ILoggingEvent) -> Boolean): LogbackAssert =
            hasNoEvent("$level event matching given predicate") {
                withLevel(level)(it)
                    && predicate(it) }

    override fun hasNoEvent(level: Level, message: String): LogbackAssert =
            hasNoEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it) }

    override fun hasNoEventContaining(level: Level, vararg messages: String): LogbackAssert =
            hasNoEvent("$level message containing ${messages.contentToString()}") {
                withLevel(level)(it)
                    && withMessageContaining(messages)(it) }

    override fun hasNoEventMatching(level: Level, regex: Regex): LogbackAssert =
            hasNoEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it) }

    private fun hasEvent(description: String, predicate: (ILoggingEvent) -> Boolean): LogbackAssert {
        if (actual.none(predicate)) {
            failWithMessage(shouldContain(formatLogEvents(actual).replace("%", "%%"), description.replace("%", "%%")).create())
        }
        return this
    }

    private fun hasNoEvent(description: String, predicate: (ILoggingEvent) -> Boolean): LogbackAssert {
        if (actual.any(predicate)) {
            failWithMessage(shouldNotContain(formatLogEvents(actual).replace("%", "%%"), description.replace("%", "%%")).create())
        }
        return this
    }

    private fun withLevel(level: Level): (ILoggingEvent) -> Boolean =
            { event -> event.level == level }

    private fun withMessage(message: String): (ILoggingEvent) -> Boolean =
            { event: ILoggingEvent -> event.formattedMessage == message }

    private fun withThrowable(throwable: Throwable): (ILoggingEvent) -> Boolean =
            { event -> event.throwableProxy != null && (event.throwableProxy as ThrowableProxy).throwable == throwable }

    private fun withThrowableClass(throwableClass: Class<out Throwable>): (ILoggingEvent) -> Boolean =
            { event -> event.throwableProxy != null && throwableClass.isAssignableFrom((event.throwableProxy as ThrowableProxy).throwable.javaClass) }

    private fun withMessageContaining(messages: Array<out String>): (ILoggingEvent) -> Boolean =
            { event: ILoggingEvent -> messages.all { event.formattedMessage.contains(it) } }

    private fun withMessageMatching(regex: Regex): (ILoggingEvent) -> Boolean =
            { event: ILoggingEvent -> event.formattedMessage.matches(regex) }

    companion object {

        @JvmStatic
        fun assertThat(events: List<ILoggingEvent>): LogbackAssert = LogbackAssert(events).withRepresentation(LogbackRepresentation())

        @JvmStatic
        fun assertThat(logCaptor: LogbackCaptor): LogbackAssert = assertThat(logCaptor.events)

        fun formatLogEvent(event: ILoggingEvent) = formatLogMessage(
                event.level,
                event.formattedMessage,
                event.throwableProxy?.let { (it as ThrowableProxy).throwable })

        fun formatLogEvents(events: List<ILoggingEvent>): String = events.joinToString("\n") { formatLogEvent(it) }
    }
}
