package csh.java.tradecenter.service;

import java.util.Scanner;

import csh.java.tradecenter.command.TradeCommand;
import csh.java.tradecenter.control.TradeAction;

public class TradeList implements TradeAction{

	@Override
	public TradeCommand excute(Scanner scanner) {
		
		System.out.println("거래소 물품 리스트");
		
		if(arrayList.size()>0) {
			int count = arrayList.size();
			System.out.println("거래소 아이템은 총 " + count + "개 입니다." );
			for(int i =0 ; i < arrayList.size(); i++) {
				
				System.out.println("아이템 이름 : " + arrayList.get(i).getTradeItem());
				System.out.println("아이템 가격 : " + arrayList.get(i).getTradePrice());
				System.out.println("아이템 등급 : " + arrayList.get(i).getTradeGrade());
				System.out.println("착용 클래스 : " + arrayList.get(i).getTradeClass());
				System.out.println("아이템 강화 : " + arrayList.get(i).getTradeEnchant());
				System.out.println("아이템 품질 : " + arrayList.get(i).getTradeQuality());
				System.out.println();
			}			
		}
		else {
			System.out.println("아이템이 없습니다.");
		}
		return null;
	}
}
