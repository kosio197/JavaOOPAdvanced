package bg.softuni.card.deckofcards;

import bg.softuni.card.model.Card.Rank;
import bg.softuni.card.model.Card.Suit;

public class Main {
    public static void main(String[] args) {

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.println(rank + " of " + suit);
            }
        }
    }
}
