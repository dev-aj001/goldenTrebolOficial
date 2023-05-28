
package Clases;

import bd.ConexionSQL;
import bd.Configurar;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class RenderPintarExistencia extends DefaultTableCellRenderer{
    
    private ConexionSQL mDB;
    

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component componente = (JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        mDB = new ConexionSQL("treboldb", "root", "C19400437");
        
        
        String fechaStr = (String)value;
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaCad = LocalDate.parse(fechaStr, formato);
               
        long diffDias = ChronoUnit.DAYS.between(fecha, fechaCad);
        
        System.out.println("Diferencia de dias: " + diffDias);
        
        int dias = 0;
        boolean alerta = false;
        
        Configurar config;
        if(mDB.Conectar()){
            config = mDB.GetConfig(1);
            if(config != null){
                dias = config.getDias();
                alerta = (config.getAlerta()==1);
                }
        }
        
        if(alerta){
            if(diffDias<dias){
                componente.setBackground(new Color(255, 153, 51));
                if(diffDias<0)
                    componente.setBackground(new Color(255, 51, 51));
            }else{
                componente.setBackground(new Color(102,204,102));
            }
        }else{
            componente.setBackground(table.getBackground());
            if(isSelected){
                componente.setForeground(Color.black);
                componente.setBackground(new Color(57,105,138));
            }
        }
        
        System.out.println("column " + column );
        
        
        return componente;
    }
    
    
    
}
