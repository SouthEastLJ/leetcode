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
        //d

        return null;
    }
}
