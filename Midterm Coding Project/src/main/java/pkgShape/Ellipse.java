package pkgShape;

public sealed class Ellipse extends Circle implements Area permits Ellipsoid{
	private double MinorRadius;
	
	public Ellipse(double radius1, double radius2) {
		// TODO Auto-generated constructor stub
		super(radius1);
	}
	
	protected double getMinorRadius() {
		return this.MinorRadius;
	}
	
	protected void setMinorRadius(double radiusPassed) {
		if(radiusPassed<0) {
			throw new IllegalArgumentException();
		}else {
			this.MinorRadius = radiusPassed;
		}
	}
	
	@Override
	public int compareTo(Circle other) {
		int value = 0;
		if(this.area()==other.area()) {
			value = 0;
		}else if(this.area()>other.area()) {
			value = 1;
		}else if(this.area()<other.area()) {
			value = -1;
		}
		return value;
	}

	@Override
	public double area() {
		
		return Math.PI*(this.MinorRadius * th);
	}

}



