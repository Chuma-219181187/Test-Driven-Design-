package za.ac.cput.StudentAccount;
//This is a worker class
//Student.java class
//Written by Chuma Nxazonke
//Date: 05/02/2022
public class Student {

    private String name;
    private String surname;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", gender=" +gender + '}';
    }

    public String displayStudentName1 (String a, String b ) {

        return a + b;

    }

}
