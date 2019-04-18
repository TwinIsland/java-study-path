package classwork.ooj;

public class poly_test {

    public static void main(String args[]) {
        animals a = new dog();

        a.bark("Alex");
    }


}

class animals{

    void bark(String who){
        System.out.print("the animal: " + who + "bark");
    }


    void make_shit(){
        System.out.print("someone is making siht");
    }



}

class dog extends animals{
    void bark(String who){
        System.out.print("the dog: " + who + "bark");
    }

    void sayDog(){
        System.out.print("I am a dog");
    }

}

