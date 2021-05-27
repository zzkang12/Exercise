package study.ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterTest {

	public static void main(String[] args) {

		Calendar1 cal = new Calendar1();
		char button;
		Scanner sc = new Scanner(System.in);
		System.out.println("조깅하셨나요?(y/n)");
		button = sc.next().charAt(0);

		String today = cal.today();
		String txt = "오늘의 운동을 완료했습니다.";
		String txt1 = "내일은 맑을거에요.^^";
		String fileName = "C:\\test11.txt";

		if (button == 'y') {
			try {
				BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
				fw.write(today);
				fw.newLine();
				fw.write(txt);
				fw.newLine();
				fw.flush();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("수고하셨습니다.");
		}
		else if(button == 'n') {
			try {
				BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));
				fw.write(today);
				fw.newLine();
				fw.write(txt1);
				fw.newLine();
				fw.flush();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("내일은 맑을거에요.");
		}
		else
			System.out.println("잘못 입력하셨습니다.");
	}
}
