package JavaProgram.HomeWork;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercise12 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * 100);
            myList.add(randomNum);
        }
        System.out.println(myList);
        Collections.sort(myList);
    for (Iterator iterator = myList.iterator(); iterator.hasNext();){
        System.out.println(iterator.next());
    }
    }
}
