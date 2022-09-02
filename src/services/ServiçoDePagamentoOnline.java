package services;

public interface ServiçoDePagamentoOnline {

	double pagamentoDeTaxa(double quantia);
	double juros(double quantia,int meses);
}
