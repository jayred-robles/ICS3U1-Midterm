import arc.*;

public class MidtermProject{
	public static void main(String [] args){
		Console con = new Console();
		
		//Variables
		String strCourse;
		strCourse = "";
		
		int intAcceleration;
		
		int intLoopCount1;
		intLoopCount1 = 0;
		
		int intScore;
		
		int intTotal; 
		intTotal = 0;
		
		int intAverage;
		
		
		con.println("WELCOME TO GOLFING DAY!");
		con.println("You wake up early in the morning to enjoy a day of golf.");
		
		while ((!strCourse.equals("competitively")) && (!strCourse.equals("fun"))){
		con.println("Do you want to play 'competitively' or for 'fun'?");
		strCourse = con.readLine();
		}
		
		if(strCourse.equals("fun")){
			con.clear();
			con.println("You decide to go to Bushwood Golf course!");
			con.println("You drive on a busy road to Bushwood, but a dear crosses the road");
			con.println("in front of you as you drive. If you are travelling at 40km/h,");
			con.println("at what rate should you decelerate to avoid crashing into the deer");
			con.println("that is 50 m away?");
			con.println("(Round final answer to 1 SD)");
			intAcceleration = con.readInt();
			
			if(intAcceleration == 1){
				con.clear();
				con.println("You don't hit the deer and slow down safely.");
				con.println("You then arrive at Bushwood.");
				con.println("Enter your 5 most recent scores in golf");
				for(intLoopCount1 = 1; intLoopCount1 <= 5; intLoopCount1++){
					con.print("Enter score "+intLoopCount1+": ");
					intScore = con.readInt();
					intTotal = intTotal + intScore;
				}
				con.clear();
				intAverage = intTotal/5;
				con.println("Your average is "+intAverage);
				if(intAverage > 15){
					con.println("You go practice at the driving range");
					con.println("to get better at golfing");
				}else{
					con.println("You go enjoy a nice and relaxing time golfing!");
				}
				
			}else if(intAcceleration < 1){
				con.clear();
				con.println("You hit the deer and have to cancel your golf trip.");
			}else{
				con.clear();
				con.println("You slow down too quickly and a car behind you rear ends you.");
				con.println("You have to repair your car and cancel your golfing plans.");
			}
		}else{
			con.clear();
			con.println("You drive to Angus Glen Golf Club to play in a golf tournament!");
		}
		
		con.println("THE END");
		
	}
}
