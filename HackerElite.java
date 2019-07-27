
import robocode.*;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;

import java.awt.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * HackerElite - a robot by (your name here)
 */
public class HackerElite extends CharlieBot
{

	public void run() {
		setBodyColor(Color.blue);
		setGunColor(Color.blue);
		setRadarColor(Color.black);
		setScanColor(Color.yellow);
		while(true) {
		
			ahead(10);
			
		}
	}

public void onHitByBullet(HitByBulletEvent e)
{
	for(int i=0;i<50;i++)
	{
		fire(2);
	}
}
public void onRobotDetected(ScannedRobotEvent e)
{
		scan();
		ahead(150);
		fire(3);
}	
public void onHitRobot(HitRobotEvent e)
{
	if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}		
}
public void onHitWall(HitWallEvent e) {	

	if (e.getBearing() > -10 && e.getBearing() < 10) {
			turnRight(150);
		}
		turnRight(15);
	}
}
