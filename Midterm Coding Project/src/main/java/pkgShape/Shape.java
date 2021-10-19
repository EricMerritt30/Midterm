package pkgShape;

public sealed abstract class Shape permits Circle {

	public Shape() {
		// TODO Auto-generated constructor stub
	}
	protected abstract double area();
}
