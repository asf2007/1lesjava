package les7;

public class Cat {
    private String name;
    private int appetite;
   private boolean satiety;

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;

        this.satiety = satiety;
    }
    public void eat(Plate p) {
        if (p.getFood()>=appetite) {
        p.decreaseFood(appetite);
        satiety=true;
        }
        else {
            System.out.println("too litle food for  "+name);
        }
    }
}

