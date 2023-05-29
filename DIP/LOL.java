package dip;

public class LOL extends Games{
	public LOL() {
		title = returnTitle();
		version = returnVersion();
	}
	
	public String returnTitle() {
		return "LOL";
	}
	
	public String returnVersion() {
		return "v.2020";
	}
}
