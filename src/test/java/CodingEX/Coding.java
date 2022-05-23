package CodingEX;


import java.util.Random;

public class Coding {

    public static void main(String[] args) {

        int start = 0;
        int roll = 0;
        int end = 0;
        Random random = new Random();



        for (int i = 0; i < 30; i++) {

            roll = random.nextInt(6)+1;

            System.out.println("start = " + start);

            start += roll;

            end = start;

            if (start>=40){
                start = 0;
            }

            if (end>=40){
                int temp=  0;
                temp = end - roll;
                end = end - temp;
            }

            System.out.println("roll = " + roll);
            System.out.println("end = " + end);

            System.out.println("---------------");

        }






        }

    }


/*
1. Let's create a game where we roll a die, and move a player around a game board.
The board has 40 spaces, arranged in a circle

The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
- roll the die (each die has a random value, 1-6)
- print player start position, die value, and ending position

sample output:

    //     start=0, roll=3, end=3
    //     start=3, roll=2, end=5
    //     ...
//     start=38, roll=6, end=4

 */
