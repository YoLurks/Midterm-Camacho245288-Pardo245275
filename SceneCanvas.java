import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject> objects; 
    private Shed shed;  

    public SceneCanvas() {
        setPreferredSize(new Dimension(800, 600));
        objects = new ArrayList<>();
        objects.add(new Background(0, 0, 800, 600));
        objects.add(new Mountains());
        objects.add(new Trees());
        objects.add(new Vines());
        objects.add(new BackPlants());
        shed = new Shed();
        objects.add(shed);
        objects.add(new BackGrass());
        objects.add(new Roadway());
        objects.add(new FrontGrass());
        objects.add(new FrontPlants());

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();
                
                if (shed.containsPoint(mouseX, mouseY)) {
                    System.out.println("Shed clicked!");
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject obj : objects) {
            obj.draw(g2d);
        }
    }

    public void openShedDoor(){
        
    }
}
