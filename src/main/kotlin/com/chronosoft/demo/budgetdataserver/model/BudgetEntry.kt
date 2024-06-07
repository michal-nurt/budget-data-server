package com.chronosoft.demo.budgetdataserver.model

class BudgetEntry() {
    lateinit var date: String
    lateinit var category: String
    lateinit var description: String
    var amount: Double = 0.0
}