package book.base;

import java.util.*;
public class BookShelf {

private ArrayList<Book> list;


public BookShelf(){
        list = new ArrayList<Book>();
    }


public void printBooks(){

    int counter = 0;

    while( counter < list.size()){
        
    System.out.println(list.get(counter));

    counter ++;
}

}
public void addBook( Book book){
    
    list.add(book);

}

public void removeBook(Book book){
    list.remove(book);
}


public Book findBook(Book book){

   boolean match = list.contains(book);


   for(int i = 0; i < list.size(); i++){

    if (match == true){
        
        return book;
   }
   else  return null;
 
}

return book;

}

}
