/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics.ui;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Charts implements ChartsInterface
{

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

    @Override
    public void SetupChartProperties()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /*
    Charts(Container contentPane)
    {
      //  window = contentPane.;
    }
     */
    public void setWindow( JFrame window )
    {
        this.window = window;
    }

    public ChartPanel create()
    {
        series = new XYSeries("test");
        dataset = new XYSeriesCollection(series);
        chart = ChartFactory.createXYLineChart(chartTitle , domainAxisLabel , RangeAxisLabel , dataset);
        chart.setBackgroundPaint(Color.darkGray);
        cp = new ChartPanel(chart);
        cp.setBackground(Color.BLACK);
        cp.setMouseZoomable(true);

        ChartUtils.applyCurrentTheme(chart);

        XYPlot plot = ( XYPlot ) chart.getPlot();
        XYItemRenderer XYItemRendererrender = plot.getRenderer();

        XYItemRendererrender.setSeriesPaint(0 , Color.ORANGE);
        XYItemRendererrender.setSeriesItemLabelPaint(0 , Color.orange);
        plot.getDataset().;
        Color range = Color.ORANGE;
        Color domain = Color.ORANGE;
        plot.getRangeAxisForDataset(0).setLabelPaint(domain);
        plot.getRangeAxisForDataset(0).setTickMarkPaint(domain);
        plot.getRangeAxisForDataset(0).setTickLabelPaint(domain);

        plot.getDomainAxisForDataset(0).setLabelPaint(domain);
        plot.getDomainAxisForDataset(0).setTickMarkPaint(domain);
        plot.getDomainAxisForDataset(0).setTickLabelPaint(domain);

        XYItemRendererrender.setSeriesPaint(0 , range);
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
        series.add(x , y);
    }

}
