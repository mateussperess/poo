package exercicio_04;

public class Main {
	public static void main(String[] args) {
		
		Entrega entrega01 = new Entrega(TipoEntrega.ENTREGA_EXPRESSA, "Mateus");
		Entrega entrega02 = new Entrega(TipoEntrega.ENTREGA_NORMAL, "Ana Laura");
		Entrega entrega03 = new Entrega(TipoEntrega.RETIRADA_LOJA, "Jeremias");
		
		String prazoEntrega01 = imprimirPrazo(entrega01);
		String prazoEntrega02 = imprimirPrazo(entrega02);
		String prazoEntrega03 = imprimirPrazo(entrega03);
		
		System.out.println("Prazo da entrega 1: " + prazoEntrega01);
		System.out.println("Prazo da entrega 2: " + prazoEntrega02);
		System.out.println("Prazo da entrega 3: " + prazoEntrega03);

	}
	
	public static String imprimirPrazo(Entrega entrega) {
		String response = "";
		if (entrega.getTipoEntrega() == TipoEntrega.ENTREGA_NORMAL) {
			response = "5 dias úteis";
		} else if (entrega.getTipoEntrega() == TipoEntrega.ENTREGA_EXPRESSA) {
			response = "1 dia útil";
		} else {
			response = "Entrega Imediata";
		}
		
		return response;
	}
}
