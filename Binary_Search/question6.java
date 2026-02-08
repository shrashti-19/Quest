import java.util.*;

public class question6{
    public static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] start = new int[n][2];

        for(int i=0 ; i<n ; i++){
            start[i][0] = intervals[i][0];
            start[i][1]=i;
        }

        Arrays.sort(start, (a,b)->Integer.compare(a[0], b[0]));

        int result[] = new int[n];

        for(int i=0 ; i<n ; i++){
            int end = intervals[i][1];
            int left = 0, right = n-1;

            int ans = -1;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(start[mid][0] >= end){
                    ans = start[mid][1]; // store index
                    right = mid - 1;      // search smaller start
                } else {
                    left = mid + 1;
                }
            }

              result[i] = ans;
        }
        return result;

    }
    public static void main(String[] args) {
        int[][] intervals = {{1,4}, {2,3}, {3,4}};

        int[] ans = findRightInterval(intervals);

        for(int i=0 ; i<ans.length ; i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println("");
        
    }
}