package utils;

import model.ResearchPaper;
import model.JournalArticle;
import model.ConferencePaper;
import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "papers.dat";

    // СОХРАНИТЬ В ФАЙЛ
    public static void save(ArrayList<ResearchPaper> papers) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(FILE_NAME)
            );
            out.writeObject(papers);
            out.close();
            System.out.println("Saved!");
        } catch (Exception e) {
            System.out.println("Error saving!");
        }
    }

    // ЗАГРУЗИТЬ ИЗ ФАЙЛА
    public static ArrayList<ResearchPaper> load() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(FILE_NAME)
            );
            ArrayList<ResearchPaper> papers =
                    (ArrayList<ResearchPaper>) in.readObject();
            in.close();
            return papers;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static void exportToCSV(ArrayList<ResearchPaper> papers) {
        try (PrintWriter writer = new PrintWriter("papers.csv")) {
            writer.println("ID;Title;Author;Year;Type");
            System.out.println(new java.io.File("papers.csv").getAbsolutePath());

            for (ResearchPaper p : papers) {
                writer.println(
                        p.getId() + ";" +
                                p.getTitle() + ";" +
                                p.getAuthor() + ";" +
                                p.getYear() + ";" +
                                p.getType()
                );
            }

            System.out.println("Exported to CSV!");
        } catch (Exception e) {
            System.out.println("Error exporting!");
        }
    }

    public static ArrayList<ResearchPaper> importFromCSV() {
        ArrayList<ResearchPaper> papers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("papers.csv"))) {

            String line;
            reader.readLine(); // пропускаем заголовок

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");

                int id = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                int year = Integer.parseInt(data[3]);
                String type = data[4];

                if (type.equals("Journal Article")) {
                    papers.add(new JournalArticle(id, title, author, year));
                } else {
                    papers.add(new ConferencePaper(id, title, author, year));
                }
            }

        } catch (Exception e) {
            System.out.println("Error importing CSV!");
        }

        return papers;
    }
}
