package Formes;
import java.awt.geom.Point2D;
import java.awt.*;

public abstract class Cercle extends Forme2D {
	private double rayon;
	double areacercle; 
	
	public Cercle(Point2D p, double rayon) {
		super(p);
		this.rayon = rayon;
	}

	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	public double area() {
		return Math.PI * rayon * rayon;
	}

	public double getAreacercle() {
		areacercle = Math.PI*rayon*rayon;
		return areacercle;
	}

	public void setAreacercle(int areacercle) {
		this.areacercle = areacercle;
	}

	public double rayon() {
		return rayon;
	}

	public void changerRayon(double nouveauRayon) {
		rayon = nouveauRayon;
	}
	
	public void colorcercle() {
	}
	
	public String toString() {
		return super.toString() + "et de rayon" + rayon;

	}

}
