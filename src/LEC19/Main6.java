package LEC19;

import java.util.*;

public class Main6 {



        public static void main(String[] args) {
            try {
                riskyMethod();
            } catch (Exception e) {
                System.out.println("risky method mai handle hua: " + e);
            }
            System.out.println("Program Continue...");
        }

        static void riskyMethod() throws ArithmeticException {
            System.out.println("riskyMethod start");
            int result = 10 / 0;
            System.out.println("Result " + result);
            System.out.println("Program end...");
        }

}
