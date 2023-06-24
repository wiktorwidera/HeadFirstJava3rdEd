public class Book implements Comparable<Book> {
    private String title;
    public Book(String t) {
        title = t;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.getTitle());
    }

    public String getTitle() {
        return title;
    }
}
