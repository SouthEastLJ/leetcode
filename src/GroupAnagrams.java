import java.util.*;

public class GroupAnagrams {
    public static void main(String []args){
        String []nums = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = new GroupAnagrams().groupAnagrams(nums);
        for(int i = 0;i<res.size();++i){
            System.out.println(res.get(i));
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List> map = new HashMap<>();
        for(String str:strs){
            char []chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}
