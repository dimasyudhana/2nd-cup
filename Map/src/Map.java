package Map.src; 

public interface Map {
    void put(String key, int value);
    int get(String key);
}
 
class HashMap implements Map {
    @Override
    public void put(String key, int value) {
        // Implementation specific to HashMap
    }
 
    @Override
    public int get(String key) {
        // Implementation specific to HashMap
        return 1;
    }
}
 
class TreeMap implements Map {
    @Override
    public void put(String key, int value) {
        // Implementation specific to TreeMap
    }
 
    @Override
    public int get(String key) {
        // Implementation specific to TreeMap
        return 2;
    }
}
 
class Main {
    public static void processMap(Map map) {
        map.put("one", 1);
        System.out.println(map.get("one"));
    }
 
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map treeMap = new TreeMap();
 
        processMap(hashMap);
        processMap(treeMap);
    }
}