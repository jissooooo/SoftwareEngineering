package ocp;

public class Rectangle implements Figure{
	public double width;
	public double length;
	
	@Override
	public double calculator() {
		return width * length;
	}
}
