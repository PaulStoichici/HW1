public class Book {

    //Name - title, nrPages - pages
    protected int pages;
    protected String title;

    //Constructor simplu
    public Book() {
        System.out.println("constructor de carte");
    }

    //Constructor parametrizat
    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    //Getters and setters
    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    //toString
    @Override
    public String toString() {
        return "Book=[pages=" + getPages() + ", " + "title=" + getTitle() + "]";
    }

}
