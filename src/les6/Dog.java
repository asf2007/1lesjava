package les6;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if(distance<=500){

            super.run(distance);}
        else {
            System.out.println("too much for dog");
        }
    }

    @Override
    public void swim(int swdistance) {
        if(swdistance<=10){
            super.swim(swdistance);}
        else {
            System.out.println("too much swim for Dog");
        }
    }
}

