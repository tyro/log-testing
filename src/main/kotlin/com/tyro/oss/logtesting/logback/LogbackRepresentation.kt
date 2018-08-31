package com.tyro.oss.logtesting.logback

import ch.qos.logback.classic.spi.ILoggingEvent
import com.tyro.oss.logtesting.logback.LogbackAssert.Companion.formatLogEvent
import com.tyro.oss.logtesting.logback.LogbackAssert.Companion.formatLogEvents
import org.assertj.core.presentation.StandardRepresentation

class LogbackRepresentation : StandardRepresentation() {
    override fun toStringOf(obj: Any?): String? {
        if (obj is ILoggingEvent) return formatLogEvent(obj)
        if (obj is List<*>) return formatLogEvents(obj as List<ILoggingEvent>)
        return super.toStringOf(obj)
    }
}