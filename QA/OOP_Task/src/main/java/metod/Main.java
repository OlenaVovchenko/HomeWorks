package metod;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka",2,"best");
        Dog dog = new Dog("Gray", 2, "Taksa");

        System.out.println(cat.isHealth());
        cat.eatCat();
        System.out.println("Друг кошечки: " + cat.friend());

        System.out.println("Все собачки здоровы  " + dog.isHealth());
        dog.barksDog();

    }
}
