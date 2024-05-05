import org.example.Liquid;

public class Cat {
    private String name;
    private  String age;

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public Liquid drink(int age){
        if (age <= 0){
            throw new IllegalArgumentException();
        }
        if (age>3){
            new Liquid("Super milk");
        } else if (age <3&& age>1){
            new Liquid("Milk for children");
        }
        return  new Liquid("No milk");
    }
}


