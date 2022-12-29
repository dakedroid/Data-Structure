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