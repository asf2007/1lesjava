import org.w3c.dom.ls.LSOutput;

public class Work1 {
    public static void main(String[] args) {
        //////////////2task
        int a=10;
        short b =3;
        long c = 97L;
        byte d = 16;
        char e = 'b';
        float n = 1.78f;
                double m = 36.888;
                boolean v = true;
                String word = "hallo";
                ////////////////////////////3task
        System.out.println("a * (b + (c / d)) = " + task3(1f,2f,2f,8f));
        ////////////////4task
        System.out.println("sum 10...20   "+task4(3,40));

        //////task5
        task5(30);

        ////////task6
        System.out.println(task6(-7));
        ////task7
        task7("Alex");



    }

   static float task3(float a, float b, float c, float d) {


       return  a * (b + (c / d));

    }
    static boolean task4 ( int a1, int a2) {
        int sum = a1 + a2;
        if (sum>=10&&sum<=20){
           return true ;
        }
        else return false;
    }

    static void task5 ( int number) {
        if(number>=0){
            System.out.println("Positive");
        }
        else System.out.println("negative");
    }



    static boolean task6 (int num){
       if (num >=0){
           return false;
       }
       else return true;
    }

     static void task7 (String name) {

        System.out.println("Hellow, " + name);

    }



}
