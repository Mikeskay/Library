package book.test;

import book.base.*;
import java.util.*;
import java.lang.reflect.Field;

public class BookShelfTest {
    public static void main(String[] args) throws Exception {


        
       
        BookShelf list = new BookShelf();
        
        TextBook book1 = new TextBook("Head First Java", "Kathy Sierra and Bert Bates", "978-0596009205",true, "O'Reilly Media");
        NovelBook book2 = new NovelBook("Inferno", "Dan Brown" , "978-0-385-53785-8", true, "English", "Mystery");
        ComicBook book3 = new ComicBook("Asterix and the Picts", "Jean-Yves Ferri, Rene Goscinny and Albert Uderzo", "978-2-86497-266-2", true, "Didier Conrad");

        list.addBook(book1);
        list.addBook(book2);
        list.addBook(book3);
         

        list.printBooks();
        

        
    }
    
}
