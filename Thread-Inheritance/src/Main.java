import model.AthleteThread;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Thread firstAthlete = new Thread(() -> {
        //     int number = 85728;
        //     race(number);
        // });

        // Thread secondAthlete = new Thread(() -> {
        //     int number = 63209;
        //     race(number);
        // });

        AthleteThread firstAthlete = new AthleteThread("abc", Thread.MAX_PRIORITY, 85728);
        AthleteThread secondAthlete = new AthleteThread("xyz", Thread.MIN_PRIORITY, 63209);
        firstAthlete.start();
        secondAthlete.start();
    
    }

}
