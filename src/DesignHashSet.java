import java.util.Hashtable;

public class DesignHashSet {
    //实际上这个写的是hashmap
    public int[] tmp = new int[1000001];

//    public MyHashMap() {
//        for(int i = 0; i < tmp.length; i++){
//            tmp[i] = 0;
//        }
//    }

    public void put(int key, int value) {
        tmp[key] = value;
    }

    public int get(int key) {
        return tmp[key];
    }

    /** Returns true if this set contains the specified element */
    public void remove(int key) {
        tmp[key] = 0;
    }
}
