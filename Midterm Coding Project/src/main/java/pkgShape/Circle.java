package pkgShape;

public sealed class Circle extends Shape implements Area, Comparable<Circle> permits Ellipse{
	private double Radius;
	
	public Circle(double radiusPassed) {
		if(radiusPassed<0) {
			throw new IllegalArgumentException();
		}else {
			this.Radius = radiusPassed;
		}
	}
	
	protected double getRadius() {
		return this.Radius;
	}
	
	protected void setRadius(double radiusPassed) {
		if(radiusPassed<0) {
			throw new IllegalArgumentException();
		}else {
			this.Radius = radiusPassed;
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
		return Math.PI*(this.Radius*this.Radius);
	}

}
