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
package com.tyro.oss.logtesting

import org.assertj.core.api.ListAssert
import kotlin.reflect.KClass

abstract class LogRuleAssert<SELF : ListAssert<EVENT>, LEVEL, EVENT>(actual: List<EVENT>) : ListAssert<EVENT>(actual) {

    abstract fun hasEvent(level: LEVEL): SELF
    abstract fun hasEvent(level: LEVEL, predicate: (EVENT) -> Boolean): SELF
    abstract fun hasEvent(level: LEVEL, message: String): SELF
    abstract fun hasEvent(level: LEVEL, message: String, throwable: Throwable): SELF
    abstract fun hasEvent(level: LEVEL, message: String, throwableClass: Class<out Throwable>): SELF
    abstract fun hasEvent(level: LEVEL, message: String, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasEventContaining(level: LEVEL, vararg messages: String): SELF
    abstract fun hasEventMatching(level: LEVEL, regex: Regex): SELF
    abstract fun hasEventMatching(level: LEVEL, regex: Regex, throwable: Throwable): SELF
    abstract fun hasEventMatching(level: LEVEL, regex: Regex, throwableClass: Class<out Throwable>): SELF
    abstract fun hasEventMatching(level: LEVEL, regex: Regex, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasNoEvent(level: LEVEL): SELF
    abstract fun hasNoEvent(level: LEVEL, message: String): SELF
    abstract fun hasInfo(): SELF
    abstract fun hasInfo(predicate: (EVENT) -> Boolean): SELF
    abstract fun hasInfo(message: String): SELF
    abstract fun hasInfo(message: String, throwable: Throwable): SELF
    abstract fun hasInfo(message: String, throwableClass: Class<out Throwable>): SELF
    abstract fun hasInfo(message: String, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasInfoContaining(vararg messages: String): SELF
    abstract fun hasInfoMatching(regex: Regex): SELF
    abstract fun hasInfoMatching(regex: Regex, throwable: Throwable): SELF
    abstract fun hasInfoMatching(regex: Regex, throwableClass: Class<out Throwable>): SELF
    abstract fun hasInfoMatching(regex: Regex, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasNoInfo(): SELF
    abstract fun hasNoInfo(message: String): SELF
    abstract fun hasWarn(): SELF
    abstract fun hasWarn(predicate: (EVENT) -> Boolean): SELF
    abstract fun hasWarn(message: String): SELF
    abstract fun hasWarn(message: String, throwable: Throwable): SELF
    abstract fun hasWarn(message: String, throwableClass: Class<out Throwable>): SELF
    abstract fun hasWarn(message: String, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasWarnContaining(vararg messages: String): SELF
    abstract fun hasWarnMatching(regex: Regex): SELF
    abstract fun hasWarnMatching(regex: Regex, throwable: Throwable): SELF
    abstract fun hasWarnMatching(regex: Regex, throwableClass: Class<out Throwable>): SELF
    abstract fun hasWarnMatching(regex: Regex, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasNoWarn(): SELF
    abstract fun hasNoWarn(message: String): SELF
    abstract fun hasError(): SELF
    abstract fun hasError(predicate: (EVENT) -> Boolean): SELF
    abstract fun hasError(message: String): SELF
    abstract fun hasError(message: String, throwable: Throwable): SELF
    abstract fun hasError(message: String, throwableClass: Class<out Throwable>): SELF
    abstract fun hasError(message: String, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasErrorContaining(vararg messages: String): SELF
    abstract fun hasErrorMatching(regex: Regex): SELF
    abstract fun hasErrorMatching(regex: Regex, throwable: Throwable): SELF
    abstract fun hasErrorMatching(regex: Regex, throwableClass: Class<out Throwable>): SELF
    abstract fun hasErrorMatching(regex: Regex, throwableClass: KClass<out Throwable>): SELF
    abstract fun hasNoError(): SELF
    abstract fun hasNoError(message: String): SELF
}
