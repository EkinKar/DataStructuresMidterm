public class LinkedList{

    private Node head;

    public Node createNode(Student val) {
        return new Node(val);
    }


    public void addToEnd(Student val) { // the method that adds new node to end of the linked list
        Node iterator = head;
        if (head == null) {
            head = createNode(val);
        } else {
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = createNode(val);
        }
    }


    public int count() { // the method that counts the nodes in linked list
        int count = 0;
        Node iterator = head;
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }
        return count;
    }


    public void delete(Student val) { // the method that will delete the student whose number is given
            if (head.value == val) {
                head = head.next;
            } else {
                Node previous, iterator = head;
                while (iterator.next != null) {
                    previous = iterator;
                    iterator = iterator.next;
                    if (iterator.value == val) {
                        previous.next = iterator.next;
                    }
                }
            }
        }


    public void display_student() { // the method that'll display the content of the linked list
        Node iterator = head;
        while (iterator != null) {
            Student a = iterator.value;
            System.out.println("Id:" + a.id + " Name:" + a.name + " Mat Grade:" + a.mat_grade +
                    " Data Grade:" + a.data_grade);
            iterator = (iterator.next);
        }
    }


    public void second_option(){ // method that sorts the linked list by students' overall average
        Node iterator = head, iterator2;
        Student temp;
        if(head == null) {
            System.out.println("List is empty.");
        }
        else {
            while(iterator != null) {
                iterator2 = iterator.next;
                while(iterator2 != null) {
                    int a = iterator.value.data_grade + iterator.value.mat_grade;
                    int b = iterator2.value.mat_grade + iterator2.value.data_grade;
                    if(a < b) { // assigns the smaller number to a temporary node, then swaps the nodes
                        temp = iterator.value;
                        iterator.value = iterator2.value;
                        iterator2.value = temp;
                    }
                    iterator2 = iterator2.next;
                }
                iterator = iterator.next;
            }
        }
    }


    public void third_option() { // the method that sorts the linked list by students' Data Structures average
        Node iterator = head, iterator2;
        Student temp;
        if(head == null) {
            System.out.println("List is empty.");
        }
        else {
            while(iterator != null) {
                iterator2 = iterator.next;
                while(iterator2 != null) {
                    if(iterator.value.data_grade < iterator2.value.data_grade) {// assigns the smaller number to a temporary node, then swaps the nodes
                        temp = iterator.value;
                        iterator.value = iterator2.value;
                        iterator2.value = temp;
                    }
                    iterator2 = iterator2.next;
                }
                iterator = iterator.next;
            }
        }
    }


    public void fourth_option(){ // the method that calculates the math average
        Node iterator = head;
        int total = 0;
        while (iterator != null){
            total += iterator.value.mat_grade;
            iterator = iterator.next;
        }
        System.out.println("Math average is: " + total/Student.myList.count());
    }


    public void fifth_option(){ // the method that calculates the lowest Data Structures Grade
        Node iterator = head;
        int min = head.value.data_grade;
        Student a = head.value;
        while (iterator != null) {
            if (iterator.value.data_grade < min) {
                min = iterator.value.data_grade;
                a = iterator.value;
            }
            iterator = iterator.next;
        }
        System.out.println(a.name + " has the lowest Data Structures grade which is " + min + ".");
    }

    public void sixth_option(int id){ // the method that deletes the student if the given id matches
        Node iterator = head;
        while (iterator!= null){
            if (iterator.value.id == id){
                System.out.println(iterator.value.name + " has been deleted.");
                Student.myList.delete(iterator.value);
            }
            iterator = iterator.next;
        }
    }

    public void seventh_option(int id, String name, int mat, int data){ // the method to create a new student and add it to end of the linkedList
        Student a = new Student(id, name, mat, data);
        Student.myList.addToEnd(a);
        System.out.println(a.name + " has added to end of the list successfully.");
    }

    public void ninth_option(){ // the method that calculates both Math and Data averages and compares student grades' with average
        int mat_average;
        int data_average;
        Node iterator = head;
        int total = 0;
        while (iterator != null){ //calculates the average math grade
            total += iterator.value.mat_grade;
            iterator = iterator.next;
        }
        mat_average = total/Student.myList.count();
        iterator = head;
        StringBuilder mat = new StringBuilder();
        while (iterator != null){ // compares each student's grade with the average
            if (iterator.value.mat_grade > mat_average){
                mat.append(iterator.value.name).append(" ");
            }
            iterator = iterator.next;
        }
        iterator = head;
        total = 0;
        while (iterator != null){ //calculates the average Data grade
            total += iterator.value.data_grade;
            iterator = iterator.next;
        }
        data_average = total/Student.myList.count();
        iterator = head;
        StringBuilder data = new StringBuilder();
        while (iterator != null){ // compares each student's grade with the average
            if (iterator.value.data_grade > data_average){
                data.append(iterator.value.name).append(" ");
            }
            iterator = iterator.next;
        }
        System.out.println(mat + "have passed the math class.");
        System.out.println(data + "have passed the data class.");
    }
}
