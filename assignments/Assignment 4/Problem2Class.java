package Homework3;

public class Problem2Class {
	
	boolean redLight, yellowLight, greenLight;
	int timer;

	public void setWarnings (boolean cruiseEngaged, double distance) {
//		redLight=yellowLight=greenLight=false;
		if (cruiseEngaged) {
			if (distance > 500.0)
				greenLight=true;
			else
				if (distance >= 150.0)
					yellowLight=true;
				else
					if (distance > 75.0) {
						yellowLight=true;
						redLight=true; }
					else {
						redLight=true;
						if (distance < 50.0) {
							timer++;
							if (timer > 1) {
								redLight = false;
								timer=0; }
						}
					}
		}
	}

	public boolean isRedLight() {
		return redLight;
	}

	public void setRedLight(boolean redLight) {
		this.redLight = redLight;
	}

	public boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight(boolean yellowLight) {
		this.yellowLight = yellowLight;
	}

	public boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight(boolean greenLight) {
		this.greenLight = greenLight;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}
}