package model;

public abstract class ResearchPaper implements java.io.Serializable {
    private int id;
    private String title;
    private String author;
    private int year;

    public ResearchPaper(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }

    // для полиморфизма
    public abstract String getType();
}
