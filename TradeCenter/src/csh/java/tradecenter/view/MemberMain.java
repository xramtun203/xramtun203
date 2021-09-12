package csh.java.tradecenter.view;

import java.util.Scanner;

import csh.java.tradecenter.member.service.MemberDelete;
import csh.java.tradecenter.member.service.MemberInsert;
import csh.java.tradecenter.member.service.MemberList;
import csh.java.tradecenter.member.service.MemberListDetail;
import csh.java.tradecenter.member.service.MemberUpdate;

public class MemberMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sel;
		do {
			System.out.println("==================");
			System.out.println("회원 관리 프로그램");
			System.out.println("1. 회원 전체 조회 2. 등록 3. 수정 ");
			System.out.println("4. 회원 상세 조회 5. 삭제 6. 메인");
			System.out.println("번호 입력 : ");
			sel = scanner.nextInt();
			
			switch (sel) {
			case 1:
				MemberList memberList = new MemberList();
				memberList.excute(scanner);
				break;
			case 2:
				MemberInsert memberInsert = new MemberInsert();
				memberInsert.excute(scanner);
				break;
			case 3:
				MemberUpdate memberUpdate = new MemberUpdate();
				memberUpdate.excute(scanner);
				break;
			case 4:
				MemberListDetail memberListDetail = new MemberListDetail();
				memberListDetail.excute(scanner);
				break;
			case 5:
				MemberDelete memberDelete = new MemberDelete();
				memberDelete.excute(scanner);
				break;
			case 6:
				HomeMain.main(null);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}		
		}
		while(true);
	}
}
