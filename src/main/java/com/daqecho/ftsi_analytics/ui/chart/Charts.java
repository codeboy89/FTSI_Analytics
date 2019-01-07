/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics.ui.chart;

import com.daqecho.ftsi_analytics.input.channel.Channel;
import com.daqecho.ftsi_analytics.ui.chart.setup.ChartAxis;
import com.daqecho.ftsi_analytics.ui.chart.setup.ChartInterface;
import com.daqecho.ftsi_analytics.ui.chart.setup.ChartProperties;
import com.daqecho.ftsi_analytics.ui.chart.setup.NewChartEditorProperties;
import com.daqecho.ftsi_analytics.ui.ui;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Charts implements ChartInterface
{

    public Charts( ArrayList<ChartProperties> ChartPropertiesArrayList , ArrayList<ChartAxis> ChartAxisArrayList , ArrayList<Channel> ChannelArrayList )
    {
        ncep = new NewChartEditorProperties(ChartPropertiesArrayList , ChartAxisArrayList , ChannelArrayList);
        ncep.setUi(ui);
        ncep.Show();
    }

    private ui ui;
    private ChartProperties chartProperties;
    private NewChartEditorProperties ncep;
    private XYSeries series;
    private XYSeriesCollection dataset;
    private JFreeChart chart;
    private JFrame window;
    private ChartPanel cp;
    private NumberAxis numberAxis;
    private XYSeriesCollection xYDataset;
    private XYPlot plot;
    private String chartTitle;
    private String domainAxisLabel = "x axis";
    private String RangeAxisLabel = "y axie";
    private int datasetIndex = 0;
    private int numYAxes;
    private int seriesNum = 0;
    private double TickMarksEvery;
    private double GridLinesEverys;
    private double defaultVisibleTime;
    private boolean legend = true;
    private boolean toolTips = true;
    private boolean url = false;

    @Override
    public void SetupChartAxis()
    {
    }

    @Override
    public void SetupChartProperties( ChartProperties chartPropertiesReturned )
    {
        new ui().setChartProperties(this.chartProperties);
        this.chartProperties = chartPropertiesReturned;
        this.chartTitle = this.chartProperties.getChartTitle();
        this.TickMarksEvery = this.chartProperties.getTickMarksInterval();
        this.GridLinesEverys = this.chartProperties.getGridLinesInterval();
        this.defaultVisibleTime = this.chartProperties.getDefaultVisibleTime();
        this.numYAxes = this.chartProperties.getNumYAxis();
        System.out.println("Class: Charts: SetupChartProperties: " + this.chartProperties.toString());
    }

    private void updateCollection( XYSeries series )
    {
        xYDataset.addSeries(series);
    }

    public void setUI( ui aThis )
    {
        this.ui = aThis;
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

    public void update( double x , double y )
    {
        series.add(x / 100 , y);
    }

}
