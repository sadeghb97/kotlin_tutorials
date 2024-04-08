import java.lang.Exception
import java.util.ArrayDeque
import kotlin.math.min

class TwoSumProblem {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for(index in nums.indices){
            val item: Int = nums[index]
            if(map.containsKey(item)){
                val first: Int = map[item]!!
                return intArrayOf(first, index)
            }
            map[target - item] = index
        }

        return null
    }
}

class PalindromeProblem {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false
        val strX = x.toString()
        val xSize = strX.length
        val half = xSize / 2

        for(i in 0..half){
            if(strX[i] != strX[xSize - 1- i]) return false
        }
        return true
    }
}

class LongestCommonPrefixProblem {
    fun longestCommonPrefix(strs: Array<String>): String {
        var out: String? = null
        for(i in strs.indices){
            if(out == null){
                out = strs[i]
                continue
            }

            var oneTimeMinDone = false
            while(!strs[i].startsWith(out!!) && out.isNotEmpty()){
                val newSize = if(!oneTimeMinDone){
                    oneTimeMinDone = true
                    min(strs[i].length, out.length - 1)
                }
                else out.length - 1
                out = out.substring(0, newSize)
            }

            if(out.isEmpty()) return ""
        }

        return out ?: ""
    }
}

class CorrespondingParenthesisProblem {
    fun _cvs(s: String, curIndex: Int, openPr: Int, remOp: Int, remCl: Int, remSt: Int) : Boolean {
        if(curIndex >= s.length){
            return openPr == 0
        }

        val opLimit = remOp + openPr
        if(opLimit + remSt < remCl) return false
        if(remCl + remSt < opLimit) return false

        if(s[curIndex] == ')'){
            if(openPr > 0) return _cvs(s, curIndex + 1, openPr - 1, remOp, remCl - 1, remSt)
            return false
        }

        if(s[curIndex] == '('){
            return _cvs(s, curIndex + 1, openPr + 1, remOp - 1, remCl, remSt)
        }

        if(openPr > 0 && _cvs(s, curIndex + 1, openPr - 1, remOp, remCl, remSt - 1)) return true
        if(_cvs(s, curIndex + 1, openPr + 1, remOp, remCl, remSt - 1)) return true
        if(_cvs(s, curIndex + 1, openPr, remOp, remCl, remSt - 1)) return true
        return false
    }

    fun _cvsPreChecking(remStr: String, consOp: Int): Boolean {
        //println("<$consOp> <$remStr>")
        var open = 0
        var close = 0
        var star = 0

        remStr.forEach {
            when (it) {
                '(' -> open++
                ')' -> close++
                else -> star++
            }
        }

        if (close + star < open + consOp) return false
        //println("TRUE")
        return true
    }

    fun cvsPreChecking(s: String, maxCheck: Int = Integer.MAX_VALUE) : Boolean {
        var checksDone = 0
        var off = s.length
        while(maxCheck > checksDone && off >= 0){
            var cons = 1
            off = s.lastIndexOf("(", off)

            if(off >= 0){
                try{
                    val rem = s.substring(off + 1)
                    if(rem.isEmpty()) return false
                    while(off > 0 && s[off - 1] == '('){
                        cons++
                        off--
                    }

                    if(!_cvsPreChecking(rem, cons)) return false
                }
                catch (ex: Exception){ return false }
            }

            checksDone++
            off--
        }
        return true
    }

    fun checkValidString(s: String): Boolean {
        if(!cvsPreChecking(s, 1)) return false

        var open = 0
        var close = 0
        var star = 0

        s.forEach {
            when (it) {
                '(' -> open++
                ')' -> close++
                else -> star++
            }
        }

        return _cvs(s, 0, 0, open, close, star)
    }
}

class MergeSortedArrayProblem {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val result = arrayListOf<Int>()
        var firstIndex = 0
        var secondIndex = 0

        for(i in 0 until m + n){
            if(secondIndex >= n || (firstIndex < m && nums1[firstIndex] <= nums2[secondIndex])){
                result.add(nums1[firstIndex])
                firstIndex++
                continue
            }

            result.add(nums2[secondIndex])
            secondIndex++
        }

        result.forEachIndexed { index, item ->
            nums1[index] = item
        }
    }
}

class StudentsUnableToEatLaunchProblem {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val stQueue = ArrayDeque<Int>(students.toList())
        val sandStack = ArrayDeque<Int>(sandwiches.toList())
        var consFail = 0

        while(stQueue.size >0 && stQueue.size > consFail) {
            if (stQueue.first() == sandStack.first()) {
                consFail = 0
                stQueue.removeFirst()
                sandStack.removeFirst()
            }
            else {
                consFail++
                stQueue.addLast(stQueue.removeFirst())
            }
        }

        return stQueue.size
    }
}

@Override
fun IntArray.print() {
    val strBuilder = StringBuilder()
    strBuilder.append("[")
    forEachIndexed() { index, item ->
        if(index != 0) strBuilder.append(", ")
        strBuilder.append(item)
    }
    strBuilder.append("]")
    println(strBuilder.toString())
}