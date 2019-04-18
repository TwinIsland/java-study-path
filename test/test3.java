package test;


public class test3{

    static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    static void printSum(int a, int b){
        System.out.print(a + b);
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }


    public static void main(String args[]) {

        System.out.print(sum(2,3));

        //TODO printSum(2,3);

        printSum(10,101);

        //TODO sum(2,3,4) return 9
        System.out.print(sum(2,3,4));

        //TODO sum(19,20)  return Wyatt39

        people a = new people(11,"Alex");

        System.out.println(a.getName());

        superHero b = new superHero(15,"Wyatt",10);
        System.out.println(b.getName());
        b.saySlogan();

    }
}


class people{

    //constructor
    private int age;
    private String name;
    private int birthDate;

    //init constructor
    public people(int age,String name){
        this.age = age;
        this.name = name;
    }

    //method
    String getName(){
        return name;
    }
}

abstract class Animal {

    abstract void saySomething();
    abstract void drawCircle(String a);

}

abstract class roket extends Animal{
    void test(){System.out.print("a");}
}

abstract class alex extends Animal implements Steven{

    void saySomething(){
        System.out.print("a");
    }

    void drawCircle(String a){
        System.out.print(a);
    }

}


class superHero extends people{


    private int level;

    public superHero(int age,String name,int leval){
        super(age,name);
        this.level = leval;
    }


    //say hero comes
    void saySlogan(){
        System.out.print("hero comes");
    }
}

abstract class testa {
    abstract void bbbbb();

}
interface Steven {
    static final boolean needsFood = true;
    static final int hearts = 1;
    void eat();
    void move();
}
