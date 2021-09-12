package csh.java.tradecenter.service;

import java.util.Scanner;

import csh.java.tradecenter.command.TradeCommand;
import csh.java.tradecenter.control.TradeAction;

public class TradeDelete implements TradeAction{

	@Override
	public TradeCommand excute(Scanner scanner) {
		
		System.out.println("거래소 아이템 회수");
		
		
		if(arrayList.size()>0) {
			int index = -1;
			System.out.println("아이템 이름 : ");
			String tradeItem = scanner.next();
			System.out.println();
			
			for(int i = 0; i < arrayList.size(); i++) {
				if(tradeItem.equals(arrayList.get(i).getTradeItem())) {
					index = i;
					while(true) {
						System.out.println("아이템 " + arrayList.get(i).getTradeItem() + "을 회수하시겠습니까?");
						System.out.println("Y / N ?  : ");
						char sel = scanner.next().charAt(i);
						
						if(sel=='Y' || sel == 'y') {
							arrayList.remove(i);
							System.out.println("아이템을 회수하였습니다.");
							System.out.println();
							break;
						}
						if(sel=='N' || sel=='n') {
							System.out.println("회수를 취소하셨습니다.");
							break;
						}
						else {
							System.out.println("잘못된 입력입니다.");
							System.out.println();
						}
					}
				}				
			}
			if(index ==-1) {
				System.out.println("아이템이 존재하지 않습니다.");
			}
		}
		else {
			System.out.println("등록된 아이템이 없습니다");
		}
		return null;
	}
}
