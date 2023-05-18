
package Clases;

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


public class RenderPintar extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        Component componente = (JLabel)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        String fechaStr = (String)value;
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaCad = LocalDate.parse(fechaStr, formato);
        
        long diffDias = ChronoUnit.DAYS.between(fecha, fechaCad);
        
        System.out.println("Diferencia de dias: " + diffDias);
        
        if(diffDias<30){
            componente.setBackground(new Color(255, 153, 51));
            if(diffDias<0)
                componente.setBackground(new Color(255, 51, 51));
        }else{
            componente.setBackground(new Color(102,204,102));
        }
        
        return componente;
    }
    
    
    
}
