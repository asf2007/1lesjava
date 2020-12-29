package les6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if(distance<=200){
            super.run(distance);}
        else {System.out.println("too much for Cat");}
    }

    @Override
    public void swim(int swdistance) {
        if(swdistance>0){
            System.out.println("Cat cannot swim");

        }
        // super.swim(swdistance);
    }
}

