package csh.java.tradecenter.member.service;

import java.util.Scanner;

import csh.java.tradecenter.command.MemberCommand;
import csh.java.tradecenter.control.MemberAction;

public class MemberUpdate implements MemberAction {

	@Override
	public MemberCommand excute(Scanner scanner) {
		
		System.out.println("회원 수정");
		if(arrayList.size()>0) {
			int index = -1;
			System.out.println("회원 아이디 : ");
			String memId = scanner.next();
			System.out.println();
			for(int i = 0; i < arrayList.size(); i++) {
				if(memId.equals(arrayList.get(i).getMemId())) {
					index = i;
					System.out.println(" 회원 정보 수정 ");
					System.out.print("비밀번호 : ");
					String memPasswd = scanner.next();
					System.out.print("이름 : ");
					String memName = scanner.next();
					System.out.print("성별 : ");
					char memSex = scanner.next().charAt(0);
					System.out.print("이메일 : ");
					String memEmail = scanner.next();
					System.out.print("전화번호 : ");
					String memPnum = scanner.next();
					
					MemberCommand memberCommand = new MemberCommand();
					memberCommand.setMemId(arrayList.get(i).getMemId());
					memberCommand.setMemAge(arrayList.get(i).getMemAge());
					memberCommand.setMemPnum(memPnum);
					memberCommand.setMemEmail(memEmail);
					memberCommand.setMemName(memName);
					memberCommand.setMemPasswd(memPasswd);
					memberCommand.setMemSex(memSex);
					arrayList.set(index, memberCommand);
					System.out.println("회원정보 수정 완료");
					//return memberCommand;
				}
			}
			if(index == -1) {
				System.out.println("찾으시는 회원이 없습니다.");
			}
		}
		return null;
	}
}
