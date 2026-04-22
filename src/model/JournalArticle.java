package model;

public class JournalArticle extends ResearchPaper {

    public JournalArticle(int id, String title, String author, int year) {
        super(id, title, author, year);
    }

    @Override
    public String getType() {
        return "Journal Article";
    }
}