public class removeElement1 {
    public int removeElement(int[] nums, int val) {
        int i = 0 ;
        for(int j = 0 ; j < nums.length ; j++){
          if(nums[j] != val){
              nums[i] = nums[j] ;
              i++ ;
          }
        }
        return i ;
        //time complexity O(N) and Space O(1) taken
  }
}