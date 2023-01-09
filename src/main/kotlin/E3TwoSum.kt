fun twoSum(nums: IntArray, target: Int): IntArray? {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if ((nums[i] + nums[j]) == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

fun twoSum2(nums: IntArray, target: Int): IntArray? {
    val hs = HashMap<Int, Int>()
    for (i in nums.indices) {
        val resta = target - nums[i]
        if (!hs.containsKey(resta)) {
            hs[nums[i]] = i
        } else {
            return intArrayOf(hs[resta]!!, i)
        }
    }
    return intArrayOf()
}


fun main() {

    val numeros = intArrayOf(2, 7, 11, 15)
    twoSum(numeros, 9)

}


