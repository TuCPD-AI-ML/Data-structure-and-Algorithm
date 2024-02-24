/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk1_Simple_Sort.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author TU
 */
public final class Deck {
    private Card[] cards;
    private final int[] ranks; 
    private final String[] suits;


    public Deck() {
        this.suits = new String[]{"Hearts", "Diamonds", "Spades", "Clubs"};
        this.ranks = random();
        this.createDeck();
    }

    public void createDeck() {
        cards = new Card[52];
        int idx = 0;
        for (String suit : suits) {
            for (int rank : ranks) {
                cards[idx]= new Card(rank, suit); // thêm giá trị của lá bài và add vào bộ bài
                idx++;
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
    
    private int[] random(){
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp; // đổi chỗ phần tử
        }
        int[] randomArr = Arrays.copyOfRange(arr, 0, 13);
        return randomArr;
    }
}
