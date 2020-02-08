package Sets.DesignHashSet;

import java.util.ArrayList;

public class MyHashSet {

    ArrayList<Integer> numList;


    /** Initialize your data structure here. */
    public MyHashSet() {
        numList = new ArrayList<Integer>();
    }

    public void add(int key) {
        if (numList.contains(key))
            return;

        numList.add(key);
    }

    public void remove(int key) {
        if (!numList.contains(key))
            return;

        numList.remove(numList.indexOf(key));
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return numList.contains(key);
    }
}