package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private Integer numero;
	private Date data;
	private double valorTotal;
	
	private List<Parcela> parcelas= new ArrayList<>();

	public Contrato(Integer numero, Date data, double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}
	public void addParcela(Parcela parcela) {
		parcelas.add(parcela);
	}
	public void removeParcela(Parcela parcela) {
		parcelas.remove(parcela);
	}

}
