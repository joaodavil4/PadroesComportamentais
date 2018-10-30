package ChainOfResponsibility;

	public interface CadeiaR {

		void setNextChain(CadeiaR nextChain);
		
		void dispense(Saldo cur);
}
