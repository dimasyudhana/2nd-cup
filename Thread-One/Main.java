public class Main {
        
    public static void asc(int nums) {

        for (int i = 0; i < nums; i++) {
            System.out.println(i);
        }

    }

    public static void desc(int nums) {

        for (int i = nums - 1; i >= 0; i--) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        
        Thread childThread = new Thread(() -> desc(100)); 

        childThread.start();

        asc(100);


    }            

}
