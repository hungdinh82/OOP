package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(String title) {
        super(title);
    }

    public Book(String id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author is already in the list.");
            return;
        }

        System.out.println(authorName + "add");
        authors.add(authorName);
        System.out.println("Successfully added new author.");
    }

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author is not in the list.");
            return;
        }
        authors.remove(authorName);
    }
}

