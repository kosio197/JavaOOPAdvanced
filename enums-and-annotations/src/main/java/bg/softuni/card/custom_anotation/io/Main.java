package bg.softuni.card.custom_anotation.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bg.softuni.card.custom_anotation.CustomEnumAnnotation;
import bg.softuni.card.model.Card.Rank;
import bg.softuni.card.model.Card.Suit;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String info = br.readLine();
        if (info.equals("Rank")) {
            try {
                CustomEnumAnnotation anot = Rank.class.getAnnotation(CustomEnumAnnotation.class);
                System.out.printf("Type = %s, Description = %s", anot.type(), anot.description());

            } catch (IllegalArgumentException e) {
                // Noting to do
            }
        } else {
            try {
                CustomEnumAnnotation anot = Suit.class.getAnnotation(CustomEnumAnnotation.class);
                System.out.printf("Type = %s, Description = %s", anot.type(), anot.description());

            } catch (IllegalArgumentException e) {
                // Noting to do
            }
        }
    }
}
