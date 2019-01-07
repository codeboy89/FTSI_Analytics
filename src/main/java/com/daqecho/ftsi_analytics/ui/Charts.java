/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics.ui;

import java.awt.Color;
import javafx.scene.chart.NumberAxis;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Charts implements ChartsInterface
{

    public Charts( NewChartEditorProperties ncep )
    {
        this.ncep = ncep;
    }

    Charts( Charts chart )
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private NumberAxis numberAxis;
    private XYSeriesCollection xYDataset;
    private XYPlot plot;
    private int datasetIndex = 0;
    private final NewChartEditorProperties ncep;
    public String chartTitle;
    private String domainAxisLabel = "x axis";
    private String RangeAxisLabel = "y axie";
    private double TickMarksEvery;
    private double GridLinesEverys;
    private double defaultVisibleTime;
    private int numYAxes;
    private boolean legend = true;
    private boolean toolTips = true;
    private boolean url = false;
    private XYSeries series;
    private XYSeriesCollection dataset;
    private JFreeChart chart;
    private JFrame window;
    private ChartPanel cp;
    private int seriesNum = 0;

    private void updateCollection( XYSeries series )
    {
        xYDataset.addSeries(series);
    }

    @Override
    public void SetupChartProperties()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setWindow( JFrame window )
    {
        this.window = window;
    }

    private TimeSeriesCollection createRandomDataset( String name )
    {
        TimeSeries randomSeries = new TimeSeries(name);
        double value = 100.0;
        RegularTimePeriod t = new Day();
        for ( int i = 0 ; i < 50 ; i++ )
            {
            randomSeries.add(t , value);
            t = t.next();
            value *= ( 1.0 + Math.random() / 100 );
            }
        return new TimeSeriesCollection(randomSeries);
    }

    public void addDataSet( String name )
    {
        createDataset(name);
    }

    private void createDataset( String name )
    {
        series = new XYSeries(name);
        updateCollection(series);
    }

    public ChartPanel create()
    {
        xYDataset = new XYSeriesCollection();
        chart = ChartFactory.createXYLineChart(chartTitle , domainAxisLabel , RangeAxisLabel , xYDataset);
        chart.setBackgroundPaint(Color.darkGray);
        cp = new ChartPanel(chart);
        cp.setBackground(Color.BLACK);
        cp.setMouseZoomable(true);

        ChartUtils.applyCurrentTheme(chart);

        return cp;
    }

    @Override
    public void SetupChartProperties( NewChartEditorProperties newChartEditorProperties )
    {
        this.chartTitle = newChartEditorProperties.getChartTitle();
        this.TickMarksEvery = newChartEditorProperties.getTickMarksEvery();
        this.GridLinesEverys = newChartEditorProperties.getGridLinesEverys();
        this.defaultVisibleTime = newChartEditorProperties.getDefaultVisibleTime();
        this.numYAxes = newChartEditorProperties.getNumYAxes();
        System.out.println("Class: Charts: SetupChartProperties: " + newChartEditorProperties.toString());
    }

    public Charts()
    {
        ncep = new NewChartEditorProperties(this);
        ncep.Show();
    }

    public void update( double x , double y )
    {
        series.add(x / 100 , y);
    }

}
