package com.dave.bootstudy.bootstudy

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationContext
import org.springframework.core.env.Environment
import org.springframework.stereotype.Component

@Component
class Runner: ApplicationRunner {

    @Autowired
    lateinit var ctx: ApplicationContext

    override fun run(args: ApplicationArguments?) {
        val environment: Environment = ctx.environment
        println(environment.getProperty("app.about"))
    }
}
