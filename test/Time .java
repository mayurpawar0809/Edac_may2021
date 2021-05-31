import java.util.concurrent.TimeUnit;
interface second
{
	void dispTime_InSec();
	void dispTime_Inhrs();
}
class Time implements second
{
	public void dispTime_InSec()
	{
		
		long milliseconds = 1000000;
		long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds");
			
	}
	public void dispTime_Inhrs()
	{
		long seconds = 10000;
		long hours = TimeUnit.SECONDS.toHours(seconds);
		System.out.println(seconds + " seconds = " + hours + " Hours");
			
	}
	public static void main(String args[])
	{ 
		Time T=new Time();
		T.dispTime_InSec();
		T.dispTime_Inhrs();
	}
}