package com.daqecho.ftsi_analytics.ui;

import com.daqecho.ftsi_analytics.data.Channel;
import com.daqecho.ftsi_analytics.input.Input_Channel_Selection;
import com.daqecho.ftsi_analytics.input.CSV;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;
import java.util.ArrayList;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;

public class ui extends javax.swing.JFrame
{

    private ArrayList<Channel> Channels = new ArrayList<>();

    private Charts chart;
    private CSV csv;
    private static String PATH = "C:\\Users\\oilfi\\Documents\\FTSI_Analytics\\FTSI_Analytics\\src\\main\\java\\com\\daqecho\\ftsi_analytics\\datas.csv";
    private JFileChooser jfc;

    public ui()
    {
        setup();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
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

        jMenuItem1.setText("Setup");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

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
        System.out.println("OPEN");
        fileHelper();

    }//GEN-LAST:event_openMenuItemMouseClicked

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_openMenuItemActionPerformed
    {//GEN-HEADEREND:event_openMenuItemActionPerformed
        System.out.println("OPEN");
        fileHelper();
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        Input_Channel_Selection input_Channel_Selection = new Input_Channel_Selection();
        Channels = Input_Channel_Selection.load();
        if (Channels != null)
        {
            input_Channel_Selection.setTableArray(Channels);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    }

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        UIManager.put("Synthetica.window.decoration", Boolean.FALSE);
        try
        {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (UnsupportedLookAndFeelException | ParseException ex)
        {
            Logger.getLogger(ui.class.getName()).log(Level.SEVERE, null, ex);
        }

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new ui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem1;
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
