//importing packages
// import java.util.*;
// import bank;

//static keyword
class Student1 {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

//interface
interface Animal1 {
    int eyes = 2;
    void walk();
}

interface Herbivore {

}

class Horse1 implements Animal1, Herbivore {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}


//abstraction
abstract class Animal {
    abstract void walk();

    //constructor chaining
    Animal() {
        System.out.println("You are creating a new Animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

//inheritance
class Shape {
    String color;

     //types of inheritance
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

//classes and objects
class Pen {
    String color;
    String type;//ballpoint; gel

    public void write() {
        System.out.println("Writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    // public void printInfo() {
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    // }

    //polymorphism
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " "+ age);
    }

    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}



public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";
        
        pen1.write();

        pen1.printColor();
        pen2.printColor();

        // Student s1 = new Student("Srishti", 24);
        Student s1 = new Student();
        s1.name = "Srishti";
        s1.age = 21;

        //copy constructor
        // Student s2 = new Student(s1);
        // s2.printInfo();

        // s1.printInfo();

        //polymorphism
        s1.printInfo(s1.name, s1.age);

        //inheritance
        Triangle t1 = new Triangle();
        t1.color = "red";
        
        // bank.Account account1 = new bank.Account();
        // account1.name = "customer1";

        // Horse horse = new Horse();
        // horse.walk();
        // horse.eat();

        //static keyword
        Student1.school = "ABC";
        Student1 student1 = new Student1();
        student1.name = "tony";
        // System.out.println(student1.school);
    }
}
