package Main;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.conta = 841523;
		c1.cpf = "15241521474";
		c1.dataDeNascimento = 12021995;
		c1.email = "pedro.barros@gmail.com";
		c1.enderco = "Av. Boa Viagem";
		c1.nome = "Pedro";
		c1.telefone = 997544214;
		
		System.out.println("conta: " + c1.conta);
		System.out.println("cpf: " + c1.cpf);
		System.out.println("data de nascimento: " + c1.dataDeNascimento);
		System.out.println("email: " + c1.email);
		System.out.println("endereço: " + c1.email);
		System.out.println("nome: " + c1.nome);
		System.out.println("telefone: " + c1.telefone);
			
	
		Agencia a1 = new Agencia();
		
		a1.numeroAgencia = 85412;
		
		System.out.println("\nagencia: " + a1.numeroAgencia);
		
		Transacoes t1 = new Transacoes();
		
		t1.codigoDeBarras = "000008451231440000469464356000000";
		t1.conta = 841523;
		t1.idTransacao = 45515452;
		t1.dataHora = "260520231530";
		t1.valor = 21.56;
		t1.idDoDestinatario = "Boa Viagem";
		
		System.out.println("\ncodigo de barras: " + t1.codigoDeBarras);
		System.out.println("conta: " + t1.conta);
		System.out.println("transações: " + t1.idTransacao);
		System.out.println("data e hora: " + t1.dataHora);
		System.out.println("valor: " + t1.valor);
		System.out.println("dentinatário: " + t1.idDoDestinatario);
			
	}

}
