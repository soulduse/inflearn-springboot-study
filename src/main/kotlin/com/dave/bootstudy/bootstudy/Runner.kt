package com.dave.bootstudy.bootstudy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.MessageSource
import org.springframework.stereotype.Component
import java.util.*
import kotlin.concurrent.thread

@Component
class Runner: ApplicationRunner {

    @Autowired
    lateinit var messageSource: MessageSource

    override fun run(args: ApplicationArguments?) {
        while (true) {
            println(messageSource.getMessage("greetings", arrayOf("Kim"), Locale.getDefault()))
            println(messageSource.getMessage("greeting", arrayOf("Kim"), Locale.KOREA))
            Thread.sleep(1000)
        }
    }
}
