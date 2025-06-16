class Animal {
    
    String name;
    int age;

    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void sound() {
        System.out.println(name + " makes a sound.");
    }

    public void info() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Animal("Buddy", 5);
        dog.info();    
        dog.sound();   

        Animal cat = new Animal("Whiskers", 3);
        cat.info();    
        cat.sound();   
    }
}