public class Card {
    public String suit;
    public int value;
    public String name;
    public Boolean isDealt;

    public Card(int pSuit, int pName) {
        if (pSuit == 0) {
            suit = "Diamonds";
        }
        if (pSuit == 1) {
            suit = "Hearts";
        }
        if (pSuit == 2) {
            suit = "Clubs";
        }
        if (pSuit == 3) {
            suit = "Spades";
        }
        if (pName == 0) {
            name = "Ace";
        }
        if (pName == 1) {
            name = "Two";
        }
        if (pName == 2) {
            name = "Three";
        }
        if (pName == 3) {
            name = "Four";
        }
        if (pName == 4) {
            name = "Five";
        }
        if (pName == 5) {
            name = "Six";
        }
        if (pName == 6) {
            name = "Seven";
        }
        if (pName == 7) {
            name = "Eight";
        }
        if (pName == 8) {
            name = "Nine";
        }
        if (pName == 9) {
            name = "Ten";
        }
        if (pName == 10) {
            name = "Jack";
        }
        if (pName == 11) {
            name = "Queen";
        }
        if (pName == 12) {
            name = "King";
        }
        System.out.println("You made the " + name + " of " + suit);
    }
    public void print() {
        System.out.println("This card is the " + name + " of " + suit);
    }
}
