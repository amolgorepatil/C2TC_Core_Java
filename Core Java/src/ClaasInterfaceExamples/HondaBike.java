package ClaasInterfaceExamples;

public class HondaBike implements MotorBike {

		int gear;
		int speed;
		
	@Override
	public void gearChange(int g) {
		// TODO Auto-generated method stub
		gear = g;
	}

	@Override
	public void topSpeed(int s) {
		// TODO Auto-generated method stub
		speed = speed + s;
	}

	@Override
	public void brakes(int b) {
		// TODO Auto-generated method stub
		speed = speed -b;
		 
	}


	void status() {
		System.out.println("Speed: " +speed+ " At gear" +gear);
	}
}
