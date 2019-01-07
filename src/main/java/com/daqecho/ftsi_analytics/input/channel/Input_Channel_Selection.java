
package com.daqecho.ftsi_analytics.input.channel;

import com.daqecho.ftsi_analytics.ui.ui;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.awt.Color;
import java.awt.Rectangle;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Input_Channel_Selection extends javax.swing.JFrame
{

    private ArrayList<Channel> channelList;

    private Channel channel;
    private boolean itemWasModified;
    private String name;
    private boolean selectall;
    private boolean selectnone;
    private String type;
    private String unit;
    private int unitRow;
    private int typeRow;
    private int pos = 0;
    private boolean isRowSelected = false;
    private boolean newRowSelected = false;
    int movePosCounter = 0;

    public Input_Channel_Selection( ArrayList<Channel> channelList )
    {
        initComponents();
        ICS_Table_Channels.setSelectionForeground(Color.orange);
        ICS_Table_Channels.setSelectionBackground(Color.BLACK);
        ICS_Table_Channels.getSelectionModel().setSelectionInterval(0 , 0);
        this.channelList = channelList;
    }

    @SuppressWarnings( "unchecked" )
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
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                OpenedWindowHandler(evt);
            }
        });

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
        ICS_Table_Channels.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        ICS_Table_Channels.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                ICS_Table_ChannelsPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(ICS_Table_Channels);
        ICS_Table_Channels.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
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
        channelEditor ce = new channelEditor(this.channelList);
        System.out.println("Class: InputChannelSelector: ICS_Button_AddActionPerformend() - ChannelList: " + channelList);
        ce.setIcs(this);
        ce.setSelectedPos(ICS_Table_Channels.getRowCount());
        ce.setVisible(true);

    }//GEN-LAST:event_ICS_Button_AddActionPerformed

    private void ICS_Button_EditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_EditActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_EditActionPerformed
        if ( isSelected() )
            {
            itemWasModified = true;
            editSelectedRow();
            }

    }//GEN-LAST:event_ICS_Button_EditActionPerformed

    private void ICS_Button_RemoveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_RemoveActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_RemoveActionPerformed
        if ( selectall )
            {
            itemWasModified = true;
            channelList.clear();
            itemWasModified = false;
            updateTable();
            } else if ( ICS_Table_Channels.isRowSelected(ICS_Table_Channels.getSelectedRow()) )
            {
            itemWasModified = true;
            removeSelectedRow();
            itemWasModified = false;
            }
        selectall = false;
    }//GEN-LAST:event_ICS_Button_RemoveActionPerformed

    private void ICS_Button_MoveUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_MoveUpActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_MoveUpActionPerformed
        if ( ICS_Table_Channels.isRowSelected(ICS_Table_Channels.getSelectedRow()) )
            {
            movePosCounter = ICS_Table_Channels.getSelectedRow();
            int lastIndexOf = channelList.lastIndexOf(channelList.get(movePosCounter));
            if ( lastIndexOf > 0 & lastIndexOf <= channelList.size() )
                {
                Collections.swap(channelList , lastIndexOf , lastIndexOf - 1);
                itemWasModified = true;
                updateChannelList();
                updateTable();
                movePosCounter--;
                }
            } else
            {
            int lastIndexOf = channelList.lastIndexOf(channelList.get(movePosCounter));
            if ( lastIndexOf > 0 & lastIndexOf <= channelList.size() )
                {
                Collections.swap(channelList , lastIndexOf , lastIndexOf - 1);
                itemWasModified = true;
                updateChannelList();
                updateTable();
                movePosCounter--;
                }
            }
        int i = movePosCounter;
        ICS_Table_Channels.getSelectionModel().setSelectionInterval(i , i);
        ICS_Label_ChannelCount.scrollRectToVisible(new Rectangle(ICS_Table_Channels.getCellRect(i , 0 , true)));
        ICS_Table_Channels.setSelectionForeground(Color.ORANGE);
    }//GEN-LAST:event_ICS_Button_MoveUpActionPerformed

    private void ICS_Button_MoveDownActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_MoveDownActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_MoveDownActionPerformed

        if ( ICS_Table_Channels.isRowSelected(ICS_Table_Channels.getSelectedRow()) )
            {
            int lastIndexOf = channelList.lastIndexOf(channelList.get(movePosCounter));
            if ( lastIndexOf >= 0 & lastIndexOf < channelList.size() - 1 )
                {
                Collections.swap(channelList , lastIndexOf , lastIndexOf + 1);
                itemWasModified = true;
                updateChannelList();
                updateTable();
                }
            movePosCounter++;
            } else
            {
            int lastIndexOf = channelList.lastIndexOf(channelList.get(movePosCounter));
            if ( lastIndexOf >= 0 & lastIndexOf < channelList.size() - 1 )
                {
                Collections.swap(channelList , lastIndexOf , lastIndexOf + 1);
                itemWasModified = true;
                updateChannelList();
                updateTable();
                }
            movePosCounter++;
            }
        int i = movePosCounter;
        ICS_Table_Channels.getSelectionModel().setSelectionInterval(i , i);
        ICS_Label_ChannelCount.scrollRectToVisible(new Rectangle(ICS_Table_Channels.getCellRect(i , 0 , true)));
        ICS_Table_Channels.setSelectionForeground(Color.ORANGE);
    }//GEN-LAST:event_ICS_Button_MoveDownActionPerformed

    private void ICS_Button_SelectAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_SelectAllActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_SelectAllActionPerformed
        selectall = true;
        selectnone = false;
        itemWasModified = true;
        ICS_Table_Channels.selectAll();

        ICS_Table_Channels.setSelectionForeground(Color.orange);

        /// updateTable();
    }//GEN-LAST:event_ICS_Button_SelectAllActionPerformed

    private void ICS_Button_SelectNoneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_SelectNoneActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_SelectNoneActionPerformed
        selectall = false;
        selectnone = true;
        itemWasModified = true;
        ICS_Table_Channels.getSelectionModel().clearSelection();
        updateTable();
    }//GEN-LAST:event_ICS_Button_SelectNoneActionPerformed

    private void ICS_Button_NextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ICS_Button_NextActionPerformed
    {//GEN-HEADEREND:event_ICS_Button_NextActionPerformed

    }//GEN-LAST:event_ICS_Button_NextActionPerformed

    private void ICS_Table_ChannelsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ICS_Table_ChannelsMouseClicked
    {//GEN-HEADEREND:event_ICS_Table_ChannelsMouseClicked
        isRowSelected = true;
        newRowSelected = true;
        this.pos = ICS_Table_Channels.getSelectedRow();
        this.movePosCounter = this.pos;
    }//GEN-LAST:event_ICS_Table_ChannelsMouseClicked

    private void OpenedWindowHandler(java.awt.event.WindowEvent evt)//GEN-FIRST:event_OpenedWindowHandler
    {//GEN-HEADEREND:event_OpenedWindowHandler
        updateTable();
        int i = 0;
        ICS_Table_Channels.getSelectionModel().setSelectionInterval(i , i);
        ICS_Label_ChannelCount.scrollRectToVisible(new Rectangle(ICS_Table_Channels.getCellRect(i , 0 , true)));
        ICS_Table_Channels.setSelectionForeground(Color.ORANGE);
    }//GEN-LAST:event_OpenedWindowHandler

    private void ICS_Table_ChannelsPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_ICS_Table_ChannelsPropertyChange
    {//GEN-HEADEREND:event_ICS_Table_ChannelsPropertyChange

    }//GEN-LAST:event_ICS_Table_ChannelsPropertyChange

    private boolean isSelected()
    {
        return !ICS_Table_Channels.getSelectionModel().isSelectionEmpty() & isRowSelected;
    }

    private void print( String s )
    {
        System.out.println(s);
    }

    private void updateRowCount()
    {
        this.ICS_Label_ChannelCount.setText(String.valueOf(ICS_Table_Channels.getRowCount()));
        print(String.valueOf("RowCount: " + ICS_Table_Channels.getRowCount()));
    }

    public void insertChannelToArray( Channel createReturnChannel , int SelectedPos )
    {
        channelList.add(SelectedPos , createReturnChannel);
        print("Inserting:" + channelList.toString() + " to array");
        updateTable();
    }

    private void editSelectedRow()
    {
        this.pos = ICS_Table_Channels.getSelectedRow();
        channelEditor ce = new channelEditor(channelList);
        ce.setSelectedPos(pos);
        ce.load();
        ce.editRow(pos);
        ce.setVisible(true);
    }

    private void removeSelectedRow()
    {
        itemWasModified = true;
        int pos1 = ICS_Table_Channels.getSelectedRow();
        this.channelList.remove(pos1);
        print("Removing row : " + ICS_Table_Channels.getSelectedRow());

        System.out.println("Class: Input_Channel_Selection: RemoveSelectedRow() - Arraylist removedArrayList: " + channelList);
        updateTable();
    }

    private void updateChannelList()
    {
        if ( !channelList.isEmpty() )

            {
            if ( itemWasModified )
                {
                for ( int i = 0 ; i < channelList.size() ; i++ )
                    {
                    System.out.println("Class: InputChannelSelecton: UpdateChannelList: Element: " + channelList.get(i) + " Pos: " + channelList.get(i).getPos());
                    channelList.get(i).setTablePos(i + 1);
                    channelList.get(i).setPos(i);

                    System.out.println("Class: InputChannelSelecton: UpdateChannelList: Element Modified: " + channelList.get(i) + " Pos: " + channelList.get(i).getPos());

                    }
                updateTable();
                }
            }
    }

    void addChannelToArray( Channel c )
    {
        channelList.add(c);
        updateTable();
        print("Adding " + c.toString() + " to Array");
    }

    public void updateTable()
    {
        if ( !channelList.isEmpty() )
            {
            print("Class: InputChannelSelecton: UpdateTable: Updating Table");
            ICS_Table_Channels.setModel(new ChannelTableModel(this.channelList));
            updateRowCount();
            } else
            {
            System.out.println("Class: InputChannelSelecton: UpdateTable() - Empty List");

            ICS_Table_Channels.setModel(new ChannelTableModel(this.channelList));
            updateRowCount();
            }
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
        java.awt.EventQueue.invokeLater(() ->
            {
            new Input_Channel_Selection(this.channelList).setVisible(true);

            });

    }

    // public void setChannels(ArrayList<Channel> Channelss)
    // {
    //     Channels = Channelss;
    //     System.out.println("ICS received Array: " + Channels.toString());
    //     updateTable();
    // }
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
    private javax.swing.JLabel ICS_Label_ChannelCount;
    private javax.swing.JTable ICS_Table_Channels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
