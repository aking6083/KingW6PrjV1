/*
    main.java ~ The main class for the package KingWk2PrjV1
    @author Adam King
    @version 1
*/

package Service;

import domain.*;
import java.util.*;

public class main
{
    /**
     * This is the main entry point for the application
     */
    public static void main(String args[]) 
    {
        LinkedList<String> Book1 = new LinkedList<String>();
        LinkedList<String> Book2 = new LinkedList<String>();
        
        //Book1.add("one");
        
        System.out.println(Book1.equals(Book2));
        

//This was my test code before I figured out how to use JUnit Test
        //JUnit test could be very very usefull tool!
        
        //Book myBook = new Book("","","03231979");
        //Book myBook2 = new Book("How to Code","Adam King","03-23-1979");
        //Book myBook2 = new Book();
        //System.out.println("Book Name " + myBook.getTitle());
        //System.out.println("Book Author " + myBook.getAuthor());
        //System.out.println("Book ISBN: " + myBook.getIsbn());
        //System.out.println(myBook2.toString());
        //if (!myBook2.validate())
        //    System.out.println("Object is not valid");
        //else
         //   System.out.println("Object is valid");
        
    }
}