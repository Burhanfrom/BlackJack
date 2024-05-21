public class Card {

    //public static void main(String[] args) {

public String suit;

public int value;

public String name;

public Card(int pname,int psuit){
//name=pname;
//suit=psuit;

    if(pname == 0){
    value = 11;
    name="Ace";
}
    if(pname == 1) {
        value = 2;
        name = "Two";
    }
        if(pname == 3) {
            value = 4;
            name = "three";
        }
    if(pname == 4) {
        value = 5;
        name = "four";
    }
    if(pname == 5) {
        value = 6;
        name = "five";
    }
    if(pname == 6) {
        value = 7;
        name = "six";
    }
    if(pname == 7) {
        value = 8;
        name = "seven";
    }
    if(pname == 8) {
        value = 9;
        name = "eight";
    }
    if(pname == 9) {
        value = 10;
        name = "nine";
    }
    if(pname == 10) {
        value = 10;
        name = "jack";
    }
    if(pname == 11) {
        value = 10;
        name = "QUEEN";
    }
    if(pname == 12) {
        value = 10;
        name = "King";
    }


        if(psuit == 0){
         suit = "Hearts";

        }
    if(psuit == 1){
        suit = "Diamonds";

    }
    if(psuit == 2){
        suit = "Spades";

    }
    if(psuit == 3){
        suit = "Clubs";

    }

  //  System.out.println("the Ace of diamonds is worth 11 points");

    }
    public void print(){
    System.out.println("the" + name + "if" + suit + "is worth" +value+ "points");
    }
}
