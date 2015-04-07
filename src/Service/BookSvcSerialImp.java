/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import domain.*;
import presentation.BookMgrGUI; //make the text fields visible.
/**
 *
 * @author root
 */
public class BookSvcSerialImp implements IBookSvc 
{

    @Override
    public Book create(Book b) {
        

//Create the book
        
        b = new Book();
       
        return b;
        
    }

    @Override
    public Book add(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book update(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book delete(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
