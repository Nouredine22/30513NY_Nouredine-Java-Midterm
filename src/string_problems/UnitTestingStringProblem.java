package string_problems;

import java.util.*;

public class UnitTestingStringProblem {

    /**
     Use this class to unit test all of the classes contained within this package
     */

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a string");
        String str = sc.next();
        System.out.println("the permuatation of given string are : ");
        permutation(str, 0, str.length());

    }

    /**
     * generate all permutations of any given string
     *
     * @param abc
     * @param start
     * @param end
     */

    static void permutation(String str, int start, int end) {
        if (start == end) {//base case
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i);              //invoke swap method
                permutation(str, start + 1, end);  //Recursively calling function generatePermutation() for rest of the characters
                str = swap(str, start, i);              //back tracking and swapping the characters again.
            }
        }
    }

    /**
     * swap method return string two character swaped
     *
     * @param abc
     * @param i      position 1
     * @param j      position 2
     * @return String
     */
    private static String swap(String str, int i, int j) {
        char[] strChar = str.toCharArray();
        char temp = strChar[i];
        strChar[i] = strChar[j];
        strChar[j] = temp;
        return String.valueOf(strChar);








    }
}






