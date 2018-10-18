/*
 * Name:            James Horton
 * Date:            10/18/2018
 * Assignment:      Practice Exercise
 * File:            UseCourse.java
 */
package usecourse;
import java.util.*;
/**
 *
 * @author Redindianfred
 */
public class UseCourse 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String dept;
        String deptCheck;
        int num;
        int hrs;
        double fee;
        
        String lab1 = "BIO";
        String lab2 = "CHM";
        String lab3 = "CIS";
        String lab4 = "PHY";
        
        CollegeCourse aCourse = new CollegeCourse();
        LabCourse aLab = new LabCourse();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter the Department: ");
        dept = sc.nextLine();
        
        System.out.println("Please Enter the Course Number: ");
        num = sc.nextInt();
        
        System.out.println("Please Enter the Course Hours: ");
        hrs = sc.nextInt();     
        
        System.out.println("Please enter the hourly Fee: ");
        fee = sc.nextDouble();
        dept = dept.toUpperCase();

        if (dept.equals(lab1))
        {
            aLab.setDepartment(dept);
            aLab.setCrsNum(num);
            aLab.setHours(hrs);
            aLab.setFee(fee);
            aLab.setLabFee();
            
            aLab.display();
        } // end of if a lab
        else if (dept.equals(lab2))
        {
            aLab.setDepartment(dept);
            aLab.setCrsNum(num);
            aLab.setHours(hrs);
            aLab.setFee(fee);
            aLab.setLabFee();
            
            aLab.display();
        }
        else if (dept.equals(lab3))
        {
            aLab.setDepartment(dept);
            aLab.setCrsNum(num);
            aLab.setHours(hrs);
            aLab.setFee(fee);
            aLab.setLabFee();
            
            aLab.display();
        }
        else if (dept.equals(lab4))
        {
            aLab.setDepartment(dept);
            aLab.setCrsNum(num);
            aLab.setHours(hrs);
            aLab.setFee(fee);
            aLab.setLabFee();
            
            aLab.display();
        }
        else
        {
            aCourse.setDepartment(dept);
            aCourse.setCrsNum(num);
            aCourse.setHours(hrs);
            aCourse.setFee(fee);
            
            aCourse.display();
        } // end of else
        
    } // end of main
    
} // end of class
