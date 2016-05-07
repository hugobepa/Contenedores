
package contenedores;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//table/model/2 cliks/modificar el  numero files y columnas


public class VContenedores extends javax.swing.JFrame {

    
    public static LinkedList contenedor = new LinkedList();
    public static String codi, nom, edat,codigo;
    Persona p;
    //imporescindible para tabla
    private DefaultTableModel modelo;
    int cont=0;
    public int Encontrado;
    
    public VContenedores() {
        initComponents();
        //hacer inivisible tabla
        TBLista.setVisible(false);
    }

    //Metodo1 para trabajar con la tabla
    public void MostrarTabla ()
    {
        String data [][]= {};
        //titulo
        String col[]={"CODIGO","NOMBRE","EDAD"};
        //Instaciamos Model para Tabla tipo de array String, y titulo columnas
        modelo = new DefaultTableModel(data,col);
        //insertamos los datos en al tabla fisica
        this.TBLista.setModel(modelo);
        TBLista.setVisible(true);
    }
    
    public void Mostrardatos(){
        Persona pp;
        for(int y=0;y<contenedor.size();y++)
        {
            pp=(Persona) contenedor.get(y);
            modelo.insertRow(cont, new Object[]{});
            modelo.setValueAt(pp.getCodigo(),cont,0);
            modelo.setValueAt(pp.getNombre(),cont,1);
            modelo.setValueAt(pp.getEdad(),cont,2);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TFCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFEdad = new javax.swing.JTextField();
        BTGuardar = new javax.swing.JButton();
        BTMostrar = new javax.swing.JButton();
        BTModificar = new javax.swing.JButton();
        BTEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLista = new javax.swing.JTable();
        BTSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        TFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFCodigoKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        TFEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEdadActionPerformed(evt);
            }
        });

        BTGuardar.setText("Guardar");
        BTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTGuardarActionPerformed(evt);
            }
        });

        BTMostrar.setText("Mostrar");
        BTMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMostrarActionPerformed(evt);
            }
        });

        BTModificar.setText("Modificar");
        BTModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTModificarActionPerformed(evt);
            }
        });

        BTEliminar.setText("Eliminar");
        BTEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarActionPerformed(evt);
            }
        });

        TBLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(TBLista);

        BTSalir.setText("Salir");
        BTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(TFCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(TFNombre)
                    .addComponent(TFEdad))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BTMostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BTSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BTEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTGuardar)
                    .addComponent(BTMostrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTModificar)
                            .addComponent(BTEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEdadActionPerformed

    private void BTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTGuardarActionPerformed
       //Obtener datos campos
        codi=this.TFCodigo.getText();
        nom=this.TFNombre.getText();
        edat=this.TFEdad.getText();
        // crear  elemento de persona
        p= new Persona(codi,nom,edat);
        //añadir a la lista nuevos  elementos
        contenedor.add(p);
        //Limpiar campos anteriores
        this.TFNombre.setText("");
        this.TFEdad.setText("");
        this.TFCodigo.setText("");
    }//GEN-LAST:event_BTGuardarActionPerformed

    private void BTMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMostrarActionPerformed
        MostrarTabla ();
        Mostrardatos();
    }//GEN-LAST:event_BTMostrarActionPerformed

    private void BTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTSalirActionPerformed

    private void BTModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTModificarActionPerformed
       String c= this.TFCodigo.getText();
       String n=this.TFNombre.getText();
       String e=this.TFEdad.getText();
       
       Persona pp=new Persona(c,n,e);
       contenedor.set(Encontrado, pp);
       //limpiar campos
       this.TFCodigo.setText("");
       this.TFNombre.setText("");
       this.TFEdad.setText("");
       
       
    }//GEN-LAST:event_BTModificarActionPerformed

    //TFxxx/BTDerecho/Events/Key/keyTyped para comprobar si existe o no ese campo
    private void TFCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCodigoKeyTyped
        int tecla= evt.getKeyChar();
        Persona pp;
        if(tecla==10)// si apretar ENTER
        {
            //eliminar espacios en blanco trim()
            codigo =this.TFCodigo.getText().trim();
            for(int y=0;y<contenedor.size();y++)
            {
                pp=(Persona) contenedor.get(y); 
                // si codigo coincide se muestran los otros
                if(codigo.equalsIgnoreCase(pp.getCodigo()))
                {
                    this.TFNombre.setText(pp.getNombre());
                    this.TFEdad.setText(pp.getEdad());
                    Encontrado =y;
                    break;
                }
            }
        }
    }//GEN-LAST:event_TFCodigoKeyTyped

    private void BTEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarActionPerformed
        contenedor.remove(Encontrado);
        //limpiar campos
       this.TFCodigo.setText("");
       this.TFNombre.setText("");
       this.TFEdad.setText("");
    }//GEN-LAST:event_BTEliminarActionPerformed

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VContenedores().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTGuardar;
    private javax.swing.JButton BTModificar;
    private javax.swing.JButton BTMostrar;
    private javax.swing.JButton BTSalir;
    private javax.swing.JTable TBLista;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFEdad;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
