package lec6_7.bDataEncap;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentsListLLDe implements StudentsListInt {
    private LinkedList<UncStudentDe> _sLL = new LinkedList<UncStudentDe>();
    private int _size = 0;

    @Override
    public boolean add(UncStudentDe st) {
        _sLL.add(st);
        _size++;
        return true;
    }

    @Override
    public void search(String name) {
        Iterator it = _sLL.iterator();
        int i = 0;
        while(it.hasNext()){
            UncStudentDe st = (UncStudentDe) it.next();
            if (st.getFName().equals(name) || (st.getLName().equals(name))){
                System.out.println(i+". "+st.getFName()+" "+st.getLName()+", id="+st.getId());
                i++;
            }
        }
    }
    @Override
    public void printAll() {
        Iterator it = _sLL.iterator();
        int i=0;
        while(it.hasNext()){
            UncStudentDe st = (UncStudentDe) it.next();
            System.out.println(i+". "+st.getFName()+" "+st.getLName()+", id="+st.getId()+", Uni="+st.getUni());
            i++;
        }
    }
    @Override
    public int getSize() {
        return _size;
    }

    @Override
    public void setUni(String name) {
        _sLL.getFirst().setUni(name);
        return;
    }
}
