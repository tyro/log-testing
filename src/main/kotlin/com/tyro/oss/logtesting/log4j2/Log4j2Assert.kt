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

import com.tyro.oss.logtesting.LogAssert
import com.tyro.oss.logtesting.formatLogMessage
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.Level.*
import org.apache.logging.log4j.core.LogEvent
import org.assertj.core.error.ShouldContainCharSequence.shouldContain
import org.assertj.core.error.ShouldNotContainCharSequence.shouldNotContain
import kotlin.reflect.KClass

class Log4j2Assert(actual: List<LogEvent>) : LogAssert<Log4j2Assert, Level, LogEvent>(actual) {

    override fun hasInfo() =
            hasEvent(INFO)

    override fun hasInfo(predicate: (LogEvent) -> Boolean) =
            hasEvent(INFO, predicate)

    override fun hasInfo(message: String) =
            hasEvent(INFO, message)

    override fun hasInfo(message: String, throwable: Throwable) =
            hasEvent(INFO, message, throwable)

    override fun hasInfo(message: String, throwableClass: Class<out Throwable>) =
            hasEvent(INFO, message, throwableClass)

    override fun hasInfo(message: String, throwableClass: KClass<out Throwable>) =
            hasEvent(INFO, message, throwableClass)

    override fun hasInfoContaining(vararg messages: String) =
            hasEventContaining(INFO, *messages)

    override fun hasInfoMatching(regex: Regex) =
            hasEventMatching(INFO, regex)

    override fun hasInfoMatching(regex: Regex, throwable: Throwable) =
            hasEventMatching(INFO, regex, throwable)

    override fun hasInfoMatching(regex: Regex, throwableClass: Class<out Throwable>) =
            hasEventMatching(INFO, regex, throwableClass)

    override fun hasInfoMatching(regex: Regex, throwableClass: KClass<out Throwable>) =
            hasEventMatching(INFO, regex, throwableClass)

    override fun hasNoInfo() =
            hasNoEvent(INFO)

    override fun hasNoInfo(predicate: (LogEvent) -> Boolean) =
            hasNoEvent(INFO, predicate)

    override fun hasNoInfo(message: String) =
            hasNoEvent(INFO, message)

    override fun hasNoInfoContaining(vararg messages: String) =
            hasNoEventContaining(INFO, *messages)

    override fun hasNoInfoMatching(regex: Regex) =
            hasNoEventMatching(INFO, regex)

    override fun hasWarn() =
            hasEvent(WARN)

    override fun hasWarn(predicate: (LogEvent) -> Boolean) =
            hasEvent(WARN, predicate)

    override fun hasWarn(message: String) =
            hasEvent(WARN, message)

    override fun hasWarn(message: String, throwable: Throwable) =
            hasEvent(WARN, message, throwable)

    override fun hasWarn(message: String, throwableClass: Class<out Throwable>) =
            hasEvent(WARN, message, throwableClass)

    override fun hasWarn(message: String, throwableClass: KClass<out Throwable>) =
            hasEvent(WARN, message, throwableClass)

    override fun hasWarnContaining(vararg messages: String) =
            hasEventContaining(WARN, *messages)

    override fun hasWarnMatching(regex: Regex) =
            hasEventMatching(WARN, regex)

    override fun hasWarnMatching(regex: Regex, throwable: Throwable) =
            hasEventMatching(WARN, regex, throwable)

    override fun hasWarnMatching(regex: Regex, throwableClass: Class<out Throwable>) =
            hasEventMatching(WARN, regex, throwableClass)

    override fun hasWarnMatching(regex: Regex, throwableClass: KClass<out Throwable>) =
            hasEventMatching(WARN, regex, throwableClass)

    override fun hasNoWarn() =
            hasNoEvent(WARN)

    override fun hasNoWarn(predicate: (LogEvent) -> Boolean) =
            hasNoEvent(WARN, predicate)

    override fun hasNoWarn(message: String) =
            hasNoEvent(WARN, message)

    override fun hasNoWarnContaining(vararg messages: String) =
            hasNoEventContaining(WARN, *messages)

    override fun hasNoWarnMatching(regex: Regex) =
            hasNoEventMatching(WARN, regex)

    override fun hasError() =
            hasEvent(ERROR)

    override fun hasError(predicate: (LogEvent) -> Boolean) =
            hasEvent(ERROR, predicate)

    override fun hasError(message: String) =
            hasEvent(ERROR, message)

    override fun hasError(message: String, throwable: Throwable) =
            hasEvent(ERROR, message, throwable)

    override fun hasError(message: String, throwableClass: Class<out Throwable>) =
            hasEvent(ERROR, message, throwableClass)

    override fun hasError(message: String, throwableClass: KClass<out Throwable>) =
            hasEvent(ERROR, message, throwableClass.java)

    override fun hasErrorContaining(vararg messages: String) =
            hasEventContaining(ERROR, *messages)

    override fun hasErrorMatching(regex: Regex) =
            hasEventMatching(ERROR, regex)

    override fun hasErrorMatching(regex: Regex, throwable: Throwable) =
            hasEventMatching(ERROR, regex, throwable)

