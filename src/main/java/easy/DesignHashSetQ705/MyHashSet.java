package easy.DesignHashSetQ705;

import java.util.*;

public class MyHashSet {
    /** Initialize your data structure here. */

    Map<Integer, Integer> index;

    public MyHashSet() {
         index = new HashMap<>();
//        this.index=new int[1000000];
    }

    public void add(int key) {
        Integer indexLoc = Objects.hash(key);
        index.put(indexLoc, key);
    }

    public void remove(int key) {
        Integer indexLoc = Objects.hash(key);
        index.remove(indexLoc);

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        Integer indexLoc = Objects.hash(key);
        return index.containsKey(indexLoc);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */