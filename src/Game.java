public class Game {
    public Card card1;
    public Card card2;
    public Card[] deck;
    public int count = 0;

    public static void main(String[] args) {
        Game blackjack = new Game();
    }

    public Game() {
        System.out.println("game constructor");
        deck = new Card[52];
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 13; x++) {
                deck[count] = new Card(y, x);
                count++;
            }
        }
//        card1 = new Card(3, 5);
//        card2 = new Card(2, 7);
//        card1.print();
//        card2.print();
    }
}
