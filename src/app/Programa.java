package app;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import entities.Contrato;
import entities.Parcela;
import services.ContratoDeServico;
import services.ServiçoDePayPal;

public class Programa {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Digite os dados do contrato:");
		System.out.print("Número:");
		int numero=sc.nextInt();
		System.out.print("Data(dd/MM/yyyy): ");
		Date date=sdf.parse(sc.next());
		System.out.print("Valor do Contrato:");
		double valorTotal=sc.nextDouble();
		
		Contrato cont=new Contrato(numero, date, valorTotal);
		
		System.out.print("Digite o número de parcelas");
		int n=sc.nextInt();
		
		ContratoDeServico contratoDeServico= new ContratoDeServico(new ServiçoDePayPal());
		
		ContratoDeServico.processoContrato(cont,n);
		
		System.out.println("Parcelas:");
		for(Parcela x:cont.getParcelas()) {
			System.out.println(x);
			
		}
		sc.close();
	}

}
