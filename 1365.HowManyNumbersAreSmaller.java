class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sz= nums.length;
        int [] resultingArr= new int[sz];
        System.arraycopy(nums, 0, resultingArr, 0, sz);
        Arrays.sort(nums);
        for(int i=0; i<sz; i++)
            resultingArr[i]= findFirst(nums, resultingArr[i]);  
        return resultingArr;
    }
    public int findFirst(int [] arr, int num){
        int left= 0;
        int right= arr.length-1;
        int result=-1;
        
        while(left<=right){
            int mid= (left+right)/2;
            if (num == arr[mid])
            {
                result = mid;
                right = mid - 1;
            }
            else if (num < arr[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
        
}
