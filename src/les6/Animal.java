package les6;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void run (int distance){
        System.out.println(name+ " run " + distance);
    }

    public void swim (int swdistance){
        System.out.println(name+ " swim " + swdistance);
    }
}

