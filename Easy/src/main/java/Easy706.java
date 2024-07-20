import java.util.Arrays;

public class Easy706 {


    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1,1);

    }
}

class MyHashMap {

    int[] hashMap = new int[(int) Math.pow(10,6)];

    public MyHashMap() {
        Arrays.fill(hashMap, -1);
    }

    public void put(int key, int value) {
        hashMap[key] = value;
    }

    public int get(int key) {
        return hashMap[key] != -1 ? hashMap[key] : -1;
    }

    public void remove(int key) {
        hashMap[key] = -1;
    }
}