    override fun hasErrorMatching(regex: Regex, throwableClass: Class<out Throwable>) =
            hasEventMatching(ERROR, regex, throwableClass)

    override fun hasErrorMatching(regex: Regex, throwableClass: KClass<out Throwable>) =
            hasEventMatching(ERROR, regex, throwableClass.java)

    override fun hasNoError() =
            hasNoEvent(ERROR)

    override fun hasNoError(predicate: (LogEvent) -> Boolean) =
            hasNoEvent(ERROR, predicate)

    override fun hasNoError(message: String) =
            hasNoEvent(ERROR, message)

    override fun hasNoErrorContaining(vararg messages: String) =
            hasNoEventContaining(ERROR, *messages)

    override fun hasNoErrorMatching(regex: Regex) =
            hasNoEventMatching(ERROR, regex)

    override fun hasEvent(level: Level) =
            hasEvent(formatLogMessage(level),
                withLevel(level))

    override fun hasEvent(level: Level, predicate: (LogEvent) -> Boolean) =
            hasEvent("$level event matching given predicate") {
                withLevel(level)(it)
                    && predicate(it) }

    override fun hasEvent(level: Level, message: String) =
            hasEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it) }

    override fun hasEvent(level: Level, message: String, throwable: Throwable) =
            hasEvent(formatLogMessage(level, message, throwable)) {
                withLevel(level)(it)
                    && withMessage(message)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: Class<out Throwable>) =
            hasEvent(formatLogMessage(level, message, throwableClass = throwableClass)) {
                withLevel(level)(it)
                    && withMessage(message)(it)
                    && withThrowableClass(throwableClass)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: KClass<out Throwable>) =
            hasEvent(level, message, throwableClass.java)

    override fun hasEventContaining(level: Level, vararg messages: String) =
            hasEvent("$level message containing ${messages.contentToString()}") {
                withLevel(level)(it)
                    && withMessageContaining(messages)(it) }

    override fun hasEventMatching(level: Level, regex: Regex) =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwable: Throwable) =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: Class<out Throwable>) =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowableClass(throwableClass)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: KClass<out Throwable>) =
            hasEventMatching(level, regex, throwableClass.java)

    override fun hasNoEvent(level: Level) =
            hasNoEvent(formatLogMessage(level),
                    withLevel(level))

    override fun hasNoEvent(level: Level, predicate: (LogEvent) -> Boolean) =
            hasNoEvent("$level event matching given predicate") {
                withLevel(level)(it)
                    && predicate(it) }

    override fun hasNoEvent(level: Level, message: String) =
            hasNoEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it) }

    override fun hasNoEventContaining(level: Level, vararg messages: String) =
            hasNoEvent("$level message containing ${messages.contentToString()}") {
                withLevel(level)(it)
                    && withMessageContaining(messages)(it) }

    override fun hasNoEventMatching(level: Level, regex: Regex) =
            hasNoEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it) }

    private fun hasEvent(description: String, predicate: (LogEvent) -> Boolean): Log4j2Assert {
        if (!actual.any(predicate)) {
            failWithMessage(shouldContain(formatLogEvents(actual).replace("%", "%%"), description.replace("%", "%%")).create())
        }
        return this
    }

    private fun hasNoEvent(description: String, predicate: (LogEvent) -> Boolean): Log4j2Assert {
        if (actual.any(predicate)) {
            failWithMessage(shouldNotContain(formatLogEvents(actual).replace("%", "%%"), description.replace("%", "%%")).create())
        }
        return this
    }

    private fun withLevel(level: Level): (LogEvent) -> Boolean =
            { event -> event.level == level }

    private fun withMessage(message: String): (LogEvent) -> Boolean =
            { event -> event.message.formattedMessage == message }

    private fun withThrowable(throwable: Throwable): (LogEvent) -> Boolean =
            { event -> event.thrownProxy?.throwable == throwable }

    private fun withThrowableClass(throwableClass: Class<out Throwable>): (LogEvent) -> Boolean =
            { event -> event.thrownProxy != null && throwableClass.isAssignableFrom(event.thrownProxy.throwable.javaClass) }

    private fun withMessageContaining(messages: Array<out String>): (LogEvent) -> Boolean =
            { event: LogEvent -> messages.all { event.message.formattedMessage.contains(it) } }

    private fun withMessageMatching(regex: Regex): (LogEvent) -> Boolean =
            { event: LogEvent -> event.message.formattedMessage.matches(regex) }

    companion object {

        @JvmStatic
        fun assertThat(events: List<LogEvent>): Log4j2Assert = Log4j2Assert(events).withRepresentation(Log4j2Representation())

        @JvmStatic
        fun assertThat(captor: Log4j2Captor): Log4j2Assert = assertThat(captor.events)

        fun formatLogEvent(event: LogEvent) = formatLogMessage(
                event.level,
                event.message.formattedMessage,
                event.thrownProxy?.throwable)

        fun formatLogEvents(events: List<LogEvent>) = events.joinToString("\n") { formatLogEvent(it) }
    }
}
