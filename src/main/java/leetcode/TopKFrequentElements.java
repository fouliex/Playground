package leetcode;

import java.util.*;

/**
 *
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int n : map.keySet()) {
            int freq = map.get(n);
            if (bucket[freq] == null) {
                bucket[freq] = new LinkedList<>();
            }
            bucket[freq].add(n);
        }

        List<Integer> res = new LinkedList<>();
            for(int i= bucket.length -1; i > 0 && k>0; --i){
                if(bucket[i]!=null){
                    List<Integer> list = bucket[i];
                    res.addAll(list);
                    k -= list.size();
                }
            }

        System.out.println(Arrays.toString(bucket));
        System.out.println(map);
        return res;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        System.out.println(new TopKFrequentElements().topKFrequent(nums,3) );
    }
}
