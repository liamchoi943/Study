package com.liam.study;

public class Conditionals {
    public static void main(String[] args) {
        int rank = 2;
        String medalcolour = "Default";
        if (rank == 1) {
            medalcolour = "G";
        }
        else { medalcolour = "loser"; }
        System.out.println(medalcolour);

        int rank2 = 4;
        switch (rank2) {
            case 1: case 0: case 7: case 10:
                medalcolour = "Gold";
                break;
            case 2:
                medalcolour = "Silver";
                break;
            case 3:
                medalcolour = "Bronze";
                break;
            default:
                medalcolour = "loser";
                System.out.println("get lost");
                System.out.println(medalcolour);
        }

        }
    }
