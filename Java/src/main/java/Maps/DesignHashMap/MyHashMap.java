package Maps.DesignHashMap;

import java.util.ArrayList;

class MyHashMap {

    ArrayList<Integer> mapList;
    int counter = -1;

    /** Initialize your data structure here. */
    public MyHashMap() {
        mapList = new ArrayList<Integer>();
        for (int i=0; i<1000001; i++) {
            mapList.add(i, -1);
        }
        ++counter;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        mapList.set(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return mapList.get(key);
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        mapList.set(key, -1);
    }
}

/**

    Hey DUMBASS
    - If you want to replace an EXISTING value in the ArrayList
     -> Use .set() instead of .add()

    Why ?
    - .add()  ADDS ANOTHER ELEMENT and DOES NOT REPLACE THE OLD ONE ...

    GEEZ TOOK ME FOREVER


 */
