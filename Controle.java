package org.fatec;

import java.util.Scanner;

public class Controle {
	private Scanner leitor;
	// é o input tipo do paitom
	
	
	public Controle() {
		leitor = new Scanner(System.in);
	}

	public synchronized int opcao() {
		int op = leitor.nextInt();
		leitor = leitor.reset();
		return op;
	}

	public synchronized String texto() {
		leitor = new Scanner(System.in);
		String t = leitor.nextLine();
		leitor = leitor.reset();
		return t;
	}

	@Override
	protected void finalize() throws Throwable {
		leitor.close();
	}
}