
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * HackerElite - a robot by (your name here)
 */
public class HackerElite extends AlphaBot
{
	String trackName;
	int count =0;
	double gunTurnAmt; // How much to turn our gun when searching

	/**
	 * run: HackerElite's default behavior
	 */
	public String Target;

	public void run() {
			
		setAdjustRadarForRobotTurn(true);
		setAdjustRadarForGunTurn(true);
		
			
		
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(500);
			turnGunRight(360);
			back(300);
			turnRight(60);
			fire(3);
		}
	}
	

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		
		if (trackName != null && !e.getName().equals(trackName)) {
			return;
		}
		 
		// If we don't have a target, well, now we do!
		if (trackName == null) {
			trackName = e.getName();
			out.println("Tracking " + trackName);
		}
		
		// This is our target.  Reset count (see the run method)
		count = 0;
		// If our target is too far away, turn and move toward it.
		
		if (e.getDistance() > 150) {
			//sgunTurnAmt = normalRelativeAngleDegrees(e.getBearing() + (getHeading() - getRadarHeading()));

			turnGunRight(gunTurnAmt); // Try changing these to setTurnGunRight,
			turnRight(e.getBearing()); // and see how much Tracker improves...
			// (you'll have to make Tracker an AdvancedRobot)
			ahead(e.getDistance() - 140);
			fire(3);
			return;
		}
			
		}
		

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */

	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		

		Target= e.getName();
		// Replace the next line with any behavior you would li
		for(int i=0;i<90;i++)
		{
			turnRight(i);
		turnLeft(i);
		}
		turnRight(90);
		turnLeft(180);
		ahead(20);
		back(60);	// Replace the next line with any behavior you would like
		back(10);
	}
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like0		
		turnRight(360);
		ahead(100);

		}
}
