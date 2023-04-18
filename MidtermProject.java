import arc.*;

public class MidtermProject{
	public static void main(String [] args){
		Console con = new Console();
		
		//Variables
		String strCourse;
		strCourse = "";
		int intAcceleration;
		
		con.println("WELCOME TO GOLFING DAY!");
		con.println("You wake up early in the morning to enjoy a day of golf.");
		
		while ((!strCourse.equals("competitively")) && (!strCourse.equals("fun"))){
		con.println("Do you want to play 'competitively' or for 'fun'?");
		strCourse = con.readLine();
		}
		
		if(strCourse.equals("fun")){
			con.println("You decide to go to Bushwood Golf course!");
			con.println("You drive on a busy road to Bushwood, but a dear crosses the road");
			con.println("in front of you as you drive. If you are travelling at 40km/h,");
			con.println("at what rate should you decelerate to avoid crashing into the deer");
			con.println("that is 50 m away?");
			con.println("(Round final answer to 1 SD)");
			intAcceleration = con.readInt();
		}else{
			con.println("You drive to Angus Glen Golf Club to play in a golf tournament!");
		}
		
		
	}
}
