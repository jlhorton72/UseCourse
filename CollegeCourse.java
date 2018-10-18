/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            CollegeCourse.java
 */
package usecourse;

/**
 *
 * @author Redindianfred
 */
public class CollegeCourse 
{
    private String department;
    private int crsNum;
    private int hours;
    private double fee;

    public String getDepartment() {
        return department;
    }

    public int getCrsNum() {
        return crsNum;
    }

    public int getHours() {
        return hours;
    }

    public double getFee() {
        return fee;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCrsNum(int crsNum) {
        this.crsNum = crsNum;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setFee(double rate)
    {
        this.fee = rate * getHours();
    }
    
    public void display()
    {
        System.out.println("Dept:\t\t\t" + department);
        System.out.println("Course Number:\t\t" + crsNum);
        System.out.println("Credit Hours:\t\t" + hours);
        System.out.println("Course fee:\t\t" + fee);
    } // end of displayCourse
    
} // end of class
