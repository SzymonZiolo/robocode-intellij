package asrobots;


import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * Created by RENT on 2017-05-16.
 */
public class MyRobot extends Robot {


    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(3);
        super.onScannedRobot(event);
    }

    @Override
    public void run() {

        turnGunRight(90);

        while (true) {
            ahead(30);
            turnRadarLeft(360);
            turnRadarRight(360);
            turnLeft(30);
        }




    }
}
