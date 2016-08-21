package bg.softuni.cardrank;

import bg.softuni.card.model.Card.Rank;

public class CardRank {
    public static void main(String[] args) {

        int count = 0;
        System.out.println("Card Ranks:");

        for (Rank card : Rank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", count++, card.toString());
        }
    }
}
