package es.anderconal.modelo;

import org.springframework.stereotype.Component;

@Component
public class Pokemon {
	private String id="Pikachu";
	private String ataque="Impactrueno";
	
	public void setId(String id) {
		this.id = id;
	}
	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}
	
	public void atacar() {
		System.out.println(id + ", ¡" + ataque + "!");
	}
}
