package ChainOfResponsibility;

public class SlotMoeda10 implements CadeiaR {

		private CadeiaR chain;
		private int qntMoedas;
		
		@Override
		public void setNextChain(CadeiaR nextChain) {
			this.chain=nextChain;
		}


		@Override
		public void dispense(Moeda moeda) {
			if(moeda.getTipo() == 1) {
				qntMoedas++;
				System.out.println("Registrado " + qntMoedas + " moedas de 10 centavos");
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


