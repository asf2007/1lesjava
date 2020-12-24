package les5;

public class Main {
    public static void main(String[] args) {
        Worker person1 = new Worker("Alex","engineer", "fff@mail.ru", "78787878787",500,31);
        person1.info();
        Worker person[] = new Worker[5];
        person[0]= new Worker("Alexey Flyagin", "engineer", "000@mail.ru", "892544444444",80000, 31);
        person[1]= new Worker("Ivan Ivanov", "engineer", "111@mail.ru", "892544444487",70000, 45);
        person[2]= new Worker("Sergey Gogolev", "programmer", "222@mail.ru", "892544444475",100000, 35);
        person[3]= new Worker("Anton Petrov", "manger", "333@mail.ru", "892544444488",75000, 42);
        person[4]= new Worker("Roman Semenov", "administrator", "444@mail.ru", "892544444499",80000, 39);
        for(int i = 0; i<person.length; i++){
            if(person[i].getAge()>40){
                person[i].info();
            }
        }
    }

}

