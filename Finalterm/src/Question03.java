import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question03 {
    /*
    Given an array of strings strs, group the anagrams together.
    You can return the answer in any order.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.//
     */

    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>>  res = new ArrayList<>();
                Map<String, ArrayList<String>> groupMap = new HashMap<>();
                for(String str: strs){
                    char[] arr = new char[26];
                    for(char c : str.toCharArray()){
                        arr[c-'a'] += 1;
                    }
                    String keyChar = new String(arr);
                    if(groupMap.containsKey(keyChar)){
                        groupMap.get(keyChar).add(str);
                    } else {
                        ArrayList<String> addItems = new ArrayList<>();
                        addItems.add(str);
                        groupMap.put(keyChar, addItems);
                    }
                }
                res.addAll(groupMap.values());
                return res;
            }
        }




