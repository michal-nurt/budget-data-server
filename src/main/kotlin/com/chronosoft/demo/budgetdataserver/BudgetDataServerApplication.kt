package com.chronosoft.demo.budgetdataserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan("com.chronosoft.demo.budgetdataserver.config.properties")
class BudgetDataServerApplication

fun main(args: Array<String>) {
    runApplication<BudgetDataServerApplication>(*args)
}
