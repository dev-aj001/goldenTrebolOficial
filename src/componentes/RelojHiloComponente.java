package componentes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;

public class RelojHiloComponente extends JLabel implements Runnable{
    
    String hora, minut, seg, ampm;
    Calendar calendario;
    Thread h1;
    
    public RelojHiloComponente(){
        super();
        h1 = new Thread(this);
        h1.start();
    }
    
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        
        while(ct == h1){
            calcula();
            this.setText(hora+":"+minut+":"+seg+":"+ampm);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
    
    public synchronized void calcula(){
        Calendar calendar = new GregorianCalendar();
        Date fechaAct = new Date();
        
        calendar.setTime(fechaAct);
        ampm = calendar.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        int h = calendar.get(Calendar.HOUR_OF_DAY);
        int m = calendar.get(calendar.MINUTE);
        int s = calendar.get(calendar.SECOND);

        if(ampm.equals("PM")){
            
            hora = (h-12)>9?""+(h-12):"0"+h;
        }else{
            hora = h>9?""+h:"0"+h;
        }
        
        hora = (h)>12?""+(h-12):""+h;
        
        minut= m>9?""+m:"0"+m;
        seg= s>9?""+s:"0"+s;
    }  
}
