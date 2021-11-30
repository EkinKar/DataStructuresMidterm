import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student{

    int id;
    String name;
    int mat_grade;
    int data_grade;
    static LinkedList myList = new LinkedList();


    public Student(int id, String name, int mat_grade, int data_grade) { // Student constructor
        this.id = id;
        this.name = name;
        this.mat_grade = mat_grade;
        this.data_grade = data_grade;
    }


    public static void read() throws IOException { // reads the student.txt and creates student objects and adds those
        // objects to the linked list called "myList"
        BufferedReader read_buffer = new BufferedReader(new FileReader("src/students.txt"));
        String strRead;
        while ((strRead = read_buffer.readLine()) != null) {
            String[] split_array = strRead.split(" ");
            Student u = new Student(Integer.parseInt(split_array[0]), split_array[1], Integer.parseInt(split_array[2]),
                    Integer.parseInt(split_array[3]));
            myList.addToEnd(u);
        }
    }
}
