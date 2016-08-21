package bg.softuni.card.cardgame.player.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bg.softuni.card.cardgame.player.contract.CardPlayer;
import bg.softuni.card.model.Card;

public class MyCardPlayer implements CardPlayer {

    private String name;
    private List<Card> cards;

    public MyCardPlayer(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    @Override
    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    @Override
    public void addCard(Card card) {
        this.cards.add(card);
    }

    @Override
    public String getName() {
        return name;
    }

}
