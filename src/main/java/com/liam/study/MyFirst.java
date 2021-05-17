package com.liam.study;

/**
 * 리암이 개발했어요.
 */
public class MyFirst {
    public static void main(String[] args)
    {
        System.out.println("hello world");
        MyFirst myFirst = new MyFirst();
        //System.out.println(myFirst.getName());
        //System.out.println(myFirst.getAge());
        //System.out.println(myFirst.Multiplier());

        //Vertical Version
       /* for (int i = 1;i<=9;i++) {
            System.out.println(i + "단");
            for (int n = 1;n <= 9; n++) {
                System.out.println(i * n);
            }
        }*/
        //Horizontal Version
        for (int i = 1;i<=9;i++) {
            System.out.print(i + "단   ");
        }
        System.out.println();
        for (int u = 1;u<=9;u++) {
            for (int p = 1; p <= 9; p++) {
                //testing for number of digits in each number so that it looks nice
                int count = 0, num = u * p;
                while (num != 0) {
                    num /= 10;
                    ++count;
                }
                if (count == 1) {
                    System.out.print(u * p + "     ");
                }
                else {
                    System.out.print(u * p + "    ");
                }
            }
            System.out.println();
        }
    }
    public int Multiplier(){
        return 1;
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
