package com.chronosoft.demo.budgetdataserver.service

import com.chronosoft.demo.budgetdataserver.config.properties.BudgetDataConfig
import com.chronosoft.demo.budgetdataserver.model.BudgetEntry
import com.opencsv.bean.CsvToBeanBuilder
import org.springframework.stereotype.Service
import java.io.FileReader


@Service
class BudgetDataService(
    val budgetDataConfig: BudgetDataConfig
) {

    val budgetData: List<BudgetEntry> by lazy {
        loadBudgetData()
    }

    private fun loadBudgetData(): List<BudgetEntry> {
        return CsvToBeanBuilder<BudgetEntry>(FileReader(budgetDataConfig.file))
            .withType(BudgetEntry::class.java).build().parse()
    }
}