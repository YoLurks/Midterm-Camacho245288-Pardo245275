/**
	SceneCanvas is the main component that handles all the elements and displays it as a 'canvas'.

	@author Lance Arnel G. Camacho (245288)
    @author John Jerome Pardo (246268)
	@version March 5, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;
import java.util.ArrayList;

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
    private Stars4 stars4;
    private Stars5 stars5;
    private Stars6 stars6;
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
    private Color placeColor;
    private Color newPlaceColor;
    private int counter;
    
    /**
    Constructs the SceneCanvas, initializing the variables' values, animation and audio setup.
    **/
    public SceneCanvas() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        counter = 0;
        STEP = 4;
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
        scanned = new Scanned(-2, 9000, 58.3, 67.5);
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
        stars4 = new Stars4();
        stars5 = new Stars5();
        stars6 = new Stars6();
        textTitle = new TextTitle();
    

        objects.add(scanned);
        objects.add(secBackground);
        objects.add(textTitle);
        objects.add(stars);
        objects.add(stars6);
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

                // Handle interactions with the shed
                if (!shedClicked && shed.containsPoint(mouseX, mouseY)) {
                    shedClicked = true;
                    clip.start();
                } else if (shedClicked && !shedClickedTwice && shed.containsPoint(mouseX, mouseY)) {
                    shedClickedTwice = true;
                    BackgroundAnimation(); 
                    if (delay) {
                        SlideAnimation();
                    }
                    clip2.start();
                }
            }
        });
    }
    
    /**
        Starts the background animation once the shed is clicked twice.
    **/
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
                    changeColor();
                }
            }
        });
        BGRemover.start();
    }

    /**
        Animation for the color changing of the strobe lights in the shed.
    **/
    private void changeColor() {
        Timer changeColor = new Timer(800, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cycle through different colors
                if (counter == 0) {
                    placeColor = new Color(138, 71, 71, 150);
                    newPlaceColor = new Color(74, 138, 71, 150);
                } else if (counter == 1) {
                    placeColor = new Color(71, 112, 138, 150);
                    newPlaceColor = new Color(115, 71, 138, 150);
                } else if (counter == 2) {
                    placeColor = new Color(74, 138, 71, 150);
                    newPlaceColor = new Color(138, 131, 71, 150);
                } else if (counter == 3) {
                    placeColor = new Color(138, 131, 71, 150);
                    newPlaceColor = new Color(71, 112, 138, 150);
                } else if (counter == 4) {
                    placeColor = new Color(115, 71, 138, 150);
                    newPlaceColor = new Color(138, 71, 71, 150);
                    counter = -1;
                }
                counter++;


                SecShed.getPartyTraingleRight().changeColor(newPlaceColor);
                SecShed.getPartyTraingleLeft().changeColor(placeColor);
                revalidate();
                repaint();
            }
        });
        changeColor.start();
    }

    /**
        Method that handles the animation of the stars once the shed is clicked twice.
    **/
    private void SlideAnimation() {
        Timer Slide = new Timer(370, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (movedAmount == 0) {
                    objects.remove(stars);
                    objects.remove(stars6);
                    objects.add(stars2);
                    objects.add(stars5);
                } else if (movedAmount == 1) {
                    objects.remove(stars2);
                    objects.remove(stars5);
                    objects.add(stars3);
                    objects.add(stars4);
                } else if (movedAmount == 2) {
                    objects.remove(stars3);
                    objects.remove(stars4);
                    objects.add(stars);
                    objects.add(stars6);
                }
                ++movedAmount;
                if (movedAmount >= 3) {
                    movedAmount = 0;
                }
            }
        });
        Slide.start();
    }

    /**
        Paints the components on the canvas.
        @param g the graphics object used for rendering the components
    **/

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        changeShed();
        for (DrawingObject obj : objects) {
            obj.draw(g2d);
        }
    }

    /**
        Graphics2D in charge of the anti-aliasing.
        @param g the graphics object used for rendering the components
    **/

    protected void paintComponent(Graphics2D g) {
        super.paintComponent(g);
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHints(rh);
        
        
    }

    /**
    Changes the shed when it is clicked. This triggers a replacement of the main shed with a secondary shed.
    **/
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
