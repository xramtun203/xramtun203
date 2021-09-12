package csh.java.tradecenter.service;

import java.util.Scanner;

import csh.java.tradecenter.command.TradeCommand;
import csh.java.tradecenter.control.TradeAction;
import csh.java.tradecenter.view.TradeMain;

public class TradeListDetail implements TradeAction {

	@Override
	public TradeCommand excute(Scanner scanner) {
		
		System.out.println("아이템 상세정보 검색");
		
		while(true) {
			System.out.println("아이템 검색 방법 선택 ");
			System.out.println("1. 아이템 이름  2. 아이템 가격 3. 착용 클래스");
			System.out.println("4. 아이템 등급  5. 아이템 강화 6. 아이템 품질");
			System.out.println("7. 거래소 메인  8. 종료");
			System.out.println("입력 : ");
			String sel = scanner.next();
			if(sel=="7") {
				System.out.println("거래소메인으로 돌아갑니다.");
				TradeMain.main(null);
				break;
			}
			else if(sel=="8") {
				System.out.println("종료합니다.");
				break;
			}
			else if(sel=="1") {
				System.out.println();
				System.out.print("아이템 이름 : ");
				String tradeItem = scanner.next();
				System.out.println();
				if(arrayList.size()>0) {
					int index = -1;
					for(int i =0; i < arrayList.size(); i++) {
						if(tradeItem.equals(arrayList.get(i).getTradeItem())) {
							index = i;
							System.out.println("아이템 가격 : " + arrayList.get(i).getTradePrice());		
							System.out.println("아이템 등급 : " + arrayList.get(i).getTradeGrade());		
							System.out.println("착용 클래스 : " + arrayList.get(i).getTradeClass());		
							System.out.println("아이템 강화 : " + arrayList.get(i).getTradeEnchant());		
							System.out.println("아이템 품질 : " + arrayList.get(i).getTradeQuality());		
							System.out.println();
						}
					}
					if(index==-1) {
						System.out.println("아이템이 존재하지 않습니다.");
					}
				}
			}
			else if(sel=="2") {
				System.out.println();
				System.out.print("아이템 가격 : ");
				int tradePrice = scanner.nextInt();
				System.out.println();
				if(arrayList.size()>0) {
					int index = -1;
					for(int i =0; i < arrayList.size(); i++) {
						if(tradePrice==arrayList.get(i).getTradePrice()) {
							index = i;
							System.out.println("아이템 이름 : " + arrayList.get(i).getTradeItem());		
							System.out.println("아이템 등급 : " + arrayList.get(i).getTradeGrade());		
							System.out.println("착용 클래스 : " + arrayList.get(i).getTradeClass());		
							System.out.println("아이템 강화 : " + arrayList.get(i).getTradeEnchant());		
							System.out.println("아이템 품질 : " + arrayList.get(i).getTradeQuality());		
							System.out.println();
						}
					}
					if(index==-1) {
						System.out.println("아이템이 존재하지 않습니다.");
					}
				}
			}
			else if(sel=="3") {
				System.out.println();
				System.out.print("착용 클래스 : ");
				String tradeClass = scanner.next();
				System.out.println();
				if(arrayList.size()>0) {
					int index = -1;
					for(int i =0; i < arrayList.size(); i++) {
						if(tradeClass.equals(arrayList.get(i).getTradeClass())) {
							index = i;
							System.out.println("아이템 이름 : " + arrayList.get(i).getTradeItem());		
							System.out.println("아이템 가격 : " + arrayList.get(i).getTradePrice());		
							System.out.println("아이템 등급 : " + arrayList.get(i).getTradeGrade());		
							System.out.println("아이템 강화 : " + arrayList.get(i).getTradeEnchant());		
							System.out.println("아이템 품질 : " + arrayList.get(i).getTradeQuality());	
							System.out.println();
						}
					}
					if(index==-1) {
						System.out.println("아이템이 존재하지 않습니다.");
					}
				}
			}
			else if(sel=="4") {
				System.out.println();
				System.out.print("아이템 등급 : ");
				String tradeGrade = scanner.next();
				System.out.println();
				if(arrayList.size()>0) {
					int index = -1;
					for(int i =0; i < arrayList.size(); i++) {
						if(tradeGrade.equals(arrayList.get(i).getTradeGrade())) {
							index = i;
							System.out.println("아이템 이름 : " + arrayList.get(i).getTradeItem());		
							System.out.println("아이템 가격 : " + arrayList.get(i).getTradePrice());		
							System.out.println("착용 클래스 : " + arrayList.get(i).getTradeClass());		
							System.out.println("아이템 강화 : " + arrayList.get(i).getTradeEnchant());		
							System.out.println("아이템 품질 : " + arrayList.get(i).getTradeQuality());		
							System.out.println();
						}
					}
					if(index==-1) {
						System.out.println("아이템이 존재하지 않습니다.");
					}
				}
			}
			else if(sel=="5") {
				System.out.println();
				System.out.print("아이템 강화 : ");
				int tradeEnchant = scanner.nextInt();
				System.out.println();
				if(arrayList.size()>0) {
					int index = -1;
					for(int i =0; i < arrayList.size(); i++) {
						if(tradeEnchant==arrayList.get(i).getTradeEnchant()) {
							index = i;
							System.out.println("아이템 이름 : " + arrayList.get(i).getTradeItem());		
							System.out.println("아이템 가격 : " + arrayList.get(i).getTradePrice());	
							System.out.println("아이템 등급 : " + arrayList.get(i).getTradeGrade());		
							System.out.println("착용 클래스 : " + arrayList.get(i).getTradeClass());			
							System.out.println("아이템 품질 : " + arrayList.get(i).getTradeQuality());	
							System.out.println();
						}
					}
					if(index==-1) {
						System.out.println("아이템이 존재하지 않습니다.");
					}
				}
			}
			else if(sel=="6") {
				System.out.println();
				System.out.print("아이템 품질 : ");
				int tradeQuality = scanner.nextInt();
				System.out.println();
				if(arrayList.size()>0) {
					int index = -1;
					for(int i =0; i < arrayList.size(); i++) {
						if(tradeQuality==arrayList.get(i).getTradeQuality()) {
							index = i;
							System.out.println("아이템 이름 : " + arrayList.get(i).getTradeItem());		
							System.out.println("아이템 가격 : " + arrayList.get(i).getTradePrice());
							System.out.println("아이템 등급 : " + arrayList.get(i).getTradeGrade());		
							System.out.println("착용 클래스 : " + arrayList.get(i).getTradeClass());		
							System.out.println("아이템 강화 : " + arrayList.get(i).getTradeEnchant());				
							System.out.println();
						}
					}
					if(index==-1) {
						System.out.println("아이템이 존재하지 않습니다.");
					}
				}
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}		
		}	
		return null;
	}
}
