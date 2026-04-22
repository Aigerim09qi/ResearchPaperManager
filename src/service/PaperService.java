package service;

import model.ResearchPaper;
import java.util.ArrayList;
import utils.FileManager;



public class PaperService {

    private ArrayList<ResearchPaper> papers;

    public PaperService() {
        papers = FileManager.load();
    }

    // CREATE
    public void addPaper(ResearchPaper paper) {
        papers.add(paper);
        FileManager.save(papers);
    }

    // READ
    public void showAllPapers() {
        if (papers.isEmpty()) {
            System.out.println("No papers found");
        }
        for (ResearchPaper p : papers) {
            System.out.println(
                    p.getId() + " | " +
                            p.getTitle() + " | " +
                            p.getAuthor() + " | " +
                            p.getYear() + " | " +
                            p.getType()
            );
        }
    }

    // DELETE
    public void deletePaper(int id) {
        boolean removed = papers.removeIf(p -> p.getId() == id);

        if (removed) {
            FileManager.save(papers);
            System.out.println("Paper deleted successfully!");
        } else {
            System.out.println("Paper not found!");
        }
    }

    // UPDATE
    public void updatePaper(int id, String newTitle) {
        boolean found = false;

        for (ResearchPaper p : papers) {
            if (p.getId() == id) {
                p.setTitle(newTitle);
                found = true;
            }
        }

        if (found) {
            FileManager.save(papers);
            System.out.println("Paper updated successfully!");
        } else {
            System.out.println("Paper not found!");
        }
    }

    public ArrayList<ResearchPaper> getPapers() {
        return papers;
    }


    public void importCSV() {
        papers = FileManager.importFromCSV();
        System.out.println("Imported from CSV!");
    }
    public void exportCSV() {
        FileManager.exportToCSV(papers);
    }
}


