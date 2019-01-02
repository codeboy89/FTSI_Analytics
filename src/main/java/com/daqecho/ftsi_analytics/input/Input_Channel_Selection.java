package com.daqecho.ftsi_analytics.input;

import de.javasoft.plaf.synthetica.*;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import com.daqecho.ftsi_analytics.data.Channel;
import java.awt.Container;
import java.util.ArrayList;

public class Input_Channel_Selection extends javax.swing.JFrame
{

    private static ArrayList<Channel> tableArray = new ArrayList<Channel>();

    public void setTableArray(ArrayList<Channel> tableArray)
    {
        Input_Channel_Selection.tableArray = tableArray;
        updateTable();
    }
    private Channel channel;
    private Channel_Editor ce;
    private static String name;
    private static String type;
    private static String unit;
    private static int unitRow;
    private static int typeRow;
    private static int pos;
    private static int row = 0;
    private boolean isRowSelected = false;

    public Input_Channel_Selection()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ICS_Table_Channels = new javax.swing.JTable();
        ICS_Button_Add = new javax.swing.JButton();
        ICS_Button_Edit = new javax.swing.JButton();
        ICS_Button_Remove = new javax.swing.JButton();
        ICS_Button_MoveUp = new javax.swing.JButton();
        ICS_Button_MoveDown = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ICS_Label_ChannelCount = new javax.swing.JLabel();
        ICS_Button_Cancel = new javax.swing.JButton();
        ICS_Button_Finish = new javax.swing.JButton();
        ICS_Button_Next = new javax.swing.JButton();
        ICS_Button_Back = new javax.swing.JButton();
        ICS_Button_SelectAll = new javax.swing.JButton();
        ICS_Button_SelectNone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(ICS_Button_Add.getBackground());
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(ICS_Button_Add.getForeground());
        jPanel1.setName("jPanel1"); // NOI18N

        jPanel2.setBackground(ICS_Button_Add.getBackground());
        jPanel2.setForeground(ICS_Button_Add.getForeground());
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel3.setBackground(ICS_Button_Add.getBackground());
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(ICS_Button_Add.getForeground());
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Input Channel Selection");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setBackground(ICS_Button_Add.getBackground());
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(ICS_Button_Add.getForeground());
        jLabel4.setText("You must add at least one channel");
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel3.setName("jPanel3"); // NOI18N

        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setName("jScrollPane1"); // NOI18N

