package com.daqecho.ftsi_analytics;

import com.daqecho.ftsi_analytics.ui.Charts;
import com.daqecho.ftsi_analytics.input.CSV;
import com.daqecho.ftsi_analytics.*;
import com.daqecho.ftsi_analytics.ui.ui;
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

    public static void main(String[] args)
    {
        ui UI = new ui();
        UI.load();

    }
}
