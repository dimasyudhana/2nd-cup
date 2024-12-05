public class Main {
    
    public static void count(int nums,int duration) {
        
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started counting");
        
        for (int i = nums - 1; i >= 0; i--) {
            System.out.println(threadName + " " + i);
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void main(String[] args) throws Exception {
    
        Thread thread1 = new Thread(() -> count(20, 1000), "high-priority");
        Thread thread2 = new Thread(() -> count(20, 0), "low-priority");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        
        thread1.start();
        thread2.start();

    }

}
