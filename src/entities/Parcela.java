package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Parcela {
	private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

	private Date dataDeVencimento;
	private double quantia;
	
	public Parcela(Date dataDeVencimento, double quantia) {
		this.dataDeVencimento = dataDeVencimento;
		this.quantia = quantia;
	}

	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public double getQuantia() {
		return quantia;
	}

	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}

	@Override
	public String toString() {
		return sdf.format(dataDeVencimento)+"."+ String.format("%.2", quantia);
	}
	
}
