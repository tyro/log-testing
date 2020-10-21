package com.tyro.oss.logtesting.log4j2

import com.tyro.oss.logtesting.log4j2.Log4j2Assert.Companion.formatLogEvent
import com.tyro.oss.logtesting.log4j2.Log4j2Assert.Companion.formatLogEvents
import org.apache.logging.log4j.core.LogEvent
import org.assertj.core.presentation.StandardRepresentation

class Log4j2Representation : StandardRepresentation() {
    override fun toStringOf(obj: Any?): String? {
        if (obj is LogEvent) return formatLogEvent(obj)
        if (obj is Collection<*>) return formatLogEvents(obj as List<LogEvent>)
        return super.toStringOf(obj)
    }
}