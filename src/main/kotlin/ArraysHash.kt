fun containsDuplicate(nums: Array<Int>): Boolean {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }
    return false;
}

fun containsDuplicate2(nums: Array<Int>): Boolean {
    nums.sort()
    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1]) {
            return true
        }
    }
    return false;
}

fun containsDuplicate3(nums: Array<Int>): Boolean {
    val set = HashSet<Int>()
    for (i in nums.indices) {
        if (!set.contains(nums[i])) {
            set.add(nums[i])
        } else {
            return true
        }
    }
    return false
}

