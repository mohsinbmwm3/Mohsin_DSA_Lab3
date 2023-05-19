package com.mohsin.dsa.lab3.bracket;

class BracketMain {
    public static void main(String[] args) {
        BracketUtil util = new BracketUtil();
        boolean result = util.areBracketsBalanced("{([([])])");
        System.out.println(result);
    }
}

