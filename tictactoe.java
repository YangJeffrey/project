import java.util.Scanner;
public class tictactoe {
	
	static String[] ttt = {"0","1","2","3","4","5","6","7","8"};
	static String turn = "x";

	static void method() {
		
		System.out.print("[" + ttt[0] + "]");
		System.out.print("[" + ttt[1] + "]");
		System.out.println("[" + ttt[2] + "]");

		System.out.print("[" + ttt[3] + "]");
		System.out.print("[" + ttt[4] + "]");
		System.out.println("[" + ttt[5] + "]");

		System.out.print("[" + ttt[6] + "]");
		System.out.print("[" + ttt[7] + "]");
		System.out.println("[" + ttt[8] + "]");
		
		System.out.println(turn + " move");
		
		Scanner input = new Scanner(System.in);
		int move = input.nextInt();
		ttt[move] = turn;

		if (ttt[0].equals(ttt[1]) && ttt[1].equals(ttt[2]) ||
				ttt[3].equals(ttt[4]) && ttt[4].equals(ttt[5]) ||
				ttt[6].equals(ttt[7]) && ttt[7].equals(ttt[8]) ||
				ttt[0].equals(ttt[3]) && ttt[3].equals(ttt[6]) ||
				ttt[1].equals(ttt[4]) && ttt[4].equals(ttt[7]) ||
				ttt[2].equals(ttt[5]) && ttt[5].equals(ttt[8]) ||
				ttt[0].equals(ttt[4]) && ttt[4].equals(ttt[8]) ||
				ttt[2].equals(ttt[4]) && ttt[4].equals(ttt[6])) { 
			System.out.println(turn + " won!");
		}
		
		if (turn.equals("x")) {
			turn = "o";
		} else {
			turn = "x";
		}
		}
	
public static void main(String args[]) {
	
	String turn = "x";
	for (int i = 0; i < 9; i++) {
		method();
	}
System.out.println("tie!");
		}
	
	}
