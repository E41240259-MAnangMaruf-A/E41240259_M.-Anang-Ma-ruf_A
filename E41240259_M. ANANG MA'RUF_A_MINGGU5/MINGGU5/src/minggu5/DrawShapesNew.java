/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawShapesNew extends JPanel {
    private final Font font;
    private final Color redColor;
    private final Color blueColor;
    private final Color backgroundColor;
    
    public DrawShapesNew() {
        font = new Font("Arial", Font.ITALIC, 18);
        redColor = Color.RED;
        backgroundColor = Color.ORANGE;
        blueColor = new Color(0, 0, 122);
        setBackground(backgroundColor);
    }
    
    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);
        
        graph.setColor(blueColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        
        graph.setColor(redColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
        graph.setColor(Color.CYAN);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Draw Shapes");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                DrawShapesNew panel = new DrawShapesNew();
                panel.setPreferredSize(new Dimension(300, 300));
                
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
