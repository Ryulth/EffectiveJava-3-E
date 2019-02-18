package chapter6;

import java.util.HashSet;
import java.util.Set;

//버그가 존재
public class Biagram {
    private final char first;
    private final char second;

    public Biagram(char first, char second) {
        this.first  = first;
        this.second = second;
    }

    public boolean equals(Biagram b) {
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Biagram> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Biagram(ch, ch));
        System.out.println(s.size());
    }
}
// 260 이 나오는데 지금의도한 바는 equal 가 객체의 값을 비교해서 반환하기를 원햇지만 상위 equal 을 오버라이딩 하지 않음
