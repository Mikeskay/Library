# Task Title: Library

# Task Description:

Create a book class that contains an Object-Oriented abstraction of a Book.

The following figure is a UML class diagram that describes Book.class:

Create a Bookshelf class that uses an ArrayList to store Book objects. The size of the
bookshelf (maximum number of books that it can store) is defined when initialising the
object. If a size is not specified, a default value of 10 is set.

A Bookshelf should also support the following three operations:
- void printBooks()
- void addBook(String isbn, String title, String author)
- Book findBookWithIsbn(String isbn)

If the bookshelf is full and you try to add another book, the class should print an error
message. When you search for a book that is not available, the class should return
“null” using the command “return null;”. Otherwise, it should return the correct Book object.

Create TestBookshelf class and test the implementation in its main method. (You
don't need a TestBook class anymore)
