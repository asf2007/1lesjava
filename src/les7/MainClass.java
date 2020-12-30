package les7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 90,false);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        System.out.println(cat.isSatiety());
        Plate plateCat = new Plate(50);
        Cat cats[]= new Cat[3];
        cats[0]= new Cat("Vasia",20, false);
        cats[1]= new Cat("Metis",40, false);
        cats[2]= new Cat("Matroskin",30, false);
plateCat.putEatInPlate(40);
        for(int i=0; i<cats.length;i++){
            cats[i].eat(plateCat);
            System.out.println(cats[i].getName()+" "+cats[i].isSatiety());
            plateCat.info();

        }
    }
}

