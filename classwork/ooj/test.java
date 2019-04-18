package classwork.ooj;

import java.util.*;

class Card{
    private int value;
    private String suit;
    private String name;
    public Card(){
        name = "some card";
        suit = "some suit";
        value = -1;
    }
    public Card(int value, String suit){
        suit = suit;
        value = value;
        name = "" + value + " of " + suit;
    }

    public String getName(){
        return name;
    }
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setSuit(String newSuit){
        this.suit = newSuit;
    }
    public void setValue(int newValue){
        this.value = newValue;
    }
}
class Deck{
    private ArrayList<Card> y;
    public Deck(){
        y=new ArrayList<Card>();
        for(int i=1;i<14;i++){
            Card m = new Card(i,"Diamonds");
            Card n = new Card(i,"Hearts");
            Card p = new Card(i,"Spades");
            Card q = new Card(i,"Clubs");
            y.add(m);
            y.add(n);
            y.add(p);
            y.add(q);
        }
    }
    public void print(){
        for(int i=0;i<y.size();i++){
            Card x=y.get(i);
            System.out.println(x.getName());
        }
    }
    public void isEmpty(){
        int remain = y.size();
        if(remain==52){
            System.out.println("No cards lefted");
        }else{
            System.out.println("Some cards lefted");
        }
    }
    public Card cardAt(int index){
        return y.get(index);
    }
    public void addCard(int m, Card n){
        y.add(m,n);
    }
    public void removeCard(int m){
        y.remove(m);
    }
    public void setCard(int index, Card c){
        y.set(index,c);
    }
    public void shuffle(){
        for(int i=0;i<y.size();i++){
            Card a=y.get(i);
            int m=(int)(Math.random()*y.size());
            Card b=y.get(m);
            y.set(m,a);
            y.set(i,b);
        }
    }
}