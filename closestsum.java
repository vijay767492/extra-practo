import java.util.Arrays;

public class closestsum {
    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int max=nums[0]+nums[1]+nums[2];
       
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                   return sum; } 
                   if(Math.abs(target-sum)<Math.abs(target-max)){ max=sum;}
                  
                   if(sum<target){
                    left++;
                   }
                   else{
                    right--;
                   }
        }
                  
    }return max;}

    public static void main(String[] args) {
        int[] a={0,0,0 };
        System.out.println(threeSumClosest(a,1));
    }
}
