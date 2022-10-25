package ua.Paton;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("2)");
        System.out.print("x = ");  
		float x = scan.nextFloat();
        System.out.print("y = ");  
		float y = scan.nextFloat();
		if(x%1 < y%1) {
			System.out.println("Остаток y більш");
		}else {
			System.out.println("Остаток x більш");
		}
		System.out.println("3)");
		scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan = new Scanner(s);
		float i = (float) -0.9913145, j = 0;
		String con = null;
		while (scan.hasNext()) {
            if (scan.hasNextFloat()) {
                if(i == (float)-0.9913145) {
                	i = scan.nextFloat();
                	continue;
                }
                j = scan.nextFloat();
            }
            else {
                con = scan.next();
            }
        }
		boolean b = false;
		if(con.equals("==")) {
			b = (i == j);
		}else if(con.equals(">=")) {
			b = (i >= j);
		}else if(con.equals("<=")) {
			b = (i <= j);
		}else if(con.equals(">")) {
			b = (i > j);
		}else if(con.equals("<")) {
			b = (i < j);
		}
		System.out.println((b == true) ? "ТАК" : "НІ");
	}
}
