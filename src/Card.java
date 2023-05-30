public class Card {
    public String suit;
    public int value;
    public String name;
    public Boolean isDealt;

    public Card(int pSuit, int pName) {
        if (pSuit == 0) {
            suit = "Diamond";
        }
    }
}
