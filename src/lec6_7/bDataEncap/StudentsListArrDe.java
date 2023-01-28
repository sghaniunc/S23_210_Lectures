package lec6_7.bDataEncap;

public class StudentsListArrDe implements StudentsListInt {
    int _maxStudents = 10;
    int _nextIndex = 0;     // Index in sList for next entry
    UncStudentDe[] _sList = new UncStudentDe[_maxStudents];

    @Override
    public boolean add(UncStudentDe st) {
        if (_nextIndex == _maxStudents) {
            System.out.println("Array full - no more students can be entered!");
            return false;
        } else {
            _sList[_nextIndex] = st;
            _nextIndex++;
            return true;
        }
    }

    @Override
    public void search(String name) {
        for (int i=0; i< _nextIndex; i++){
            if (_sList[i].getFName().equals(name) || (_sList[i].getLName().equals(name))){
                System.out.println(i+". "+_sList[i].getFName()+" "+_sList[i].getLName()+", id="+_sList[i].getId());
            }
        }
    }

    @Override
    public void printAll() {
        for (int i=0; i<_nextIndex; i++){
            System.out.println(i+". "+_sList[i].getFName()+" "+_sList[i].getLName()+", id="+_sList[i].getId());
        }
    }

    @Override
    public int getSize() {
        return _nextIndex;
    }

    @Override
    public void setUni(String name) {
        _sList[0].setUni(name);
    }

}
