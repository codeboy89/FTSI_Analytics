package com.daqecho.ftsi_analytics.data;

import com.daqecho.ftsi_analytics.input.Channel_Editor;
import java.util.logging.Logger;

public class Channel
{

    public Channel()
    {
    }

    private String name = (String) "";
    private String type = (String) "";
    private String unit = (String) "";
    private int unitRow = 0;
    private int typeRow = 0;
    private int pos = 0;

    public Channel(Channel_Editor aThis)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString()
    {
        return "{" + name + "," + type + "," + unit + "," + pos + '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public int getUnitRow()
    {
        return unitRow;
    }

    public void setUnitRow(int unitRow)
    {
        this.unitRow = unitRow;
    }

    public int getTypeRow()
    {
        return typeRow;
    }

    public void setTypeRow(int typeRow)
    {
        this.typeRow = typeRow;
    }

    public int getPos()
    {
        return pos;
    }

    public void setPos(int pos)
    {
        this.pos = pos;
    }

}
