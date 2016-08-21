package bg.softuni.card.compareto.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.card.model.Card;
import bg.softuni.card.model.Card.Rank;
import bg.softuni.card.model.Card.Suit;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Rank type1 = Rank.valueOf(br.readLine());
            Suit color1 = Suit.valueOf(br.readLine());
            Rank type2 = Rank.valueOf(br.readLine());
            Suit color2 = Suit.valueOf(br.readLine());
            br.close();

            Card card1 = new Card(type1, color1, type1.getValue() + color1.getValue());
            Card card2 = new Card(type2, color2, type2.getValue() + color2.getValue());

            if (card1.compareTo(card2) >= 0) {
                System.out.println(card1.toString());
            } else {
                System.out.println(card2.toString());
            }
        } catch (Exception e) {
            // Noting to do
        }
        br.close();
    }
}
