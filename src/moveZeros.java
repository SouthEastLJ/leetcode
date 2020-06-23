import java.util.List;

public class moveZeros {

    public static void main(String []args){
        int []nums = {1,0,1,0,0,2};
        new moveZeros().moveZeroes(nums);
        for(int i = 0;i<nums.length;++i){
            System.out.print(nums[i]+" ");
        }
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        int flag = nums.length;
        while(i<flag){
            if(nums[i]==0){
                int k = i;
                while(k<flag-1){
                    exchange(nums,k,k+1);
                    ++k;
                }
                flag--;
            }
            if(nums[i]==0){
                continue;
            }else {
                ++i;
            }
        }
    }

    private void exchange(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
