package lec6_7.bDataEncap;

public interface StudentsListInt {
    boolean add(UncStudentDe st);     // adds student object to collection (returns true if successful)
    void search(String name);       // prints all the matches
    void printAll();                // prints all
    default int getSize(){     // returns the default number in the list
        return(-1);
    }
    void setUni(String name);       // sets the University name for all students
}
