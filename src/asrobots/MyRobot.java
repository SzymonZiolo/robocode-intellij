package asrobots;


import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * Created by RENT on 2017-05-16.
 */
public class MyRobot extends Robot {


    @Override
    public void run() {

        turnGunRight(90);

        while (true) {
            ahead(20);
            turnRadarLeft(360);
            turnRadarRight(360);
            turnLeft(10);
        }


    }
}
