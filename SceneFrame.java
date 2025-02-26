import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SceneFrame {

    private JFrame frame;
    private JButton shedButton;
    private SceneCanvas scenecanvas;

    public SceneFrame(){
        frame = new JFrame();
        shedButton = new JButton("Open Shed Door");
        scenecanvas = new SceneCanvas();
    }

    public void setUpGUI(){
        frame.setTitle("Midterm Project - Camacho245288 - Pardo246268");
        frame.setLayout(new BorderLayout());
        frame.add(scenecanvas, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(shedButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        setUpButtonListener();

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setUpButtonListener() {
        
        shedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scenecanvas.openShedDoor(); // Call method to open the shed door
                scenecanvas.repaint();
            }
        });
    }
}
