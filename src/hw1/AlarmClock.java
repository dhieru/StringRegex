package hw1;

public class AlarmClock
{
	
	private int alarmMinutes;
	private int effectiveAlarmMinutes;
	private int clockMinutes;
	private boolean alarm;
	private boolean ringing;
	
	//Number of minutes to silence the alarm when snoozing.
	public static final int SNOOZE_MINUTES = 9;
	//Number of minutes in a 24-hour day.
	public static final int MINUTES_PER_DAY = 1440;
	
	public AlarmClock()
		{
		//Constructs an alarm clock with initial clock time at 00:00 and alarm time at 01:00
		alarm = false;
		ringing = false;
		alarmMinutes = 60;
		effectiveAlarmMinutes = alarmMinutes;
		clockMinutes = 0;
		
		}
	
	public AlarmClock(int hours,int minutes)
		{ 
		//Constructs an alarm clock with the given initial clock time and with alarm time at 01:00.
		alarmMinutes = 60;
		effectiveAlarmMinutes = alarmMinutes;
		clockMinutes = hours * 60 + minutes;
		alarm = false;
		ringing = false;
		}
	
	public void advanceTime(int hours,int minutes)
		{
		clockMinutes = clockMinutes + ((hours * 60) + minutes);
		if (clockMinutes > effectiveAlarmMinutes && alarm == true || clockMinutes == effectiveAlarmMinutes && alarm == true)
		{ringing = true;
			
		}
		if (effectiveAlarmMinutes != alarmMinutes){
		ringing = false;
		}}
		//Advances the clock time by the given hours and minutes.
		
	
	public void advanceTime(int minutes)
		{
		if(minutes < MINUTES_PER_DAY){
			clockMinutes = clockMinutes + minutes;
		}
		else { 
			minutes = minutes % MINUTES_PER_DAY;
			clockMinutes = clockMinutes + minutes;
		}
		if(clockMinutes > effectiveAlarmMinutes || clockMinutes == effectiveAlarmMinutes){
			ringing = true;
			
		}
		//Advances the clock time by the specified number of minutes.
		}
	
	public boolean isRinging()
		{
		//Determines whether the clock is currently ringing.
		return ringing;
		}
	
	public int getClockTime()
		{
		//Returns the current clock time as the number of minutes past midnight. This value is always between 0 and 1439, inclusive.
		return clockMinutes;
		}
	
	public int getAlarmTime()
		{
		//Returns the current alarm time as the number of minutes past midnight. This value is always between 0 and 1439, inclusive.
		return alarmMinutes;
		}
	
	public int getEffectiveAlarmTime()
		{
		//Returns the effective alarm time as the number of minutes past midnight. If snooze is not in effect, this value is the same as the current alarm time. This value is always between 0 and 1439, inclusive.
		return effectiveAlarmMinutes;
		}
	
	public java.lang.String getClockTimeAsString()
		{
		//Returns the current clock time as a string of the form hh:mm. The hours value hh is between 0 and 23, inclusive, and the minutes value mm is between 0 and 59, inclusive.
		String a = clockMinutes / 60 + ":" + clockMinutes % 60;
		return a;
		}
	
	public java.lang.String getAlarmTimeAsString()
		{
		//Returns the current alarm time as a string of the form hh:mm. The hours value hh is between 0 and 23, inclusive, and the minutes value mm is between 0 and 59, inclusive.
		String b = alarmMinutes / 60 + ":" + alarmMinutes % 60;
		return b;
		}
	
	public java.lang.String getEffectiveAlarmTimeAsString()
		{
		//Returns the effective alarm time as a string of the form hh:mm. The hours value hh is between 0 and 23, inclusive, and the minutes value mm is between 0 and 59, inclusive.
		String c = effectiveAlarmMinutes / 60 + ":" + effectiveAlarmMinutes % 60;
		return c;
		}
	
	public void alarmOn()
		{
		//Turns the alarm on. This method does not cause the alarm to start ringing regardless of current clock time and alarm time. (If clock time and alarm time are equal, it will start ringing after time is advanced by 24 hours.)
		alarm = true;
		}
			
	
	public void alarmOff()
		{
		//Turns off the alarm, stops it from ringing (if it is ringing) and cancels snooze if it is in effect.
		alarm = false;
		ringing = false;
		effectiveAlarmMinutes = alarmMinutes;
		}
	
	public void snooze(){
		//Stops the clock from ringing and sets the effective alarm time for SNOOZE_MINUTES minutes after the current clock time. 
		//Does not turn off the alarm or change the alarm time. Does nothing if the alarm is not currently ringing
		if (ringing == true){
		ringing = false;
		effectiveAlarmMinutes = (clockMinutes + SNOOZE_MINUTES);
		}}
	public void setTime(int hours,int minutes)
		{
		clockMinutes = (hours * 60) + minutes;
		effectiveAlarmMinutes = alarmMinutes;
		}
		//Sets the current clock time to the given hours and minutes. The hours must be in the range [0, 23] and minutes must be in the range [0, 59]. This method will not cause the clock to start ringing, even if the alarm is currently set, and will not cause it to stop ringing if it is already in the ringing state. If snooze is in effect, it is canceled by this method.
		
	
	public void setAlarmTime(int hours,int minutes)
		{
		alarmMinutes = (hours * 60) + minutes;
		effectiveAlarmMinutes = alarmMinutes;
		//Sets the alarm time to the given hours and minutes. The hours must be in the range [0, 23] and minutes must be in the range [0, 59]. This method will not cause the clock to start ringing, and will not cause it to stop ringing if it is already in the ringing state. If snooze is in effect, it is canceled by this method.
		}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* AlarmClock clock = new AlarmClock();
		 System.out.println(clock.getClockTime());
		 clock.advanceTime(4000);
		 System.out.println(clock.getClockTime());
		 clock.setTime(2, 30);
		 System.out.println(clock.getClockTime()); 
		 AlarmClock clock = new AlarmClock();
		 clock.setTime(2, 0);
		 System.out.println(clock.getClockTime());
		 clock.setAlarmTime(2, 30);
		 clock.advanceTime(15);
		 System.out.println(clock.isRinging());
		 clock.advanceTime(15);
		 System.out.println(clock.isRinging());
		 clock.alarmOff();
		 System.out.println(clock.isRinging());*/
		AlarmClock	clock = new AlarmClock();
		 clock.setTime(2, 30);
		 clock.setAlarmTime(2, 30);
		 System.out.println(clock.isRinging()); // true
		 clock.advanceTime(1440);
		 System.out.println(clock.isRinging());
		 System.out.println(); 
		 AlarmClock clock1 = new AlarmClock();
		 clock1.setTime(23, 0);
		 clock1.setAlarmTime(23, 30);
		 clock1.advanceTime(60);
		 System.out.println(clock1.isRinging());
	}
}