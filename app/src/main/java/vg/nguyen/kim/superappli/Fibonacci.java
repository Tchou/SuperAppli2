package vg.nguyen.kim.superappli;

import android.support.annotation.MainThread;

import java.math.BigDecimal;

public class Fibonacci {

    @MainThread
    public static BigDecimal compute(int n) {

        if (n <= 1) {
            return new BigDecimal(1);
        }
        else {
            System.err.println(n);
            return compute(n-1).add(compute(n-2));
        }
    }

}
