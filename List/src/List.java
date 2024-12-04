package List.src; 

public interface List {
    void add(String element);
    String get(int index);
}
 
class ArrayList implements List {
    @Override
    public void add(String element) {
        // Implementation specific to ArrayList
    }
 
    @Override
    public String get(int index) {
        // Implementation specific to ArrayList
        return null;
    }
}
 
class LinkedList implements List {
    @Override
    public void add(String element) {
        // Implementation specific to LinkedList
    }
 
    @Override
    public String get(int index) {
        // Implementation specific to LinkedList
        return null;
    }
}
 
class Main {
    public static void processList(List list) {
        list.add("element");
        System.out.println(list.get(0));
    }
 
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
 
        processList(arrayList);
        processList(linkedList);
    }
}