import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    

    private ArrayList<DrawingObject> objects; 
    public SceneCanvas() {
        setPreferredSize(new Dimension(800, 600));
        objects = new ArrayList<>(); 
        objects.add(new Background(0, 0, 800, 600));  
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
