package es.anderconal.modelo;

import java.util.Random;

public class AtaqueAleatorio {
	private static String[] ataques = {
			"Onda trueno",
			"Ataque rápido", 
			"Rayo"
	};
	
	public String getAtaque() {
		Random aleatorio = new Random();
		
		return ataques[aleatorio.nextInt(ataques.length)];
	}
}
