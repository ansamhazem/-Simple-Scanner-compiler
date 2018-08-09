package GUI;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import scanner.scan;

public class IDE extends javax.swing.JFrame {

    public IDE() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Scan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Parse");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lexemes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ArrayList<Character> input=new ArrayList<>();
          String str= jTextArea1.getText();

          for(int i=0;i<str.length();i++ ){
              input.add(str.charAt(i));
              
          }
          scan s=new scan();
          
          System.out.println(input);
        try {
            s.DoToken(input, s.table);
        } catch (IOException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        }
           s.table.scanner2();
           new OutputTable(s.table.outTable).setVisible(true); // n3red al output
          
    }//GEN-LAST:event_jButton1ActionPerformed

      
    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed

String lexems[]=new String [12];
lexems[0]="Imw";
lexems[1]="Imwf";
lexems[2]="IfTrue";
lexems[3]="Chj";
lexems[4]="Series";
lexems[5]="SIMwf";
lexems[6]="NOReturn";
lexems[7]="GetBack";
lexems[8]="OutLoop";
lexems[9]="Loli";
lexems[10]="Start";
lexems[11]="Last";
    
       
       if ((evt.getKeyCode() == KeyEvent.VK_SPACE) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
           
          String str= jTextArea1.getText();
    char ch =str.charAt(str.length()-1);
           
    
    
    for(int i=0;i<lexems.length;i++){
           
           if(ch==lexems[i].charAt(0)){
               
               DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
           Vector<Object>datai=new Vector<>();
            datai.add(lexems[i]);
            model.addRow(datai);
         datai=new Vector<>();
            
           }    
       }
       }
       
         if ((evt.getKeyCode() == KeyEvent.VK_ALT) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {

            String str = jTextArea1.getText();
            char special[]=new char[12];
            char compare[]=new char[12];
            special[0]='%';
            special[1]='#';
            special[2]='\\';
            
              
            char ch = str.charAt(0);
            
            for(int i=0;i<str.length();i++){
               compare[i]=str.charAt(i);
            }
            
            
            int counter=0;
            int j=0;
             
           while(counter<=str.length()){
               
               if(Character.isDigit(ch) || compare[j++]==special[counter]){
                  jLabel1.setText(str);
                  
                  // we want to color then delete 
                  
               }
              
               
               counter++;
               
           }
                 
        }
         
         if ((evt.getKeyCode() == KeyEvent.VK_SHIFT) && ((evt.getModifiers() & KeyEvent.CTRL_MASK) != 0)) {
             StringBuilder input = new StringBuilder ()  ;
             StringBuilder b=new StringBuilder();
          String str= jTextArea1.getText();

          for(int i=0;i<str.length();i++ ){
              input.append(str.charAt(i));
              
          }
           for ( int i=0 ; i<input.length()-1 ; i++)
          { 
              if (input.charAt(i)=='/' && input.charAt(i+1)=='@' )
              {
                  i+=2;
                  int j=i ;
                  //int k=0 ;
                  do 
                  {
                     
                    b.append(input.charAt(j)) ;
                    j++ ; 
                  }while (input.charAt(j)!='@' && input.charAt(j+1)!='/') ;
                  
                      //jTextArea1.                   
                // jTextArea1.replaceRange(b,j ,k);
             
         }
          }
             System.out.println(b);
      jLabel2.setText(b.toString());
         
         }
   
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        Vector data = new Vector();
        JTable target = (JTable) evt.getSource();
        int Selrow = target.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        data.add(model.getValueAt(Selrow, 0));
         String x=(data.get(0).toString()).substring(1);
         jTextArea1.append(x);
 
       while(model.getRowCount() > 0)
{
    model.removeRow(0);
}
            
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
