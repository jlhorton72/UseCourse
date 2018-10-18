/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            LabCourse.java
 */
package usecourse;

/**
 *
 * @author Redindianfred
 */
public class LabCourse extends CollegeCourse 
{
    private double labFee;

    public double getLabFee() {
        return labFee;
    }

    public void setLabFee() {
        //double fee = setFee(labFee); 
        this.labFee = 50 + getFee();
    }
    
    @Override
    public void display()
    {
        System.out.println("This is a lab course!!");
        super.display();
        System.out.println("Lab Fee:\t\t$50");
        System.out.println("Total Course Fees are:\t" + labFee);
    }
    
    
} // end of class
