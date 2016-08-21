package bg.softuni.card.cardgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.card.cardgame.player.contract.CardPlayer;
import bg.softuni.card.cardgame.player.model.MyCardPlayer;
import bg.softuni.card.model.Card;
import bg.softuni.card.model.Card.Rank;
import bg.softuni.card.model.Card.Suit;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        CardPlayer player1 = new MyCardPlayer(br.readLine());
        CardPlayer player2 = new MyCardPlayer(br.readLine());

        Card maxCard1 = null;
        Card maxCard2 = null;

        while (player1.getCards().size() < 5) {
            String cardInfo[] = br.readLine().split(" of ");
            try {
                Rank rank = Rank.valueOf(cardInfo[0]);
                Suit suit = Suit.valueOf(cardInfo[1]);
                Card card = new Card(rank, suit, rank.getValue() + suit.getValue());

                if (!player1.getCards().contains(card)) {
                    player1.addCard(card);
                    if (maxCard1 == null || card.compareTo(maxCard1) > 0) {
                        maxCard1 = card;
                    }
                } else {
                    System.out.println("Card is not in the deck.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("No such card exists.");
            }
        }

        while (player2.getCards().size() < 5) {
            String cardInfo[] = br.readLine().split(" of ");
            try {
                Rank rank = Rank.valueOf(cardInfo[0]);
                Suit suit = Suit.valueOf(cardInfo[1]);
                Card card = new Card(rank, suit, rank.getValue() + suit.getValue());

                if (!player1.getCards().contains(card) && !player2.getCards().contains(card)) {
                    player2.addCard(card);
                    if (maxCard2 == null || card.compareTo(maxCard2) > 0) {
                        maxCard2 = card;
                    }
                } else {
                    System.out.println("Card is not in the deck.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("No such card exists.");
            }
        }

        if (maxCard1.compareTo(maxCard2) > 0) {
            System.out.printf("%s wins with %s of %s.", player1.getName(), maxCard1.getRank(), maxCard1.getSuit());
        } else {
            System.out.printf("%s wins with %s of %s.", player2.getName(), maxCard2.getRank(), maxCard2.getSuit());

        }
    }
}
