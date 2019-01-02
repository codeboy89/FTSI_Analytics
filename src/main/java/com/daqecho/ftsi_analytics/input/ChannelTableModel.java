/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daqecho.ftsi_analytics.input;

import com.daqecho.ftsi_analytics.data.Channel;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ChannelTableModel extends AbstractTableModel
{

    private ArrayList<Channel> ChannelList;

    private String[] columnNames =
    {
        "POS", "NAME", "TYPE", "Units"
    };

    public ChannelTableModel(ArrayList<Channel> channelList)
    {
        this.ChannelList = channelList;
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        int size;
        if (ChannelList == null)
        {
            size = 0;
        } else
        {
            size = ChannelList.size();
        }
        return size;
    }

    @Override
    public Object getValueAt(int row, int col)
    {
        Object temp = null;

        switch (col)
        {
            case 0:
                temp = ChannelList.get(row).getPos();
                break;
            case 1:
                temp = ChannelList.get(row).getName();
                break;
            case 2:
                temp = ChannelList.get(row).getType();
                break;
            case 3:
                temp = ChannelList.get(row).getUnit();
                break;
            default:
                break;
        }

        return temp;
    }
    // needed to show column names in JTable

    @Override
    public String getColumnName(int col)
    {
        return columnNames[col];
    }

    @Override
    public Class getColumnClass(int col)
    {
        return String.class;
    }
}
