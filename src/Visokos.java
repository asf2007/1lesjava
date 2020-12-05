public class Visokos {
    public static void main(String[] args) {
whatYear(2300);
    }

   static   void whatYear(int year){
        if ((year%4==0&&year%100!=0)||year%400==0){

                System.out.println("visokosniy");

        }
        else System.out.println("nevisokosniy");
    }
}
