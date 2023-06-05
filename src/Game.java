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
        for (int s = 0; s < 4; s++) {
            for (int n = 0; n < 13; n++) {
                deck[count] = new Card(s, n);
                count++;
            }
        }
//        for (int i = 0; i < deck.length; i++) {
//            deck[i].print();
//        }
//        card1 = new Card(3, 5);
//        card2 = new Card(2, 7);
//        card1.print();
//        card2.print();
        shuffle();
    }
    public void shuffle() {
        Card[] shuffledDeck = new Card[52];
        for (int f=0;f<shuffledDeck.length;f++) {
            int randomCard = (int)(Math.random()*52);
            Card shuffleCard = deck[randomCard];
            while (deck[randomCard].isDealt == true) {
                randomCard = (int)(Math.random()*52);
                shuffleCard = deck[randomCard];
            }
            deck[randomCard].isDealt = true;
            shuffleCard.print();

            shuffledDeck[f] = shuffleCard;
        }
        deck = shuffledDeck;
    }
}
