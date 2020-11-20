package view;

import java.util.Scanner;

import grade.GradeController;
import grade.GradeDTO;
import grade.GradeService;

public class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeController gradeController = new GradeController();
		GradeDTO grade = null;
		while (true) {
			System.out.println("[메뉴] (1)성적등록 (2)등수출력(이름,합계,평균) (0)종료");
			switch (scanner.next()) {
			case "1":
				grade = new GradeDTO();
				System.out.println("---성적등록---");
				System.out.print("이름: ");
				grade.setName(scanner.next());
				System.out.print("국어점수: ");
				grade.setKorean(scanner.nextInt());
				System.out.print("영어점수: ");
				grade.setEnglish(scanner.nextInt());
				System.out.print("수학점수: ");
				grade.setMath(scanner.nextInt());
				gradeController.postGrade(grade);
				break;
			case "2":
				System.out.println("---등수출력---");
				break;
			case "0":
				System.out.println("시스템 종료");
				return;
			}
		}
	}
}
