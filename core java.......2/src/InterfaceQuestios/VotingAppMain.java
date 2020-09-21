package InterfaceQuestios;

import java.util.Scanner;

public class VotingAppMain {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Kids ki=new Kids(11,"kids");
		ki.registerUser();
		ki.registerVotingNumber();
		
		
		
		Adults ad=new Adults(23,"adults");
		ad.registerUser();
		ad.registerVotingNumber();
	}

}
