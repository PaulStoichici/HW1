import java.util.ArrayList;
import java.util.List;

public class Main {
    enum PaperQuality {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Novel n= new Novel(5,"Nuvela","Comedie");
        Album a= new Album(5,"Michael Jackson",PaperQuality.HIGH.toString());


        List<Book> list = new ArrayList<>();
        list.add(n);
        list.add(a);


        for(Book b : list) {
            System.out.println(b);
        }

        list.remove(n);

        for(Book b : list) {
            System.out.println(b);
        }

    }
}
