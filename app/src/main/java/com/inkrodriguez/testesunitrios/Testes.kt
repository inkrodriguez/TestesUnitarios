package com.inkrodriguez.testesunitrios

class Testes {

    fun add(x: Int, y: Int): Int {

        var result = x + y

        return result

    }

    fun isPalindrome(str: String): Boolean {
        return str == str.reversed()
    }

    fun isPrime(number: Int): Boolean {
        if (number <= 1) {
            return false
        }

        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }

        return true
    }

    fun calculateAverage(listNumbers: MutableList<Double>): Double{
        return listNumbers.sum() / listNumbers.size
    }



}