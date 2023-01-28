package lec6_7.aInterface;

/**
 * USMS_Int         = USMS (UNS Student Management System), now modified to use Interfaces
 * UncStudent       = UNC student class
 * StudentsListInt  = Interface, implemented by StudentsListArr and StudentsListLL
 * StudentsListArr  = StudentsList based on Array data structure
 * StudentsListLL   = StudentsList based on Linked List data structure
 */

import java.util.Scanner;
public class USMS_Int{
    // Use one of the following statements depending on the data structure to be used:
    static StudentsListInt sList = new StudentsListArr();
    // OR:
    // static StudentsListLL sList = new StudentsListLL();

    public static void main(String[] args) {
        while (menu()!=0);
    }

    public static int menu() {  // returns 0 to exit
        Scanner s = new Scanner(System.in);
        boolean exit = false;
        System.out.println("\nWelcome to the UNC Students Management System(USMS)");
        System.out.println("Press one of the following keys:");
        System.out.println("1 : For enrolling a new student");
        System.out.println("2 : For searching for a student");
        System.out.println("3 : Print all students");
        System.out.println("4 : Print number of students enrolled");
        System.out.println("0 : For exiting.");
        String selectionS = s.nextLine();
        int selectionI = Integer.parseInt(selectionS);
        switch (selectionI) {
            case 1: {enrollStudent();                       break;}
            case 2: {searchStudent();                       break;}
            case 3: {printAllStudents();                    break;}
            case 4: {System.out.println(sList.getSize());break;}
            case 0: {exit = true;                           break;}
            default: {System.out.println("Invalid Entry."); break;}
        }
        if (exit) { System.out.println("Thank you for using USMS. Good bye!");
                return (0); }
        return(1);
    }

    static UncStudent enrollStudent(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enrolling a new student:");

        UncStudent st = new UncStudent();
        System.out.println("Enter first name:");
        st._fName = s.next();
        System.out.println("Enter last name of "+st._fName);
        st._lName = s.next();
        System.out.println("Enter student id (max 9 digits):");
        st._id = s.nextInt();
        sList.add(st);
        System.out.println("Student: "+st._fName+" "+st._lName+" with id = "+ st._id+ " enrolled.");
        return(st);
    }

    static void searchStudent(){
        Scanner s = new Scanner(System.in);
        System.out.println("Searching an enrolled student:");
        System.out.println("Enter first or last name:");
        String name = s.nextLine();
        sList.search(name);
    }

    static void printAllStudents(){
        System.out.println("Printing all " + sList.getSize()+ " students :");
        sList.printAll();
    }
}
