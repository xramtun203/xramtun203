package csh.java.tradecenter.member.service;

import java.util.Scanner;

import csh.java.tradecenter.command.MemberCommand;
import csh.java.tradecenter.control.MemberAction;

public class MemberInsert implements MemberAction{

	@Override
	public MemberCommand excute(Scanner scanner) {
		String memId = null;
		String memEmail = null;
		System.out.println("회원 등록");
		if(arrayList.size()>0) {
			int index = -1;
			while(true) {
				index = -1;
				System.out.print("아이디 : ");
				memId = scanner.next();
				for(int i =0 ; i < arrayList.size(); i++) {
					if(memId.equals(arrayList.get(i).getMemId())) {
						index = i;
						System.out.println("사용중인 아이디 입니다.");
					}
				}
				if(index == -1){
					break;
				}
			}
		}
		else {
			System.out.print("아이디 : ");
			memId = scanner.next();
		}
		
		System.out.print("비밀번호 : ");
		String memPasswd = scanner.next();
		System.out.print("이름 : ");
		String memName = scanner.next();
		System.out.print(" 성별 : ");
		char memSex = scanner.next().charAt(0);
		System.out.print("전화번호 : ");
		String memPnum = scanner.next();
		if(arrayList.size()>0) {
			int index = -1;
			while(true) {
				System.out.print("이메일 : ");
				memEmail = scanner.next();
				for(int i=0; i< arrayList.size(); i++) {
					if(memEmail.equals(arrayList.get(i).getMemEmail())) {
						index = i;
						System.out.println("사용중인 이메일입니다.");
					}
				}
				if(index==-1) {
					break;
				}
			}
		}
		else {
			System.out.println("이메일 : ");
			memEmail = scanner.next();
		}
		System.out.print("나이 : ");
		int memAge = scanner.nextInt();
		
		MemberCommand memberCommand =  new MemberCommand();
		memberCommand.setMemAge(memAge);
		memberCommand.setMemEmail(memEmail);
		memberCommand.setMemId(memId);
		memberCommand.setMemName(memName);
		memberCommand.setMemPasswd(memPasswd);
		memberCommand.setMemPnum(memPnum);
		memberCommand.setMemSex(memSex);
		arrayList.add(memberCommand);
		
		return memberCommand;
	}

}
