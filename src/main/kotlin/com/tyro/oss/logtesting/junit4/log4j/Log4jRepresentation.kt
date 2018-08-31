package com.tyro.oss.logtesting.junit4.log4j

import com.tyro.oss.logtesting.junit4.log4j.Log4jAssert.Companion.formatLogEvent
import com.tyro.oss.logtesting.junit4.log4j.Log4jAssert.Companion.formatLogEvents
import org.apache.log4j.spi.LoggingEvent
import org.assertj.core.presentation.StandardRepresentation

class Log4jRepresentation : StandardRepresentation() {
    override fun toStringOf(obj: Any?): String? {
        if (obj is LoggingEvent) return formatLogEvent(obj)
        if (obj is Collection<*>) return formatLogEvents(obj as List<LoggingEvent>)
        return super.toStringOf(obj)
    }
}