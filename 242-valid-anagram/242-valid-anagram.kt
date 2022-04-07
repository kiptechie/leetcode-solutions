class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val countS : HashMap<Char, Int?> = HashMap()
        val countT : HashMap<Char, Int?> = HashMap()
        for (i in s.indices) {
            countS[s[i]] = if (countS[s[i]] == null) 1 else countS[s[i]]?.plus(1)
            countT[t[i]] = if (countT[t[i]] == null) 1 else countT[t[i]]?.plus(1)
        }
        for (c in countS.keys) {
            if (countS[c] != countT[c]) {
                return false
            }
        }
        return true
    }
}