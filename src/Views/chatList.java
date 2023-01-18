/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.UserController;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author naufalabdillah
 */
public class chatList extends javax.swing.JFrame {
    UserController ctr = new UserController();
    String user_now;
    /**
     * Creates new form chatList
     */
    
    public void fillFriends(String user_now){
        this.user_now = user_now;
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<String> friends = new ArrayList<>();
        friends = ctr.findFriends(user_now);
        for(String f : friends){
            listModel.addElement(f);
        }
        friend_list.setModel(listModel);
    }
    
    public void list_clear(){
        DefaultListModel listModel = new DefaultListModel();
        listModel.clear();
        friend_list.setModel(listModel);
    }
    
    public chatList(String user_now) {
        initComponents();
        fillFriends(user_now);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        friend_list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        name_disp = new javax.swing.JLabel();
        btn_open = new javax.swing.JButton();
        btn_add_friend = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_custom = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        friend_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friend_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(friend_list);

        jLabel1.setText("Name : ");

        btn_open.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_open.setText("Open");
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });

        btn_add_friend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_add_friend.setText("Add Friend");
        btn_add_friend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_friendActionPerformed(evt);
            }
        });

        btn_reload.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reload.setText("Reload");
        btn_reload.setMaximumSize(new java.awt.Dimension(77, 23));
        btn_reload.setMinimumSize(new java.awt.Dimension(77, 23));
        btn_reload.setPreferredSize(new java.awt.Dimension(77, 23));
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_custom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_custom.setText("Edit Account");
        btn_custom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btn_add_friend))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_custom)
                        .addGap(13, 13, 13)
                        .addComponent(btn_logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_delete)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_disp)
                            .addComponent(btn_open, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name_disp))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_open)
                            .addComponent(btn_delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_friend)
                    .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout)
                    .addComponent(btn_custom))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
        // TODO add your handling code here:
        String selectedFriend = friend_list.getSelectedValue();
        
        chatWindow chatWindow = new chatWindow(user_now, selectedFriend);
        chatWindow.show();
        this.dispose();
    }//GEN-LAST:event_btn_openActionPerformed

    private void btn_add_friendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_friendActionPerformed
        // TODO add your handling code here:
        AddFriendDialog d = new AddFriendDialog(this, true, user_now);
        d.show();
    }//GEN-LAST:event_btn_add_friendActionPerformed

    private void friend_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friend_listMouseClicked
        // TODO add your handling code here:
        int index = friend_list.getSelectedIndex();
        name_disp.setText(friend_list.getSelectedValue());
    }//GEN-LAST:event_friend_listMouseClicked

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        // TODO add your handling code here:
        fillFriends(user_now);
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        LoginView login = new LoginView();
        login.show();
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_customActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customActionPerformed
        // TODO add your handling code here:
        CustomizationDialog d = new CustomizationDialog(user_now);
        d.show();
        this.dispose();
    }//GEN-LAST:event_btn_customActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        String selectedFriend = friend_list.getSelectedValue();
        try {
           ctr.removeFriend(user_now, selectedFriend); 
           JOptionPane.showMessageDialog(null, "friend deleted successfully!");
           fillFriends(user_now);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        name_disp.setText("");
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_friend;
    private javax.swing.JButton btn_custom;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_open;
    private javax.swing.JButton btn_reload;
    private javax.swing.JList<String> friend_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name_disp;
    // End of variables declaration//GEN-END:variables
}