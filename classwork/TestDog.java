package classwork;

class Animal{
    public void move(){
        System.out.println("animal can move");
    }
}

class Dog extends Animal{

    public void move(){
        System.out.println("dog cna run and walk");
    }

    public void bark(){
        System.out.println("dog can bark");
    }

}

public class TestDog{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象
        Dog steven = new Dog();

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        //b.bark();

    }
}