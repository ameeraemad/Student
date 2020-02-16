/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author user
 */
public class Studentmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Student [] students = {
          new ItStudent("Areej" , 221 , "Computer systems" , 26 , 29 , 31),
          new ItStudent("Dina" , 222 , "Developers" , 25 ,28 , 45),
          new ItStudent("Samar" , 223 , "computer science" , 14,25 , 39.5),
          new ArtStudent ("Ameera" , 224 , "Art" , 7 , 30 , 37.5),
          new ArtStudent ("Noor" , 225 , "Software Engeneering" , 8 , 37 , 43),
          new ArtStudent ("Rawan" , 226 , "IT-Multimedia" , 6 , 35.5 , 42)};
       
        sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
        
	FileOutputStream f = new FileOutputStream(new File("C:/src/student.txt"));
	ObjectOutputStream o = new ObjectOutputStream(f);
                o.writeObject(students);
                 f.close();
                 o.close();
    }
    
           public static void sort(Student [] student) {
            Arrays.sort(student, 0, student.length, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.compareTo(s2) ;
            }
        });
    }
    
    
}