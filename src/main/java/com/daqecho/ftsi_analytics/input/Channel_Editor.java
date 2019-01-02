package com.daqecho.ftsi_analytics.input;

import com.daqecho.ftsi_analytics.data.Channel;
import de.javasoft.plaf.synthetica.*;
import java.awt.PopupMenu;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Channel_Editor extends javax.swing.JFrame
{

    private Input_Channel_Selection ics;
    private Channel ReturnedChannel;
    private static Channel channel;
    private boolean unitsSelected = false;
    private boolean typesSelected = false;
    private String TypeValues;
    private String UnitValues;
    private String SelectedUnit;
    private String SelectedType;
    private String SelectedName = "channel name";
    private List<String> TypeRowlist;
    private List<String> UnitRowList;
    private List<String> TableArrayList;
    private DefaultTableModel TypeRowTableModel;
    private DefaultTableModel UnitRowTableModel;
    private int SelectedTypeRow;
    private int SelectedUnitRow;
    private int returnedRow;
    private int SelectedPos;
    private Object model;
    private Object table;
    private String[] TypeRowsStrings =
    {
        "Acidity", "Generic", "Density", "Date/Time", "Elapsed Time", "Length", "Mass", "Power", "Percent", "Pressure", "Rate (mass)",
        "Rate (mass/rev)", "Rate (revolutions)", "Rate (volume)", "Ratio", "String", "Temperature", "Velocity", "Viscosity", "Volts", "Volume"
    };

    public Input_Channel_Selection getIcs()
    {
        return ics;
    }

    public void setIcs(Input_Channel_Selection ics)
    {
        this.ics = ics;
    }

    public int getSelectedPos()
    {
        return SelectedPos;
    }

    public void setSelectedPos(int SelectedPos)
    {
        this.SelectedPos = SelectedPos;
    }

    public Channel_Editor()
    {
        load();
        initComponents();
        initTypeRows();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel3 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CE_Lable_Name = new javax.swing.JTextField();
        CE_JScrollPane_Units = new javax.swing.JScrollPane();
        CE_Table_Units = new javax.swing.JTable();
        ICS_Button_Cancel = new javax.swing.JButton();
        ICS_Button_Finish = new javax.swing.JButton();
        CE_JScrollPane_Type = new javax.swing.JScrollPane();
        CE_Table_Type = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);
        setResizable(false);
        setSize(getPreferredSize());

        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setAlignmentX(0.0F);
        MainPanel.setAlignmentY(0.0F);
        MainPanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MainPanel.setOpaque(false);
        MainPanel.setPreferredSize(new java.awt.Dimension(808, 554));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Type and Units:");

        CE_Lable_Name.setText("Channel Name");
        CE_Lable_Name.setAutoscrolls(false);

        CE_JScrollPane_Units.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        CE_Table_Units.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Units"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        CE_Table_Units.setColumnSelectionAllowed(true);
        CE_Table_Units.setPreferredSize(new java.awt.Dimension(324, 64));
        CE_Table_Units.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CE_Table_UnitsMouseClicked(evt);
            }
        });
        CE_JScrollPane_Units.setViewportView(CE_Table_Units);
        CE_Table_Units.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (CE_Table_Units.getColumnModel().getColumnCount() > 0)
        {
            CE_Table_Units.getColumnModel().getColumn(0).setResizable(false);
        }

        ICS_Button_Cancel.setMnemonic('c');
        ICS_Button_Cancel.setText("Cancel");
        ICS_Button_Cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_CancelActionPerformed(evt);
            }
        });

        ICS_Button_Finish.setMnemonic('f');
        ICS_Button_Finish.setText("Finish");
        ICS_Button_Finish.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_FinishActionPerformed(evt);
            }
        });

        CE_JScrollPane_Type.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        CE_Table_Type.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Type"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        CE_Table_Type.setColumnSelectionAllowed(true);
        CE_Table_Type.setFillsViewportHeight(true);
        CE_Table_Type.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CE_Table_TypeMouseClicked(evt);
            }
        });
        CE_Table_Type.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                CE_Table_TypePropertyChange(evt);
            }
        });
        CE_JScrollPane_Type.setViewportView(CE_Table_Type);
        CE_Table_Type.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (CE_Table_Type.getColumnModel().getColumnCount() > 0)
        {
            CE_Table_Type.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(ICS_Button_Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ICS_Button_Finish))
                    .addComponent(CE_Lable_Name)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(CE_JScrollPane_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CE_JScrollPane_Units, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))
                .addGap(171, 171, 171))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CE_Lable_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CE_JScrollPane_Type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(CE_JScrollPane_Units, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICS_Button_Cancel)
                    .addComponent(ICS_Button_Finish))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Edit the Name, Type, and Units of this channel");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Channel Editor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ICS_Button_CancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_CancelActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_CancelActionPerformed
        super.dispose();
    }//GEN-LAST:event_ICS_Button_CancelActionPerformed

    private void ICS_Button_FinishActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_FinishActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_FinishActionPerformed
        if (unitsSelected && typesSelected)
        {
            this.SelectedName = CE_Lable_Name.getText();
            ics.insertChannelToArray(createReturnChannel(), SelectedPos);

            setVisible(false); //you can't see me!
            dispose();
        }
    }//GEN-LAST:event_ICS_Button_FinishActionPerformed

    private void CE_Table_TypePropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_CE_Table_TypePropertyChange
    {//GEN-HEADEREND:event_CE_Table_TypePropertyChange

    }//GEN-LAST:event_CE_Table_TypePropertyChange

    private void CE_Table_TypeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CE_Table_TypeMouseClicked
    {//GEN-HEADEREND:event_CE_Table_TypeMouseClicked
        getSelectedTypeValues();
        typesSelected = true;
    }//GEN-LAST:event_CE_Table_TypeMouseClicked

    private void CE_Table_UnitsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CE_Table_UnitsMouseClicked
    {//GEN-HEADEREND:event_CE_Table_UnitsMouseClicked
        getSelectedUnitsValues();
        unitsSelected = true;
    }//GEN-LAST:event_CE_Table_UnitsMouseClicked

    public static void load()
    {
        channel = new Channel();

        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                    break;
                }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException | ParseException ex)
        {
            java.util.logging.Logger.getLogger(Channel_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    private void initTypeRows()
    {
        TypeRowlist = Arrays.asList(TypeRowsStrings);
        TypeRowTableModel = (DefaultTableModel) CE_Table_Type.getModel();
        Object rowData[] = new Object[1];
        for (int i = 0; i < TypeRowlist.size(); i++)
        {
            rowData[0] = TypeRowlist.get(i);
            TypeRowTableModel.addRow(rowData);
        }
        CE_Table_Type.setModel(TypeRowTableModel);
        if (ReturnedChannel != null)
        {
            CE_Table_Type.setRowSelectionInterval(SelectedTypeRow, 1);
            System.out.println("Channel Returned: " + ReturnedChannel.toString());
        }
    }

    private void getSelectedTypeValues()
    {
        Object xyz = null;
        String Value = null;
        try
        {
            Value = (String) CE_Table_Type.getValueAt(CE_Table_Type.getSelectedRow(), 0);
            initUnitRows(dump(Class.forName("com.daqecho.ftsi_analytics.data.types." + lookupTypes(Value)).newInstance()));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex)
        {
            Logger.getLogger(Channel_Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.SelectedTypeRow = CE_Table_Type.getSelectedRow();
        this.SelectedType = Value;
    }

    public static String[] dump(Object o)
    {
        String[] s = null;
        Method[] m = o.getClass().getDeclaredMethods();
        try
        {
            s = (String[]) m[0].invoke(o, null);

        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex)
        {
            Logger.getLogger(Channel_Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    private String lookupUnits(String Value)
    {

        String[] Name =
        {
            "Acidity",
            "Generic",
            "Density",
            "Date/Time",
            "Elapsed Time",
            "Length",
            "Mass",
            "Power",
            "Percent",
            "Pressure",
            "Rate (mass)",
            "Rate (mass/rev)",
            "Rate (revolutions)",
            "Rate (volume)",
            "Ratio",
            "String",
            "Temperature",
            "Velocity",
            "Viscosity",
            "Volts",
            "Volume"
        };

        String[] ClassName =
        {
            "Acidity",
            "Generic",
            "Density",
            "DateTime",
            "ElapsedTime",
            "Length",
            "Mass",
            "Power",
            "Percent",
            "Pressure",
            "RateMass",
            "RateMassRev",
            "RateRevolutions",
            "RateVolume",
            "Ratio",
            "String",
            "Temperature",
            "Velocity",
            "Viscosity",
            "Volts",
            "Volume"
        };

        HashMap<String, String> hmap = new HashMap<>();

        for (int i = 0; i < Name.length; i++)
        {
            hmap.put(Name[i], ClassName[i]);
        }

        return hmap.get(Value);
    }

    private String lookupTypes(String Value)
    {

        String[] Name =
        {
            "Acidity", "Generic", "Density", "Date/Time", "Elapsed Time", "Length", "Mass", "Power", "Percent", "Pressure", "Rate (mass)", "Rate (mass/rev)",
            "Rate (revolutions)", "Rate (volume)", "Ratio", "String", "Temperature", "Velocity", "Viscosity", "Volts", "Volume"
        };

        String[] ClassName =
        {
            "Acidity", "Generic", "Density", "DateTime", "ElapsedTime", "Length", "Mass", "Power", "Percent", "Pressure", "RateMass", "RateMassRev", "RateRevolutions",
            "RateVolume", "Ratio", "String", "Temperature", "Velocity", "Viscosity", "Volts", "Volume"
        };

        HashMap<String, String> hmap = new HashMap<>();

        for (int i = 0; i < Name.length; i++)
        {
            hmap.put(Name[i], ClassName[i]);
        }

        return hmap.get(Value);
    }

    private void initUnitRows(String[] s)
    {
        UnitRowList = Arrays.asList(s);
        UnitRowTableModel = (DefaultTableModel) CE_Table_Units.getModel();
        UnitRowTableModel.setRowCount(0);
        Object rowData[] = new Object[1];
        for (int i = 0; i < UnitRowList.size(); i++)
        {
            rowData[0] = UnitRowList.get(i);
            UnitRowTableModel.addRow(rowData);
        }
        CE_Table_Units.setModel(UnitRowTableModel);
    }

    private void getSelectedUnitsValues()
    {
        String Value = (String) CE_Table_Units.getValueAt(CE_Table_Units.getSelectedRow(), 0);
        this.SelectedUnit = Value;
        this.SelectedUnitRow = CE_Table_Units.getSelectedRow();
    }

    void editRow(Channel channel)
    {
        ReturnedChannel = channel;
        this.SelectedName = channel.getName();
        this.SelectedType = channel.getType();
        this.SelectedUnit = channel.getUnit();
        this.SelectedTypeRow = channel.getTypeRow();
        this.SelectedUnitRow = channel.getUnitRow();
        this.SelectedPos = channel.getPos();
        initTypeRows();
    }

    private Channel createReturnChannel()
    {
        Channel c = new Channel();
        c.setName(SelectedName);
        c.setType(SelectedType);
        c.setUnit(SelectedUnit);
        c.setTypeRow(SelectedTypeRow);
        c.setUnitRow(SelectedUnitRow);
        c.setPos(SelectedPos);

        return c;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CE_JScrollPane_Type;
    private javax.swing.JScrollPane CE_JScrollPane_Units;
    private javax.swing.JTextField CE_Lable_Name;
    public javax.swing.JTable CE_Table_Type;
    private javax.swing.JTable CE_Table_Units;
    private javax.swing.JButton ICS_Button_Cancel;
    private javax.swing.JButton ICS_Button_Finish;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
