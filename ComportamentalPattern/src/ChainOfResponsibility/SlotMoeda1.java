package ChainOfResponsibility;

public class SlotMoeda1 implements CadeiaR {

		private CadeiaR chain;
		private int qntMoedas;
		private Saldo saldo;
		
		@Override
		public void setNextChain(CadeiaR nextChain) {
			this.chain=nextChain;
		}


		@Override
		public void dispense(Moeda moeda) {
			if(moeda.getTipo() == 1) {
				qntMoedas++;
				saldo.addGrana(moeda.getTipo());
				System.out.println("Registrado " + qntMoedas + " moedas de 1 centavo");
			}
			else {
				this.chain.dispense(moeda);
			}
			// TODO Auto-generated method stub
			
		}


		@Override
		public int qntMoedas() {
			// TODO Auto-generated method stub
			return qntMoedas;
		}
		


	}

