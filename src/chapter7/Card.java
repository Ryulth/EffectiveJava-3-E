package chapter7;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

// 반복 방식과 스트림 방식으로 두 리스트의 데카르트 곱을 생성한다. (275-276쪽)
public class Card {
    public enum Suit {SPADE, HEART, DIAMOND, CLUB}

    public enum Rank {
        ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING,
        ACE2, DEUCE2, THREE2, FOUR2, FIVE2, SIX2, SEVEN2,
        EIGHT2, NINE2, TEN2, JACK2, QUEEN2, KING2,
        ACE3, DEUCE3, THREE3, FOUR3, FIVE3, SIX3, SEVEN3,
        EIGHT3, NINE3, TEN3, JACK3, QUEEN3, KING3,
        ACE4, DEUCE4, THREE4, FOUR4, FIVE4, SIX4, SEVEN4,
        EIGHT4, NINE4, TEN4, JACK4, QUEEN4, KING4
        
    }

    private final Suit suit;
    private final Rank rank;

    @Override
    public String toString() {
        return rank + " of " + suit + "S";
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;

    }

    private static final List<Card> NEW_DECK = newDeck();
    private static final List<Card> NEW_DECK2 = newDeck2();
    // 코드 45-4 데카르트 곱 계산을 반복 방식으로 구현 (275쪽)
    private static List<Card> newDeck() {
        long start = System.currentTimeMillis();
        List<Card> result = new ArrayList<>();
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                result.add(new Card(suit, rank));
        long end = System.currentTimeMillis();
        System.out.println( "newDeck 실행 시간 : " + ( end - start )/1000.0 );
        return result;
    }

    // 코드 45-5 데카르트 곱 계산을 스트림 방식으로 구현 (276쪽)
    private static List<Card> newDeck2() {
        long start = System.currentTimeMillis();
        List<Card> result = Stream.of(Suit.values())
                .flatMap(suit ->
                        Stream.of(Rank.values())
                                .map(rank -> new Card(suit, rank)))
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.println( "newDeck2 실행 시간 : " + ( end - start )/1000.0 );
        return result;
    }

    public static void main(String[] args) {
        System.out.println(NEW_DECK);
        System.out.println(NEW_DECK2 );
    }
}

