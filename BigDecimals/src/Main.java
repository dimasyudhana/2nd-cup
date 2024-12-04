package BigDecimals.src;

import java.math.BigDecimal;

public class Main {
    
    public static void main(String[] args) {
        
        double x1 = 0.1;
        double y1 = 0.2;

        double z1 = x1 + y1; // 0.30000000000000004

        System.out.println(z1);

        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.2");

        System.out.println(x);
        System.out.println(y);

        System.out.println(x.add(y)); // 0.3
        System.out.println(x.subtract(y)); // -0.1

    }

}