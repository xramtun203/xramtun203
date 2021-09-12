package csh.java.tradecenter.member.service;

import java.util.Scanner;

import csh.java.tradecenter.command.MemberCommand;
import csh.java.tradecenter.control.MemberAction;

public class MemberDelete implements MemberAction{

	@Override
	public MemberCommand excute(Scanner scanner) {
		
		System.out.println("회원 삭제");
		
		if(arrayList.size()>0) {
			int index = -1;
			System.out.print("아이디 입력 : ");
			String memId = scanner.next();
			
			System.out.println();
			for(int i =0; i<arrayList.size(); i++) {
				if(memId.equals(arrayList.get(i).getMemId())) {
					index = i;
					while(true) {
						System.out.println("회원 "+ arrayList.get(i).getMemId() + "님을 삭제 하시겠습니까?" );
						System.out.print(" Y / N ?");
						char sel = scanner.next().charAt(0);
						
						if(sel=='Y' || sel == 'y') {
							arrayList.remove(i);
							System.out.println("회원이 삭제되었습니다.");
							break;
						}
						else if(sel=='N' || sel=='n') {
							System.out.println("삭제가 취소되었습니다.");
							break;
						}
						else {
							System.out.println("잘못된 입력입니다.");
						}
					}
				}
			}
			if(index==-1) {
				System.out.println("등록되지 않은 회원입니다.");
			}
		}
		else {
			System.out.println("등록된 회원이 없습니다.");
		}
		return null;
	}
}
