package bg.softuni.cardwithpower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.card.model.Card.Rank;
import bg.softuni.card.model.Card.Suit;

public class CardsWithPower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            Rank rank = Rank.valueOf(br.readLine());
            Suit suit = Suit.valueOf(br.readLine());
            System.out.println(rank.getValue() + suit.getValue());
        } catch (IllegalArgumentException e) {
            // Noting to do
        }

        br.close();
    }
}
