/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import java.io.Serializable;

/**
 *
 * @author user
 */
public abstract class Student implements Comparable<Student>  , Serializable{
    protected int id ; 
    protected String name ;
    protected String major ;
    protected double grade ; 

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGrade() {
        return grade;
    }
    
    @Override
    public String toString() {
        return  " Name : " + name + " , Id : " + id + " , Major : " + major + " , Grade : " + grade + " ";
    }
    @Override
    public int compareTo(Student s) {
        return this.grade > s.grade ? -1 : 1 ;
    }
    
}