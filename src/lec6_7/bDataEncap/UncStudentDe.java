package lec6_7.bDataEncap;

import java.util.Date;

class UncStudentDe {
    private String _fName = "";
    private String _lName = "";
    private int _id = -1;
    private String _admitTerm = "";
    private Date _dob;
    private int _age;
    private int _ssn;
    private static String _university = "UNC";

    public boolean setId (int id){
        if (id > 99){
            _id = id;
            return (true);
        }
        else {
            System.out.println("ID must be atleast 3 digits!");
            return (false);
        }
    }

    public int getId (){
        return _id;
    }

    public void setFName (String fName){
        _fName = fName;
    }

    public String getFName (){
        return _fName;
    }

    public void setLName (String lName){
        _lName = lName;
    }

    public String getLName (){
        return _lName;
    }

    public void setUni (String uni){
        _university = uni;
    }

    public String getUni (){
        return _university;
    }

    public void setDob(Date date){
        // validate if date is in appropriate range, then set _dob, else given error
        _dob = date;
    }
}
