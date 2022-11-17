/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbmock;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shao
 */
public class ESBMock extends JFrame {

    // Variables declaration - do not modify                     
    private JPanel AlarmsPanel;
    private JPanel AspectsPanel;
    private JComboBox CommandMenu;
    private JTable CommandTable;
    private JPanel CommandsPanel;
    private JButton ExecuteButton;
    private JPanel GeneralPanel;
    private JPanel NotesPanel;
    private JPanel StatusPanel;
    private JPanel TagsOrder;
    private JTabbedPane TopicTabs;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JPanel subPanel;
    private JScrollPane jScrollPane1;
    // End of variables declaration    
    /**
     * Creates new form NewJFrame
     */
    public ESBMock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        TopicTabs = new JTabbedPane();
        GeneralPanel = new JPanel();
        CommandsPanel = new JPanel();
        subPanel = new JPanel();
        jScrollPane1 = new JScrollPane();
        CommandTable = new JTable();
        CommandMenu = new JComboBox();
        StatusPanel = new JPanel();
        TagsOrder = new JPanel();
        AlarmsPanel = new JPanel();
        AspectsPanel = new JPanel();
        NotesPanel = new JPanel();
        ExecuteButton = new JButton();

        jMenuItem1.setText("Command Status");

        jMenuItem2.setText("Command 1");

        jMenuItem3.setText("Command 2");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        
        /* Begin General Panel*/
        GridBagLayout generalPanelgridLayout = new GridBagLayout();
        GridBagConstraints s = new GridBagConstraints();
//        GeneralPanel.setLayout(generalPanelLayout);
        s.fill=GridBagConstraints.NONE;
        s.weightx=0.0;
        s.weighty=0.0;
        GroupLayout GeneralPanelLayout = new GroupLayout(GeneralPanel);
        JPanel GeneralSubPanel =  new JPanel();
        JTextField emptyTextField = new JTextField(15);

        GeneralSubPanel.setLayout(generalPanelgridLayout);
        GeneralSubPanel.add(emptyTextField,s);
        GeneralPanel.add(GeneralSubPanel);
        TopicTabs.addTab("General", GeneralPanel);

        
        /*End General Panel*/
        
        /*Begin Command Panel*/
        CommandTable.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Command Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(CommandTable);

        GridBagLayout commandPanelLayout= new GridBagLayout();
        
        
        GroupLayout jPanel8Layout = new GroupLayout(subPanel);
        subPanel.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 812, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CommandMenu.setModel(new DefaultComboBoxModel(new String[] { "UTMC", "CCL Camera", "Digital Camera", "ORBB Controller", "Orbb Videowall Device" }));
        CommandMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommandMenuActionPerformed(evt);
            }
        });

        GroupLayout CommandsPanelLayout = new GroupLayout(CommandsPanel);
        CommandsPanel.setLayout(CommandsPanelLayout);
        CommandsPanelLayout.setHorizontalGroup(
            CommandsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(CommandsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(CommandsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(subPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(CommandMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        CommandsPanelLayout.setVerticalGroup(
            CommandsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, CommandsPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CommandMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );

        TopicTabs.addTab("Commands", CommandsPanel);

        GroupLayout StatusPanelLayout = new GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        TopicTabs.addTab("GIS", StatusPanel);

        GroupLayout TagsOrderLayout = new GroupLayout(TagsOrder);
        TagsOrder.setLayout(TagsOrderLayout);
        TagsOrderLayout.setHorizontalGroup(
            TagsOrderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 1036, Short.MAX_VALUE)
        );
        TagsOrderLayout.setVerticalGroup(
            TagsOrderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TopicTabs, GroupLayout.PREFERRED_SIZE, 1041, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExecuteButton)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(TopicTabs, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExecuteButton)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopicTabs.addTab("Command Library", NotesPanel);
        pack();
    }// </editor-fold>                        

    private void ExecuteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void CommandMenuActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ESBMock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESBMock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESBMock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESBMock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ESBMock().setVisible(true);
            }
        });
    }

               
}