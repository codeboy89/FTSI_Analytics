/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics.ui;

import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartPanel;

public class Charts
{

    private XYSeries series;
    private XYSeriesCollection dataset;
    private String title = "title";
    private String xAxisLabel = "x";
    private String yAxisLabel = "y";
    private JFreeChart chart;
    private JFrame window;
    private ChartPanel cp;


    /*
    Charts(Container contentPane)
    {
      //  window = contentPane.;
    }
     */
    public void setWindow(JFrame window)
    {
        this.window = window;
    }

    public ChartPanel create()
    {
        series = new XYSeries("test");
        dataset = new XYSeriesCollection(series);
        chart = ChartFactory.createXYLineChart(title, xAxisLabel, yAxisLabel, dataset);
        cp = new ChartPanel(chart);

        return cp;
    }

    public void update(double x, double y)
    {
        series.add(x, y);
    }

    public Charts()
    {
        // gui();
        create();
    }
}
