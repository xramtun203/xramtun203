package csh.java.tradecenter.member.login.service;

import java.util.Scanner;

import csh.java.tradecenter.command.MemberCommand;
import csh.java.tradecenter.control.MemberAction;
import csh.java.tradecenter.view.HomeMain;
import csh.java.tradecenter.view.MemberMain;
import csh.java.tradecenter.view.TradeMain;

public class MemberLogin implements MemberAction{

	@Override
	public MemberCommand excute(Scanner scanner) {
		String memId;
		String memPasswd;
		int sel;
		
			System.out.println("로그인 화면");
			while(true){
			System.out.print("아이디 : " );
			memId = scanner.next();
			System.out.print("비밀번호 : ");
			memPasswd = scanner.next();			
			
			if(arrayList.size()==0) {
				MemberCommand memberCommand = new MemberCommand();
				memberCommand.setMemId("admin");
				memberCommand.setMemPasswd("1234");
				memberCommand.setMemName("최성환");
				arrayList.add(memberCommand);
			}
			
			for(int i=0; i< arrayList.size(); i++) {
				if(memId.equals(arrayList.get(i).getMemId())) {
					if(memPasswd.equals(arrayList.get(i).getMemPasswd())) {
						System.out.println("로그인 확인");
						System.out.println("===============");
						System.out.println("1. 회원 관리  2. 거래소 관리");
						System.out.print("번호 입력 : ");
						
						sel = scanner.nextInt();
						System.out.println();
						if(sel==1){
							System.out.println("회원 관리로 이동");
							MemberMain.main(null);
							break;
						}
						if(sel==2) {
							System.out.println("거래소 관리로 이동");
							TradeMain.main(null);
							break;
						}
						else {
							System.out.println("잘못된 선택입니다.");
						}	
					}
					else {
						System.out.println("비밀번호가 틀렸습니다. 다시 입력해 주십시오.");
					}
				}
				else {
					System.out.println("등록된 아이디가 아닙니다. 다시 입력해 주십시오");
				}
			}	
		}
	}
}