package book.base;

public class TextBook extends Book {
    
    protected String publisher;

    public TextBook(String title, String author, final String isbn, boolean availability, String publisher){
        super(title, author, isbn, availability);
        this.publisher = publisher;
        
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getPublisher(){
        return publisher;
    }

    
}
