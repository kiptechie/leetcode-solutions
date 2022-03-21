class Solution {
    fun reverse(x: Int): Int {
        var reversedInt = 0 // hold reversed number
        var num = x // hold our input
        while (num != 0) { // run this loop until value of num is not 0
            val pop = num % 10
            num /= 10 // our break point
            // overflow checks
            if (reversedInt > Integer.MAX_VALUE/10 || (reversedInt == Integer.MAX_VALUE / 10 && pop > 7)) return 0
            if (reversedInt < Integer.MIN_VALUE/10 || (reversedInt == Integer.MIN_VALUE / 10 && pop < -8)) return 0
            reversedInt = reversedInt * 10 + pop // take the rightmost digit of num and add it to reversedInt
        }
        return reversedInt
    }
}