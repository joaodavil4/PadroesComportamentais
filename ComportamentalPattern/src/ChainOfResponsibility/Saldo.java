package ChainOfResponsibility;

public class Saldo {

		private double grana;
		
		public Saldo(double grana){
			this.grana = grana;
		}
		
		public double getAmount(){
			return grana;
		}
		
		public void addGrana(double moeda) {
			this.grana = moeda;
		}
		

	
}
