package componentes;

import eventos.EventMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.xml.stream.events.Comment;
import net.miginfocom.swing.MigLayout;
import swing.ButtonMenu;

public class MenuEm extends javax.swing.JPanel {

    private EventMenu evento;
    public MenuEm() {
        initComponents();
        setOpaque(false);
        scrollMenu.getViewport().setOpaque(false);
        scrollMenu.setViewportBorder(null);
        panelMenu.setLayout(new MigLayout("wrap 2, fillx","[center]0[center]","[fill, 100]0[fill, 100]"));
    }

    public void initMenu(EventMenu evento){
        this.evento = evento;
        addMenu("1", "Ventas", 0);
        addMenu("2", "Productos", 1);
        addMenu("3", "Almacen", 2);
        addMenu("4", "Mi caja", 3);
        addMenu("5", "Configuracion", 4);
    }
    
    private void addMenu(String icon, String text, int index){
        ButtonMenu menu = new ButtonMenu();
        menu.setIconName(icon);
        menu.setText(text);
        if(index==0){
            menu.setSelected(true);
        }
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evento.Selectd(index);
                setSelected(menu);
            }
        });
        panelMenu.add(menu, " w 95");
    }
    
    private void setSelected(ButtonMenu menu){
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof ButtonMenu) {
                ButtonMenu b = (ButtonMenu) com;
                b.setSelected(false);
            }
        }
        menu.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new swing.ImageAvatar();
        lbluserName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scrollMenu = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();

        imageAvatar1.setForeground(new java.awt.Color(255, 255, 255));
        imageAvatar1.setBorderSize(4);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/profile.png"))); // NOI18N

        lbluserName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbluserName.setForeground(new java.awt.Color(255, 255, 255));
        lbluserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluserName.setText("User Name");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Empleado");

        scrollMenu.setBorder(null);
        scrollMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelMenu.setMinimumSize(new java.awt.Dimension(218, 414));
        panelMenu.setOpaque(false);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        scrollMenu.setViewportView(panelMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbluserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollMenu))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbluserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLbluserName() {
        return lbluserName;
    }

    public void setLbluserName(String userName) {
        this.lbluserName.setText(userName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbluserName;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JScrollPane scrollMenu;
    // End of variables declaration//GEN-END:variables
}
