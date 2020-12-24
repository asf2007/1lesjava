package les5;

public class Worker {
    private String fio = new String();
    private String position = new String();
    private   String email = new String();
    private String telephone = new String();
    private int  salary;
    private   int age;

    public Worker(String fio, String position, String email, String telephone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public  void info (){
        System.out.println("fio: "+ fio + " position: " + position + " email: "+email+" telephone: "+ telephone+
                " salary: "+salary+" age: "+age);
    }
}

