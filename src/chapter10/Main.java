package chapter10;

import java.util.EmptyStackException;

public class Main {
        public static void main(String args[])  {
            Higher higher = new Higher();
            try {
                higher.high();
            } catch (HigherLevelException e) {
                System.out.println("error"+e.getCause());
            }
        }

}
