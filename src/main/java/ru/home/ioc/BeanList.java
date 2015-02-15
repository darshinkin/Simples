package ru.home.ioc;

import java.util.List;

/**
 * Created by dima on 15.02.15.
 */
public class BeanList {
    private List<String> list;
    private int a;

    public BeanList() {
    }

    public void printList() {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void init() {

    }

    public void close() {

    }

    public int getA() throws Exception {
        System.out.println("Running the method getA()!");
//        throw new Exception();
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
