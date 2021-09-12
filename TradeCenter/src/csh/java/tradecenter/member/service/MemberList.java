package csh.java.tradecenter.member.service;

import java.util.Scanner;

import csh.java.tradecenter.command.MemberCommand;
import csh.java.tradecenter.control.MemberAction;

public class MemberList  implements MemberAction{

	@Override
	public MemberCommand excute(Scanner scanner) {
		
		if(arrayList.size()>0) {
			int count = arrayList.size();
			System.out.println(" 전체 회원 수 : " + count + "명");
			for(int i =0; i < arrayList.size(); i++) {
				System.out.print("아이디 : " + arrayList.get(i).getMemId() + ", ");
				System.out.print("이름 : " + arrayList.get(i).getMemName() + ", ");
				System.out.println("나이 : " + arrayList.get(i).getMemAge());
				System.out.print("성별 : " + arrayList.get(i).getMemSex() + ", ");
				System.out.print("전화번호 : " + arrayList.get(i).getMemPnum() + ", ");
				System.out.println("이메일 : " + arrayList.get(i).getMemEmail());
				System.out.println();			
			}
		}
		else {
			System.out.println("회원이 없습니다.");
		}
		return null;
	}
}