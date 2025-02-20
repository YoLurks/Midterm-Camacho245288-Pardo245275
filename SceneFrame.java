import javax.swing.JFrame;

public class SceneFrame {
    public void setUpGUI(){
        JFrame f = new JFrame();
        SceneCanvas sc = new SceneCanvas();
        f.setTitle("Midterm Project - Camacho245288 - Pardo246268");
        f.add(sc);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
