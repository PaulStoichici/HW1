public class Album extends Book {

    private String quality;

    public Album() {}

    public Album(int pages, String title, String type) {
        super(pages, title);
        this.quality = type;
    }

    public Album(int pages, String title) {
        super(pages, title);
    }


    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "Album=[pages=" + getPages() + ", title=" + getTitle() + ", quality=" + getQuality() + "]";
    }

}