package lsp;

public class LecturerMain {
	public static void main(String[] args) {
		LecturerNomal lecNomal = new LecturerNomal();
		lecNomal.Lecturer();
		
		LecturerNight lecNight = new LecturerNight();
		lecNight.Lecturer();
		
		LecturerWithWork lecWork = new LecturerWithWork();
		lecWork.Lecturer();
	}
}
