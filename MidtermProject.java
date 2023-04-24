import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;

public class MidtermProject{
	public static void main(String [] args){
		Console con = new Console("Golfing Day",1280,720);
		
		//Variables
		String strCourse;
		String strName;
		String strLetter;
		String strMoney;
		String strDraw;
		
		double dblAcceleration;
		double dblV1;
		double dblV1y;
		double dblV1x;
		double dblt;
		double dblFinal;
		double dblDistance;
		double dblTime;
		
		int intLoopCount1;
		int intScore;
		int intTotal; 
		int intAverage;
		int intIron;
		int intNameLength;
		int intMouseX;
		int intMouseY;
		int intCurrentMouseButton;
		int intDraw;
		int intStrokes;
		int intYards;
		int intBallY;
		int intCount;
		
		char charAgain;
		char charTrust;
		
		intTotal = 0;
		intLoopCount1 = 0;
		intIron = 0;
		intStrokes = 0;
		intBallY = 490;
		intCount = 0;
		
		charAgain = 0;
		charTrust = 0;
		
		strMoney = "";
		strDraw = "";
		strCourse = "";
		
		
		String strForce1;
		String strForce2;
		
		Font fntOswald = con.loadFont("Oswald-Bold.ttf", 100);
		
		Font fntOswald2 = con.loadFont("Oswald-Bold.ttf", 25);
		
		
		while ((!strCourse.equals("competitively")) && (!strCourse.equals("fun"))){
			con.setTextColor(Color.BLACK);
			S1(con);
			con.println("Do you want to play 'competitively' or for 'fun'?");
			strCourse = con.readLine();
			con.clear();
		}
		
		if(strCourse.equals("fun")){
			con.clear();
			con.setTextColor(Color.RED);
			S2(con);
			con.println("at what rate should you decelerate (m/s^2) to avoid crashing into the deer");
			con.println("that is 50 m away?");
			con.println("(Round final answer to 1 SD)");
			dblAcceleration = con.readDouble();
			
			if(dblAcceleration == 1){
				con.clear();
				con.setTextColor(Color.BLACK);
				S3(con);
				con.println("Enter your 5 most recent scores in golf");
				for(intLoopCount1 = 1; intLoopCount1 <= 5; intLoopCount1++){
					con.print("Enter score "+intLoopCount1+": ");
					intScore = con.readInt();
					intTotal = intTotal + intScore;
				}
				con.clear();
				intAverage = intTotal/5;
				if(intAverage > 15){
					
					while((intIron != 4) && (intIron !=7) && (intIron != 9)){
						con.setTextColor(Color.BLACK);
						con.println("Your average is: "+intAverage);
						S4(con);
						con.println("Which iron would you want to use at the driving range? (4,7, or 9):");
						intIron = con.readInt();
						con.clear();
					}
					
					if(intIron==4){
						con.clear();
						con.println("You choose the "+intIron+" Iron!");
						con.println("You spend the day practicing your long-range shots.");
						
						while(intBallY > - 200){
						Iron(con);
						con.setDrawColor(Color.WHITE);
						con.fillOval(520,intBallY, 50, 50);
						intBallY = intBallY - 25;
						con.sleep(12);
						con.repaint();
						}
						con.sleep(5000);
					}else if(intIron == 7){
						con.clear();
						Iron(con);
						con.println("You choose the "+intIron+" Iron!");
						con.println("You spend the day practicing your mid-range shots.");
						
						while(intBallY > 75){
						Iron(con);
						con.setDrawColor(Color.WHITE);
						con.fillOval(520,intBallY, 50, 50);
						intBallY = intBallY - 15;
						con.sleep(12);
						con.repaint();
						}
						con.sleep(5000);
					}else{
						con.clear();
						Iron(con);
						con.println("You choose the "+intIron+" Iron!");
						con.println("You spend the day practicing your short-range shots.");
						
						while(intBallY > 250){
						Iron(con);
						con.setDrawColor(Color.WHITE);
						con.fillOval(520,intBallY, 50, 50);
						intBallY = intBallY - 5;
						con.sleep(12);
						con.repaint();
						}
						con.sleep(5000);
						
					}
					
				}else{
					con.println("You go enjoy a nice and relaxing time golfing!");
					con.sleep(5000);
				}
				
			}else if(dblAcceleration < 1){
				con.clear();
				con.setTextColor(Color.WHITE);
				S32(con);
				con.sleep(7000);
			}else{
				con.clear();
				con.setTextColor(Color.RED);
				S9(con);
				con.sleep(7000);
			}
		}else{
			con.clear();
			con.setTextColor(Color.WHITE);
			S10(con);
			con.println("Enter your name in the registration form");
			strName = con.readLine();
			
			intNameLength = strName.length();
			
			strLetter = strName.substring(intNameLength - 1, intNameLength);
			
			if(strLetter.equals("z")){
				while((!strMoney.equals("golf")) && (!strMoney.equals("money"))){
				con.clear();
				S11(con);
				con.println("Do you leave to spend the 'money' or continue to play 'golf'");
				strMoney = con.readLine();
				}
				if(strMoney.equals("money")){
					con.clear();
					con.println("You leave the tournament and spend the money");
					con.sleep(3000);
					con.setDrawColor(Color.RED);
					con.setDrawFont(fntOswald);
					con.repaint();
					con.drawString("THE END", 450, 200);
					con.sleep(5000);
					con.closeConsole();
				}else{
					
				}
				}
				
			con.clear();
			S13(con);
			con.setDrawColor(new Color (152, 225, 225));;
			con.fillRect(542,546,98,36);
			con.setDrawColor(Color.BLACK);
			con.setDrawFont(fntOswald2);
			con.repaint();
			con.drawString("Draw", 542, 546);
			
			while(strDraw.equals("")){
				intMouseX = con.currentMouseX();
				intMouseY = con.currentMouseY();
				intCurrentMouseButton = con.currentMouseButton();
				con.repaint();
				if(((intMouseX >= 542) && (intMouseX <= 640)) && ((intMouseY >= 546) && (intMouseY <= 582))){
					con.setDrawColor(Color.red);
					con.drawRect(540,544,100,38);
					if(intCurrentMouseButton == 1){
						strDraw = "click";
					}
				}else{
					con.setDrawColor(Color.black);
					con.drawRect(540,544,100,38);
				}
			}
			
			
			intDraw = (int)(Math.random()*10.00)+1;
			
			S13(con);

			con.clear();
			con.println("Your order number is: "+intDraw);
			con.sleep(3000);
			
			if(intDraw > 5){
				con.clear();
				con.println("You are one of the last golfers to play. While waiting,");
				con.println("you record the time it takes until it is your turn.");
				con.println("What is the uncertainty in this measurement?");
				dblTime = con.readDouble();
				
				if(dblTime == 0.01){
					con.clear();
					con.println("Correct! An official is impressed and gives you an advantage");
					con.println("It is now your turn.");
					intStrokes = intStrokes - 1;
					con.sleep(3000);
				}else{
					con.clear();
					con.println("Wrong! A random bystander looks in disappointment");
					con.println("It is now your turn.");
					con.sleep(3000);
				}
			}else{
				con.println("You are one of the first golfers to begin");
				con.println("It is now your turn.");
				con.sleep(5000);
			}
			
			con.clear();
			con.println("Welcome to the tournament "+strName+"!");
			con.println("The first hole is 560 yards away from the tee. How many");
			con.println("significant digits are in that measurement?");
			intYards = con.readInt();
			
			if(intYards == 2){
				con.println("Correct! Your shot hits your target with ease!");
				intStrokes = intStrokes + 1;
				con.sleep(5000);
				
			}else{
				con.println("Wrong! Your shot does not take that into account and you miss your target.");
				intStrokes = intStrokes + 2;
				con.sleep(5000);
			}
			con.clear();
			
			con.println("A few holes later, the conditions get very windy.");
			con.println("What 2 forces do you need to consider that will be applied to the ball in the air?");
			strForce1 = con.readLine();
			strForce2 = con.readLine();
			
			if(strForce1.equals(strForce2)){
				con.clear();
				con.println("Wrong!, you can't answer the same thing twice! You miss.");
				intStrokes = intStrokes + 2;
				con.sleep(5000);
			}else if(strForce1.equals("gravity") || strForce1.equals("air resistance")){
				if(strForce2.equals("gravity") || strForce2.equals("air resistance")){
					con.clear();
					con.println("Correct! Even in the windy conditions you still had a great shot!");
					intStrokes = intStrokes + 1;
					con.sleep(5000);
				}else{
					con.clear();
					con.println("Wrong! You did not think about all of the forces. You miss");
					intStrokes = intStrokes + 2;
					con.sleep(5000);
				}	
			}else{
				con.clear();
				con.println("Wrong! You did not think about all of the forces. You miss");
				intStrokes = intStrokes + 2;
				con.sleep(5000);
			}
			con.clear();
			con.println("You then play at the final hole");
			con.println("How fast can you make your golf ball travel? (m/s),");
			dblV1 = con.readDouble();
			
			dblV1y = dblV1*Math.sin(Math.PI/4);
			dblV1x = dblV1*Math.cos(Math.PI/4);
			dblt = (Math.round((dblV1y/4.9)*100.00))/100.00;
			
			con.clear();
			con.println("You want the ball to be hit at a 45-degree angle up to");
			con.println("achieve maximum distance. With an initial velocity with your top speed: "+dblV1+" m/s");
			con.println("how many seconds will the ball be in the air for?");
			con.println("(assume on flat ground, no air resistance and round to 2DP)");
			dblFinal = con.readDouble();
			
			if(dblFinal == dblt){
				con.clear();
				con.println("Wow! right on!");
				intStrokes = intStrokes + 1;
				con.sleep(5000);
			}else{
				con.clear();
				con.println("Oh no! You miscalculated your shot.");
				intStrokes = intStrokes + 2;
				con.sleep(5000);
			}
			
			dblDistance = (Math.round((dblV1x * dblt)*100.00)/100.00);
			
			while(charTrust != 'y' && charTrust != 'n'){
			con.clear();
			con.println("For the final shot, a man on the side tells you that your shot will go "+dblDistance+"m.");
			con.println("Do you trust him? ('y' or 'n')");
			charTrust = con.readChar();
			}
			if(charTrust == 'y'){
				con.clear();
				con.println("He was right! The ball goes right into the final hole.");
				intStrokes = intStrokes + 1;
				con.sleep(5000);
			}else{
				con.clear();
				con.println("He was right! The ball misses the final hole. Be more trusting!");
				intStrokes = intStrokes + 3;
				con.sleep(5000);
			}
			con.clear();
			con.println("The final results are in, and you end up with a score of: "+intStrokes);
			con.println("What a great score!, but is it enough to win");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.print(".");
			con.sleep(3000);
			
			if(intStrokes > 4){
				con.clear();
				con.println("You don't place first in the tournament. You lose, better luck next time.");
				con.sleep(5000);
			}else{
				con.clear();
				con.println("CONGRATULATIONS, YOU WIN THE TOURNAMENT!!!");
				con.sleep(5000);
			}
		}
		con.clear();
		con.setDrawColor(Color.RED);
		con.setDrawFont(fntOswald);
		con.repaint();
		con.drawString("THE END", 450, 200);
	}	

public static void S1(Console con){
	BufferedImage imgS1 = con.loadImage("GolfSunrise1.jpg");
	con.println("WELCOME TO GOLFING DAY!");
	con.println("You wake up early in the morning to enjoy a day of golf.");
	con.drawImage(imgS1, 0, 0);
	con.repaint();
}
public static void S2(Console con){
	BufferedImage imgS2 = con.loadImage("DeerRoad.jpg");
	con.println("You decide to go to Bushwood Golf course!");
	con.println("You drive on a busy road to Bushwood, but a deer crosses the road");
	con.println("in front of you as you drive. If you are travelling at 40km/h,");
	con.drawImage(imgS2, 0, 0);
	con.repaint();
}
public static void S3(Console con){
	BufferedImage imgS3 = con.loadImage("Bushwood.jpg");
	con.println("You don't hit the deer and slow down safely.");
	con.println("You then arrive at Bushwood.");
	con.drawImage(imgS3, 0, 0);
	con.repaint();
}
public static void S4(Console con){
	BufferedImage imgS4 = con.loadImage("Range.jpg");
	con.println("You go practice at the driving range to get better at golfing!");
	con.drawImage(imgS4, 0, 0);
	con.repaint();
}
public static void S9(Console con){
	BufferedImage imgS9 = con.loadImage("Crash.jpg");
	con.println("You slow down too quickly and a car behind you rear ends you.");
	con.println("You have to repair your car and cancel your golfing plans.");
	con.drawImage(imgS9, 0, 0);
	con.repaint();
}
public static void S32(Console con){
	BufferedImage imgS32 = con.loadImage("Death.jpg");
	con.println("You do not slow down fast enough and hit the deer.");
	con.println("You then have to cancel your golf trip.");
	con.drawImage(imgS32, 0, 0);
	con.repaint();
}
public static void Iron(Console con){
	BufferedImage imgIron = con.loadImage("Iron.jpg");
	con.drawImage(imgIron, 0, 0);
	con.repaint();
}
public static void S10(Console con){
	BufferedImage imgS10 = con.loadImage("AG.jpg");
	con.println("You drive to Angus Glen Golf Club to play in a golf tournament!");
	con.drawImage(imgS10, 0, 0);
	con.repaint();
}
public static void S11(Console con){
	BufferedImage imgS11 = con.loadImage("Name.jpg");
	con.println("Your name is special and win $1000!");
	con.drawImage(imgS11, 0, 0);
	con.repaint();
}
public static void S13(Console con){
	BufferedImage imgS13 = con.loadImage("Draw.jpg");
	con.println("You successfully enter the tournament and head to the first hole.");
	con.println("pick a draw you want to start at");
	con.drawImage(imgS13, 0, 0);
	con.repaint();
}

}


