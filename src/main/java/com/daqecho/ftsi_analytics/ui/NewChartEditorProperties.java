
package com.daqecho.ftsi_analytics.ui;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NewChartEditorProperties extends javax.swing.JFrame
{

    public NewChartEditorProperties( ChartsInterface chartsInterface )
    {
        this.chartsInterface = chartsInterface;
        initComponents();
    }

    private ChartsInterface chartsInterface;

    /*
        private boolean legend = true;
    private boolean toolTips = true;
    private boolean url = false;
    private String domainAxisLabel = "X";
    private String RangeAxisLabel = "Y";
     */
    private String chartTitle;

    private double TickMarksEvery;

    private double GridLinesEverys;

    private double defaultVisibleTime;

    private int numYAxes;

    private boolean useAutomaticGridLines = true;

    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        javax.swing.JPanel ChartEditor_Panel_Top = new javax.swing.JPanel();
        javax.swing.JLabel ChartEditor_Properties_Jlabel = new javax.swing.JLabel();
        javax.swing.JLabel ChartEditor_Suggestions_Jlabel = new javax.swing.JLabel();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel ChartEditor_Title_Jlabel1 = new javax.swing.JLabel();
        NewChartEditorProperties_TitleEdit_JTextField = new javax.swing.JTextField();
        javax.swing.JLabel ChartEditor_Title_Jlabel2 = new javax.swing.JLabel();
        NewChartEditorProperties_NumYAxes_Jspinner = new javax.swing.JSpinner();
        javax.swing.JSeparator NewChartEditorProperties_Top_jSeparator = new javax.swing.JSeparator();
        javax.swing.JLabel NewChartEditorProperties_DVT_Jlabel2 = new javax.swing.JLabel();
        NewChartEditorProperties_DefaultVisibleTimeEdit_JTextField = new javax.swing.JTextField();
        javax.swing.JLabel NewChartEditorProperties_DVT_Jlabel4 = new javax.swing.JLabel();
        javax.swing.JSeparator NewChartEditorProperties_Bottom_jseperator = new javax.swing.JSeparator();
        NewChartEditorProperties_UseAutomaticGridLines_JCheckBox = new javax.swing.JCheckBox();
        javax.swing.JLabel NewChartEditorProperties_GLEL_Jlabel = new javax.swing.JLabel();
        NewChartEditorProperties_GridLinesEverys_JTextField = new javax.swing.JTextField();
        javax.swing.JLabel NewChartEditorProperties_GLEU_Jlabel5 = new javax.swing.JLabel();
        javax.swing.JLabel ChartEditor_TMEL_Jlabel = new javax.swing.JLabel();
        NewChartEditorProperties_TickMarksEvery_JTextField = new javax.swing.JTextField();
        javax.swing.JLabel ChartEditor_TMEU_Jlabel = new javax.swing.JLabel();
        javax.swing.JButton NewChartEditorProperties_Back_JButton = new javax.swing.JButton();
        javax.swing.JButton NewChartEditorProperties_Next_JButton = new javax.swing.JButton();
        javax.swing.JButton NewChartEditorProperties_Finish_JButton = new javax.swing.JButton();
        javax.swing.JButton NewChartEditorProperties_Cancel_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Line Chart");
        setMinimumSize(new java.awt.Dimension(679, 530));
        setPreferredSize(new java.awt.Dimension(679, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(670, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChartEditor_Panel_Top.setMinimumSize(new java.awt.Dimension(655, 70));
        ChartEditor_Panel_Top.setPreferredSize(new java.awt.Dimension(655, 70));
        ChartEditor_Panel_Top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChartEditor_Properties_Jlabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ChartEditor_Properties_Jlabel.setText("Chart Properties");
        ChartEditor_Panel_Top.add(ChartEditor_Properties_Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 30));

        ChartEditor_Suggestions_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ChartEditor_Suggestions_Jlabel.setText("Select properties for the line chart.");
        ChartEditor_Panel_Top.add(ChartEditor_Suggestions_Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 30));

        getContentPane().add(ChartEditor_Panel_Top, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 655, 80));

        jPanel1.setMinimumSize(new java.awt.Dimension(655, 382));
        jPanel1.setPreferredSize(new java.awt.Dimension(655, 382));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChartEditor_Title_Jlabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ChartEditor_Title_Jlabel1.setText("Title:");
        jPanel1.add(ChartEditor_Title_Jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 30));

        NewChartEditorProperties_TitleEdit_JTextField.setText("Title");
        NewChartEditorProperties_TitleEdit_JTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_TitleEdit_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_TitleEdit_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 440, 30));

        ChartEditor_Title_Jlabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ChartEditor_Title_Jlabel2.setText("Number of Y axes:");
        jPanel1.add(ChartEditor_Title_Jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 30));

        NewChartEditorProperties_NumYAxes_Jspinner.setModel(new javax.swing.SpinnerNumberModel());
        NewChartEditorProperties_NumYAxes_Jspinner.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                NewChartEditorProperties_NumYAxes_JspinnerStateChanged(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_NumYAxes_Jspinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 40, -1));
        jPanel1.add(NewChartEditorProperties_Top_jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 620, 20));

        NewChartEditorProperties_DVT_Jlabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorProperties_DVT_Jlabel2.setText("Default Visible Time: ");
        jPanel1.add(NewChartEditorProperties_DVT_Jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 30));

        NewChartEditorProperties_DefaultVisibleTimeEdit_JTextField.setText("60");
        NewChartEditorProperties_DefaultVisibleTimeEdit_JTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_DefaultVisibleTimeEdit_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_DefaultVisibleTimeEdit_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 360, 30));

        NewChartEditorProperties_DVT_Jlabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorProperties_DVT_Jlabel4.setText("minutes");
        jPanel1.add(NewChartEditorProperties_DVT_Jlabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 60, 30));
        jPanel1.add(NewChartEditorProperties_Bottom_jseperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 620, 20));

        NewChartEditorProperties_UseAutomaticGridLines_JCheckBox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorProperties_UseAutomaticGridLines_JCheckBox.setSelected(true);
        NewChartEditorProperties_UseAutomaticGridLines_JCheckBox.setText("Use Automatic Grid Lines");
        NewChartEditorProperties_UseAutomaticGridLines_JCheckBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_UseAutomaticGridLines_JCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_UseAutomaticGridLines_JCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        NewChartEditorProperties_GLEL_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorProperties_GLEL_Jlabel.setText("Grid lines every:");
        jPanel1.add(NewChartEditorProperties_GLEL_Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 30));

        NewChartEditorProperties_GridLinesEverys_JTextField.setText("0.0");
        NewChartEditorProperties_GridLinesEverys_JTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_GridLinesEverys_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_GridLinesEverys_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 360, 30));

        NewChartEditorProperties_GLEU_Jlabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewChartEditorProperties_GLEU_Jlabel5.setText("minutes");
        jPanel1.add(NewChartEditorProperties_GLEU_Jlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 60, 30));

        ChartEditor_TMEL_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ChartEditor_TMEL_Jlabel.setText("Tick marks every:");
        jPanel1.add(ChartEditor_TMEL_Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));

        NewChartEditorProperties_TickMarksEvery_JTextField.setText("0.0");
        NewChartEditorProperties_TickMarksEvery_JTextField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_TickMarksEvery_JTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_TickMarksEvery_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 360, 30));

        ChartEditor_TMEU_Jlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ChartEditor_TMEU_Jlabel.setText("minutes");
        jPanel1.add(ChartEditor_TMEU_Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 60, 30));

        NewChartEditorProperties_Back_JButton.setText("< Back");
        NewChartEditorProperties_Back_JButton.setEnabled(false);
        NewChartEditorProperties_Back_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_Back_JButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_Back_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        NewChartEditorProperties_Next_JButton.setText("Next >");
        NewChartEditorProperties_Next_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_Next_JButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_Next_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        NewChartEditorProperties_Finish_JButton.setText("Finish");
        NewChartEditorProperties_Finish_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_Finish_JButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_Finish_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        NewChartEditorProperties_Cancel_JButton.setText("Cancel");
        NewChartEditorProperties_Cancel_JButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NewChartEditorProperties_Cancel_JButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NewChartEditorProperties_Cancel_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 655, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewChartEditorProperties_TickMarksEvery_JTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_TickMarksEvery_JTextFieldActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_TickMarksEvery_JTextFieldActionPerformed
        this.TickMarksEvery = Double.parseDouble(NewChartEditorProperties_TickMarksEvery_JTextField.getText().trim().replaceAll("[^0-9.]" , ""));
        System.out.println("Class: NewChartEditorProperties: NewChartEditorProperties_TickMarksEvery_JTextFieldActionPerformed: " + this.TickMarksEvery);
    }//GEN-LAST:event_NewChartEditorProperties_TickMarksEvery_JTextFieldActionPerformed

    private void NewChartEditorProperties_UseAutomaticGridLines_JCheckBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_UseAutomaticGridLines_JCheckBoxActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_UseAutomaticGridLines_JCheckBoxActionPerformed
        this.useAutomaticGridLines = NewChartEditorProperties_UseAutomaticGridLines_JCheckBox.isSelected();
        System.out.println("Class: NewChartEditorProperties: NewChartEditorProperties_UseAutomaticGridLines_JCheckBoxActionPerformed: " + this.useAutomaticGridLines);
    }//GEN-LAST:event_NewChartEditorProperties_UseAutomaticGridLines_JCheckBoxActionPerformed

    private void NewChartEditorProperties_DefaultVisibleTimeEdit_JTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_DefaultVisibleTimeEdit_JTextFieldActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_DefaultVisibleTimeEdit_JTextFieldActionPerformed
        this.defaultVisibleTime = Double.parseDouble(NewChartEditorProperties_DefaultVisibleTimeEdit_JTextField.getText().trim().replaceAll("[^0-9.]" , ""));
        System.out.println("Class: NewChartEditorProperties: NewChartEditorProperties_DefaultVisibleTimeEdit_JTextFieldActionPerformed: " + this.defaultVisibleTime);
    }//GEN-LAST:event_NewChartEditorProperties_DefaultVisibleTimeEdit_JTextFieldActionPerformed

    private void NewChartEditorProperties_GridLinesEverys_JTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_GridLinesEverys_JTextFieldActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_GridLinesEverys_JTextFieldActionPerformed
        this.GridLinesEverys = Double.parseDouble(NewChartEditorProperties_GridLinesEverys_JTextField.getText().trim().replaceAll("[^0-9.]" , ""));
        System.out.println("Class: NewChartEditorProperties: NewChartEditorProperties_GridLinesEverys_JTextFieldActionPerformed: " + this.GridLinesEverys);
    }//GEN-LAST:event_NewChartEditorProperties_GridLinesEverys_JTextFieldActionPerformed

    private void NewChartEditorProperties_Next_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_Next_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_Next_JButtonActionPerformed

    }//GEN-LAST:event_NewChartEditorProperties_Next_JButtonActionPerformed

    private void NewChartEditorProperties_Finish_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_Finish_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_Finish_JButtonActionPerformed
        readForm();
        super.dispose();
    }//GEN-LAST:event_NewChartEditorProperties_Finish_JButtonActionPerformed

    private void NewChartEditorProperties_Cancel_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_Cancel_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_Cancel_JButtonActionPerformed
        super.dispose();
    }//GEN-LAST:event_NewChartEditorProperties_Cancel_JButtonActionPerformed

    private void NewChartEditorProperties_NumYAxes_JspinnerStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_NewChartEditorProperties_NumYAxes_JspinnerStateChanged
    {//GEN-HEADEREND:event_NewChartEditorProperties_NumYAxes_JspinnerStateChanged
        this.numYAxes = ReadSpinner();
    }//GEN-LAST:event_NewChartEditorProperties_NumYAxes_JspinnerStateChanged

    private void NewChartEditorProperties_Back_JButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_Back_JButtonActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_Back_JButtonActionPerformed

    }//GEN-LAST:event_NewChartEditorProperties_Back_JButtonActionPerformed

    private void NewChartEditorProperties_TitleEdit_JTextFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NewChartEditorProperties_TitleEdit_JTextFieldActionPerformed
    {//GEN-HEADEREND:event_NewChartEditorProperties_TitleEdit_JTextFieldActionPerformed
        //this.chartTitle = NewChartEditorProperties_TitleEdit_JTextField.getText();
        //System.out.println("Class: NewChartEditorProperties: NewChartEditorProperties_TitleEdit_JTextFieldActionPerformed: " + this.chartTitle);
    }//GEN-LAST:event_NewChartEditorProperties_TitleEdit_JTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField NewChartEditorProperties_DefaultVisibleTimeEdit_JTextField;
    javax.swing.JTextField NewChartEditorProperties_GridLinesEverys_JTextField;
    javax.swing.JSpinner NewChartEditorProperties_NumYAxes_Jspinner;
    javax.swing.JTextField NewChartEditorProperties_TickMarksEvery_JTextField;
    javax.swing.JTextField NewChartEditorProperties_TitleEdit_JTextField;
    javax.swing.JCheckBox NewChartEditorProperties_UseAutomaticGridLines_JCheckBox;
    // End of variables declaration//GEN-END:variables
    private int ReadSpinner()
    {
        try
            {
            NewChartEditorProperties_NumYAxes_Jspinner.commitEdit();
            } catch ( java.text.ParseException e )
            {
            }
        System.out.println("Class: NewChartEditorProperties: NewChartEditorProperties_NumYAxes_JspinnerPropertyChange: " + this.numYAxes);
        return ( Integer ) NewChartEditorProperties_NumYAxes_Jspinner.getValue();
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
                new NewChartEditorProperties(chartsInterface).setVisible(true);
            }

        });
    }

    void Show()
    {
        load();
    }

    private void readForm()
    {
        this.chartTitle = NewChartEditorProperties_TitleEdit_JTextField.getText();
        this.GridLinesEverys = Double.parseDouble(NewChartEditorProperties_GridLinesEverys_JTextField.getText().trim().replaceAll("[^0-9.]" , ""));
        this.TickMarksEvery = Double.parseDouble(NewChartEditorProperties_TickMarksEvery_JTextField.getText().trim().replaceAll("[^0-9.]" , ""));
        this.numYAxes = ReadSpinner();
        this.useAutomaticGridLines = NewChartEditorProperties_UseAutomaticGridLines_JCheckBox.isSelected();
        this.defaultVisibleTime = Double.parseDouble(NewChartEditorProperties_DefaultVisibleTimeEdit_JTextField.getText().trim().replaceAll("[^0-9.]" , ""));
        chartsInterface.SetupChartProperties(this);
    }

    @Override
    public String toString()
    {
        return "NewChartEditorProperties{" + "chartTitle=" + chartTitle + ", TickMarksEvery=" + TickMarksEvery + ", GridLinesEverys=" + GridLinesEverys + ", defaultVisibleTime=" + defaultVisibleTime + ", numYAxes=" + numYAxes + ", useAutomaticGridLines=" + useAutomaticGridLines + '}';
    }

    public String getChartTitle()
    {
        return chartTitle;
    }

    public void setChartTitle( String chartTitle )
    {
        this.chartTitle = chartTitle;
    }

    public double getTickMarksEvery()
    {
        return TickMarksEvery;
    }

    public void setTickMarksEvery( double TickMarksEvery )
    {
        this.TickMarksEvery = TickMarksEvery;
    }

    public double getGridLinesEverys()
    {
        return GridLinesEverys;
    }

    public void setGridLinesEverys( double GridLinesEverys )
    {
        this.GridLinesEverys = GridLinesEverys;
    }

    public double getDefaultVisibleTime()
    {
        return defaultVisibleTime;
    }

    public void setDefaultVisibleTime( double defaultVisibleTime )
    {
        this.defaultVisibleTime = defaultVisibleTime;
    }

    public int getNumYAxes()
    {
        return numYAxes;
    }

    public void setNumYAxes( int numYAxes )
    {
        this.numYAxes = numYAxes;
    }

    public boolean isUseAutomaticGridLines()
    {
        return useAutomaticGridLines;
    }

    public void setUseAutomaticGridLines( boolean useAutomaticGridLines )
    {
        this.useAutomaticGridLines = useAutomaticGridLines;
    }

}
