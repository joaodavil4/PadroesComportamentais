package ChainOfResponsibility;

public class Moeda1 implements CadeiaR {

		private CadeiaR chain;
		private int qntMoedas;
		
		@Override
		public void setNextChain(CadeiaR nextChain) {
			this.chain=nextChain;
		}

		@Override
		public void dispense(Moeda moeda) {
			if(moeda.getTipo() == 1){
				saldo
				int num = saldo.getAmount();
				int remainder = saldo.getAmount() % 1;
				System.out.println("Registrado "+num+" moedas de 1 centavo");
				if(remainder !=0) this.chain.dispense(new Saldo(remainder));
			}else{
				this.chain.dispense(saldo);
			}
		}

	}
}
