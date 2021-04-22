package TitlePrinter;

import java.io.*;
import java.util.ArrayList;

public class TitlePrinter {

    static private final ArrayList<String> title = new ArrayList<>();

    public void printTitle() throws IOException {
        this.printTitle(new BufferedWriter(new OutputStreamWriter(System.out)));
    }

    public void printTitle(Writer w) throws IOException {
        for (String line : title) {
            w.write(line + "\n");
            w.flush();
        }
    }

    public TitlePrinter(File f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        while ((line = br.readLine()) != null) {
            title.add(line);
        }
    }

}
