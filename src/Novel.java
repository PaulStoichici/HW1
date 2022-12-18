public class Novel extends Book {

    private String type;

    public Novel() {}

    public Novel(int pages, String title, String type) {
        super(pages, title);
        this.type = type;
    }

    public Novel(int pages, String title) {
        super(pages, title);
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Novel=[pages=" + getPages() + ", title=" + getTitle() + ", type=" + getType() + "]";
    }

}