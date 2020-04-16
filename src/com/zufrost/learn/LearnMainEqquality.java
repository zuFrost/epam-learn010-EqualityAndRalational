package com.zufrost.learn;

public class LearnMainEqquality {
    public static void main(String[] args) {
        int count = 1;
       /* System.out.println(count < 1);
        System.out.println(count < 0);
        System.out.println(count <= 0);
        System.out.println(count >= 0);
        System.out.println(count == 0);
        System.out.println(count != 1);*/

        Object object1 = new Object();
        Object object2 = object1;
        Object object3 = null;

        System.out.println(object1 == object2);
        System.out.println(object3 == null);

        System.out.println("\n Машинный ноль");
        float result = 1 / 3.0f * 3;
        System.out.println(1.f == result);
        System.out.println(1.0000000123123f == 1.0000000213532f);

    }
}
