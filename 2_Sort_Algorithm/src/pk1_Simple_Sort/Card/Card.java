/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk1_Simple_Sort.Card;

/**
 *
 * @author TU
 */
public class Card implements Comparable<Card>{

    public int rank;
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card() {
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int compareTo(Card otherCard) {
        if (this.rank != otherCard.getRank()) {
            return this.rank;
        }
        // nếu rank bằng nhau thì so sánh suit
        return this.suit.compareTo(otherCard.getSuit());
    }
}
