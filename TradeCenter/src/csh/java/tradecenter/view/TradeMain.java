package csh.java.tradecenter.view;

import java.util.Scanner;

import javax.management.loading.MLet;

import csh.java.tradecenter.service.TradeDelete;
import csh.java.tradecenter.service.TradeInsert;
import csh.java.tradecenter.service.TradeList;
import csh.java.tradecenter.service.TradeListDetail;
import csh.java.tradecenter.service.TradeUpdate;



public class TradeMain {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("아이템 거래소");
			System.out.println("1. 전체조회  2. 등록  3. 수정");
			System.out.println("4. 삭제  5. 상세조회  6. 종료 ");
			System.out.print("번호 입력 : ");
			
			String sel = scanner.next();
			System.out.println();
			
			switch (sel) {
			case "1" :
				TradeList tradeList = new TradeList();
				tradeList.excute(scanner);
				break;
			case "2":
				TradeInsert tradeInsert = new TradeInsert();
				tradeInsert.excute(scanner);
				break;
			case "3":
				TradeUpdate tradeUpdate = new TradeUpdate();
				tradeUpdate.excute(scanner);
				break;
			case "4":
				TradeDelete tradeDelete = new TradeDelete();
				tradeDelete.excute(scanner);
				break;
			case "5":
				TradeListDetail tradeListDetail = new TradeListDetail();
				tradeListDetail.excute(scanner);
				break;
			case "6":
				System.out.println("종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("번호를 다시 입력해주세요.");
				break;
			}
		}
	}
}
