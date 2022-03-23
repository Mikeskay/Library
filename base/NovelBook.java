package book.base;

public class NovelBook extends Book {
    protected String Language;
    protected String genre;

    public NovelBook(String title, String author, final String isbn, boolean availability, String Language, String genre){
        
        super(title, author, isbn, availability);
        this.Language = Language;    
        this.genre = genre;
        
    }

    public void setLanguage(String Language){
        this.Language = Language;
    }

    public String getLanguage(){
        return Language;
    }

    public void setgenre(String genre){
        this.genre = genre;
    }

    public String getgenre(){
        return genre;
    }
}
