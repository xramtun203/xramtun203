package csh.java.tradecenter.command;

public class MemberCommand {
	
	private String memId;
	private String memPasswd;
	private String memName;
	private int memAge;
	private char memSex;
	private String memPnum;
	private String memEmail;
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPasswd() {
		return memPasswd;
	}
	public void setMemPasswd(String memPasswd) {
		this.memPasswd = memPasswd;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemAge() {
		return memAge;
	}
	public void setMemAge(int memAge) {
		this.memAge = memAge;
	}
	public char getMemSex() {
		return memSex;
	}
	public void setMemSex(char memSex) {
		this.memSex = memSex;
	}
	public String getMemPnum() {
		return memPnum;
	}
	public void setMemPnum(String memPnum) {
		this.memPnum = memPnum;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	@Override
	public String toString() {
		return "MemberCommand [memId=" + memId + ", memPasswd=" + memPasswd + ", memName=" + memName + ", memAge="
				+ memAge + ", memSex=" + memSex + ", memPnum=" + memPnum + ", memEmail=" + memEmail + "]";
	}

	 

}
