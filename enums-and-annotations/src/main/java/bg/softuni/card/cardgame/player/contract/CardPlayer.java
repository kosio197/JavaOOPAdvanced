package bg.softuni.card.cardgame.player.contract;

import java.util.List;

import bg.softuni.card.model.Card;

public interface CardPlayer {

    List<Card> getCards();

    void addCard(Card card);

    String getName();
}
