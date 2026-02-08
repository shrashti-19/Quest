public class question5{
    public static int[] searchRange(int[] nums, int target) {
        int firstindex = search(nums,target);
        int lastindex = searchlast(nums,target);
        return new int[]{firstindex, lastindex};
    }

    public static int search(int nums[], int target){
        int ans = -1;
        int left =0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                ans = mid;
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }

    public static int searchlast(int nums[],int target){
        int ans1 = -1;
        int left =0, right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                ans1 = mid;
                left = mid+1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans1;
    }
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int ans[] = searchRange(nums,8);
        for(int i=0 ; i<ans.length ; i++){
            System.out.println(ans[i] + ",");
        }
    }
}