package LaunchCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish):");
        do {
            System.out.println("Student: ");
            newStudent = in.nextLine();
            if (!newStudent.equals("")){
                System.out.println("ID: ");
                Integer newId = in.nextInt();
                students.put(newStudent, newId);
                in.nextLine();

            }
        } while(!newStudent.equals(""));
        System.out.println("\nClass roster:");
        for (Map.Entry<String, Integer> student : students.entrySet()){
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}
