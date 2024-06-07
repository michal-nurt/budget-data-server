package com.chronosoft.demo.budgetdataserver.controller


import com.chronosoft.demo.budgetdataserver.model.BudgetContainer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.ActiveProfiles


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class BudgetDataControllerTest {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun testGetBudgetData() {

        val result = restTemplate.getForEntity("/budget", BudgetContainer::class.java)

        assertThat(result.statusCode.is2xxSuccessful)
        assertThat(result.body?.budgetData).hasSize(155)
    }
}