package hust.soict.dsai.aims.media;

public abstract class Media {
    private String id;
    private final String title;
    private String category;
    private float cost;

    public Media(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public Media(String id, String title, String category, float cost) {
        this(title);
        this.id = id;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }
}
