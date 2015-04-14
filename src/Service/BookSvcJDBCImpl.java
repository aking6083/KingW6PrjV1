/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import java.sql.*;
import javax.sql.*;
import domain.*;

/**
 *
 * @author root
 */
public class BookSvcJDBCImpl implements IBookSvc {
    
    private String connString; //Connection string
    
    private Connection getConnection() throws Exception 
    {
        //Get the connection to database
        return DriverManager.getConnection(connString);
    }

    @Override
    public Book create(Book b) {
        b = new Book();
       
        return b;
    }

    @Override
    public Book add(Book b) throws Exception {
        Connection conn = getConnection();
        try
        {
            Statement myStmnt = conn.createStatement();
            
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return b;
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
