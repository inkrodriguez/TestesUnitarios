package com.inkrodriguez.testesunitrios

import org.junit.Test
import org.junit.jupiter.api.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private var testes = Testes()

    @Test
    fun testCalculator(){
        val result = testes.add(2,3)
        Assertions.assertEquals(7, result)
        println("O Resultado não foi o esperado!")
    }

    @Test
    fun testIsPalindrome(){
        val result = testes.isPalindrome("ovo")
        Assertions.assertEquals(true, result)
        println("Essa palavra pode ser lida  da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda.")
    }

    @Test
    fun testIsPrime(){
        val result = testes.isPrime(5)
        Assertions.assertEquals(true, result)
    }

    @Test
    fun testAverage(){
        val value = 8.42
        val listNumbers = mutableListOf<Double>(3.2, 4.9, 6.0, 8.0, 20.0)
        val result = testes.calculateAverage(listNumbers)

        if(listNumbers.isEmpty()){
            throw IllegalArgumentException("A lista de números não pode estar vazia.")
        } else {
            Assertions.assertEquals(value, result)
            println("o valor da lista de números corresponde ao valor esperado.")
        }
    }


}