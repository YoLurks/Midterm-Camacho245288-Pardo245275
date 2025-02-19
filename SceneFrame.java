import javax.swing.JFrame;

public class SceneFrame {
    public void setUpGUI(){
        int w = 800;
        int h = 600;
        JFrame f = new JFrame();
        SceneCanvas sc = new SceneCanvas(w, h);
        f.setSize(w,h);
        f.setTitle("Midterm Project - Camacho245288 - Pardo246268");
        f.add(sc);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
