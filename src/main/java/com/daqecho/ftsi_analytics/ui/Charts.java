/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics.ui;

import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Charts implements ChartsInterface
{

    private boolean legend = true;
    private final NewChartEditorProperties ncep;
    private boolean toolTips = true;
    private boolean url = false;
    private XYSeries series;
    private XYSeriesCollection dataset;
    private String title = "title";
    private String domainAxisLabel = "x";
    private String RangeAxisLabel = "y";
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
        chart = ChartFactory.createXYLineChart(title, domainAxisLabel, RangeAxisLabel, dataset);
        cp = new ChartPanel(chart);

        return cp;
    }

    @Override
    public void SetupChartProperties()
    {
        this.title = ncep.getTitle();
        this.RangeAxisLabel = ncep.getRangeAxisLabel();
        this.domainAxisLabel = ncep.getDomainAxisLabel();
        this.legend = ncep.isLegend();
        this.toolTips = ncep.isToolTips();
        this.url = ncep.isUrl();
        System.out.println("Class: Charts: SetupChartProperties: " + ncep.toString());

    }

    public Charts()
    {
        ncep = new NewChartEditorProperties(this);
        ncep.Show();
    }

    public void update(double x, double y)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
