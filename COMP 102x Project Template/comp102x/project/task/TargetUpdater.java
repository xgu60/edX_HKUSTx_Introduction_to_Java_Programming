package comp102x.project.task;

import java.util.Random;

import comp102x.project.model.Target;

public class TargetUpdater {
    
    public void updateTarget(Target[] targets, int level) {
        Random rn = new Random();
        int xnum;
        if (level == 1) xnum = 0;
        else if(level == 2) xnum = 4;
        else  xnum = 10;
        for (int i = 0; i < xnum; i++){
            int rn1 = rn.nextInt(targets.length);
            int rn2 = rn.nextInt(targets.length);
            if (!((targets[rn1].isHit())^(targets[rn2].isHit()))) continue;
            else {
                int tempX = targets[rn1].getX();
                int tempY = targets[rn1].getY();
                int tempZ = targets[rn1].getZ();
                targets[rn1].setX(targets[rn2].getX());
                targets[rn1].setY(targets[rn2].getY());
                targets[rn1].setZ(targets[rn2].getZ());
                targets[rn2].setX(tempX);
                targets[rn2].setY(tempY);
                targets[rn2].setZ(tempZ);
        }
        
    }
    }

}
