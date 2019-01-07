
package com.daqecho.ftsi_analytics.ui.chart.setup;

public class ChartAxis
{

    public ChartAxis( String AxisName , String AxisType , String AxisUnit , String AxisChannel )
    {
        this.AxisName = AxisName;
        this.AxisType = AxisType;
        this.AxisUnit = AxisUnit;
        this.AxisChannel = AxisChannel;
    }

    public ChartAxis()
    {
    }

    private String AxisName;
    private String AxisType;
    private String AxisUnit;
    private String AxisChannel;
    private String AxitColor;
    private boolean AxisSolid;
    private boolean AxisDashed;
    private boolean AxisDotted;
    private boolean AxisAutomaticScaling;
    private boolean AxitAutomaticGridLines;
    private double AxisScaleMin;
    private double AxisScaleMax;
    private double AxisGridLinesInterval;
    private double AxisTickmarksInterval;
    private int LineThickness;

    public String getAxisChannel()
    {
        return AxisChannel;
    }

    public void setAxisChannel( String AxisChannel )
    {
        this.AxisChannel = AxisChannel;
    }

    public double getAxisGridLinesInterval()
    {
        return AxisGridLinesInterval;
    }

    public void setAxisGridLinesInterval( double AxisGridLinesInterval )
    {
        this.AxisGridLinesInterval = AxisGridLinesInterval;
    }

    public String getAxisName()
    {
        return AxisName;
    }

    public void setAxisName( String AxisName )
    {
        this.AxisName = AxisName;
    }

    public double getAxisScaleMax()
    {
        return AxisScaleMax;
    }

    public void setAxisScaleMax( double AxisScaleMax )
    {
        this.AxisScaleMax = AxisScaleMax;
    }

    public double getAxisScaleMin()
    {
        return AxisScaleMin;
    }

    public void setAxisScaleMin( double AxisScaleMin )
    {
        this.AxisScaleMin = AxisScaleMin;
    }

    public double getAxisTickmarksInterval()
    {
        return AxisTickmarksInterval;
    }

    public void setAxisTickmarksInterval( double AxisTickmarksInterval )
    {
        this.AxisTickmarksInterval = AxisTickmarksInterval;
    }

    public String getAxisType()
    {
        return AxisType;
    }

    public void setAxisType( String AxisType )
    {
        this.AxisType = AxisType;
    }

    public String getAxisUnit()
    {
        return AxisUnit;
    }

    public void setAxisUnit( String AxisUnit )
    {
        this.AxisUnit = AxisUnit;
    }

    public String getAxitColor()
    {
        return AxitColor;
    }

    public void setAxitColor( String AxitColor )
    {
        this.AxitColor = AxitColor;
    }

    public double getLineThickness()
    {
        return LineThickness;
    }

    public void setLineThickness( int LineThickness )
    {
        this.LineThickness = LineThickness;
    }

    public boolean isAxisAutomaticScaling()
    {
        return AxisAutomaticScaling;
    }

    public void setAxisAutomaticScaling( boolean AxisAutomaticScaling )
    {
        this.AxisAutomaticScaling = AxisAutomaticScaling;
    }

    public boolean isAxisDashed()
    {
        return AxisDashed;
    }

    public void setAxisDashed( boolean AxisDashed )
    {
        this.AxisDashed = AxisDashed;
    }

    public boolean isAxisDotted()
    {
        return AxisDotted;
    }

    public void setAxisDotted( boolean AxisDotted )
    {
        this.AxisDotted = AxisDotted;
    }

    public boolean isAxisSolid()
    {
        return AxisSolid;
    }

    public void setAxisSolid( boolean AxisSolid )
    {
        this.AxisSolid = AxisSolid;
    }

    public boolean isAxitAutomaticGridLines()
    {
        return AxitAutomaticGridLines;
    }

    public void setAxitAutomaticGridLines( boolean AxitAutomaticGridLines )
    {
        this.AxitAutomaticGridLines = AxitAutomaticGridLines;
    }

    @Override
    public String toString()
    {
        return "ChartAxis{" + "AxisName=" + AxisName + ", AxisType=" + AxisType + ", AxisUnit=" + AxisUnit + ", AxisChannel=" + AxisChannel + ", AxitColor=" + AxitColor + ", AxisSolid=" + AxisSolid + ", AxisDashed=" + AxisDashed + ", AxisDotted=" + AxisDotted + ", AxisAutomaticScaling=" + AxisAutomaticScaling + ", AxitAutomaticGridLines=" + AxitAutomaticGridLines + ", AxisScaleMin=" + AxisScaleMin + ", AxisScaleMax=" + AxisScaleMax + ", AxisGridLinesInterval=" + AxisGridLinesInterval + ", AxisTickmarksInterval=" + AxisTickmarksInterval + ", LineThickness=" + LineThickness + '}';
    }

}
