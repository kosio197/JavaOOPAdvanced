package bg.softuni.card.model;

import bg.softuni.card.custom_anotation.CustomEnumAnnotation;

public class Card implements Comparable<Card> {

    @CustomEnumAnnotation(type = "Enumeration", category = "Rank", description = "Provides rank constants for a Card class.")
    public enum Rank {
        ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(
                12), KING(13);

        private int value;

        private Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    @CustomEnumAnnotation(type = "Enumeration", category = "Suit", description = "Provides suit constants for a Card class.")
    public enum Suit {
        CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
        private int value;

        private Suit(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    private Rank rank;
    private Suit suit;
    private int power;

    public Card(Rank rank, Suit suit, int power) {
        super();
        this.rank = rank;
        this.suit = suit;
        this.power = power;
    }

    public int getValue() {
        return power;
    }

    public void setValue(int value) {
        this.power = value;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", rank, suit, power);
    }

    @Override
    public int compareTo(Card o) {
        return this.power > o.power ? 1 : this.power < o.power ? -1 : 0;
    }

    @Override
    public boolean equals(Object obj) {
        Card c = null;
        if (obj instanceof Card) {
            c = (Card) obj;
        } else {
            throw new ClassCastException("Invalid Card: " + obj);
        }
        return this.rank.equals(c.rank) && this.suit.equals(c.suit);
    }
}
