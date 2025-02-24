import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    
    private ArrayList<DrawingObject> objects; 
    public SceneCanvas() {
        setPreferredSize(new Dimension(800, 600));
        objects = new ArrayList<>(); 
        objects.add(new Background(0, 0, 800, 600));
        objects.add(new Mountains());
        objects.add(new Trees());
        objects.add(new Vines());
        objects.add(new BackPlants());
        objects.add(new BackGrass());
        objects.add(new Roadway());
        objects.add(new FrontGrass());
        objects.add(new FrontPlants());
        
  
    }
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        for (DrawingObject obj : objects) {
            obj.draw(g2d);  
        }
    }
}
