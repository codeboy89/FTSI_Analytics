package com.daqecho.ftsi_analytics.input;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSV
{

    //private static URI SAMPLE_CSV_FILE_PATH;
    private static String PATH;
    private static CSVReader csvReader;
    private static List<String[]> data;
    String Path;
    private List<String[]> List;

    public CSV(String Path)
    {
        this.PATH = Path;
    }

    private static void run() throws IOException
    {
        try
        {
            Reader reader = Files.newBufferedReader(Paths.get(PATH));
            csvReader = new CSVReader(reader);
        } catch (Exception e)
        {
            System.out.println(e);
        }
        {
            data = csvReader.readAll();
        }
    }

    public List<String[]> load()
    {
        try
        {
            run();
            return data;
        } catch (IOException ex)
        {
            Logger.getLogger(CSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
