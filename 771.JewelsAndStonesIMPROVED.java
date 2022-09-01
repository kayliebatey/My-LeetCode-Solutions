class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int sz= stones.length();
        int jewelCount=0;
        for (int i=0; i<sz;i++){
            if (jewels.indexOf(stones.charAt(i))!=-1)
                jewelCount++;
        }
        return jewelCount;
    }
}
