package com.daqecho.ftsi_analytics.data;

import java.util.ArrayList;

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
    private int tablePos = 0;

    public Channel(ArrayList<Channel> channelList)
    {
        String temp;
        temp = channelList.toString();
        String[] s;
        s = temp.split(",");
        this.name = s[0];
        this.type = s[1];
        this.unit = s[2];
        this.tablePos = Integer.parseInt(s[3].trim().replaceAll("[^0-9]", ""));
        this.typeRow = Integer.parseInt(s[4].trim().replaceAll("[^0-9]", ""));
        this.unitRow = Integer.parseInt(s[5].trim().replaceAll("[^0-9]", ""));
        this.pos = Integer.parseInt(s[3].trim().replaceAll("[^0-9]", ""));
    }

    public Channel(String channel)
    {
        System.out.println("Class: Channel: Constructor: Channel(String channel) - channel: " + channel);
        String[] channelSplit = channel.trim().split(",");
        this.name = channelSplit[0];
        this.type = channelSplit[1];
        this.unit = channelSplit[2];
        System.out.println("pos" + Integer.parseInt(channelSplit[3]));
        this.tablePos = Integer.parseInt(channelSplit[3].trim().replaceAll("[^0-9]", ""));
        this.typeRow = Integer.parseInt(channelSplit[4].trim().replaceAll("[^0-9]", ""));
        this.unitRow = Integer.parseInt(channelSplit[5].trim().replaceAll("[^0-9]", ""));
        this.pos = Integer.parseInt(channelSplit[6].trim().replaceAll("[^0-9]", ""));

    }

    @Override
    public String toString()
    {
        return "{" + name + "," + type + "," + unit + "," + tablePos + "," + unitRow + "," + typeRow + "," + pos + '}';
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

    public int getTablePos()
    {
        return tablePos;
    }

    public void setTablePos(int tablePos)
    {
        this.tablePos = tablePos;
    }

}
