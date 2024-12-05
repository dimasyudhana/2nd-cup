package model;

public class AthleteThread extends Thread {
    
    private int bibNum;

    public AthleteThread(String name, int priority, int bibNum) {
        this.setName(name);
        this.setPriority(priority);
        this.bibNum = bibNum;
    }

    public int getBibNum() {
        return bibNum;
    }

    public void setBibNum(int bibNum) {
        this.bibNum = bibNum;
    }

    @Override
    public void run() {
        double dst = 10;
        double steps = 0.0000001;
        for (double i = 0; i <= dst; i += steps) {
            if (Math.abs(i - dst) < steps) {
                System.out.println("\n atlit no." + this.bibNum + " " + this.getName() + " finish" );
                break;
            }
        }
    }
}
