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
import com.tyro.oss.logtesting.LogRuleAssert
import org.assertj.core.error.ShouldBeNullOrEmpty.shouldBeNullOrEmpty
import org.assertj.core.error.ShouldContainCharSequence.shouldContain
import org.assertj.core.util.Objects.areEqual
import kotlin.reflect.KClass

class LogbackRuleAssert(actual: List<ILoggingEvent>) : LogRuleAssert<LogbackRuleAssert, Level, ILoggingEvent>(actual) {

    override fun hasNoInfo(): LogbackRuleAssert {
        val events = actual.filter(withLevel(Level.INFO))
        if (events.isNotEmpty()) {
            failWithMessage(shouldBeNullOrEmpty(formatLogMessages(events)).create())
        }
        return this
    }

    override fun hasNoWarn(): LogbackRuleAssert {
        val events = actual.filter(withLevel(Level.WARN))
        if (events.isNotEmpty()) {
            failWithMessage(shouldBeNullOrEmpty(formatLogMessages(events)).create())
        }
        return this
    }

    override fun hasNoError(): LogbackRuleAssert {
        val events = actual.filter(withLevel(Level.ERROR))
        if (events.isNotEmpty()) {
            failWithMessage(shouldBeNullOrEmpty(formatLogMessages(events)).create())
        }
        return this
    }

    override fun hasInfo(): LogbackRuleAssert =
            hasEvent(Level.INFO)

    override fun hasInfo(predicate: (ILoggingEvent) -> Boolean): LogbackRuleAssert =
            hasEvent(Level.INFO, predicate)

    override fun hasInfo(message: String): LogbackRuleAssert =
            hasEvent(Level.INFO, message)

    override fun hasInfo(message: String, throwable: Throwable): LogbackRuleAssert =
            hasEvent(Level.INFO, message, throwable)

