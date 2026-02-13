import java.util.*;

public class Third{

    public static ArrayList<Integer> findMissing(int nums[]){
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] bool = new boolean[nums.length+1];
        for(int i :nums){
            bool[i] = true;
        }

        for(int i=1 ; i<=nums.length ; i++){
            if(!bool[i]){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> res = findMissing(nums);
        for(int i=0 ; i<res.size() ; i++){
            System.out.println(res.get(i) + " ,");
        }
    }
}