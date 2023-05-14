package swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import fbr.FancyBorderRadius;

/**
 *
 * @author RAVEN
 */
public class Button extends JButton {

    private Shape shape;
    private final RippleEffect rippleEffect;

    public Button() {
        rippleEffect = new RippleEffect(this);
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(8, 5, 8, 5));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255, 255, 255, 100));
        g2.fill(shape);
        rippleEffect.reder(g2, shape);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        shape = new FancyBorderRadius(getWidth(), getHeight(), "30% 70% 44% 56% / 57% 30% 70% 43%").getShape();
    }

}
