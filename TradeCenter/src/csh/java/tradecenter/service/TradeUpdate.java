package csh.java.tradecenter.service;

import java.util.Scanner;

import csh.java.tradecenter.command.TradeCommand;
import csh.java.tradecenter.control.TradeAction;
import csh.java.tradecenter.view.TradeMain;

public class TradeUpdate implements TradeAction{

	@Override
	public TradeCommand excute(Scanner scanner) {
		
		System.out.println("거래소 아이템 수정");
		
		if(arrayList.size()>0) {
			int index = -1;
			System.out.println();
			System.out.println("아이템 이름 : ");
			String tradeItem = scanner.next();
			System.out.println();
			
			for(int i = 0; i < arrayList.size(); i++) {
				if(tradeItem.equals(arrayList.get(i).getTradeItem())) {
					index = i;
					System.out.println("아이템 이름 : " + arrayList.get(i).getTradeItem());
					System.out.print("아이템 가격 : ");
					int tradePrice = scanner.nextInt();
					System.out.print("아이템 등급 : ");
					String tradeGrade = scanner.next();
					System.out.print("착용 클래스 : ");
					String tradeClass = scanner.next();
					System.out.print("아이템 강화 : ");
					int tradeEnchant = scanner.nextInt();
					System.out.print("아이템 품질 : ");
					int tradeQuality = scanner.nextInt();
					System.out.println();
					
					TradeCommand tradeCommand = new TradeCommand();
					tradeCommand.setTradeItem(tradeItem);
					tradeCommand.setTradeGrade(tradeGrade);
					tradeCommand.setTradeClass(tradeClass);
					tradeCommand.setTradeEnchant(tradeEnchant);
					tradeCommand.setTradeQuality(tradeQuality);
					arrayList.add(index, tradeCommand);
					System.out.println("아이템 정보 수정 완료");
					return tradeCommand;
				}			
			}
			if( index ==-1) {
				System.out.println("찾으시는 아이템이 없습니다.");		
			}
		}
		return null;
	}
}
