package chapter6;

import java.util.HashSet;
import java.util.Set;

public class Biagram2 {
    private final char first;
    private final char second;

    public Biagram2(char first, char second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Biagram2))
            return false;
        Biagram2 b = (Biagram2) obj;
        return b.first == first && b.second == second;
    }

    @Override // Override 쓸거면 여기도 쓰자
    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Biagram2> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Biagram2(ch, ch));

            }
        }
        System.out.println(s.size());
    }
}
