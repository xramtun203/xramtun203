package csh.java.tradecenter.view;

import java.util.Scanner;

import csh.java.tradecenter.member.login.service.MemberLogin;
import csh.java.tradecenter.member.service.MemberInsert;

public class HomeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("메인 페이지");
			System.out.println("1. 로그인  2. 회원 가입  3. 종료");
			System.out.print("번호 입력 : ");
			String sel = scanner.next();

			switch (sel) {
			case "1":
				MemberLogin memberLogin = new MemberLogin();
				memberLogin.excute(scanner);
				break;
			case "2":
				MemberInsert memberInsert = new MemberInsert();
				memberInsert.excute(scanner);
				break;
			case "3":
				System.out.println("종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("1번에서 4번 중의 번호를 선택하세요");
				break;
			}
		}
	}
}
