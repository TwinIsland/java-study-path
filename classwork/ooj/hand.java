package classwork.ooj;


class hand extends deck {

    public hand() {
        for (int k = cardLeft() - 1; k >= 0; k--) {
            removeCard(k);
        }
    }

    int howMany(String suit) {
        int count = 0;
        for (int k = cardLeft() - 1; k >= 0; k--) {
            if (cardAt(k).getSuit().equals(suit))
                count++;
        }
        return count;
    }

    void sortByNumber(){


    }

    @Override
    void addCard(card Card) {
        super.addCard(Card);
    }

    @Override
    void removeCard(int index) {
        super.removeCard(index);
    }

    void sortBySuit(){

        // similar to method of Insertion Sort

        sortByNumber();
        for(int cardIndex = 0; cardIndex < cardLeft()-1; cardIndex ++){
            String suitNow = cardAt(cardIndex).getSuit();
            for(int loopedCardIndex = cardIndex + 1; loopedCardIndex < cardLeft() ;loopedCardIndex ++){
                // if find the same index card
                if(cardAt(loopedCardIndex).getSuit().equals(suitNow)){
                    //put into the end of this type of class
                    setCard(cardIndex,cardAt(loopedCardIndex));
                    removeCard(loopedCardIndex ++);
                }
            }
        }

        //check the last card

        String cardSuit = cardAt(cardLeft()-1).getSuit();

        for(int cardIndex = cardLeft()-2; cardIndex >=0; cardIndex --){
            if(cardAt(cardIndex).getSuit().equals(cardSuit)){
                setCard(cardIndex,cardAt(cardLeft()-1));
                removeCard(cardLeft()-1);
            }
        }
    }
}

