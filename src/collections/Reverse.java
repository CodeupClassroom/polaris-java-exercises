package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {

        ArrayList<String> someStrings = new ArrayList<>();
        someStrings.add("bob");
        someStrings.add("tom");
        someStrings.add("sue");

        System.out.println("In normal order:");
        for (String aString : someStrings) {
            System.out.println(aString);
        }

        System.out.println("In REVERSE order:");
        for (int i = someStrings.size() - 1; i >= 0 ; i--) {
            System.out.println(someStrings.get(i));
        }

    }
}
