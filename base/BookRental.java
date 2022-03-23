package book.base;

public class BookRental{
        
    public static void checkAvailability(boolean availability){
        if (availability){
            System.out.println("this book is free");
        }
        else{
            System.out.println("Sorry this book has been rented");
        }
    
    }
    public static boolean rentBook(boolean availability){
        
        if (availability == true){
    
            System.out.println("It's your lucky day, this book is available - you have now rented this book");
                     
        }
    
        else{
            System.out.println("Sorry Mate, this book is unavailable");
        
        
        }
        return availability = false;
    
    }

    public static boolean returnBook(boolean availability){
        if (availability == true){

            System.out.println("You can't return a book you haven't borrowed");
        }

        else{
            System.out.println("thank you, return made");
        }

        return availability = true;

    }   



}




