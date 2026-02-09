public class First{
    public static int[] setMismatch(int nums[]){
        int dup=-1, miss=-1;
        boolean[] bool = new boolean[nums.length+1];
        for(int i : nums){
            if(bool[i]){
                dup = i;
            }
            bool[i] = true;
        }
        for(int i=1 ; i<=nums.length ; i++){
            if(!bool[i]){
                miss = i;
            }
        }

        return new int[]{dup,miss};
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        int ans[] = setMismatch(nums);

        for(int i=0 ; i<ans.length ; i++){
            System.out.println(ans[i] + ",");
        }
    }
}