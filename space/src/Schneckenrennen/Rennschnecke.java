package Schneckenrennen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rennschnecke {
	private String name;
	private String rasse;
	private double maxSpeed; // in cm/h
	private double distance; // in m
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRasse() {
		return rasse;
	}
	public void setRasse(String rasse) {
		this.rasse = rasse;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Rennschnecke [name=" + name + ", rasse=" + rasse + ", maxSpeed=" + maxSpeed +"cm/h, distance=" + distance
				+ "cm]";
	}
	public Rennschnecke(String name, String rasse, double maxSpeed, double distance) {
		super();
		this.name = name;
		this.rasse = rasse;
		this.maxSpeed = maxSpeed;
		this.distance = distance;
	}
	
	public void krieche() {
		double tmp = 0;
		tmp = Math.random() * maxSpeed;
		distance += tmp;
	}
	public static void ermittleGewinner(ArrayList<Rennschnecke> rennen) {
		
		System.out.println("Der Gewinner ist: " + rennen.get(0).getName());
	}
	
	public static void main(String[] args) {
		int counter = 0;
		ArrayList<Rennschnecke> rennen = new ArrayList<Rennschnecke>();
		rennen.add(new Rennschnecke("Dieter", "Tibetanische Rennschnecke", 12.0, 0.0));
		rennen.add(new Rennschnecke("Heinz", "Afghanische Windschnecke", 15.0, 0.0));
		rennen.add(new Rennschnecke("Fred", "Europäisch Kleinhaus", 9.0, 0.0));
		rennen.add(new Rennschnecke("Kurt", "Kleiner Schneckling", 8.0, 0.0));
		

		for(int i = 0; i < 10; i++) {
		for(Rennschnecke schnecke : rennen) {
			schnecke.krieche();
		}
		counter++;
		}
		rennen.sort(Comparator.comparing(Rennschnecke::getDistance).reversed());
		System.out.println("Nach " + counter + " wirklich langen Stunden...");
		for(Rennschnecke schnecke : rennen) {
			
		System.out.printf(schnecke.getName() + " hat %.2f cm geschafft. Hurra.\n", schnecke.getDistance());
		
		
		}
		Rennschnecke.ermittleGewinner(rennen);
	}
}