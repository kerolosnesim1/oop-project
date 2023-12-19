package contacts;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MainFrame extends javax.swing.JFrame {
    DefaultTableModel model;
    File f;
    public MainFrame() throws Exception {
        initComponents();
        ImageIcon img = new ImageIcon("src/Recs/app_logo.png");
        setIconImage(img.getImage());
        setTitle("oop contacts project");
        model = (DefaultTableModel) table.getModel();
        setSize(1010 , 680);
        table.setAutoCreateRowSorter(true);
        f = new File("src\\dataSet.bin");
        if (!f.exists()) {
            f.createNewFile();
        }
        start();
    }
    

    public void start() throws Exception {
        FileInputStream fi = new FileInputStream(f);
        if (f.length() <= 0) {
            return;
        }
        ObjectInputStream oi = new ObjectInputStream(fi);
        Vector<Vector> tableData = (Vector<Vector>) oi.readObject();
        oi.close();
        fi.close();
        numberOfClients = tableData.size();
        for (int i = 0; i < numberOfClients; i++) {
            model.addRow(new Object[]{tableData.get(i).get(0) , tableData.get(i).get(1) , tableData.get(i).get(2) , tableData.get(i).get(3) , tableData.get(i).get(4)});
        }
       
    }
    public void updateFile() throws Exception{
        Vector<Vector> tableData = model.getDataVector();
        FileOutputStream fo = new FileOutputStream(f);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(tableData);
        fo.close();
        oo.close();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        newClientPanel = new javax.swing.JPanel();
        fullNameLabel = new javax.swing.JLabel();
        fullNameText = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        gmailText = new javax.swing.JTextField();
        gmailLabel = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        listOfContactsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        sortButtom = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 102, 102));
        mainPanel.setMinimumSize(new java.awt.Dimension(1000, 700));
        mainPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        newClientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "New Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N
        newClientPanel.setOpaque(false);
        newClientPanel.setPreferredSize(new java.awt.Dimension(350, 400));

        fullNameLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        fullNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/id-card.png"))); // NOI18N
        fullNameLabel.setText(" Full  name");

        fullNameText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phoneNumberLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        phoneNumberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/telephone.png"))); // NOI18N
        phoneNumberLabel.setText(" Phone number");

        phoneNumberText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });

        gmailText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        gmailLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        gmailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/gmail.png"))); // NOI18N
        gmailLabel.setText(" Gmail");

        addressText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        addressLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/address_icon.png"))); // NOI18N
        addressLabel.setText(" address");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/add.png"))); // NOI18N
        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/clear_icon.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newClientPanelLayout = new javax.swing.GroupLayout(newClientPanel);
        newClientPanel.setLayout(newClientPanelLayout);
        newClientPanelLayout.setHorizontalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(newClientPanelLayout.createSequentialGroup()
                        .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(newClientPanelLayout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressText)
                            .addComponent(gmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        newClientPanelLayout.setVerticalGroup(
            newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newClientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(newClientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        listOfContactsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listOfContactsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listOfContactsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/contacts_icon.png"))); // NOI18N
        listOfContactsLabel.setText("my Contacts");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Full name", "Phone number", "Gmail", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(120);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(90);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        searchButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/search-interface-symbol.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        sortButtom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sortButtom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/sort_icon.png"))); // NOI18N
        sortButtom.setText("sort");
        sortButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtomActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asc(A-Z)", "Desc(Z-A)", " ", " " }));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listOfContactsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listOfContactsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newClientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jComboBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(searchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sortButtom)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
        fullNameText.setText("");
        phoneNumberText.setText("");
        gmailText.setText("");
        addressText.setText("");
    
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (checkMainInfo()) {
            User newClient;
            if (addressText.getText().trim().isEmpty()){
                newClient = new User(fullNameText.getText().trim() , phoneNumberText.getText().trim(), gmailText.getText().trim());
            } else {
                newClient = new User(fullNameText.getText().trim() , phoneNumberText.getText().trim(), gmailText.getText().trim() , addressText.getText().trim());
            }
            if (!newClient.flag()) {
                JOptionPane.showMessageDialog(this, newClient.getMessege(), "Error Message" , JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    addToTable(newClient);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "Please enter the Main Information !" , "Error Message" , JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int index = table.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this , "Please select at least one row !!" , "Not selected row !!" , JOptionPane.ERROR_MESSAGE);
        } else {
            model.removeRow(index);
            numberOfClients--;
            
        }
        try {
            updateFile();
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (searchBox.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a value to search for !" , "Error Messege" , JOptionPane.ERROR_MESSAGE);
        }else {         
                for (int i = 0; i < numberOfClients; i++) {
                    for (int j = 1; j < 5; j++) {
                        if (model.getValueAt(i , j).equals(searchBox.getText().trim())) {
                            validSearch(i);
                            return;
         }
     }
}         
            JOptionPane.showMessageDialog(this, "Not founded data in the Option : "  , "Not founded !!" , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchButtonActionPerformed
     
    
    public void updateToTable(User c) throws Exception{
        int i = table.getSelectedRow();
        model.setValueAt(c.getFullName(), i , 1);
        model.setValueAt(c.getPhoneNumber(),i , 2);
        model.setValueAt(c.getGmail(),i, 3);
        model.setValueAt(c.getAddress(),i, 4);
        updateFile();
    }
    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void sortButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtomActionPerformed
       nameSort();
    }//GEN-LAST:event_sortButtomActionPerformed
    
    private void nameSort() {
    int selectedSortIndex = jComboBox1.getSelectedIndex();

    DefaultTableModel model = (DefaultTableModel) table.getModel();

    int rowCount = model.getRowCount();

    for (int i = 0; i < rowCount - 1; i++) {
        for (int j = i + 1; j < rowCount; j++) {
            String name1 = (String) model.getValueAt(i, 1);
            String name2 = (String) model.getValueAt(j, 1);

            int compareResult = name1.compareToIgnoreCase(name2);

            if ((selectedSortIndex == 0 && compareResult > 0) ||
                (selectedSortIndex == 1 && compareResult < 0)) {
                // Swap rows
                for (int k = 0; k < model.getColumnCount(); k++) {
                    Object temp = model.getValueAt(i, k);
                    model.setValueAt(model.getValueAt(j, k), i, k);
                    model.setValueAt(temp, j, k);
                }
            }
        }
    }
}

    
    public void validSearch(int i){
        table.setRowSelectionInterval(i , i);
        JOptionPane.showMessageDialog(this,"Founded in the " + " data !!" , "Result of your search" , JOptionPane.INFORMATION_MESSAGE);
    }
    
    
   public void addToTable(User c)throws Exception {
        model.addRow(new Object[]{table.getRowCount()+1 , c.getFullName() , c.getPhoneNumber() , c.getGmail() ,  c.getAddress() }); 
        numberOfClients++;
        updateFile();
    }
    
    public boolean checkMainInfo(){
        return !fullNameText.getText().trim().isEmpty() && 
               !phoneNumberText.getText().trim().isEmpty() &&
               !gmailText.getText().trim().isEmpty();
    }
    
    public static void main(String args[]) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    

    public static int numberOfClients;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressText;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullNameText;
    private javax.swing.JLabel gmailLabel;
    private javax.swing.JTextField gmailText;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listOfContactsLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel newClientPanel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton sortButtom;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    
}
