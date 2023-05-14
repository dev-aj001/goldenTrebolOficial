package swing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class PasswordField extends JPasswordField {
    
    

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
        esconderPass();
        repaint();
    }

    private String hint = "";
    private final Animator animator;
    private float animate;
    private boolean show = true;
    private final Image eye;
    private final Image eye_hide;
    private boolean hiden = true;
    private Color linea;
    private Color hintColor;

    public Color getLinea() {
        return linea;
    }

    public void setLinea(Color linea) {
        this.linea = linea;
    }

    public Color getHintColor() {
        return hintColor;
    }

    public void setHintColor(Color hintColor) {
        this.hintColor = hintColor;
    }
    
    
    private void esconderPass(){
        setEchoChar('\u25cf');
        setFont(new Font("Segoe UI", 0, 12));
    }

    public PasswordField() {
        setOpaque(false);
        setBorder(new EmptyBorder(9, 1, 9, 30));
        setBackground(new Color(0, 0, 0, 0));
        setForeground(new Color(255, 255, 255));
        setSelectionColor(new Color(200, 200, 200, 100));
        setLinea(new Color(255, 255, 255, 200));
        setHintColor(new Color(232, 232, 232));
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = getWidth()-30;
                if(new Rectangle(x,0,30,30).contains(e.getPoint())){
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }else{
                    setCursor(new Cursor(Cursor.TEXT_CURSOR));
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = getWidth()-30;
                if(new Rectangle(x,0,30,30).contains(e.getPoint())){
                    hiden=!hiden;
                    if(hiden){
                        esconderPass();
                    }else{
                        setEchoChar((char)0);
                    }
                    repaint();
                }
            }
        });
        
        eye= new ImageIcon(getClass().getResource("/iconos/eye.png")).getImage();
        eye_hide= new ImageIcon(getClass().getResource("/iconos/eye_hide.png")).getImage();
        
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    animate = fraction;
                } else {
                    animate = 1f - fraction;
                }
                repaint();
            }

            @Override
            public void end() {
                show = !show;
                repaint();
            }

        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (getPassword().length != 0) {
                    if (show) {
                        if (animator.isRunning() == false) {
                            stop();
                            animator.start();
                        }
                    } else if (animator.isRunning()) {
                        stop();
                        animator.start();
                    }
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (getText().equals("")) {
                    stop();
                    animator.start();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

    }
    
    private void createShowHide(Graphics2D g2){
        int x=getWidth()-30+5;
        int y=(getHeight()-20)/2;
        g2.drawImage(hiden? eye_hide:eye, x, y,null);
        
    }

    private void stop() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setColor(linea);
        g2.drawLine(0, getHeight() - 3, getWidth(), getHeight() - 3);
        createShowHide(g2);
        if (!hint.equals("")) {
            int h = getHeight();
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            g2.setColor(hintColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f - animate));
            g2.drawString(hint, ins.left + (animate * 30), h / 2 + fm.getAscent() / 2 - 1);
        }
        g2.dispose();
        super.paint(g);
    }
}
