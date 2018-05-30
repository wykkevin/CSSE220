package citytemperatures;

import java.util.ArrayList;

public class CityTemperatures {

	private ArrayList<String> cities;
	private ArrayList<Integer> temperatures;

	public CityTemperatures() {
		this.cities = new ArrayList<String>();
		this.temperatures = new ArrayList<Integer>();
	}

	public void addCity(String city) {
		this.cities.add(city);
	}

	public void calculateAverage(String city, ArrayList<Integer> temperatures) {

		int sum = 0;
		for (int temp : temperatures) {
			sum = sum + temp;
		}
		System.out.println("The average temperature of " + city + " is " + sum / temperatures.size());

	}
}
