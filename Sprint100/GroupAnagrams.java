import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"ate","eat","tea","hi"};;
        System.out.println(groupinganagrams(str));

    }
    static List<List<String>> groupinganagrams(String[] str){
        //create a hashmap
        Map<String, List<String>> ans = new HashMap();
        for(String s : str){
            /*if(s.isEmpty()){
                continue;
            }*/
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            //again convert to string
            String key = new String(chars);
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        return new ArrayList<>(ans.values());

    }
    
}
