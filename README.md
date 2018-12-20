# log-testing

[![Download](https://maven-badges.herokuapp.com/maven-central/com.tyro.oss/log-testing/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.tyro.oss/log-testing)
[![Build Status](https://travis-ci.org/tyro/log-testing.svg?branch=master)](https://travis-ci.org/tyro/log-testing)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

A simple library for testing log events.

## Getting Started

log-testing is available on Maven Central.
```xml
<dependency>
    <groupId>com.tyro.oss</groupId>
    <artifactId>log-testing</artifactId>
    <version>2.1</version>
    <scope>test</scope>
</dependency>
```

A typical test using Logback and JUnit 5 looks like the following. Log4j and JUnit 4 are also supported.
```kotlin
import com.tyro.oss.logtesting.logback.LogbackAssert.Companion.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension
import org.slf4j.LoggerFactory

class ExampleTest {

    private val logger = LoggerFactory.getLogger(ExampleTest::class.java)

    @JvmField
    @RegisterExtension
    val log = LogbackCaptor(ExampleTest::class)

    @Test
    fun `should log message`() {
        logger.info("test message")

        assertThat(log)
                .hasSize(1)
                .hasInfo("test message")
    }
}
```

## Copyright and Licensing

Copyright (C) 2018 Tyro Payments Pty Ltd

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Contributing

See [CONTRIBUTING](CONTRIBUTING.md) for details.
