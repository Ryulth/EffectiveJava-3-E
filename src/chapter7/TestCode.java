package chapter7;

import java.math.BigInteger;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;

public class TestCode {
    static Function<String, Integer> strToInt = Integer::parseInt;
    static Function<String, Integer> strToInt2 = str -> Integer.parseInt(str);
    static BinaryOperator<BigInteger> add = BigInteger::add;
    static UnaryOperator<String> toCustomLower = String::toLowerCase;
    static Predicate<Collection> isCustomEmpty = Collection::isEmpty;

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("test2");
        words.add("test3");
        words.add("test4");
        words.add("test5");
        // words 가 List row 타입이엿다면 에러가 난다.
        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length() + 1));
        System.out.println(words);

        words.clear();
        words.add("test2");
        words.add("test");
        Collections.sort(words, comparingInt(String::length));
        System.out.println(words);

        words.clear();
        words.add("test2");
        words.add("test");
        words.sort(comparingInt(String::length));
        System.out.println(words);
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        nums.sort(Integer::compareTo);
        System.out.println(nums);

        Map<Integer, Integer> map = new HashMap<>();
        map.merge(1, 1, (count, incr) -> count + incr);
        System.out.println(map);

        map.clear();
        map.merge(1, 1, Integer::sum);
        System.out.println(map);

        String test = "12";
        System.out.println(strToInt.apply(test) + 10);
        System.out.println(strToInt2.apply(test) + 11);

        String test2 = "MY NAME IS JOHN";
        System.out.println(toCustomLower.apply(test2));

        BigInteger big = new BigInteger("10");
        BigInteger big2 = new BigInteger("200");
        System.out.println(big.add(big2));
        Collection<Integer> integerCollection = nums;
        integerCollection.isEmpty();




    }
}
