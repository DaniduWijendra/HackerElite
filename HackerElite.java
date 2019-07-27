
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * HackerElite - a robot by (your name here)
 */
public class HackerElite extends BravoBot
{
	String trackName;
	int count =0;
	boolean peek;
	double Move;
	int turnDirection;
	double gunTurnAmt; // How much to turn our gun when searching
		boolean movingForward;

	/**
	 * run: HackerElite's default behavior
	 */
	public String Target;

	public void run() {
			
		setAdjustRadarForRobotTurn(true);
		setAdjustRadarForGunTurn(true);
		Move=Math.max(getBattleFieldWidth(),getBattleFieldHeight());
		peek=false;
		
		turnLeft(getHeading()%90);
		peek=true;
		turnRight(90);
		
		

		
		
			
		
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
		
			peek=true;
			ahead(Move);
			peek=false;
			turnRight(90);
			// Replace the next 4 lines with any behavior you would like
			for(int x=0 ;x< 50; x++ ){
			ahead(50);
			fire(3);
				}
				
			turnRight(35);
				for(int x=0 ;x< 50; x++ ){
			ahead(7);
			fire(3);
			}
			for(int x=0 ;x< 20; x++ ){
			back(8);
			fire(3);
			}
			
			turnRight(60);
			fire(3);
			 
		}
	}
	

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
public void onScannedRobot(ScannedRobotEvent e) {
	 
		for(int x= 0; x<15 ;x++){
				fire(3);
			}
			
		}
		

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */

	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would li
		turnRight(90);
		for(int i=0;i<5;i++){
		ahead(10);
		fire(1);
			}
		turnRight(90);
		ahead(100);
		fire(1);
		turnRight(90);
		ahead(100);
		fire(1);
		turnRight(90);
		ahead(100);
		fire(1);
		
	
		 
		 
	}
	
	public void onHitRobot(HitRobotEvent e){
		
	if (e.getBearing() >= 0) {
			turnDirection = 1;
		} else {
			turnDirection = -1;
		}
		turnRight(e.getBearing());

		// Determine a shot that won't kill the robot...
		// We want to ram him instead for bonus points
		if (e.getEnergy() > 16) {
			fire(3);
		} else if (e.getEnergy() > 10) {
			fire(2);
		} else if (e.getEnergy() > 4) {
			fire(1);
		} else if (e.getEnergy() > 2) {
			fire(.5);
		} else if (e.getEnergy() > .4) {
			fire(.1);
		}
		ahead(40); // Ram him again!
	}



	
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like0		
		turnRight(90);
		for(int x=0;x<4;x++){
			fire(3);
		}
		
		ahead(100);
		}
	 
}
