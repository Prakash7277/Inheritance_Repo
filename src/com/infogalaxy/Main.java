package com.infogalaxy;

public class Main {
    public static void main(String[] args) {
        ResultImpl result = new ResultImpl();
        result.setStudent();
        result.setPerc();
        result.calculate();
        result.showResult();
    }
}
