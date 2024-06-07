package com.chronosoft.demo.budgetdataserver.controller

import com.chronosoft.demo.budgetdataserver.model.BudgetContainer
import com.chronosoft.demo.budgetdataserver.service.BudgetDataService
import com.chronosoft.demo.budgetdataserver.util.Logging
import com.chronosoft.demo.budgetdataserver.util.logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/budget")
class BudgetDataController(
    val budgetDataService: BudgetDataService
): Logging {
    @GetMapping
    fun getBudgetData(): BudgetContainer {
        logger().info("Request for budget data")
        return BudgetContainer(budgetDataService.budgetData)
    }
}