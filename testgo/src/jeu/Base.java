package jeu;

import java.util.LinkedList;

public class Base {
private LinkedList<LinkedList<String>> goban;
	
	public Base(int l, int h) {
		goban = new LinkedList<LinkedList<String>>();
		for (int i=0;i<h;++i) {
			LinkedList<String> tmp = new LinkedList<>();
			for(int j=0;j<l;++j) {
				tmp.add(j, ".");
//				System.out.println(tmp);
			}
			goban.add(i, tmp);
		}
	}
	
	public LinkedList<LinkedList<String>> get() {
		return goban;
	}
	
	public String showboard() {
		StringBuilder sb = new StringBuilder();
		int taille = Integer.toString(goban.size()).length();
		
		sb.append("=\n");
		String tete = String.format("%"+taille+"s", " ");
		sb.append(tete).append(" ");
		for(int i=0;i<goban.get(0).size();++i) {
			sb.append(Character.toString(65+i)+" ");
		}
		sb.append("\n");
		for (int i=0;i<goban.size();++i) {
			String format = String.format("%"+taille+"s", goban.size()-i);
			
			sb.append(format);
			for(int j=0;j<goban.get(i).size();++j) {
				
				sb.append(" "+goban.get(i).get(j));
			}
			sb.append(" "+(format));
			if(i==goban.size()/2)
				sb.append("\tWHITE (O) has captured "+nbpion("O")+ " stones");
			if(i==(goban.size()/2)+1)
				sb.append("\tBLACK (X) has captured " +nbpion("X")+ " stones");
			sb.append("\n");
		}
		sb.append(tete).append(" ");
		for(int i=0;i<goban.get(0).size();++i) {
			sb.append(Character.toString(65+i)+" ");
		}
		return sb.toString();
	}
	
	private String nbpion(String st) {
		int cpt=0;
		for (int i=0;i<goban.size();++i) {
			for(int j=0;j<goban.get(i).size();++j) {
				if(goban.get(i).get(j).compareTo(st)==0)
					++cpt;
			}
		}
		return Integer.toString(cpt);
	}

	public void poser(int x, int y, String joueur) {
		if(goban.get(x).get(y).compareTo(".")==0) {
			goban.get(x).set(y, joueur);
//			System.out.println(goban.get(x).get(y));
		}
//		else
//			System.out.println("nop");
	}
}
