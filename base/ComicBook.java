package book.base;

public class ComicBook extends Book {
    protected String illustrator;

    public ComicBook(String title, String author, final String isbn, boolean availability, String illustrator){
    
       super(title, author, isbn, availability);
       this.illustrator = illustrator;
    
    }

    public void setillustrator(String illustrator){
        this.illustrator = illustrator;
    }

    public String getillustrator(){
        return illustrator;
    }
    
}
