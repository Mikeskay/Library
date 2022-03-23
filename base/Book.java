package book.base;

public abstract class Book{

protected String title;
protected String  author;
protected String  isbn;
protected boolean availability = true;

    public Book(String title, String author, final String isbn, boolean availability){
        
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availability = availability;
    
    }

    public String getTitle(){

        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor(){

        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getIsbn(){

        return this.isbn;
    }


    public boolean getAvailability(){

        return this.availability;
    }
        

    public void setAvailability(boolean availability){
        
    
        this.availability = availability;
    
    }


    public static void printcheckedIn(boolean availability){

        System.out.println("Book is " + availability);
        
    }


    public String toString(){
        return "Book title: " + title + " Book Auther: " + author + " Book ISBN: " + isbn + " Book availability: " + availability;
    }

   
}
