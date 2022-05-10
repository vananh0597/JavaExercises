package JavaProgram.HomeWork;

import java.util.HashMap;

public class Exercise13 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<Integer, String>();
        studentList.put(1, "Anna");
        studentList.put(2, "Alex");
        studentList.put(2, "Mint");
        studentList.put(4, "Candy");
        studentList.put(5, "James");
        studentList.put(5, "Hanna");
        System.out.println(studentList);

        HashMap newStudentList = new HashMap();
        for (int i : studentList.keySet()) {
            newStudentList.put(studentList.get(i), i );
        }
        System.out.println(newStudentList);
    }
    }

