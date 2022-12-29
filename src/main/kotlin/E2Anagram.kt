fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false;
    val sc = s.toCharArray()
    val tc = t.toCharArray()
    sc.sort()
    tc.sort()
    for (i in sc.indices) {
        if (sc[i] != tc[i]) {
            return false
        }
    }
    return true
}

fun isAnagram2(s: String, t: String): Boolean {
    val hs = HashMap<Char, Int>()
    if (s.length != t.length) return false
    for (i in s.indices) {
        if (hs.containsKey(s[i])) {
            hs[s[i]] = (hs[s[i]] ?: 0) + 1
        } else {
            hs[s[i]] = 1
        }
    }
    for (j in t.indices) {
        if (hs.containsKey(t[j]) && hs[t[j]]!! > 0) {
            hs[t[j]] = (hs[t[j]] ?: 0) - 1
        } else {
            return false
        }
    }
    return true
}

fun isAnagram3(s: String, t: String): Boolean {
    val abecedario = Array(26) { 0 }
    if (s.length != t.length) return false
    for (i in s.indices) {
        abecedario[s[i] - 'a']++
        abecedario[t[i] - 'a']--
    }
    for (letra in abecedario) {
        if (letra != 0) return false
    }
    return true
}

fun main() {
    isAnagram3("anagram", "nagaram")
}