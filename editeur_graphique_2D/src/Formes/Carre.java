package Formes;
import java.awt.geom.*;
import java.awt.geom.Point2D;

public abstract class Carre extends Forme2D {
	private Rectangle delegue;
    protected double side;
	double areacarre;
	
	public Carre(Point2D p, double cote) {
		super(x, y);

		side = cote;
		delegue = new Rectangle(p, cote, cote);
	}

	public double perimetre() {
		return delegue.perimetre();
	}

	public double surface() {
		areacarre = side * side; 
		return areacarre;
	}

	public double getAreacarre() {
		return areacarre;
	}

	public void setAreacarre(double areacarre) {
		this.areacarre = areacarre;
	}

	public void changerCote(double nouvelleTaille) {
		delegue.changerHauteur(nouvelleTaille);
		delegue.changerLargeur(nouvelleTaille);
	}

	
	public String toString() {
		return this.getClass().getName() + "de centre ("+ delegue.origem.getx() + "," 
	+ delegue.origem.gety() + ")" +"de taille " + delegue.hauteur()+"color"+ getcolor();
	}

	public void translater(double dx, double dy) {
		delegue.translater(dx, dy);
	}
}
