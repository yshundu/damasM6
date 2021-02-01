/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat5damas;

import entity.Movimiento;
import entity.Partida;
import javax.swing.JOptionPane;
import org.hibernate.Session;
/**
 *
 * @author Yang
 */
public final class tabla extends javax.swing.JFrame {

    /**
     * Creates new form tabla
     */
    int contadorX = 8;
    int contadorO = 8;
    int filaClicada = -1;
    int columnaClicada = -1;
    int filaFinal = -1;
    int columnaFinal = -1;
    boolean jugaO = true;
    boolean jugaX = false;
    static Session session;
    static Partida partida = new Partida("");
    
    public tabla() {
        initComponents();
        partidaHibernate("NC");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bSortir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bSortir.setText("Sortir");
        bSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSortirActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"X", null, "X", null, "X", null, "X", null},
                {null, "X", null, "X", null, "X", null, "X"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {"O", null, "O", null, "O", null, "O", null},
                {null, "O", null, "O", null, "O", null, "O"}
            },
            new String [] {
                "Columna1", "Columna2", "Columna3", "Columna4", "Columna5", "Columna6", "Columna7", "Columna8"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(bSortir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(bSortir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSortirActionPerformed
        PartidaNova pNova = new PartidaNova();
        pNova.setVisible(true);
        dispose();
    }//GEN-LAST:event_bSortirActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
  int columna = obtenirColumnaClicada();
        int fila = obtenirFilaClicada(); 
        
        if(noHiHaOrigen()){
            if(jugaO && esO(fila, columna)){
                actualitzaNouOrigen(fila,columna);
                
            } else if (jugaX && esX(fila, columna)){
                actualitzaNouOrigen(fila, columna); 
            } else {
                mostrarError();
            }
        } else {
            if(movimentValid(fila, columna)){
                if(ocupatContrari(fila, columna)){
                    if (jugaO == true) {
                    contadorX--;
                    } else {
                    contadorO--;
                    }
                }
                if(esBuit(fila, columna) || ocupatContrari(fila, columna)){
                    mou(fila, columna);
                    jocAcabadaPerEliminacio(fila,columna);
                    guanyador(fila, columna);
                } else if (ocupatPropi(fila, columna)){
                    actualitzaNouOrigen(fila, columna);
                }
            } else {
                mostraErrorMoviment();
            }
        }
    }//GEN-LAST:event_tableMouseClicked
    
    public int obtenirFilaClicada(){
        int fila;
        fila = table.getSelectedRow();
        
        return fila;
    }
    
    public int obtenirColumnaClicada(){
        int columna;
        columna = table.getSelectedColumn();
        
        return columna;
        
    }
    
   private boolean noHiHaOrigen() {
        boolean noOrigen = false;
        if(filaClicada == -1 || columnaClicada == -1) {
            noOrigen = true;
        }
        return noOrigen;
    }
    
    public boolean esX(int fila,int columna){
        boolean esx = false;
        if(table.getValueAt(fila, columna) == ("X")){
            esx = true;
        }
        
        
        return esx;
    }
    
   private boolean esO(int fila, int columna) {
        boolean esO = false;
        
        if(table.getValueAt(fila, columna) == "O"){
            esO = true;            
        }
        return esO;
    }
    
    private void actualitzaNouOrigen(int fila, int columna) {
        filaClicada = fila;
        columnaClicada = columna;
    }
    
   private void mostrarError() {
        JOptionPane.showMessageDialog(null, "Error ", "Dames", 
                JOptionPane.ERROR_MESSAGE);
        filaClicada = -1;
        columnaClicada = -1;
    }
    
    //Comprovem si el moviment es valid
    private boolean movimentValid(int fila, int columna) {
        boolean movimentValid = false;
        
        //Comprovació de moviment vàlid
        int cMovimentColumna = columna - columnaClicada;
        int cMovimentFila = fila - filaClicada;
        
        //comprovem el moviment de O 
        if(jugaO && (cMovimentFila == -1) && ((cMovimentColumna == 1) || (cMovimentColumna == -1))){
           movimentValid = true;
        } else if (jugaX && (cMovimentFila == 1) && ((cMovimentColumna == 1) || (cMovimentColumna == -1))) {
           movimentValid = true;
        }
        return movimentValid;
    }
    
    private boolean esBuit(int fila, int columna) {
        boolean esBuit = false;
        if(table.getValueAt(fila, columna) == null){
            esBuit = true;
        }
        return esBuit;
    }
    
     //Comprovar si eliminem una fitxa contraria, serveix tant per eliminar
    //la fitxa com per fer la funcio de guanyar per eliminacio
    private boolean ocupatContrari(int fila, int columna) {
        boolean ocupadaContrari = false;
        if ((jugaO == true && esX(fila,columna) == true)) {
            ocupadaContrari = true;
        }
        else if((jugaX == true && esO(fila,columna) == true)){
            ocupadaContrari = true;
        }
        return ocupadaContrari;
    }
    
    //Mou les fitxes
    private void mou(int fila, int columna) {
        int activador = 0;
        NewMoviment(columnaClicada, columna, filaClicada, fila);
        table.setValueAt(null, filaClicada, columnaClicada);
        //começarem amb el jugador O
        //comprobar codi funcionalitat
        if(jugaO){
            table.setValueAt("O", fila, columna);
            columnaClicada = -1;
            filaClicada = -1;
            if(activador == 0){
                activador = 1;
                jugaO = false;
                jugaX = true;
            }
        } else {
            table.setValueAt("X", fila, columna);
            columnaClicada = -1;
            filaClicada = -1;
            if(activador == 0){
                activador = 1;
                jugaO = true;
                jugaX = false;
            }
            activador = 0;
        }
    }
    
    //Si es fitxa propi no pot moure alli
    private boolean ocupatPropi(int fila, int columna) {
        boolean ocupatPropi = false;
        if((jugaO == true && esO(fila,columna) == true) || 
                (jugaX == true && esX(fila,columna) == true)){
            ocupatPropi = true;
        }
        return ocupatPropi;
    }
    
    private void mostraErrorMoviment() {
        JOptionPane.showMessageDialog(null, "Moviment no vàlid", "Error dames", 
                JOptionPane.ERROR_MESSAGE);
        filaClicada = -1;
        columnaClicada = -1;
    }
    
    private void guanyador(int fila, int columna) {
        if(esO(fila, columna) && fila == 0){
            JOptionPane.showMessageDialog(null, "Les dames O han guanyat! \n", 
                    "GAME OVER", 
                JOptionPane.PLAIN_MESSAGE);
            PartidaNova partidaNova = new PartidaNova();
            partidaNova.setVisible(true);
            dispose();
            partidaHibernate("O");
        } else if (esX(fila, columna) && fila == 7){
            JOptionPane.showMessageDialog(null, "Les dames X han guanyat!\n", 
                    "GAME OVER", 
                JOptionPane.PLAIN_MESSAGE);
            PartidaNova partidaNova = new PartidaNova();
            partidaNova.setVisible(true);
            dispose();
            partidaHibernate("X");
            
        }
    }
        private void jocAcabadaPerEliminacio(int fila, int columna) {
        if(esO(fila, columna) && contadorX == 0){
            JOptionPane.showMessageDialog(null, "Les dames O han guanyat! \n", 
                    "GAME OVER", 
                JOptionPane.PLAIN_MESSAGE);
            partidaHibernate("O");
            PartidaNova partidaNova = new PartidaNova();
            partidaNova.setVisible(true);
            dispose();
        } else if (esX(fila, columna) && contadorO == 0){
            JOptionPane.showMessageDialog(null, "Les dames X han guanyat! \n", 
                    "GAME OVER", 
                JOptionPane.PLAIN_MESSAGE);
            partidaHibernate("X");
            PartidaNova partidaNova = new PartidaNova();
            partidaNova.setVisible(true);
            dispose();
        }
    } 
    
    //Guarda la informació de la partida, la id es auto incrementable
     public void partidaHibernate(String guanyador){
        partida.setGanador(guanyador);
        try { 
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            session.saveOrUpdate(partida);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
    }
    
     public void NewMoviment(int columnaInicio, int columnaFinal, int filaInicio, int filaFinal){
        Movimiento movimientos = new Movimiento(partida, columnaInicio, columnaFinal, filaInicio, filaFinal);
        try{
           session = NewHibernateUtil.getSessionFactory().openSession();
           session.beginTransaction(); 
           session.save(movimientos);
           session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
    }
     
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }    
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tabla().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSortir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}