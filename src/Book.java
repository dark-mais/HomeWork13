public class Book {
    private String nameBook;
    private Author author;
    private int agePublicBook;

    public Book(String nameBook, Author author, int agePublicBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.agePublicBook = agePublicBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }



    public int getAgePublicBook() {
        return this.agePublicBook;
    }
    public Author getAuthor() {return author;}
    public void setAgePublicBook(int agePublicBook) {
        this.agePublicBook = agePublicBook;
    }
}
