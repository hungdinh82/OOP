package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;


    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    private String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDisc++;
    }

    public int getId() {
        return id;
    }

    private int id;

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    private static int nbDigitalVideoDisc = 0;

    @Override
    public String toString() {
        return id+". DVD - " + title + " - " + category + " - " +director + " - " + length + " : " + cost + "$";
    }
    public boolean isMatch(String title){
        if(this.title.equals(title))
            return true;
        return false;
    }
}
