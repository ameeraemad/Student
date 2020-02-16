/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

/**
 *
 * @author user
 */
public class ArtStudent extends Student {
    protected double Report ;
    protected double Mid ; 
    protected double Final_ ;
    
     public ArtStudent(String name , int id , String major , double Report , double Mid , double Final_ ) {
        this.name = name ;
        this.id = id ; 
        this.major = major ; 
        this.Report = Report ; 
        this.Mid = Mid ; 
        this.Final_ = Final_ ; 
        this.grade = (Report) + (Final_) + (Mid) ; 
        
    }

    public double getReport() {
        return Report;
    }

    public void setReport(double report) {
        this.Report = report;
    }

    public double getMid() {
        return Mid;
    }

    public void setMid(double mid) {
        this.Mid = mid;
    }

    public double getFinal_() {
        return Final_;
    }

    public void setFinal_(double final_) {
        this.Final_ = final_;
    }
     
}