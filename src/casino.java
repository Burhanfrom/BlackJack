public class casino {

    public Card aceofHearts;
    public Card[] Deck;

    public static void main(String[] args) {
        casino x = new casino();
    }

    public casino() {
        System.out.println("Welcome to Burhan's Casino");
        Deck = new Card[52];
        int door = 0;
        Deck[0] = aceofHearts;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 13; i++) {
                aceofHearts = new Card(i, j);
                //  System.out.println(aceofHearts);
                aceofHearts.print();
                Deck[door] = aceofHearts;
                door++;
            }
        }
        shuffle();
        printdeck();
    }

    public void printdeck() {
        for (int i = 0; i < Deck.length; i++) {
            Deck[i].print();
            // Deck[i].print();
        }
    }

    public void shuffle() {

        for (int i = 0; i < 52; i++) {

            int esme = (int) (Math.random() * 52);

            Card temp = Deck[i];
            Deck[i] = Deck[esme];
            Deck[esme] = temp;

          //  Deck[0] = Deck[(int) (Math.random() * 52)];
            //Deck[0] = Deck [(int)(Math.random()*52)];
        }
    }
}