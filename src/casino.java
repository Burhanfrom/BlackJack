import java.util.Scanner;

public class casino {

    public Card aceofHearts;
    public Card[] Deck;
    public player Jai;
    public player Dealer;

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


        Jai = new player(false,0,false);


        Dealer = new player(false,0,false);
        Deal();
        Jai.print();
        Dealer.print();

        //Source;https://www.theserverside.com/tutorial/How-Javas-Systemin-reads-input-from-the-user
        System.out.println("Do you want to Hit or Stay");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(name + " is a great choice");

       if(name.equals("hit")){
           //code for hit
           System.out.println("you chose to hit");



       } else{
           //code for stand
           System.out.println("you chose to stand");
       }

    }


    public void Deal(){
        Jai.hand[0] = Deck[0];

        Jai.hand[1]=Deck[1];
        Jai.cardssum= Jai.hand[1].value +Jai.hand[0].value;
        Dealer.hand[0]=Deck[2];
        Dealer.hand[1]=Deck[3];

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