package comp102x.project.task;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import comp102x.project.view.GameScreen;

public class AimListener implements MouseMotionListener{

    private double pan = 0.0;
    private double tilt = 0.0;
    
    public double getPan(){
        return pan;
    }
    public double getTilt(){
        return tilt;
    }
    public void mouseDragged(MouseEvent e){
    }
    public void mouseMoved(MouseEvent e){
        pan = e.getX() / GameScreen.WIDTH * 180 - 90;
        tilt = e.getY() / GameScreen.HEIGHT * 90;
    }
    

}
