package com.daqecho.ftsi_analytics;

import com.daqecho.ftsi_analytics.ui.Charts;
import com.daqecho.ftsi_analytics.input.CSV;
import com.daqecho.ftsi_analytics.*;
import com.opencsv.CSVReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Core
{

    private static final String PATH = "C:\\Users\\oilfi\\Documents\\FTSI_Analytics\\FTSI_Analytics\\src\\main\\java\\com\\daqecho\\ftsi_analytics\\datas.csv";
    private static CSV csv;
    private static Charts charts;

    private static void read(Iterable<String[]> records)
    {
        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                for (String[] record : records)
                {
                    charts.update(Double.parseDouble(record[0]), Double.parseDouble(record[2]));
                }
            }

        };
        thread.start();

    }

    public static void mains(String[] args) throws IOException
    {
        csv = new CSV(PATH);
        charts = new Charts();
        read(csv.load());
    }
}
