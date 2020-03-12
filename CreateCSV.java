package co.com.choucair.certification.linkedin.util;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class CreateCSV {

    private static CSVWriter writer;

    static {
        try {
            writer = new CSVWriter(new FileWriter("src/test/resources/testFiles/interests.csv"), '\t');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void file(String[] lines) throws IOException {
        writer.writeNext(lines);
        writer.close();
    }
    
}
