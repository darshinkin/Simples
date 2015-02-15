package ru.home.ioc;

/**
 * Created by dima on 15.02.15.
 */
public class Single {
    private static Single single;

    private Single() { }

    public static Single getInstance() {
        if (single==null) {
            single = new Single();
        }
        return single;
    }

    public double pow(double a) {
        return a * a;
    }
}
