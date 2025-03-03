import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.sound.sampled.*;
import javax.swing.*;

public class SceneCanvas extends JComponent {
    private ArrayList<DrawingObject> objects; 
    private Shed shed;  
    private boolean shedClickedTwice = false;
    private boolean shedClicked = false;
    private SecShed secShed;
    private BackGrass backGrass;
    private FrontGrass frontGrass;
    private BackPlants backPlants;
    private Roadway roadway;
    private FrontPlants frontPlants;
    private TextTitle textTitle;
    private Background background;
    private Mountains mountains;
    private Trees trees;
    private Vines vines;
    private Sign sign;
    private Stars stars;
    private Stars2 stars2;
    private Stars3 stars3;
    private SecBackground secBackground;
    private Timer BGRemover;
    private Timer Slide;
    private Clip clip;
    private Clip clip2;
    private File music;
    private File music2;
    private Scanned scanned;
    private final int STEP;
    private int movedAmount;
    private boolean delay;



    public SceneCanvas() throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        STEP = 3;
        movedAmount = 0;
        delay = false;
        music = new File("shrek.AIFF");
        music2 = new File("accidentally.AIFF");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(music);
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(music2);
        clip2 = AudioSystem.getClip();
        clip = AudioSystem.getClip();
        clip.open(audioStream); 
        clip2.open(audioStream2);
        setPreferredSize(new Dimension(800, 600));
        objects = new ArrayList<>();
        scanned = new Scanned(-2,9000,58.3,67.5);
        secBackground = new SecBackground();
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
        stars = new Stars();
        stars2 = new Stars2();
        stars3 = new Stars3();
        textTitle = new TextTitle();
    
        objects.add(scanned);
        objects.add(secBackground);
        objects.add(textTitle);
        objects.add(stars);
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
                    shedClicked = true;
                    clip.start();
                } else if (shedClicked && !shedClickedTwice && shed.containsPoint(mouseX, mouseY)) {
                    shedClickedTwice = true;
                    BackgroundAnimation(); 
                    if (delay){
                        SlideAnimation();

                    }
                    clip2.start();
            
                }
            }
        });
    }
    
    private void BackgroundAnimation() {
    Timer BGRemover = new Timer(16, new ActionListener() { 
        @Override
        public void actionPerformed(ActionEvent e) {
            scanned.moveRight(STEP);
            trees.moveDown(STEP); 
            mountains.moveRight(STEP);
            background.moveDown(STEP);
            backPlants.updateSway();
            frontPlants.updateSway();
            scanned.setX(scanned.getX() + STEP);
            repaint();
            if (scanned.getX() > 780 && !delay) {
                delay = true; 
                SlideAnimation(); 
            }
        }
    });
        BGRemover.start();
    }

    // private void BackgroundColor() {
    //     Timer B = new Timer(16, new ActionListener() { 
    //         @Override
    //         public void actionPerformed(ActionEvent e) {
              
    //         }
    //     });
    //         BGRemover.start();
    //     }


    private void SlideAnimation() {
    Timer Slide = new Timer(370, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (movedAmount == 0) {
                objects.remove(stars);
                objects.add(stars2);


            }else if (movedAmount == 1){
                objects.remove(stars2);
                objects.add(stars3);

            }else if (movedAmount == 2){
                objects.remove(stars3);
                objects.add(stars);

            }
            ++movedAmount;
            if (movedAmount >= 3){
                movedAmount = 0;
            }
            
        }
        });
        Slide.start();
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

    public void changeShed() {
        if (shedClicked) {
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
            
            shedClicked = false;
        }
    }
}
