package classwork.ooj;

import java.util.ArrayList;

class deck{

    private ArrayList<card> deck = new ArrayList<card>();

    public deck() {
        String[] suitDict = {"black","red","red","yellow"};
        int[] numberDict = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        //make the card
        for(String suitSingle:suitDict){
            for(int numberSingle:numberDict){
                card tempCard = new card(suitSingle,numberSingle);
                deck.add(tempCard);
            }
        }
    }

    void print() {
        for (card i : deck)
            System.out.println(i.getName());
    }

    boolean isEmpyty() {
        return deck.size() == 0;
    }

    int cardLeft() {
        return deck.size();
    }

    card cardAt(int number) {
        return deck.get(number);
    }

    void addCard(card Card) {
        deck.add(Card);
    }

    void setCard(int index, card C) {
        deck.set(index, C);
    }


    void shuffle() {
        for (card i : deck) {
            int replace_index = (int) (Math.random() * cardLeft());
            deck.set(replace_index, i);
        }
    }

    void removeCard(int index){
        deck.remove(index);
    }

    void test(){

    }
}


class card {

    //constractor
    card(String shape, int num) {
        suit = shape;
        value = num;
        name = suit + "-----" + num;
    }

    private String name;
    private String suit;
    private int value;


    String getName() {
        return name;
    }

    String getSuit() {
        return suit;
    }

    int getValue() {
        return value;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSuit(String suit) {
        this.suit = suit;
    }

    void setValue(int value) {
        this.value = value;
    }

}

