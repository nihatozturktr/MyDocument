package com.company;

public class Main {

    public static void main(String[] args) {
        //Max Method Find Highest number!
        int a = 10; int b = 11;
        System.out.println(Math.PI);
        System.out.println(Math.PI);
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.sqrt(32));
        System.out.println(Math.sqrt(-10));
        double getNumber = Math.random()*100; // 0-99
        System.out.println(Math.round(getNumber));
	        /*   String[] names = {“Ali”,”Veli”,”Deli”};
	        System.out.println(Math.round(GetIndexNum));
	       */

        //Digital2016!   wifi password
        String[] names = {"Ali", "Veli", "Deli"};
        double GenIndexNum =Math.random() * 2;
        float GetIndexNum;
        System.out.println(Math.round(GenIndexNum));

        System.out.println(names[(int)Math.round(GenIndexNum)]);

    }
}
