public class Second{
    public static int[] countNumber(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        
        for(int i=0 ; i<n ; i++){
            int count = 0;
            for(int j=0 ; j<n ;j++){
                if(arr[i]>arr[j]){
                   count++;
                }
            }

            
                ans[i] = count;
            
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        int ans1[] = countNumber(arr);
        for(int i=0 ; i<ans1.length ; i++){
            System.out.println(ans1[i] + " ");
        }
    }
}