import java.util.Arrays;
import java.util.Scanner;

public class School {
    private String name;
    private Student[] student;

    public School() {
    }


    public void getAllStudent(Student[] students) {
        System.out.println(Arrays.toString(students));
    }

    public void getByName(String name, Student[] student) {
        for (int i = 0; i < student.length; i++) {
            if (student[i].getName().equals(name)) {
                System.out.println(student[i]);
            }
        }
    }
    public void getAllBoys(Student[] student) {
        for (int i = 0; i < student.length; i++)
            if (student[i].getGender().equalsIgnoreCase("male")) {
                System.out.println(student[i]);
            }
    }
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                "student='" + student + '\'' +
                ", student=" + Arrays.toString(student) +
                '}' + '\n';
    }
}




