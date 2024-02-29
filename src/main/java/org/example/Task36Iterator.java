package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Java program to demonstrate working of
// Iterator.remove() on an integer ArrayList

public class Task36Iterator {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an ArrayList
        List<Integer> al = new ArrayList<>();

        // Adding elements to our ArrayList
        // using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);

        // Printing the current ArrayList
        System.out.println(al);

        // Creating iterator object
        Iterator itr = al.iterator();

        // Holds true till there is single element
        // remaining in the object
        while (itr.hasNext()) {

            // Remove elements smaller than 10 using
            // Iterator.remove()
            int x = (Integer)itr.next();
            if (x < 10)
                itr.remove();
        }

        // Printing the updated ArrayList
        System.out.print(al);
    }
}
