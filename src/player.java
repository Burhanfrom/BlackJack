public class player {
    public boolean isDealer;

    public int cardssum;

    public boolean isBust;

    public Card[] hand;


    public player(boolean pIsDealer, int pCardsSum, boolean pisBust) {
        isDealer = pIsDealer;
        cardssum = pCardsSum;
        isBust = pisBust;
        hand = new Card[2];

    }

    public void print() {
        if (isDealer) {
            System.out.println("the dealer has"+ cardssum+ "prints");
        } else {
            System.out.println("the player has" + cardssum + "prints");
        }
        ///TODO; print the hand
    }
}