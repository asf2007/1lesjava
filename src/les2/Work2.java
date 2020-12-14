package les2;

import java.util.Arrays;

public class Work2 {
    public static void main(String[] args) {


        int task1[] = {1, 1, 0, 1, 0, 0, 1, 0};

        for (int i = 0; i < task1.length;i++) {

            if (task1[i]==0){
                task1[i]=1;
            }
            else
            {task1[i]=0;}
        }
        System.out.println(Arrays.toString(task1));




        int[]task2 = new int[8];
        int n=0;
        for(int i = 0; i< task2.length; i++){
            task2[i] = n;
            n = n+3;
        }

        System.out.println(Arrays.toString(task2));
int m=0;
       int [] task3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
       for(int i =0 ; i< task3.length; i++){
           m = task3[i];
           if (m<6) {task3[i]=m*2;


           }

       }
        System.out.println(Arrays.toString(task3));

        int [][] task4 = new int[4][4];

        int i = 0;
        int j = 0;
        for (i = 0, j=0; i < 4; i++,j++) {


            task4[i][j] = 1;}

        for (i = 0, j=3; i <4; i++,j--) {


            task4[i][j] = 1;}


        for (i = 0; i < 4; i++) {
            for(j=0;j<4;j++) {

                System.out.print(task4[i][j]);
            }

            System.out.println();

        }

        int task5[] = {3,4,2,1,5,9,7,19};
        int max=task5[0];
        int min=task5[0];
        for (i=0;i<task5.length;i++){
            if (task5[i]>max){
                max=task5[i];

            }
            else  if (task5[i]<min){
                min = task5[i];
            }

        }

        System.out.println("min= "+ min +"   max= " +max);

        int [] task6Arr = {2,3,3,2};

        System.out.println(task6(task6Arr));



    }


    static boolean task6 (int arr6[] ){
        int sum =0;
        int sum2 = 0;
        for(int i = 0; i<arr6.length; i++){
            sum = sum+arr6[i];
        }
        sum2=sum;
        for(int i = 0; i<arr6.length; i++){
            sum2 = sum2-arr6[i];
            if(sum2==sum/2) {
                return true;
            }
            //return false;
        }
        return false;
    }


    }

