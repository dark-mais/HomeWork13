public class Book {
    private String nameBook;
    private Author authorBook;
    private int agePublicBook;

    public Book(String nameBook, Author authorBook, int agePublicBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.agePublicBook = agePublicBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }



    public int getAgePublicBook() {
        return this.agePublicBook;
    }
    public void setAgePublicBook(int agePublicBook) {
        this.agePublicBook = agePublicBook;
    }
}
