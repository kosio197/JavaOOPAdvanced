package bg.softuni.cardsuit;

import bg.softuni.card.model.Card.Suit;

public class CardSuit {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        for (Suit card : Suit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", card.getValue(), card.toString());
        }
    }
}
