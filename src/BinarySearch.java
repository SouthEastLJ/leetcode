public class BinarySearch {
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 40;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
    /* 迭代解法
    *
    * arr 排序的数组
    * l 查找下界
    * r 查找上界
    * x 目标值
    */
    int binarySearch(int arr[], int left, int right, int x) {
        while(right>=left) {
            int middle =left + (right - left) / 2;
            if (arr[middle] == x) {
                return middle;
            }
            else if (arr[middle] > x){
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return -1;
    }

    /* 递归解法
     *
     * arr 排序的数组
     * l 查找下界
     * r 查找上界
     * x 目标值
     */
    int binarySearch2(int arr[], int l, int r, int x) {
        if(r>=l) {
            int middle = l + (r - l) / 2;
            if (arr[middle] == x) {
                return middle;
            }
            else if (arr[middle] > x){
                return binarySearch(arr, l, middle - 1, x);
            }
            else {
                return binarySearch(arr, middle + 1, r, x);
            }
        }
        return -1;
    }
}
