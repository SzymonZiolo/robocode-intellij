package asrobots;


import robocode.Robot;

/**
 * Created by RENT on 2017-05-16.
 */
public class MyRobot extends Robot{


    @Override
    public void run() {

        while(true) {
            ahead(100);
            turnLeft(15);
            fire(3);
            turnGunLeft(15);
            fire(3);
        }
    }


}
