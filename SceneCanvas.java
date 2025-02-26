import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject> objects; 
    private Shed shed;  
    private boolean shedClicked = false;
    private SecShed secShed;
    private BackGrass backGrass;
    private FrontGrass frontGrass;
    private BackPlants backPlants;
    private Roadway roadway;
    private FrontPlants frontPlants;
    private Background background;
    private Mountains mountains;
    private Trees trees;
    private Vines vines;
    private Sign sign;

    public SceneCanvas() {
        setPreferredSize(new Dimension(800, 600));
        objects = new ArrayList<>();
        backGrass = new BackGrass();
        frontGrass = new FrontGrass();
        backPlants = new BackPlants();
        frontPlants = new FrontPlants();
        roadway = new Roadway();
        shed = new Shed();
        secShed = new SecShed();
        background = new Background();
        mountains = new Mountains();
        trees = new Trees();
        vines = new Vines();
        sign = new Sign();
        

        objects.add(background);
        objects.add(mountains);
        objects.add(trees);
        objects.add(vines);
        objects.add(backPlants);
        objects.add(shed);
        objects.add(backGrass);
        objects.add(sign);
        objects.add(roadway);
        objects.add(frontGrass);
        objects.add(frontPlants);
        
        
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();
                
                if (!shedClicked && shed.containsPoint(mouseX, mouseY)) {
                    System.out.println("Shed clicked!");
                    shedClicked = true; 
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        changeShed();
        for (DrawingObject obj : objects) {
            obj.draw(g2d);
        }
    }

    public void changeShed(){
        if (shedClicked){
            objects.remove(shed);
            objects.remove(backGrass);
            objects.remove(roadway);
            objects.remove(frontGrass);
            objects.remove(frontPlants);
            objects.remove(sign);
            objects.add(secShed);
            objects.add(backGrass);
            objects.add(roadway);
            objects.add(frontGrass);
            objects.add(frontPlants);
            objects.add(sign);

            shedClicked = false;
        }
    }


}
