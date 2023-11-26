/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.util.ArrayList;
/**
 *
 * @author MSI LAPTOP
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Student> students;
    private ArrayList<Book> books;

    public Library(ArrayList<Student> students, ArrayList<Book> books) {
        this.students = students;
        this.books = books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Student student1;
    }
}
