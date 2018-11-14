package ChainOfResponsibility;

public class SlotMoeda5 implements CadeiaR {

		private CadeiaR chain;
		private int qntMoedas;
		
		@Override
		public void setNextChain(CadeiaR nextChain) {
			this.chain=nextChain;
		}


		@Override
		public void dispense(Moeda moeda) {
			if(moeda.getTipo() == 5) {
				qntMoedas++;
				System.out.println("Registrado " + qntMoedas + " moedas de 5 centavos");
			}
			else {
				this.chain.dispense(moeda);
			}
			// TODO Auto-generated method stub
			
		}

		@Override
		public int qntMoedas() {
			return qntMoedas;
		}
		


	}