        ICS_Table_Channels.setAutoCreateRowSorter(true);
        ICS_Table_Channels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Pos", "Name", "Type", "Unit "
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
        ICS_Table_Channels.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ICS_Table_Channels.setColumnSelectionAllowed(true);
        ICS_Table_Channels.setFillsViewportHeight(true);
        ICS_Table_Channels.setInheritsPopupMenu(true);
        ICS_Table_Channels.setName("ICS_Table_Channels"); // NOI18N
        ICS_Table_Channels.getTableHeader().setReorderingAllowed(false);
        ICS_Table_Channels.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ICS_Table_ChannelsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ICS_Table_Channels);
        ICS_Table_Channels.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (ICS_Table_Channels.getColumnModel().getColumnCount() > 0)
        {
            ICS_Table_Channels.getColumnModel().getColumn(0).setResizable(false);
            ICS_Table_Channels.getColumnModel().getColumn(1).setResizable(false);
            ICS_Table_Channels.getColumnModel().getColumn(2).setResizable(false);
            ICS_Table_Channels.getColumnModel().getColumn(3).setResizable(false);
        }

        ICS_Button_Add.setMnemonic('a');
        ICS_Button_Add.setText("Add");
        ICS_Button_Add.setToolTipText("");
        ICS_Button_Add.setName("ICS_Button_Add"); // NOI18N
        ICS_Button_Add.setPreferredSize(new java.awt.Dimension(110, 32));
        ICS_Button_Add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_AddActionPerformed(evt);
            }
        });

        ICS_Button_Edit.setMnemonic('e');
        ICS_Button_Edit.setText("Edit");
        ICS_Button_Edit.setName("ICS_Button_Edit"); // NOI18N
        ICS_Button_Edit.setPreferredSize(new java.awt.Dimension(110, 32));
        ICS_Button_Edit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_EditActionPerformed(evt);
            }
        });

        ICS_Button_Remove.setMnemonic('r');
        ICS_Button_Remove.setText("Remove");
        ICS_Button_Remove.setName("ICS_Button_Remove"); // NOI18N
        ICS_Button_Remove.setPreferredSize(new java.awt.Dimension(110, 32));
        ICS_Button_Remove.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_RemoveActionPerformed(evt);
            }
        });

        ICS_Button_MoveUp.setMnemonic('u');
        ICS_Button_MoveUp.setText("Move Up");
        ICS_Button_MoveUp.setActionCommand("Move_Up");
        ICS_Button_MoveUp.setName("ICS_Button_MoveUp"); // NOI18N
        ICS_Button_MoveUp.setPreferredSize(new java.awt.Dimension(110, 32));
        ICS_Button_MoveUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_MoveUpActionPerformed(evt);
            }
        });

        ICS_Button_MoveDown.setMnemonic('d');
        ICS_Button_MoveDown.setText("Move Down");
        ICS_Button_MoveDown.setActionCommand("Move_Down");
        ICS_Button_MoveDown.setName("ICS_Button_MoveDown"); // NOI18N
        ICS_Button_MoveDown.setPreferredSize(new java.awt.Dimension(110, 32));
        ICS_Button_MoveDown.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_MoveDownActionPerformed(evt);
            }
        });

        jLabel1.setBackground(getBackground());
        jLabel1.setForeground(getForeground());
        jLabel1.setText("Channel Count:");
        jLabel1.setName("jLabel1"); // NOI18N

        ICS_Label_ChannelCount.setBackground(getBackground());
        ICS_Label_ChannelCount.setDisplayedMnemonic('0');
        ICS_Label_ChannelCount.setForeground(getForeground());
        ICS_Label_ChannelCount.setText("0");
        ICS_Label_ChannelCount.setName("ICS_Label_ChannelCount"); // NOI18N

        ICS_Button_Cancel.setMnemonic('c');
        ICS_Button_Cancel.setText("Cancel");
        ICS_Button_Cancel.setName("ICS_Button_Cancel"); // NOI18N
        ICS_Button_Cancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_CancelActionPerformed(evt);
            }
        });

        ICS_Button_Finish.setMnemonic('f');
        ICS_Button_Finish.setText("Finish");
        ICS_Button_Finish.setName("ICS_Button_Finish"); // NOI18N
        ICS_Button_Finish.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_FinishActionPerformed(evt);
            }
        });

        ICS_Button_Next.setText("Next >");
        ICS_Button_Next.setActionCommand("Next");
        ICS_Button_Next.setName("ICS_Button_Next"); // NOI18N
        ICS_Button_Next.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_NextActionPerformed(evt);
            }
        });

        ICS_Button_Back.setText("< Back");
        ICS_Button_Back.setActionCommand("Back");
        ICS_Button_Back.setName("ICS_Button_Back"); // NOI18N
        ICS_Button_Back.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_BackActionPerformed(evt);
            }
        });

        ICS_Button_SelectAll.setMnemonic('l');
        ICS_Button_SelectAll.setText("Select All");
        ICS_Button_SelectAll.setActionCommand("Select_All");
        ICS_Button_SelectAll.setName("ICS_Button_SelectAll"); // NOI18N
        ICS_Button_SelectAll.setPreferredSize(new java.awt.Dimension(110, 32));
        ICS_Button_SelectAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_SelectAllActionPerformed(evt);
            }
        });

        ICS_Button_SelectNone.setMnemonic('n');
        ICS_Button_SelectNone.setText("Select None");
        ICS_Button_SelectNone.setActionCommand("Select_None");
        ICS_Button_SelectNone.setName("ICS_Button_SelectNone"); // NOI18N
        ICS_Button_SelectNone.setPreferredSize(new java.awt.Dimension(110, 32));
        ICS_Button_SelectNone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ICS_Button_SelectNoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ICS_Button_Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ICS_Button_Next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ICS_Button_Finish)
                        .addGap(12, 12, 12)
                        .addComponent(ICS_Button_Cancel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ICS_Label_ChannelCount)
                            .addComponent(ICS_Button_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ICS_Button_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ICS_Button_Remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ICS_Button_MoveUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ICS_Button_MoveDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ICS_Button_SelectAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ICS_Button_SelectNone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ICS_Button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ICS_Button_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ICS_Button_Remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ICS_Button_MoveUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ICS_Button_MoveDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ICS_Button_SelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ICS_Button_SelectNone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICS_Label_ChannelCount)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ICS_Button_Cancel)
                    .addComponent(ICS_Button_Finish)
                    .addComponent(ICS_Button_Next)
                    .addComponent(ICS_Button_Back))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ICS_Button_BackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_BackActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_BackActionPerformed

    }//GEN-LAST:event_ICS_Button_BackActionPerformed

    private void ICS_Button_FinishActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_FinishActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_FinishActionPerformed
        super.dispose();
    }//GEN-LAST:event_ICS_Button_FinishActionPerformed

    private void ICS_Button_CancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_CancelActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_CancelActionPerformed
        super.dispose();
    }//GEN-LAST:event_ICS_Button_CancelActionPerformed

    private void ICS_Button_AddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_AddActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_AddActionPerformed
        ce = new Channel_Editor();
        ce.setIcs(this);
        ce.setSelectedPos(ICS_Table_Channels.getRowCount());
        ce.setVisible(true);
    }//GEN-LAST:event_ICS_Button_AddActionPerformed

    private void ICS_Button_EditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_EditActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_EditActionPerformed
        if (isSelected())
        {
            editSelectedRow();
        }

    }//GEN-LAST:event_ICS_Button_EditActionPerformed

    private void ICS_Button_RemoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_RemoveActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_RemoveActionPerformed
        if (isSelected())
        {
            removeSelectedRow(pos);
        }
    }//GEN-LAST:event_ICS_Button_RemoveActionPerformed

    private void ICS_Button_MoveUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_MoveUpActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_MoveUpActionPerformed

    }//GEN-LAST:event_ICS_Button_MoveUpActionPerformed

    private void ICS_Button_MoveDownActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_MoveDownActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_MoveDownActionPerformed

    }//GEN-LAST:event_ICS_Button_MoveDownActionPerformed

    private void ICS_Button_SelectAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_SelectAllActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_SelectAllActionPerformed

    }//GEN-LAST:event_ICS_Button_SelectAllActionPerformed

    private void ICS_Button_SelectNoneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_SelectNoneActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_SelectNoneActionPerformed

    }//GEN-LAST:event_ICS_Button_SelectNoneActionPerformed

    private void ICS_Button_NextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_NextActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_NextActionPerformed

    }//GEN-LAST:event_ICS_Button_NextActionPerformed

    private void ICS_Table_ChannelsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ICS_Table_ChannelsMouseClicked
    {//GEN-HEADEREND:event_ICS_Table_ChannelsMouseClicked
        isRowSelected = true;
    }//GEN-LAST:event_ICS_Table_ChannelsMouseClicked

    private boolean isSelected()
    {
        return !ICS_Table_Channels.getSelectionModel().isSelectionEmpty() & isRowSelected;
    }

    private static void print(String s)
    {
        System.out.println(s);
    }

    private static void updateRowCount()
    {
        ICS_Label_ChannelCount.setText(String.valueOf(ICS_Table_Channels.getRowCount()));
        print(String.valueOf("RowCount: " + ICS_Table_Channels.getRowCount()));
    }

    public static ArrayList load()
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());

                    break;
                }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException | ParseException ex)
        {
            java.util.logging.Logger.getLogger(Input_Channel_Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new Input_Channel_Selection().setVisible(true);
        return tableArray;

    }

    public void insertChannelToArray(Channel createReturnChannel, int SelectedPos)
    {
        tableArray.add(SelectedPos, createReturnChannel);
        print("Inserting:" + tableArray.toString() + " to array");
        updateTable();
    }

    private void editSelectedRow()
    {
        Input_Channel_Selection.pos = ICS_Table_Channels.getSelectedRow();
        channel = new Channel();
        channel.setName(name);
        channel.setType(type);
        channel.setUnit(unit);
        channel.setPos(pos);
        channel.setTypeRow(typeRow);
        channel.setUnitRow(unitRow);

        ce = new Channel_Editor();
        ce.setVisible(true);
        ce.editRow(channel);
    }

    private void removeSelectedRow(int pos)
    {
        tableArray.remove(ICS_Table_Channels.convertRowIndexToModel(ICS_Table_Channels.getSelectedRow()));
        print("Removing row: " + ICS_Table_Channels.convertRowIndexToModel(ICS_Table_Channels.getSelectedRow()));
        updateTable();
    }

    void addChannelToArray(Channel c)
    {
        tableArray.add(c);
        updateTable();
        print("Adding " + c.toString() + " to Array");
    }

    void removeChannelFromArray(int pos)
    {
        print("Removing " + tableArray.get(pos).toString() + " from array");
        tableArray.remove(pos);
        updateTable();

    }

    public void updateTable()
    {
        if (!tableArray.isEmpty())
        {
            print("updating table");
            ICS_Table_Channels.setModel(new ChannelTableModel(tableArray));
            updateRowCount();
        } else
        {
            System.out.println("empty list");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ICS_Button_Add;
    private javax.swing.JButton ICS_Button_Back;
    private javax.swing.JButton ICS_Button_Cancel;
    private javax.swing.JButton ICS_Button_Edit;
    private javax.swing.JButton ICS_Button_Finish;
    private javax.swing.JButton ICS_Button_MoveDown;
    private javax.swing.JButton ICS_Button_MoveUp;
    private javax.swing.JButton ICS_Button_Next;
    private javax.swing.JButton ICS_Button_Remove;
    private javax.swing.JButton ICS_Button_SelectAll;
    private javax.swing.JButton ICS_Button_SelectNone;
    private static javax.swing.JLabel ICS_Label_ChannelCount;
    private static javax.swing.JTable ICS_Table_Channels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
