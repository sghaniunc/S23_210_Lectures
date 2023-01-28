package lec6_7.bDataEncap;
/**
 * UsmsDe           = USMS_Int modified to handle data encapsulation
 * UncStudentDe     = UNC student class modified for data encapsulation
 *                      using private fields and setters and getters
 * StudentsListInt  = Interface (unchanged)
 * StudentsListArrDe  = StudentsListArr modified for Data Encapsulation
 * StudentsListLLDe   = StudentsListArr modified for Data Encapsulation
 */

import java.util.Scanner;
public class UsmsDe {
    static StudentsListArrDe sList = new StudentsListArrDe();
//    static StudentsListLL sList = new StudentsListLL();
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
        System.out.println("4 : Set University");
        System.out.println("0 : For exiting.");
        String selectionS = s.nextLine();
        int selectionI = Integer.parseInt(selectionS);
        switch (selectionI) {
            case 1: {
                enrollStudent();
                break;}
            case 2: {searchStudent();                       break;}
            case 3: {printAllStudents();                    break;}
            case 4: {setUni();                              break;}
            case 0: {exit = true;                           break;}
            default: {System.out.println("Invalid Entry."); break;}
        }
        if (exit) { System.out.println("Thank you for using USMS. Good bye!");
                return (0); }
        return(1);
    }

    static UncStudentDe enrollStudent(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enrolling a new student:");

        UncStudentDe st = new UncStudentDe();
        System.out.println("Enter first name:");
        st.setFName(s.next());
        System.out.println("Enter last name of "+st.getFName());
        st.setLName(s.next());
        System.out.println("Enter student id (max 9 digits):");
        while (!st.setId(s.nextInt())){
            System.out.println("Please renter id:");
        }
        sList.add(st);
        System.out.println("Student: "+st.getFName()+" "+st.getLName()+" with id = "+ st.getId()+ " enrolled.");
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

    static void setUni(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of University:");
        sList.setUni(s.nextLine());
    }
}
