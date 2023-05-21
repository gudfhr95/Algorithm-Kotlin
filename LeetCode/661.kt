class Solution {
    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        val result = Array(img.size){ it -> IntArray(img[0].size) }
        for(y in 0..img.lastIndex){
            for(x in 0..img[0].lastIndex){
                var sum = 0
                var divend = 0
                for(dy in -1..1){
                    for(dx in -1..1){
                        val xn = x + dx
                        val yn = y + dy

                        if(xn < 0 || xn > img[0].lastIndex){
                            continue
                        }

                        if(yn < 0 || yn > img.lastIndex){
                            continue
                        }

                        sum += img[yn][xn]
                        divend += 1
                    }
                }

                result[y][x] = sum / divend
            }
        }

        return result
    }
}