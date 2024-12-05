public class Main {

    public static void count(int nums) {
        for (int i = nums - 1; i >= 0; i--) {
            System.out.println(Thread.currentThread().getName() + " " + i );
            if (!Thread.currentThread().getName().equals("thread-one")) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws Exception {

        // priority = order + length + age + urgency
        // order + length + age = unpredictable due to running by os
        // urgency = static that can be set able

        Thread thread1 = new Thread(() -> count(20), "thread-one");
        Thread thread2 = new Thread(() -> count(20), "thread-two");
        Thread thread3 = new Thread(() -> count(20), "thread-three");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
