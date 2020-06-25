package by.epam.javaonline.programmingclass.simpleclass.task4;

import java.util.Date;
import java.util.Scanner;

public class Train {

	public Train[] trains;
	private String destinationName;
	private int trainNumber;
	private Date departureTime;

	public Train() {
	this.destinationName = null;
	this.trainNumber = 0;
	this.departureTime = null;
	}
	
	public Train(Train[] trains) {
		this.trains = trains;
	}

	public Train(String destinationName, int trainNumber, Date departureTime) {
		this.destinationName = destinationName;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public void setDestionName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getTrainNumber() {
		return this.trainNumber;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getDepartureTime() {
		return this.departureTime;
	}

	public void quickSortByNumber() {
		recQuickSort(0, trains.length - 1);
	}

	public void recQuickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			long pivot = trains[right].trainNumber;
			int partition = partitionIt(left, right, pivot);
			recQuickSort(left, partition - 1);
			recQuickSort(partition + 1, right);
		}
	}

	public int partitionIt(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (trains[++leftPtr].trainNumber < pivot)
				;
			while (rightPtr > 0 && trains[--rightPtr].trainNumber > pivot)
				;
			if (leftPtr >= rightPtr) {
				break;
			} else {
				swap(leftPtr,rightPtr);
			}
		}
		swap(leftPtr,right);
		return leftPtr;
	}

	public void swap(int dex1, int dex2) {
		Train temp;
		temp = trains[dex1];
		trains[dex1] = trains[dex2];
		trains[dex2] = temp;
	}
	
	public void display() {
		System.out.println("Номер поезда|\tМаршрут|\t\tВремя отправления");
		for(Train x: trains) {
			System.out.println(x.trainNumber+"\t\t"+x.destinationName+"\t\t"+x.departureTime);
		}
	}
	
	public void searchByNumber() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);			
		System.out.println("Введите номер поезда");
		System.out.print(">>");

		while (!in.hasNextInt()) {
			in.next();
			System.out.println("Введите номер поезда");
			System.out.print(">>");
		}
		
		int number = in.nextInt();	
		
		for(int i=0;i<trains.length;i++) {
			if(number==trains[i].trainNumber) {
				System.out.println("Номер поезда|\tМаршрут|\t\tВремя отправления");	
				System.out.println(trains[i].trainNumber+"\t\t"+trains[i].destinationName+"\t\t"+trains[i ].departureTime);	
				
			}
		}
	}
	
	public void sortByDestinationName() {
		int index = 1;
		for (int j = 0; j < trains.length; j++) {
            for (int i = j + 1; i <trains.length; i++) {
                if (trains[i].equals(trains[j])) {
                    Train k = trains[j+index];
                    trains[j+index] = trains[i];
                    trains[i] = k;
                }
            }          
        }
		display();	
	}
	
	public void sortByTime() {
		int index = 1;
		for (int j = 0; j < trains.length; j++) {
            for (int i = j + 1; i <trains.length; i++) {
                if (trains[i].equals(trains[j])) {
                    Train k = trains[j+index];
                    trains[j+index] = trains[i];
                    trains[i] = k;
                }
            }          
        }
		display();	
	}
	
	public boolean equals(Train train) {
	       return this.destinationName ==  train.destinationName;
	}
}
















