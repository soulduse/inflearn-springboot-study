package com.dave.bootstudy.bootstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
@PropertySource("classpath:/app.properties")
class BootStudyApplication

fun main(args: Array<String>) {
	runApplication<BootStudyApplication>(*args)
}

