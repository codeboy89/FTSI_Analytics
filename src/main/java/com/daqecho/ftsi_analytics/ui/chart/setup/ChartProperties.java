
package com.daqecho.ftsi_analytics.ui.chart.setup;

public class ChartProperties
{

    public ChartProperties()
    {
    }

    public ChartProperties( String ChartTitle , int NumYAxis )
    {
        this.ChartTitle = ChartTitle;
        this.NumYAxis = NumYAxis;
    }

    public ChartProperties( String ChartTitle , int NumYAxis , double DefaultVisibleTime , double GridLinesInterval , double TickMarksInterval , boolean AutomaticGridLines )
    {
        this.ChartTitle = ChartTitle;
        this.NumYAxis = NumYAxis;
        this.DefaultVisibleTime = DefaultVisibleTime;
        this.GridLinesInterval = GridLinesInterval;
        this.TickMarksInterval = TickMarksInterval;
        this.AutomaticGridLines = AutomaticGridLines;
    }

    private String ChartTitle;
    private int NumYAxis;
    private double DefaultVisibleTime;
    private double GridLinesInterval;
    private double TickMarksInterval;
    private boolean AutomaticGridLines;

    public String getChartTitle()
    {
        return ChartTitle;
    }

    public void setChartTitle( String ChartTitle )
    {
        this.ChartTitle = ChartTitle;
    }

    public double getDefaultVisibleTime()
    {
        return DefaultVisibleTime;
    }

    public void setDefaultVisibleTime( double DefaultVisibleTime )
    {
        this.DefaultVisibleTime = DefaultVisibleTime;
    }

    public double getGridLinesInterval()
    {
        return GridLinesInterval;
    }

    public void setGridLinesInterval( double GridLinesInterval )
    {
        this.GridLinesInterval = GridLinesInterval;
    }

    public int getNumYAxis()
    {
        return NumYAxis;
    }

    public void setNumYAxis( int NumYAxis )
    {
        this.NumYAxis = NumYAxis;
    }

    public double getTickMarksInterval()
    {
        return TickMarksInterval;
    }

    public void setTickMarksInterval( double TickMarksInterval )
    {
        this.TickMarksInterval = TickMarksInterval;
    }

    public boolean isAutomaticGridLines()
    {
        return AutomaticGridLines;
    }

    public void setAutomaticGridLines( boolean AutomaticGridLines )
    {
        this.AutomaticGridLines = AutomaticGridLines;
    }

    @Override
    public String toString()
    {
        return "ChartProperties{" + "ChartTitle=" + ChartTitle + ", NumYAxis=" + NumYAxis + ", DefaultVisibleTime=" + DefaultVisibleTime + ", GridLinesInterval=" + GridLinesInterval + ", TickMarksInterval=" + TickMarksInterval + ", AutomaticGridLines=" + AutomaticGridLines + '}';
    }

}
