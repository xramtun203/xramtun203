package csh.java.tradecenter.member.service;

import java.util.Scanner;

import csh.java.tradecenter.command.MemberCommand;
import csh.java.tradecenter.control.MemberAction;

public class MemberListDetail implements MemberAction{

	@Override
	public MemberCommand excute(Scanner scanner) {
		
		System.out.println("최원 정보 상세보기");
		
		if(arrayList.size()>0) {
			int index = -1;
			System.out.print("아이디 : ");
			String memId = scanner.next();
			System.out.println();
			for(int i = 0 ; i < arrayList.size(); i++) {
				if(memId.equals(arrayList.get(i).getMemId())) {
					index = i;
					System.out.println("비밀번호 : " + arrayList.get(i).getMemPasswd());
					System.out.println("이름 : " + arrayList.get(i).getMemName());
					System.out.println("나이 : " + arrayList.get(i).getMemAge());
					System.out.println("성별 : " + arrayList.get(i).getMemSex());
					System.out.println("이메일 : " + arrayList.get(i).getMemEmail());
					System.out.println("전화번호 : " + arrayList.get(i).getMemPnum());
				}
			}
			if(index==-1) {
				System.out.println("등록된 화원이 없습니다.");
			}
		}
		return null;
	}
}
