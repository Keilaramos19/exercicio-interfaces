package services;

public class ServiçoDePayPal implements ServiçoDePagamentoOnline{
	private static final double FEE_PERCENTAGE=0.02;
	private static final double MONTHLY_INTEREST=0.01;
	
	@Override
	public double pagamentoDeTaxa(double quantia) {
		return quantia*FEE_PERCENTAGE;
	}
	@Override
	public double juros(double quantia, int meses) {
		
		return quantia*MONTHLY_INTEREST;
	
	}

}
