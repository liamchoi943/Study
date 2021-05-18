package com.liam.study;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int num = bNum;

        //System.out.print(num);

        long lNum = 10;
        float fNum = lNum;

        //System.out.print(fNum);
        double dNum = fNum + num;
        System.out.print(dNum);


    }
}
