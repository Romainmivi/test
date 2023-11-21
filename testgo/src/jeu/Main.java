package jeu;

import java.util.Scanner;

public class Main {
//	private static boolean Analyse(String elt) {
//		if(elt.compareTo("exit")==0) {
//			System.out.println("coucou");
//			return true;
//		}
//		if(elt.compareTo("show")==0) {
//			System.out.println(show());
//		}
//		return false;
//	}
	
	private static void Lecture(Base b) {
		Scanner sc = new Scanner(System.in);
		int cmp=0;
		while(true) {
			System.out.println(cmp);
			String str = sc.nextLine();
			String[] mots = str.split(" ");
			System.out.println(mots[0]);
//			if(Analyse(str));
//			System.out.println("");
			if(mots[0].compareTo("exit")==0) {
				System.out.println("coucou");
			}
			else if(mots[0].compareTo("showboard")==0) {
				System.out.println(b.showboard());
			}
			else if(mots[0].compareTo("play")==0) {
				System.out.println("r");
				if(mots.length==4) {
					if(mots[1].compareTo("white")==0) {
						b.poser((b.get().size()-1)-0,0, "O");
						System.out.println("O");
					}
					else if(mots[1].compareTo("black")==0) {
						System.out.println("X");
						b.poser((b.get().size()-1)-0,0, "X");
					}
	//				cmp = (cmp+1)%2;
				}
			}
		}
	}
	
	public static void main(String[] args) {
//		GobanPoint g = new GobanPoint();
//		System.out.println(g.Afficher());
		System.out.println((int)(9.5));
		Base b = new Base(9, 9);
		Lecture(b);
	}
}
