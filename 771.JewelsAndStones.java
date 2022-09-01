class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap <Character, Character> listJewels= new HashMap<Character,Character>(52);
        int sz= jewels.length();
        for(int i=0; i<sz; i++){
            Character temp= new Character(jewels.charAt(i));
            listJewels.put(temp,temp);     
        }
        sz= stones.length();
        int jewelCount=0;
        for (int i=0; i<sz;i++){
            if (listJewels.containsKey(stones.charAt(i))){
                jewelCount++;
            }
        }
            
        return jewelCount;
    }
}
