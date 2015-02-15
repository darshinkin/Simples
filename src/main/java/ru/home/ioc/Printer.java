package ru.home.ioc;

/**
 * Created by dima on 15.02.15.
 */
public class Printer implements IPrintf {
    private String s;
    private int a;

    public Printer(String s, int a, int b) {
        this.s = s;
        this.a = a;
    }

    public Printer() {
        s = "String";
    }

    @Override
    public void printf() {
        System.out.println(s+"  =   "+a);
    }
}
