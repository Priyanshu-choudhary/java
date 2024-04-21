class gcd {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 9, 10 };
        Solution sc = new Solution();
        System.out.println(sc.findGCD(nums));
      //  System.out.println(sc.gcd(2,9));
    }
}

class Solution {
    int gcd(int a, int b){
        if (b == 0) {
      return a;
    }
    return gcd(b, a % b); 
    }
   int findGCD(int[] nums) {
    
     int a=nums[0],b=0;
     for(int i=0;i<nums.length;i++){
        if(a>nums[i]){a=nums[i];}
        if(b<nums[i]){b=nums[i];}
      
     }
  
    return gcd(a,b);
  }
}