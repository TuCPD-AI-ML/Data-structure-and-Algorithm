/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk1_Simple_Sort.Card;

import java.util.Comparator;

/**
 *
 * @author TU
 */
public class CompareCard implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        
        int suit1 = suitValue(o1.getSuit());
        int suit2 = suitValue(o2.getSuit());
        
        if (suit1 == suit2 && o1.getRank() == o2.getRank()) {
            return 0;
        } else if (suit1 == suit2) {
            if (o1.getRank() > o2.getRank()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    private int suitValue(String suit) {
        switch (suit) {
            case "Hearts" -> {
                return 4;
            }
            case "Diamonds" -> {
                return 3;
            }
            case "Spades" -> {
                return 2;
            }
            case "Clubs" -> {
                return 1;
            }
            default -> throw new IllegalArgumentException("Invalid suit: " + suit);
        }
    }
}
