package ocp;

public class Circle implements Figure {
	public double radious;
	
	@Override
	public double calculator() {
		return radious * radious / 3.14;
	}
}
