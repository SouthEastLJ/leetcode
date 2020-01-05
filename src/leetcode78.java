import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetcode78 {
    public static void main(String []args){
        int []nums = {1,3,2};
        List<List<Integer>> result = new leetcode78().subsets(nums);
        for(List<Integer> list:result){
            for(Integer j:list){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> subsets(int []nums){
        if(nums.length==0){
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }

    private void backtrack(List<List<Integer>> list,List<Integer> tempList, int []nums,int start){

        list.add(new ArrayList<>(tempList));

        for(int i=start;i<nums.length;++i){
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }

    }
}
