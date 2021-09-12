package csh.java.tradecenter.control;

import java.util.ArrayList;
import java.util.Scanner;

import csh.java.tradecenter.command.MemberCommand;

public interface MemberAction {
	ArrayList<MemberCommand> arrayList = new ArrayList<MemberCommand>();
	public MemberCommand excute (Scanner scanner);

}
