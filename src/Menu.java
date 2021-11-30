import java.util.Scanner;

public class Menu {

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("1-: The linked list content");
        System.out.println("2-: Students sorted by their average");
        System.out.println("3-: Students sorted by their data structures grades");
        System.out.println("4-: Math average");
        System.out.println("5-: Student with the lowest Data Structures grade");
        System.out.println("6-: Delete a student");
        System.out.println("7-: Add a new student");
        System.out.println("8-: Total student count");
        System.out.println("9-: Successful students");
        System.out.println("0-: Exit the program");
        System.out.println("--------------------------------------");
        System.out.print("Please enter a number: ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("Thanks for using the program.");
        }
        else if (a == 1) {
            option1();
            menu();
        }
        else if (a == 2){
            option2();
            menu();
        }
        else if (a == 3){
            option3();
            menu();
        }
        else if (a == 4){
            option4();
            menu();
        }
        else if (a == 5){
            option5();
            menu();
        }
        else if (a==6){
            option6();
            menu();
        }
        else if (a == 7){
            option7();
            menu();
        }
        else if (a == 8){
            option8();
            menu();
        }
        else if (a == 9){
            option9();
            menu();
        }
        else {
            System.out.println("Invalid number");
            menu();
        }
    }

    public static void option1(){
        System.out.println("Displaying the list content..");
        System.out.println();
        Student.myList.display_student();
        System.out.println();
    }

    public static void option2(){
        System.out.println("Displaying students sorted by their overall average..");
        System.out.println();
        Student.myList.second_option();
        Student.myList.display_student();
        System.out.println();
    }

    public static void option3(){
        System.out.println("Displaying students sorted by their Data Structures grade..");
        Student.myList.third_option();
        System.out.println();
        Student.myList.display_student();
    }

    public static void option4(){
        System.out.println("Displaying the math average..");
        System.out.println();
        Student.myList.fourth_option();
    }

    public static void option5(){
        System.out.println("Displaying the student with the lowest data grade..");
        System.out.println();
        Student.myList.fifth_option();
        System.out.println();
    }

    public static void option6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the id of the student you want to delete: ");
        int a = sc.nextInt();
        Student.myList.sixth_option(a);
        System.out.println();
    }

    public static void option7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the student you want to add: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter the name of the student: ");
        String b = sc.nextLine();
        System.out.print("Please enter the math grade of the student: ");
        int c = sc.nextInt();
        System.out.print("Please enter the data grade of the student: ");
        int d = sc.nextInt();
        Student.myList.seventh_option(a,b,c,d);
    }

    public static void option8(){
        System.out.println("There are " + Student.myList.count() + " students in the list.");
    }

    public static void option9(){
        System.out.println("Successful");
        Student.myList.ninth_option();
        System.out.println();
    }
}
