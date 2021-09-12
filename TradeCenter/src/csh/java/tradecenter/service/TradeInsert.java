package csh.java.tradecenter.service;

import java.util.Scanner;

import csh.java.tradecenter.command.TradeCommand;
import csh.java.tradecenter.control.TradeAction;

public class TradeInsert implements TradeAction{

	@Override
	public TradeCommand excute(Scanner scanner) {
		
		System.out.println("거래소 물품 등록");
		
		System.out.print("아이템 이름 : ");
		String tradeItem = scanner.next();
		System.out.print("아이템 가격 : ");
		int tradePrice = scanner.nextInt();
		System.out.print("아이템 등급 : ");
		String tradeGrade = scanner.next();
		System.out.print("착용 클래스 : ");		
		//System.out.println("1. 전사 2. 마법사 3. 레인저 4. 공용");
		//System.out.print("입력 : ");
		String tradeClass = scanner.next();
		System.out.print("아이템 강화 : ");
		int tradeEnchant = scanner.nextInt();
		System.out.print("아이템 품질 : ");
		int tradeQuality = scanner.nextInt();
		System.out.println();
		
		TradeCommand tradeCommand = new TradeCommand();
		tradeCommand.setTradeItem(tradeItem);
		tradeCommand.setTradePrice(tradePrice);
		tradeCommand.setTradeGrade(tradeGrade);
		tradeCommand.setTradeClass(tradeClass);
		tradeCommand.setTradeEnchant(tradeEnchant);
		tradeCommand.setTradeQuality(tradeQuality);		
		arrayList.add(tradeCommand);	
		return tradeCommand;
	}
}
