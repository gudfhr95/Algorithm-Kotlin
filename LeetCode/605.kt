class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if(n == 0){
            return true
        }

        if(flowerbed.size == 1){
            return flowerbed[0] == 0
        }

        var count = n
        for(i in 0..flowerbed.lastIndex){
            if(flowerbed[i] == 1){
                continue
            }

            if(i == 0 && flowerbed[i] == 0){
                if(flowerbed[i+1] == 0){
                    flowerbed[i] = 1
                    count -= 1
                }
            } else if(i == flowerbed.lastIndex && flowerbed[i] == 0 ){
                if(flowerbed[i-1] == 0){
                    flowerbed[i] = 1
                    count -= 1
                }
            } else if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1
                count -=1
            }
        }

        return count <= 0
    }
}