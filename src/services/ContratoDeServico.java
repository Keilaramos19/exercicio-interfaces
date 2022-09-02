package services;

import java.util.Date;
import java.util.Calendar;


import entities.Contrato;
import entities.Parcela;

public class ContratoDeServico {
private ServiçoDePagamentoOnline serviçoDePagamentoOnline;
	
		public ContratoDeServico(ServiçoDePagamentoOnline serviçoDePagamentoOnline) {
	       		this.serviçoDePagamentoOnline=serviçoDePagamentoOnline;
	}
	
	public void processoContrato(Contrato cont, int meses) {
		   double cotaBasica= cont.getValorTotal()/ meses;
	for(int i=1; i<=meses; i++) {
		Date data=addMonths(cont.getData(),i);
		 double cotaAtualizada = cotaBasica + serviçoDePagamentoOnline.juros(cotaBasica, i);
         double cotaCompleta =  cotaAtualizada + serviçoDePagamentoOnline.pagamentoDeTaxa(cotaAtualizada);
         cont.addParcela(new Parcela(date, cotaCompleta));
	}
	}
	
	private Date addMonths(Date data, int n) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH,n);
		return cal.getTime();
	}
}
