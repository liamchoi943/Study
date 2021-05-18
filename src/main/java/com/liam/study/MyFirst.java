package com.liam.study;

/**
 * 리암이 개발했어요.
 */
public class MyFirst {
    public static void main(String[] args)
    {

    }
    //For fun: function with number input for gugudan
    static void gugudan(int mul) {
        for (int i = 1; i <= mul; i++) {
            System.out.print(i + "단   ");
        }
        System.out.println();
        for (int u = 1; u <= mul; u++) {
            for (int p = 1; p <= mul; p++) {
                //testing for number of digits in each number so that it looks nice
                int count = 0, num = u * p;
                while (num != 0) {
                    num /= 10;
                    ++count;
                }
                if (count == 1) {
                    System.out.print(u * p + "     ");
                } else {
                    System.out.print(u * p + "    ");
                }
            }
            System.out.println();
        }
    }
    public String getName()
    {
        return "Liam";
    }
    public int getAge()
    {
        return 28;
    }
}
