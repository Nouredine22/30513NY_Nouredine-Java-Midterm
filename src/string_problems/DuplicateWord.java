package string_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    /**
     * INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here

         // create map to store duplicate words(String), and number of occurence (int)
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] words = st.trim().split(" ");

        for (String s : words) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);    //if the words exist increment value
            } else map.put(s, 1);            //put the word as key and the value 1
        }

        for (Map.Entry<String, Integer> a : map.entrySet()) {
            if (a.getValue() > 1) {
                System.out.println(a);          //printing only value>1 which mean duplicate.
            }

        }
        //the average length of all words
        int countOfWord = words.length;
        String stWithOutSpace = st.replace(" ","");
        int countOfChar = stWithOutSpace.length();
        System.out.println(" average length  is: "+countOfChar/countOfWord);

    }

}
