package csh.java.tradecenter.control;

import java.util.ArrayList;
import java.util.Scanner;

import csh.java.tradecenter.command.TradeCommand;

public interface TradeAction {
	ArrayList<TradeCommand> arrayList = new ArrayList<TradeCommand>();
	public TradeCommand excute(Scanner scanner);

}
