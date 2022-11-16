package testcase;

import java.security.KeyStore;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class s2 {
   public static Map<Integer,Integer> countNumber(int[] arr ) {
       Map<Integer, Integer> treeMap = new TreeMap<>();
       for (int key: arr) {
           if(!treeMap.containsKey(key)){
               treeMap.put(key,1);
           }else {
               int count = treeMap.get(key);
               treeMap.put(key,count+1);
           }
       }
       return treeMap;
   }

    public static void main(String[] args) {
       int[] arr = {1,1,2,2,2,2,3,3,4,5,1};
        System.out.println(countNumber(arr));
    }
}
