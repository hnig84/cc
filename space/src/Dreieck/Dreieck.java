package Dreieck;

public class Dreieck {
	private Punkt p1;
	private Punkt p2;
	private Punkt p3;
	public Dreieck(){
	System.out.println ("Dreieck wird erzeugt aus 3 Eckpunkten");
	p1 = new Punkt();
	p2 = new Punkt();
	p3 = new Punkt();
	}
	public double entfernung (Punkt q1, Punkt q2){
	return Math.sqrt ((q1.getX() - q2.getX()) *
	(q1.getX() - q2.getX()) +
	(q1.getY() - q2.getY()) *
	(q1.getY() - q2.getY()));
	}
	public double umfang(){
	return this.entfernung(p1, p2) + this.entfernung(p2, p3) + this.entfernung(p3, p1);
	}
}
