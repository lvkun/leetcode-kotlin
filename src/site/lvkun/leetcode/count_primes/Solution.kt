package site.lvkun.leetcode.count_primes

class Solution {
    fun countPrimes(n: Int): Int {
        if (n < 3) {
            return 0
        }
        val isPrime = BooleanArray(n)
        for (i in 2 until n) {
            isPrime[i] = true
        }

        var start = 2
        while (start < n / 2 + 1) {
            var time = 2
            var nonPrime = start * time
            while (nonPrime < n) {
                isPrime[nonPrime] = false
                time++
                nonPrime = start * time
            }

            start++
            while (!isPrime[start] && start < n / 2 + 1) {
                start++
            }
        }

        return isPrime.count { it }
    }
}