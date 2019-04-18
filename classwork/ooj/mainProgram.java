package classwork.ooj;

public class mainProgram {

    public static void main(String[] args) {

        // initialize
        deck cardLib = new deck();
        hand[] hands = new hand[4];

        //check card number
        System.out.println("Total Card: " + cardLib.cardLeft());

        // allocate card for hand
        cardLib.shuffle();

        for(int handIndex = 0; handIndex <4; handIndex ++){
            hands[handIndex] = new hand();
            for(int cardIndex = 0; cardIndex <= 12; cardIndex ++){
                hands[handIndex].addCard(cardLib.cardAt(cardIndex));
            }
        }


        hands[1].sortByNumber();
        hands[1].print();
    }
}

