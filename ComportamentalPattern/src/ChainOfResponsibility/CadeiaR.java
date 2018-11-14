package ChainOfResponsibility;

	public interface CadeiaR {
		

		void setNextChain(CadeiaR nextChain);
		
		void dispense(Moeda moeda);
		
		int qntMoedas();
}
