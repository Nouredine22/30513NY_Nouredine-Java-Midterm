package data_structures;

import databases.SharedStepsDatabase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) throws Exception {




            List<Object> strings = new ArrayList<>();

            strings.add("Hey!");
            strings.add("Welcome");
            strings.add("To");
            strings.add("my");
            strings.add("Page");
            System.out.println (strings);

            strings.remove("Hey!");
            strings.add("Facebook!");
            System.out.println(strings);

            for (Object words : strings) {
                System.out.print(words + " ");
            }

            Iterator<Object> myIterator1 = strings.iterator();
            while (myIterator1.hasNext()) {
                System.out.print(myIterator1.next() + " ");
            }

            // db store and receive
            // new db object

            SharedStepsDatabase ssdb = new SharedStepsDatabase();

            //inserting
            ssdb.insertList("ArrayList_Example", "Words", strings);

            //querying
            String arrayListQuery = "SELECT * FROM ArrayList_Example";

            //retrieving
            List<String> results = ssdb.executeQueryReadAllSingleColumn(arrayListQuery, "Words");

            for (String s: results) {
                System.out.print(s+" ");
            }


    }

}
