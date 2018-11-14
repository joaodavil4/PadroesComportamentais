package ChainOfResponsibility;

import java.util.Scanner;

public class MaquinaDeVendas{
	private CadeiaR c1;
	private Moeda moeda;

	public MaquinaDeVendas() {
		this.c1 = new SlotMoeda1();
		CadeiaR c2 = new SlotMoeda5();
		CadeiaR c3 = new SlotMoeda10();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main (String args[]) {
		MaquinaDeVendas m1 = new MaquinaDeVendas();
		Produto p1 = new Produto("Coca", 2.20);
		double saldo = 0;
		
		while(p1.getPreco()< saldo) {
			double moeda = 5.0;
			Moeda moedaChain = new Moeda(moeda);
			
			m1.c1.dispense(moedaChain);
			

		}
	}
	
}
