package les3;

import java.util.Random;
import java.util.Scanner;

public class Work3 {public static void main(String[] args) {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    int num;
    int in;
    int yes;
    while(true){
        // Random rand = new Random();
        num =  rand.nextInt(9);
        //Scanner input = new Scanner(System.in);
        for (int i = 0; i<3; i++) {
            System.out.println("Write your number from 0 to 9");
            in = input.nextInt();

            if (in==num){
                System.out.println("YOU WIN");
            }
            else if (in>num){
                System.out.println("your number is biger");
            }
            else if(in<num){
                System.out.println("your number is less");
            }
        }

        System.out.println("write 1 to try again, 0 to stop ");
        yes = input.nextInt();

        if(yes==0){
            System.out.println("game finish");
            break;
        }
        else if (yes==1){
            System.out.println("new game1");
        }
    }
    //while (yes);
}

}
