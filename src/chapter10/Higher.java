package chapter10;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Higher {
    public void high() throws HigherLevelException{
        List<String> data = Arrays.asList("test", "test2");
        try {
            data.get(3); // get 과정에서 index 가 넘어가는 에러 발생
        } catch (NoSuchElementException e) {
            throw new HigherLevelException(e);
        }
    }
}
