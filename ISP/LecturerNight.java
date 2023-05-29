package lsp;

public class LecturerNight extends Lecturer {
	public LecturerNight() {
		lecturer = "야간 강사";
		charge = 100000;
	}
	
	public void Lecturer() {
		System.out.println(lecturer);
		System.out.println("강사료: " + charge + "원\n");
	}
}
