package Cst438h2.domain;

public class TempAndTime {
	public double temp;
	public long time;
	public int timezone;
	
	public TempAndTime(double temp, long time, int timezone){
		this.temp = temp;
		this.time = time;
		this.timezone = timezone;
	}
	public double getTemp() {
		return temp;
	}
	
	public void setTemp (double temp) {
		this.temp=temp;
	}
	public double getTime() {
		return temp;
	}
	
	public void setTime (long time) {
		this.time=time;
	}
	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	
 }
