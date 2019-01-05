package com.dave.bootstudy.bootstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.ReloadableResourceBundleMessageSource

@SpringBootApplication
@PropertySource("classpath:/app.properties")
class BootStudyApplication {
	@Bean
	fun messageSource(): MessageSource {
		return ReloadableResourceBundleMessageSource().apply {
			setBasename("classpath:/messages")
			setDefaultEncoding("UTF-8")
			setCacheSeconds(3)
		}
	}
}

fun main(args: Array<String>) {
	runApplication<BootStudyApplication>(*args)
}

