package za.ac.cput.StudentAccount;
//This is a test class for objects
//StudentTest.java
//Written by Chuma Nxazonke and Ishmail
//Date: 06/02/2022

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;
    private Student studentAccount1;
    private Student surname1;
    private Student surname2;
    private Student surname3;

    private Student studentAccount2;
    private Student studentAccount3;

    @BeforeEach
    void setUp() {

        studentAccount1 = new Student();
        studentAccount2 = new Student();
        studentAccount3 = studentAccount1;

        surname1 = new Student();
        surname2 = new Student();
        surname3 = surname1;

    }

    //Here we want to test for object identity
    @Test
    void testIdentity(){
    assertSame(studentAccount1, studentAccount3);
    assertSame(surname1, surname1);

    }

    //Here we want to test for object equality
   @Test
    void testEquality (){

    assertEquals(studentAccount1, studentAccount3);
    assertEquals(surname1, surname3);

    }


    //This method will fail if you enter the wrong value
    @Test
    public void testDisplayStudentName1() {

        this.student = new Student();
        String studentName = student.displayStudentName1("Chuma", "Nxazonke");
        assertEquals("ChumaNxazonke", studentName);

    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void infinity() {
        // fails if execution time exceeds 100 milliseconds
        //...
    }



    /**
     * Disabling the method
     * Test of setName method, of class Student.
     */
    @Test
    @Disabled
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Disabling the method
     * Test of setSurname method, of class Student.
     */
    @Test
    @Disabled
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Student instance = new Student();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Disabling the method
     * Test of getDepartment method, of class Student.
     */
    @Test
    @Disabled
    public void testGender() {
        System.out.println("getDepartment");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Disabling the method
     * Test of setDepartment method, of class Student.
     */
    @Test
    @Disabled
    public void testSetGender() {
        System.out.println("setDepartment");
        String department = "";
        Student instance = new Student();
        instance.setGender(department);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Disabling the method
     * Test of toString method, of class Student.
     */
    @Test
    @Disabled
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Disabling the method
     * Test of displayStudentName method, of class Student.
     */
    @Test
    @Disabled
    public void testDisplayStudentName() {
        System.out.println("displayStudentName");
        String a = "";
        String b = "";
        Student instance = new Student();
        String expResult = "";
        String result = instance.displayStudentName1(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    @Override
    public String toString() {
        return "StudentTest{" + "student=" + student + ", studentaccount1=" + studentAccount1 + ", studentaccount2=" + studentAccount2 + ", studentaccount3=" + studentAccount3 + '}';
    }

}
