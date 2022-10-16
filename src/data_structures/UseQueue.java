package data_structures;

import databases.SharedStepsDatabase;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) throws Exception{

            Queue<Object> numbers = new ArrayDeque<>();

            numbers.add(0);
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);
            System.out.println(numbers);
            System.out.println();

            for (Object n : numbers) {
                System.out.println(n);
            }

            numbers.remove(50);
            System.out.println(numbers);

            System.out.println(numbers.peek());

            System.out.println(numbers.poll());
            System.out.println(numbers);
            System.out.println(numbers.poll());
            System.out.println(numbers);
            System.out.println();

            Iterator<Object> myIterator1 = numbers.iterator();

            while (myIterator1.hasNext()) {
                System.out.println(myIterator1.next());
            }

//            SharedStepsDatabase ssdb = new SharedStepsDatabase();
//            ssdb.insertQueue("Queue_Example", "queue_numbers", numbers); // insertQueue needs to be fixed
//            String queueQuery = "SELECT * FROM Queue_Example";
//
//            List<String> results = ssdb.executeQueryReadAllSingleColumn(queueQuery, "queue_numbers");
//
//            for (String queueResults: results) {
//                System.out.println(queueResults);
//            }
      }

    }



