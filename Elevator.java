/***************************
*name: Edward Kang
*CSCIE-55 HW 1
*date: 9/12/2018
***************************/

import java.util.Scanner;

public class Elevator {

	public static final int numFloors = 7;
	int currentFloor = 1;
	String direction;

	public void move(int numFloors, int currentFloor, String direction) {
		//If currentFloor is 1, it only goes up.
		//If currentFloor is the highest floor, it only goes down.
		if (currentFloor == 1) {
			currentFloor = currentFloor + 1;
			direction = "Up";
		} else if (currentFloor == numFloors) {
			currentFloor = currentFloor - 1;
			direction = "Down";
		} else {
			if (direction == "Up") {
				currentFloor = currentFloor + 1;
			} else {
				currentFloor = currentFloor - 1;
		    	}
		}
		System.out.println("Now the elevator is at " + currentFloor + " and it is moving " + direction);
	};

	/*
	public void boardPassenger(int destinationFloor) {

	};

	public String toString() {

	};
	*/

	public static void main(String[] args) {
		Elevator elevator = new Elevator();

		System.out.println("Enter the number of passengers: ");
		
		int totalPassengers;
		Scanner scanner = new Scanner(System.in);
		totalPassengers = scanner.nextInt();
		
		elevator.move(numFloors, totalPassengers, "Up");
	};
}
