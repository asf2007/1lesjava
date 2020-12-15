package les3;

import java.util.Random;
import java.util.Scanner;

public class Work3Star {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", " broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"
        };

        int numWord;
        String in;
        Random rand = new Random();
        numWord = rand.nextInt(words.length - 1);
        numWord=0;

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("write your word");
            in = input.next();
            if (in.equals(words[numWord]) == false) {
                int j;

                    for ( j=0;(j<words[numWord].length())&&(j<in.length());j++)
                    {
                    char letterIn = in.charAt(j);
                    char letterWords = words[numWord].charAt(j);

                    if(letterIn==letterWords){
                        System.out.print(letterIn);

                    }
                    else {
                        System.out.print("#");
                    }}
                    for (int i = j; i<15;i++){
                    System.out.print("#");
                }
                System.out.println("");

            }
            else if  (in.equals(words[numWord]) ) {
                System.out.println("you win!!!!");
                break;
            }
        }
    }

}
