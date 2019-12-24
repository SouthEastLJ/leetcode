import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * given a collection of numbers that might contain duplicates, return all possible unique permutations
 */
public class leetcode47 {
    public static void main(String []args){
        int []nums = {1,1,2};
        List<List<Integer>> result = new leetcode47().permuteUnique(nums);
        for(List<Integer> list:result){
            for(Integer j:list){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> permuteUnique(int []nums){
        if(nums.length==0){
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<>(),nums,new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> list,List<Integer> tempList, int []nums,boolean []used){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        }else{
            for(int i=0;i<nums.length;++i){
                if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(list,tempList,nums,used);
                used[i] = false;
                tempList.remove(tempList.size()-1);
            }
        }
    }

}
