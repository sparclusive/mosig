/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * aClient.java
 *
 * Created on 19 févr. 2011, 20:17:59
 */

package chat.client.gui;

/**
 *
 * @author NargiT
 */
public class aClient extends javax.swing.JPanel {

    /** Creates new form aClient */
    public aClient() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nickname = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 20));
        setMinimumSize(new java.awt.Dimension(100, 20));
        setPreferredSize(new java.awt.Dimension(100, 20));

        nickname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat/client/gui/icone/client.png"))); // NOI18N
        nickname.setText("aName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nickname)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nickname, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nickname;
    // End of variables declaration//GEN-END:variables

}