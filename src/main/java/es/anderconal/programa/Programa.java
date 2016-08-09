package es.anderconal.programa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.anderconal.modelo.Pokemon;

public class Programa {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("es/anderconal/bean/beans.xml");
		
		Pokemon pokemon = (Pokemon) context.getBean("pikachu");
		
		pokemon.atacar();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}