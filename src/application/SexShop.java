package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Acessorios;
import entities.Cliente;
import entities.Gel;
import entities.Oleo;
import entities.Pedido;
import entities.Produto;
import entities.Vibradores;
import entities.enums.TipoLubrificantes;
import entities.enums.TipoProdutos;
import services.Credito;
import services.taxaPadrao;

public class SexShop {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos= new ArrayList<>();
				
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		System.out.println("Cadastrar Cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Sexo (masculino/feminino): ");
		String sexo = sc.nextLine();
		System.out.print("dataNascimento? (dd/MM/yyyy): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(name, sexo, dataNascimento);
		System.out.println(cliente);
		System.out.println();
		
		char ch = 'y';
		do {
		sc.nextLine();
		System.out.println("Qual nome do produto");
		String produto = sc.nextLine();		
		System.out.println("Quantas unidades?");
		int unid = sc.nextInt();
		System.out.println("Qual tipo do produto?(ACESSORIOS/VIBRADORES/LUBRIFICANTES)");
		TipoProdutos tipoProduto = TipoProdutos.valueOf(sc.next().toUpperCase()); 
		
		if(tipoProduto == TipoProdutos.valueOf("ACESSORIOS")) {	
			System.out.println("Qual o material?");
			sc.nextLine();
			String material = sc.nextLine();
			produtos.add(new Acessorios(produto, unid, tipoProduto, material));
		}else if(tipoProduto == TipoProdutos.valueOf("VIBRADORES")){
			System.out.println("Qual o tamanho?");
			sc.nextLine();
			String tamanho = sc.nextLine();
			produtos.add(new Vibradores(produto, unid, tipoProduto, tamanho));
		}else {
			System.out.println("Qual tipo de lubrificante?(GEL/OLEO)");
			TipoLubrificantes tipoLubrificantes = TipoLubrificantes.valueOf(sc.next().toUpperCase()); 
			System.out.println("Qual o volume?");
			int volume = sc.nextInt();
			if(tipoLubrificantes == TipoLubrificantes.valueOf("GEL")) {	
				System.out.println("É comestível ? (true/false)");
				boolean comestivel = sc.nextBoolean();
				produtos.add(new Gel(produto, unid, tipoProduto, tipoLubrificantes, volume, comestivel));
			}else {
				System.out.println("Qual cheiro ?");
				sc.nextLine();
				String cheiro = sc.nextLine();
				produtos.add(new Oleo(produto, unid, tipoProduto, tipoLubrificantes, volume, cheiro));
			}
		}
		System.out.println("Deseja mais um produto? (y/n)");
		ch = sc.next().toLowerCase().charAt(0);
		}while(ch == 'y');
		
		Pedido pedido = new Pedido(cliente,produtos,new taxaPadrao(), new Credito());
	
		System.out.println("R$ " + pedido.processamentoPedido());
				
		}catch (ParseException e) {
			System.out.println("Você digitou a data no formato errado! " + e);
		}catch (InputMismatchException e) {
			System.out.println("Você digitou um valor diferente do esperado! ");
		}
		sc.close();
		}
	

}
