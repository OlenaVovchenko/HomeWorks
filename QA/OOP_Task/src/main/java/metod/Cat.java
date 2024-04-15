package metod;

public class Cat {
    String name;
    int age;
    String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isHealth() {
        return true;
    }

    public void eatCat(){
        System.out.println("Кошечка хорошо кушает");
    }
    public Dog friend(){
        return new Dog("Rex",5,"Tai richbek");
    }
}
