package First;

import java.util.Scanner;

public class Clock {
	
	static int hour;
	static int minutes;

	public static void main(String[] args) {
		Entertime();
		min_angle(hour,minutes);
		}			
	
	public static void Entertime()
	{
		System.out.println("Enter the time");
		Scanner user= new Scanner(System.in);
		String timevalue=user.nextLine();
		user.close();
		String[]time= timevalue.split(":");
		hour = Integer.parseInt(time[0]);
		minutes = Integer.parseInt(time[1]);			
	}
	
	public static void min_angle(int hour,int minutes)
	{
		double angle_value= (hour*60+minutes)*0.5-minutes*6;
				
				if (angle_value<=180)
		{
			System.out.println("Minimum angle is: "+Math.abs(angle_value));
		}
			else
			{
				angle_value= Math.abs(360-angle_value);
				System.out.println("Minimum angle is: "+angle_value);
			}
				
		}
					
		}
	