    override fun hasInfo(message: String, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEvent(Level.INFO, message, throwableClass)

    override fun hasInfo(message: String, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEvent(Level.INFO, message, throwableClass)

    override fun hasInfoContaining(vararg messages: String): LogbackRuleAssert =
            hasEventContaining(Level.INFO, *messages)

    override fun hasInfoMatching(regex: Regex): LogbackRuleAssert =
            hasEventMatching(Level.INFO, regex)

    override fun hasInfoMatching(regex: Regex, throwable: Throwable): LogbackRuleAssert =
            hasEventMatching(Level.INFO, regex, throwable)

    override fun hasInfoMatching(regex: Regex, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEventMatching(Level.INFO, regex, throwableClass)

    override fun hasInfoMatching(regex: Regex, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEventMatching(Level.INFO, regex, throwableClass)

    override fun hasWarn(): LogbackRuleAssert =
            hasEvent(Level.WARN)

    override fun hasWarn(predicate: (ILoggingEvent) -> Boolean): LogbackRuleAssert =
            hasEvent(Level.WARN, predicate)

    override fun hasWarn(message: String): LogbackRuleAssert =
            hasEvent(Level.WARN, message)

    override fun hasWarn(message: String, throwable: Throwable): LogbackRuleAssert =
            hasEvent(Level.WARN, message, throwable)

    override fun hasWarn(message: String, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEvent(Level.WARN, message, throwableClass)

    override fun hasWarn(message: String, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEvent(Level.WARN, message, throwableClass)

    override fun hasWarnContaining(vararg messages: String): LogbackRuleAssert =
            hasEventContaining(Level.WARN, *messages)

    override fun hasWarnMatching(regex: Regex): LogbackRuleAssert =
            hasEventMatching(Level.WARN, regex)

    override fun hasWarnMatching(regex: Regex, throwable: Throwable): LogbackRuleAssert =
            hasEventMatching(Level.WARN, regex, throwable)

    override fun hasWarnMatching(regex: Regex, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEventMatching(Level.WARN, regex, throwableClass)

    override fun hasWarnMatching(regex: Regex, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEventMatching(Level.WARN, regex, throwableClass)

    override fun hasError(): LogbackRuleAssert =
            hasEvent(Level.ERROR)

    override fun hasError(predicate: (ILoggingEvent) -> Boolean): LogbackRuleAssert =
            hasEvent(Level.ERROR, predicate)

    override fun hasError(message: String): LogbackRuleAssert =
            hasEvent(Level.ERROR, message)

    override fun hasError(message: String, throwable: Throwable): LogbackRuleAssert =
            hasEvent(Level.ERROR, message, throwable)

    override fun hasError(message: String, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEvent(Level.ERROR, message, throwableClass)

    override fun hasError(message: String, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEvent(Level.ERROR, message, throwableClass)

    override fun hasErrorContaining(vararg messages: String): LogbackRuleAssert =
            hasEventContaining(Level.ERROR, *messages)

    override fun hasErrorMatching(regex: Regex): LogbackRuleAssert =
            hasEventMatching(Level.ERROR, regex)

    override fun hasErrorMatching(regex: Regex, throwable: Throwable): LogbackRuleAssert =
            hasEventMatching(Level.ERROR, regex, throwable)

    override fun hasErrorMatching(regex: Regex, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEventMatching(Level.ERROR, regex, throwableClass)

    override fun hasErrorMatching(regex: Regex, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEventMatching(Level.ERROR, regex, throwableClass)

    override fun hasEvent(level: Level): LogbackRuleAssert =
            hasEvent("[$level]",
                withLevel(level))

    override fun hasEvent(level: Level, predicate: (ILoggingEvent) -> Boolean): LogbackRuleAssert =
            hasEvent("$level event matching given predicate") {
                withLevel(level)(it)
                    && predicate(it) }

    override fun hasEvent(level: Level, message: String): LogbackRuleAssert =
            hasEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it) }

    override fun hasEvent(level: Level, message: String, throwable: Throwable): LogbackRuleAssert =
            hasEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                    && withMessage(message)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEvent(formatLogMessage(level, message)) {
                withLevel(level)(it)
                        && withMessage(message)(it)
                        && withThrowableClass(throwableClass)(it) }

    override fun hasEvent(level: Level, message: String, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEvent(level, message, throwableClass.java)

    override fun hasEventContaining(level: Level, vararg messages: String): LogbackRuleAssert =
            hasEvent("$level message containing ${messages.contentToString()}") {
                withLevel(level)(it)
                    && withMessageContaining(messages)(it) }

    override fun hasEventMatching(level: Level, regex: Regex): LogbackRuleAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwable: Throwable): LogbackRuleAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowable(throwable)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: Class<out Throwable>): LogbackRuleAssert =
            hasEvent("$level message matching: $regex") {
                withLevel(level)(it)
                    && withMessageMatching(regex)(it)
                    && withThrowableClass(throwableClass)(it) }

    override fun hasEventMatching(level: Level, regex: Regex, throwableClass: KClass<out Throwable>): LogbackRuleAssert =
            hasEventMatching(level, regex, throwableClass.java)

    private fun hasEvent(description: String, predicate: (ILoggingEvent) -> Boolean): LogbackRuleAssert {
        if (!actual.any(predicate)) {
            failWithMessage(shouldContain(formatLogMessages(actual).replace("%", "%%"), description.replace("%", "%%")).create())
        }
        return this
    }

    private fun withLevel(level: Level): (ILoggingEvent) -> Boolean =
            { event -> areEqual(event.level, level) }

    private fun withMessage(message: String): (ILoggingEvent) -> Boolean =
            { event: ILoggingEvent -> areEqual(event.formattedMessage, message) }

    private fun withThrowable(throwable: Throwable): (ILoggingEvent) -> Boolean =
            { event -> event.throwableProxy != null && areEqual((event.throwableProxy as ThrowableProxy).throwable, throwable) }

    private fun withThrowableClass(throwableClass: Class<out Throwable>): (ILoggingEvent) -> Boolean =
            { event -> event.throwableProxy != null && throwableClass.isAssignableFrom((event.throwableProxy as ThrowableProxy).throwable.javaClass) }

    private fun withMessageContaining(messages: Array<out String>): (ILoggingEvent) -> Boolean =
            { event: ILoggingEvent -> messages.all { event.formattedMessage.contains(it) } }

    private fun withMessageMatching(regex: Regex): (ILoggingEvent) -> Boolean =
            { event: ILoggingEvent -> event.formattedMessage.matches(regex) }

    private fun formatLogMessages(events: List<ILoggingEvent>): String =
            events.joinToString("\n") { formatLogMessage(it.level, it.formattedMessage) }

    private fun formatLogMessage(level: Level, message: String): String =
            "[$level] $message"

    companion object {

        @JvmStatic
        fun assertThat(events: List<ILoggingEvent>): LogbackRuleAssert = LogbackRuleAssert(events)

        @JvmStatic
        fun assertThat(rule: LogbackRule): LogbackRuleAssert = assertThat(rule.events)
    }
}
