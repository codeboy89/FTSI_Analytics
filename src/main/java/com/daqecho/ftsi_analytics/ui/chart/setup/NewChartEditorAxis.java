
package com.daqecho.ftsi_analytics.ui.chart.setup;

import com.daqecho.ftsi_analytics.input.channel.Channel;
import com.daqecho.ftsi_analytics.input.channel.ChannelTableModel;
import com.daqecho.ftsi_analytics.input.channel.channelEditor;
import com.daqecho.ftsi_analytics.ui.ui;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class NewChartEditorAxis extends javax.swing.JFrame
{

    public NewChartEditorAxis()
    {

    }

    NewChartEditorAxis( ArrayList<ChartAxis> ChartAxisArrayList , ArrayList<Channel> ChannelArrayList )
    {
        initComponents();
        initTypeRows();
        this.ChartAxisArrayList = ChartAxisArrayList;
        this.ChannelArrayList = ChannelArrayList;
        this.setVisible(true);
    }

    private ArrayList<ChartAxis> ChartAxisArrayList;
    private ArrayList<Channel> ChannelArrayList;
    private ChartAxis chartAxis;
    private boolean typesSelected;
    private ui ui;
    private List<String> TypeRowlist;
    private List<String> UnitRowList;
    private DefaultTableModel TypeRowTableModel;
    private DefaultTableModel UnitRowTableModel;
    private String SelectedUnit;
    private String SelectedType;

    private String[] TypeRowsStrings =
        {
        "Acidity" , "Generic" , "Density" , "Date/Time" , "Elapsed Time" , "Length" , "Mass" , "Power" , "Percent" , "Pressure" , "Rate (mass)" ,
        "Rate (mass/rev)" , "Rate (revolutions)" , "Rate (volume)" , "Ratio" , "String" , "Temperature" , "Velocity" , "Viscosity" , "Volts" , "Volume"
        };
    private boolean unitsSelected;

    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        NewChartEditorAxis_ChartAxisProperties_Jlabel = new javax.swing.JLabel();
        NewChartEditorAxis_Suggestions_Jlabel = new javax.swing.JLabel();
        NewChartEditorAxis_Title_Jlabel = new javax.swing.JLabel();
        NewChartEditorAxis_TitleEdit_JTextField = new javax.swing.JTextField();
        NewChartEditorAxis_TypesAndUnits_Jlabel = new javax.swing.JLabel();
        NewChartEditorProperties_Top_jSeparator = new javax.swing.JSeparator();
        NewChartEditorAxis_Channels_Jlabel = new javax.swing.JLabel();
        NewChartEditorProperties_DVT_Jlabel4 = new javax.swing.JLabel();
        NewChartEditorProperties_Bottom_jseperator = new javax.swing.JSeparator();
        NewChartEditorAxis_AutomaticallyGridLines_JCheckBox = new javax.swing.JCheckBox();
        NewChartEditorAxis_GridLinesEvery_Jlabel = new javax.swing.JLabel();
        NewChartEditorAxis_GridLinesEvery_JTextField = new javax.swing.JTextField();
        NewChartEditorAxis_LineStyle_Jlabel = new javax.swing.JLabel();
        NewChartEditorAxis_TickMarksEvery_Jlabel = new javax.swing.JLabel();
        NewChartEditorAxis_TickMarksEvery_JTextField = new javax.swing.JTextField();
        NewChartEditorAxis_ScaleUnits_JLabel = new javax.swing.JLabel();
        NewChartEditorAxis_Back_JButton = new javax.swing.JButton();
        NewChartEditorAxis_Next_JButton = new javax.swing.JButton();
        NewChartEditorAxis_Finish_JButton = new javax.swing.JButton();
        NewChartEditorAxis_Cancel_JButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NewChartEditorAxis_Units_JTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        NewChartEditorAxis_Types_JTable = new javax.swing.JTable();
        NewChartEditorAxis_Solid_JRadioButton = new javax.swing.JRadioButton();
        NewChartEditorAxis_Dashed_JRadioButton = new javax.swing.JRadioButton();
        NewChartEditorAxis_Dotted_JRadioButton = new javax.swing.JRadioButton();
        NewChartEditorAxis_Color_JButton = new javax.swing.JButton();
        NewChartEditorAxis_LineThickness_JSlider = new javax.swing.JSlider();
        NewChartEditorAxis_AutomaticallyCorrectScales_JCheckBox = new javax.swing.JCheckBox();
        NewChartEditorAxis_ScaleMax_JTextField = new javax.swing.JTextField();
        NewChartEditorAxis_ScaleMin_JTextField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        NewChartEditorAxis_Channels_JTable = new javax.swing.JTable();
        NewChartEditorAxis_GridLinesUnits_JLabel = new javax.swing.JLabel();
        NewChartEditorAxis_TickMarksUnits_JLabel = new javax.swing.JLabel();
        NewChartEditorAxis_Scaling_Jlabel = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setRequestFocusEnabled(false);

        NewChartEditorAxis_ChartAxisProperties_Jlabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        NewChartEditorAxis_ChartAxisProperties_Jlabel.setText("Chart Axis Properties");

        NewChartEditorAxis_Suggestions_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_Suggestions_Jlabel.setText("Select properties for the line chart axis.");

        NewChartEditorAxis_Title_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_Title_Jlabel.setText("Title:");

        NewChartEditorAxis_TitleEdit_JTextField.setText("Title");

        NewChartEditorAxis_TypesAndUnits_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_TypesAndUnits_Jlabel.setText("Types and Units:");

        NewChartEditorAxis_Channels_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_Channels_Jlabel.setText("Channels:");

        NewChartEditorProperties_DVT_Jlabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorProperties_DVT_Jlabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewChartEditorProperties_DVT_Jlabel4.setText("to");
        NewChartEditorProperties_DVT_Jlabel4.setToolTipText("");

        NewChartEditorAxis_AutomaticallyGridLines_JCheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_AutomaticallyGridLines_JCheckBox.setSelected(true);
        NewChartEditorAxis_AutomaticallyGridLines_JCheckBox.setText("Use Automatic Grid Lines");

        NewChartEditorAxis_GridLinesEvery_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_GridLinesEvery_Jlabel.setText("Grid lines every:");

        NewChartEditorAxis_GridLinesEvery_JTextField.setText("0.0");

        NewChartEditorAxis_LineStyle_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_LineStyle_Jlabel.setText("Line Style: ");

        NewChartEditorAxis_TickMarksEvery_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_TickMarksEvery_Jlabel.setText("Tick marks every:");

        NewChartEditorAxis_TickMarksEvery_JTextField.setText("0.0");

        NewChartEditorAxis_ScaleUnits_JLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_ScaleUnits_JLabel.setText("s");

        NewChartEditorAxis_Back_JButton.setText("< Back");
        NewChartEditorAxis_Back_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorAxis_Back_JButtonActionPerformed(evt);
            }
        });

        NewChartEditorAxis_Next_JButton.setText("Next >");
        NewChartEditorAxis_Next_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorAxis_Next_JButtonActionPerformed(evt);
            }
        });

        NewChartEditorAxis_Finish_JButton.setText("Finish");
        NewChartEditorAxis_Finish_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorAxis_Finish_JButtonActionPerformed(evt);
            }
        });

        NewChartEditorAxis_Cancel_JButton.setText("Cancel");
        NewChartEditorAxis_Cancel_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorAxis_Cancel_JButtonActionPerformed(evt);
            }
        });

        NewChartEditorAxis_Units_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        NewChartEditorAxis_Units_JTable.getTableHeader().setReorderingAllowed(false);
        NewChartEditorAxis_Units_JTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                NewChartEditorAxis_Units_JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(NewChartEditorAxis_Units_JTable);
        if (NewChartEditorAxis_Units_JTable.getColumnModel().getColumnCount() > 0)
        {
            NewChartEditorAxis_Units_JTable.getColumnModel().getColumn(0).setResizable(false);
        }

        NewChartEditorAxis_Types_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null}
            },
            new String []
            {
                "Types"
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
        NewChartEditorAxis_Types_JTable.getTableHeader().setReorderingAllowed(false);
        NewChartEditorAxis_Types_JTable.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                NewChartEditorAxis_Types_JTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(NewChartEditorAxis_Types_JTable);
        if (NewChartEditorAxis_Types_JTable.getColumnModel().getColumnCount() > 0)
        {
            NewChartEditorAxis_Types_JTable.getColumnModel().getColumn(0).setResizable(false);
        }

        NewChartEditorAxis_Solid_JRadioButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_Solid_JRadioButton.setText("Solid");

        NewChartEditorAxis_Dashed_JRadioButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_Dashed_JRadioButton.setText("Dashed");

        NewChartEditorAxis_Dotted_JRadioButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_Dotted_JRadioButton.setText("Dotted");

        NewChartEditorAxis_Color_JButton.setBackground(new java.awt.Color(0, 0, 0));
        NewChartEditorAxis_Color_JButton.setForeground(new java.awt.Color(0, 51, 204));
        NewChartEditorAxis_Color_JButton.setText("Color");
        NewChartEditorAxis_Color_JButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NewChartEditorAxis_Color_JButton.setOpaque(false);

        NewChartEditorAxis_AutomaticallyCorrectScales_JCheckBox.setSelected(true);
        NewChartEditorAxis_AutomaticallyCorrectScales_JCheckBox.setText("Automatically Correct Scales");

        NewChartEditorAxis_ScaleMax_JTextField.setText("100");

        NewChartEditorAxis_ScaleMin_JTextField.setText("0");

        NewChartEditorAxis_Channels_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Source", "Name", "Type", "Unit"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
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
        NewChartEditorAxis_Channels_JTable.setColumnSelectionAllowed(true);
        NewChartEditorAxis_Channels_JTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(NewChartEditorAxis_Channels_JTable);
        NewChartEditorAxis_Channels_JTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (NewChartEditorAxis_Channels_JTable.getColumnModel().getColumnCount() > 0)
        {
            NewChartEditorAxis_Channels_JTable.getColumnModel().getColumn(0).setResizable(false);
            NewChartEditorAxis_Channels_JTable.getColumnModel().getColumn(1).setResizable(false);
            NewChartEditorAxis_Channels_JTable.getColumnModel().getColumn(2).setResizable(false);
            NewChartEditorAxis_Channels_JTable.getColumnModel().getColumn(3).setResizable(false);
        }

        NewChartEditorAxis_GridLinesUnits_JLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_GridLinesUnits_JLabel.setText("s");

        NewChartEditorAxis_TickMarksUnits_JLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_TickMarksUnits_JLabel.setText("s");

        NewChartEditorAxis_Scaling_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorAxis_Scaling_Jlabel.setText("Scaling:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NewChartEditorAxis_Suggestions_Jlabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewChartEditorAxis_ChartAxisProperties_Jlabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NewChartEditorAxis_TypesAndUnits_Jlabel)
                                        .addComponent(NewChartEditorAxis_Title_Jlabel))
                                    .addGap(72, 72, 72)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(NewChartEditorAxis_TitleEdit_JTextField)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(NewChartEditorAxis_Channels_Jlabel)
                                                .addComponent(NewChartEditorAxis_LineStyle_Jlabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(111, 111, 111))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(NewChartEditorAxis_Scaling_Jlabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(NewChartEditorAxis_Solid_JRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NewChartEditorAxis_Dashed_JRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NewChartEditorAxis_Dotted_JRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NewChartEditorAxis_Color_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NewChartEditorAxis_LineThickness_JSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(NewChartEditorAxis_AutomaticallyCorrectScales_JCheckBox))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(NewChartEditorAxis_ScaleMin_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(NewChartEditorProperties_DVT_Jlabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(NewChartEditorAxis_ScaleMax_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(NewChartEditorAxis_ScaleUnits_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(13, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NewChartEditorAxis_AutomaticallyGridLines_JCheckBox))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NewChartEditorAxis_Back_JButton)
                                .addGap(18, 18, 18)
                                .addComponent(NewChartEditorAxis_Next_JButton)
                                .addGap(18, 18, 18)
                                .addComponent(NewChartEditorAxis_Finish_JButton)
                                .addGap(18, 18, 18)
                                .addComponent(NewChartEditorAxis_Cancel_JButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(NewChartEditorAxis_TickMarksEvery_Jlabel)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(NewChartEditorAxis_GridLinesEvery_Jlabel)
                                        .addGap(44, 44, 44)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(NewChartEditorAxis_GridLinesEvery_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NewChartEditorAxis_GridLinesUnits_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(NewChartEditorAxis_TickMarksEvery_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NewChartEditorAxis_TickMarksUnits_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 488, Short.MAX_VALUE)
                    .addComponent(NewChartEditorProperties_Top_jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 482, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 488, Short.MAX_VALUE)
                    .addComponent(NewChartEditorProperties_Bottom_jseperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 482, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(NewChartEditorAxis_ChartAxisProperties_Jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewChartEditorAxis_Suggestions_Jlabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewChartEditorAxis_TitleEdit_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewChartEditorAxis_Title_Jlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewChartEditorAxis_TypesAndUnits_Jlabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(NewChartEditorAxis_Channels_Jlabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewChartEditorAxis_Solid_JRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChartEditorAxis_Dashed_JRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChartEditorAxis_Dotted_JRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChartEditorAxis_Color_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChartEditorAxis_LineStyle_Jlabel))
                        .addGap(18, 18, 18)
                        .addComponent(NewChartEditorAxis_AutomaticallyCorrectScales_JCheckBox)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewChartEditorAxis_ScaleMin_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChartEditorProperties_DVT_Jlabel4)
                            .addComponent(NewChartEditorAxis_ScaleMax_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewChartEditorAxis_ScaleUnits_JLabel)
                            .addComponent(NewChartEditorAxis_Scaling_Jlabel))
                        .addGap(18, 18, 18)
                        .addComponent(NewChartEditorAxis_AutomaticallyGridLines_JCheckBox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewChartEditorAxis_LineThickness_JSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NewChartEditorAxis_GridLinesEvery_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewChartEditorAxis_GridLinesUnits_JLabel))
                    .addComponent(NewChartEditorAxis_GridLinesEvery_Jlabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewChartEditorAxis_TickMarksEvery_Jlabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NewChartEditorAxis_TickMarksEvery_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewChartEditorAxis_TickMarksUnits_JLabel)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewChartEditorAxis_Cancel_JButton)
                    .addComponent(NewChartEditorAxis_Next_JButton)
                    .addComponent(NewChartEditorAxis_Back_JButton)
                    .addComponent(NewChartEditorAxis_Finish_JButton))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 459, Short.MAX_VALUE)
                    .addComponent(NewChartEditorProperties_Top_jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 459, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 459, Short.MAX_VALUE)
                    .addComponent(NewChartEditorProperties_Bottom_jseperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 459, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewChartEditorAxis_Back_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorAxis_Back_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorAxis_Back_JButtonActionPerformed

    }//GEN-LAST:event_NewChartEditorAxis_Back_JButtonActionPerformed

    private void NewChartEditorAxis_Next_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorAxis_Next_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorAxis_Next_JButtonActionPerformed

    }//GEN-LAST:event_NewChartEditorAxis_Next_JButtonActionPerformed

    private void NewChartEditorAxis_Finish_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorAxis_Finish_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorAxis_Finish_JButtonActionPerformed
        readForm();
        super.dispose();
    }//GEN-LAST:event_NewChartEditorAxis_Finish_JButtonActionPerformed

    private void NewChartEditorAxis_Cancel_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorAxis_Cancel_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorAxis_Cancel_JButtonActionPerformed
        super.dispose();
    }//GEN-LAST:event_NewChartEditorAxis_Cancel_JButtonActionPerformed

    private void NewChartEditorAxis_Types_JTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_NewChartEditorAxis_Types_JTableMouseClicked
    {//GEN-HEADEREND:event_NewChartEditorAxis_Types_JTableMouseClicked
        getSelectedTypeValues();
        typesSelected = true;
    }//GEN-LAST:event_NewChartEditorAxis_Types_JTableMouseClicked

    private void NewChartEditorAxis_Units_JTableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_NewChartEditorAxis_Units_JTableMouseClicked
    {//GEN-HEADEREND:event_NewChartEditorAxis_Units_JTableMouseClicked
        getSelectedUnitsValues();
        unitsSelected = true;
        updateChannelTable();
    }//GEN-LAST:event_NewChartEditorAxis_Units_JTableMouseClicked

    private void readForm()
    {
        chartAxis = new ChartAxis();
        chartAxis.setAxisName(NewChartEditorAxis_Title_Jlabel.getText());
        chartAxis.setAxisType(NewChartEditorAxis_Types_JTable.getModel().getValueAt(NewChartEditorAxis_Types_JTable.getSelectedRow() , 0).toString());
        chartAxis.setAxisType(NewChartEditorAxis_Units_JTable.getModel().getValueAt(NewChartEditorAxis_Units_JTable.getSelectedRow() , 0).toString());
        chartAxis.setAxisChannel(NewChartEditorAxis_Channels_JTable.getModel().getValueAt(NewChartEditorAxis_Channels_JTable.getSelectedRow() , 0).toString());
        chartAxis.setAxitColor(NewChartEditorAxis_Color_JButton.getForeground().toString());
        chartAxis.setAxisSolid(NewChartEditorAxis_Solid_JRadioButton.isSelected());
        chartAxis.setAxisDashed(NewChartEditorAxis_Dashed_JRadioButton.isSelected());
        chartAxis.setAxisDotted(NewChartEditorAxis_Dotted_JRadioButton.isSelected());
        chartAxis.setAxisAutomaticScaling(NewChartEditorAxis_AutomaticallyCorrectScales_JCheckBox.isSelected());
        chartAxis.setAxitAutomaticGridLines(NewChartEditorAxis_AutomaticallyGridLines_JCheckBox.isSelected());
        chartAxis.setAxisScaleMin(Double.parseDouble(NewChartEditorAxis_ScaleMin_JTextField.getText()));
        chartAxis.setAxisScaleMax(Double.parseDouble(NewChartEditorAxis_ScaleMax_JTextField.getText()));
        chartAxis.setAxisGridLinesInterval(Double.parseDouble(NewChartEditorAxis_GridLinesEvery_JTextField.getText()));
        chartAxis.setAxisTickmarksInterval(Double.parseDouble(NewChartEditorAxis_TickMarksEvery_JTextField.getText()));
        chartAxis.setLineThickness(NewChartEditorAxis_LineThickness_JSlider.getValue());
        ChartAxisArrayList.add(chartAxis);

    }

    public void load()
    {

        try
            {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
            } catch ( ParseException | UnsupportedLookAndFeelException ex )
            {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE , null , ex);
            }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                // new NewChartEditorAxis().setVisible(true);
            }

        });
    }

    public void updateChannelTable()
    {

        System.out.println("Class: NewChartEditorAxit: UpdateChannelTable: Updating Table: " + this.ChannelArrayList);
        NewChartEditorAxis_Channels_JTable.setModel(new ChannelTableModel(this.ChannelArrayList));

    }

    private void initTypeRows()
    {
        TypeRowlist = Arrays.asList(TypeRowsStrings);
        TypeRowTableModel = ( DefaultTableModel ) NewChartEditorAxis_Types_JTable.getModel();
        Object rowData[] = new Object[ 1 ];
        for ( int i = 0 ; i < TypeRowlist.size() ; i++ )
            {
            rowData[ 0 ] = TypeRowlist.get(i);
            TypeRowTableModel.addRow(rowData);
            }
        NewChartEditorAxis_Types_JTable.setModel(TypeRowTableModel);

    }

    private void getSelectedTypeValues()
    {
        Object xyz = null;
        String Value = null;
        try
            {
            Value = ( String ) NewChartEditorAxis_Types_JTable.getValueAt(NewChartEditorAxis_Types_JTable.getSelectedRow() , 0);
            initUnitRows(dump(Class.forName("com.daqecho.ftsi_analytics.data.types." + lookupTypes(Value)).newInstance()));
            } catch ( ClassNotFoundException | InstantiationException | IllegalAccessException ex )
            {
            Logger.getLogger(channelEditor.class.getName()).log(Level.SEVERE , null , ex);
            }
        this.SelectedType = Value;
        System.out.println("Class: NewChartEditorAxis: GetSelectedTypeVallues() - SelectedTypeValues: " + Value);

    }

    public static String[] dump( Object o )
    {
        String[] s = null;
        Method[] m = o.getClass().getDeclaredMethods();
        try
            {
            s = ( String[] ) m[ 0 ].invoke(o , null);

            } catch ( IllegalAccessException | IllegalArgumentException | InvocationTargetException ex )
            {
            Logger.getLogger(channelEditor.class.getName()).log(Level.SEVERE , null , ex);
            }
        return s;
    }

    private String lookupUnits( String Value )
    {

        String[] Name =
            {
            "Acidity" ,
            "Generic" ,
            "Density" ,
            "Date/Time" ,
            "Elapsed Time" ,
            "Length" ,
            "Mass" ,
            "Power" ,
            "Percent" ,
            "Pressure" ,
            "Rate (mass)" ,
            "Rate (mass/rev)" ,
            "Rate (revolutions)" ,
            "Rate (volume)" ,
            "Ratio" ,
            "String" ,
            "Temperature" ,
            "Velocity" ,
            "Viscosity" ,
            "Volts" ,
            "Volume"
            };

        String[] ClassName =
            {
            "Acidity" ,
            "Generic" ,
            "Density" ,
            "DateTime" ,
            "ElapsedTime" ,
            "Length" ,
            "Mass" ,
            "Power" ,
            "Percent" ,
            "Pressure" ,
            "RateMass" ,
            "RateMassRev" ,
            "RateRevolutions" ,
            "RateVolume" ,
            "Ratio" ,
            "String" ,
            "Temperature" ,
            "Velocity" ,
            "Viscosity" ,
            "Volts" ,
            "Volume"
            };

        HashMap<String , String> hmap = new HashMap<>();

        for ( int i = 0 ; i < Name.length ; i++ )
            {
            hmap.put(Name[ i ] , ClassName[ i ]);
            }

        return hmap.get(Value);
    }

    private String lookupTypes( String Value )
    {

        String[] Name =
            {
            "Acidity" , "Generic" , "Density" , "Date/Time" , "Elapsed Time" , "Length" , "Mass" , "Power" , "Percent" , "Pressure" , "Rate (mass)" , "Rate (mass/rev)" ,
            "Rate (revolutions)" , "Rate (volume)" , "Ratio" , "String" , "Temperature" , "Velocity" , "Viscosity" , "Volts" , "Volume"
            };

        String[] ClassName =
            {
            "Acidity" , "Generic" , "Density" , "DateTime" , "ElapsedTime" , "Length" , "Mass" , "Power" , "Percent" , "Pressure" , "RateMass" , "RateMassRev" , "RateRevolutions" ,
            "RateVolume" , "Ratio" , "String" , "Temperature" , "Velocity" , "Viscosity" , "Volts" , "Volume"
            };

        HashMap<String , String> hmap = new HashMap<>();

        for ( int i = 0 ; i < Name.length ; i++ )
            {
            hmap.put(Name[ i ] , ClassName[ i ]);
            }

        return hmap.get(Value);
    }

    private void initUnitRows( String[] s )
    {

        UnitRowList = Arrays.asList(s);
        UnitRowTableModel = ( DefaultTableModel ) NewChartEditorAxis_Units_JTable.getModel();
        UnitRowTableModel.setRowCount(0);
        Object rowData[] = new Object[ 1 ];
        for ( int i = 0 ; i < UnitRowList.size() ; i++ )
            {
            rowData[ 0 ] = UnitRowList.get(i);
            UnitRowTableModel.addRow(rowData);
            }
        NewChartEditorAxis_Units_JTable.setModel(UnitRowTableModel);

    }

    private void getSelectedUnitsValues()
    {
        String Value = ( String ) NewChartEditorAxis_Units_JTable.getValueAt(NewChartEditorAxis_Units_JTable.getSelectedRow() , 0);
        this.SelectedUnit = Value;
        System.out.println("Class: NewChartEditorAxis: GetSelectedUnitsValues() - SelectedUnitsValues: " + Value);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox NewChartEditorAxis_AutomaticallyCorrectScales_JCheckBox;
    javax.swing.JCheckBox NewChartEditorAxis_AutomaticallyGridLines_JCheckBox;
    private javax.swing.JButton NewChartEditorAxis_Back_JButton;
    private javax.swing.JButton NewChartEditorAxis_Cancel_JButton;
    private javax.swing.JTable NewChartEditorAxis_Channels_JTable;
    private javax.swing.JLabel NewChartEditorAxis_Channels_Jlabel;
    private javax.swing.JLabel NewChartEditorAxis_ChartAxisProperties_Jlabel;
    private javax.swing.JButton NewChartEditorAxis_Color_JButton;
    private javax.swing.JRadioButton NewChartEditorAxis_Dashed_JRadioButton;
    private javax.swing.JRadioButton NewChartEditorAxis_Dotted_JRadioButton;
    private javax.swing.JButton NewChartEditorAxis_Finish_JButton;
    javax.swing.JTextField NewChartEditorAxis_GridLinesEvery_JTextField;
    private javax.swing.JLabel NewChartEditorAxis_GridLinesEvery_Jlabel;
    private javax.swing.JLabel NewChartEditorAxis_GridLinesUnits_JLabel;
    private javax.swing.JLabel NewChartEditorAxis_LineStyle_Jlabel;
    private javax.swing.JSlider NewChartEditorAxis_LineThickness_JSlider;
    private javax.swing.JButton NewChartEditorAxis_Next_JButton;
    private javax.swing.JTextField NewChartEditorAxis_ScaleMax_JTextField;
    private javax.swing.JTextField NewChartEditorAxis_ScaleMin_JTextField;
    private javax.swing.JLabel NewChartEditorAxis_ScaleUnits_JLabel;
    private javax.swing.JLabel NewChartEditorAxis_Scaling_Jlabel;
    private javax.swing.JRadioButton NewChartEditorAxis_Solid_JRadioButton;
    private javax.swing.JLabel NewChartEditorAxis_Suggestions_Jlabel;
    javax.swing.JTextField NewChartEditorAxis_TickMarksEvery_JTextField;
    private javax.swing.JLabel NewChartEditorAxis_TickMarksEvery_Jlabel;
    private javax.swing.JLabel NewChartEditorAxis_TickMarksUnits_JLabel;
    javax.swing.JTextField NewChartEditorAxis_TitleEdit_JTextField;
    private javax.swing.JLabel NewChartEditorAxis_Title_Jlabel;
    private javax.swing.JLabel NewChartEditorAxis_TypesAndUnits_Jlabel;
    private javax.swing.JTable NewChartEditorAxis_Types_JTable;
    private javax.swing.JTable NewChartEditorAxis_Units_JTable;
    private javax.swing.JSeparator NewChartEditorProperties_Bottom_jseperator;
    private javax.swing.JLabel NewChartEditorProperties_DVT_Jlabel4;
    private javax.swing.JSeparator NewChartEditorProperties_Top_jSeparator;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    void setUi( ui ui )
    {
        this.ui = ui;
    }

}
