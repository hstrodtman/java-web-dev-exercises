package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    String firstName;
    String lastName;
    String subject;
    int yearsTeaching;

    public String getFirstName(){
        return firstName;
    }
    private void setFirstName(String aFirstName){
        firstName = aFirstName;
    }

    public String getLastName(){
        return lastName;
    }

    private void setLastName(String aLastName){
        lastName = aLastName;
    }

    public String getsubject(){
        return subject;
    }

    private void setSubject(String aSubject){
        subject = aSubject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }

    private void setYearsTeaching(int aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }
}
