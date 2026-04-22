package model;

public class ConferencePaper extends ResearchPaper {

    public ConferencePaper(int id, String title, String author, int year) {
        super(id, title, author, year);
    }

    @Override
    public String getType() {
        return "Conference Paper";
    }
}
