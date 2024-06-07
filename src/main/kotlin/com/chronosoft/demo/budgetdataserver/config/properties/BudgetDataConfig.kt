package com.chronosoft.demo.budgetdataserver.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "budget-data")
data class BudgetDataConfig(
    val file: String
)
