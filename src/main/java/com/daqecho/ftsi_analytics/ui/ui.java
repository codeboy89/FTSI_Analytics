package com.daqecho.ftsi_analytics.ui;

import com.daqecho.ftsi_analytics.data.Channel;
import com.daqecho.ftsi_analytics.input.CSV;
import com.daqecho.ftsi_analytics.input.Input_Channel_Selection;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileSystemView;

public class ui extends javax.swing.JFrame
{

    public ArrayList<Channel> channelList = new ArrayList<>();

    public ArrayList<Channel> getChannelList()
    {
        return channelList;
    }

    public void setChannelList(ArrayList<Channel> channelList)
    {
        this.channelList = channelList;
    }

    public void load()
    {

        try
        {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException ex)
        {
            System.out.println(ex);
        }
        java.awt.EventQueue.invokeLater(() ->
        {
            new ui().setVisible(true);

        });
    }

    private Charts chart;
    private CSV csv;
    private String PATH = "C:\\Users\\oilfi\\Documents\\FTSI_Analytics\\FTSI_Analytics\\src\\main\\java\\com\\daqecho\\ftsi_analytics\\datas.csv";
    private JFileChooser jfc;

    public ui()
    {
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        SetupMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        SetupMenuItem.setText("Setup");
        SetupMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SetupMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(SetupMenuItem);

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                openMenuItemMouseClicked(evt);
            }
        });
        openMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_openMenuItemMouseClicked
    {//GEN-HEADEREND:event_openMenuItemMouseClicked
        System.out.println("Class: UI: openMenuItemMouseClicked() - OPEN");
        fileHelper();

    }//GEN-LAST:event_openMenuItemMouseClicked

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_openMenuItemActionPerformed
    {//GEN-HEADEREND:event_openMenuItemActionPerformed
        System.out.println("Class: UI: openMenuItemActionPerformed() - OPEN");
        fileHelper();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void SetupMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SetupMenuItemActionPerformed
    {//GEN-HEADEREND:event_SetupMenuItemActionPerformed
        Input_Channel_Selection input_Channel_Selection = new Input_Channel_Selection(channelList);
        input_Channel_Selection.load();

        if (this.channelList != null)
        {

            System.out.println("Class: UI: SetupMenuItemActionPerformed() - Sent channelList: " + this.channelList);
        } else
        {

            System.out.println("Class: UI: SetupMenuItemActionPerformed() - Null channelList");
        }

    }//GEN-LAST:event_SetupMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveMenuItemActionPerformed
    {//GEN-HEADEREND:event_saveMenuItemActionPerformed
        System.out.println("Class: UI: saveMenuItemActionPerformed() - Saving: " + this.channelList);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void read(Iterable<String[]> records)
    {

        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                for (String[] record : records)
                {
                    chart.update(Double.parseDouble(record[0]), Double.parseDouble(record[2]));
                }
            }

        };
        thread.start();
    }

    private void setup()
    {

        chart = new Charts();
        JPanel jpanel = chart.create();
        setContentPane(jpanel);
        Channel Channel = new Channel();
        Channel.setName("Timer");
        Channel.setTablePos(1);
        Channel.setPos(1);
        Channel.setType("Date/Time");
        Channel.setUnit("Generic");
        Channel.setTypeRow(1);
        Channel.setUnitRow(1);
        //this.channelList.add(Channel);
        for (int i = 1; i <= 10; i++)
        {
            String name, type, unit;
            int tablepos, pos, typerow, unitrow;
            name = "name" + i;
            type = "type" + i;
            unit = "unit" + i;
            if (i == 0)
            {
                tablepos = i + 1;
                pos = i;
            } else
            {
                tablepos = i + 1;
                pos = i;

            }
            typerow = 5;
            unitrow = 1;
            String c = name + "," + type + "," + unit + "," + pos + "," + unitrow + "," + typerow + "," + tablepos;
            Channel Test = new Channel(c);
            this.channelList.add(Test);
        }
        System.out.println("Class: UI: setup() - Init channelList:" + channelList);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SetupMenuItem;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    private void fileHelper()
    {
        jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
        // int returnValue = jfc.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = jfc.getSelectedFile();
            PATH = selectedFile.toString();
            csv = new CSV(PATH);
            read(csv.load());
        }

    }
}
