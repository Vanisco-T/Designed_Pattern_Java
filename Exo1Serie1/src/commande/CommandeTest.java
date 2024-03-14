package commande;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import livraison.Model1;
import livraison.Model2;

class CommandeTest {

	@Test
	void test() {
		Model1 m1= new Model1();
		Commande c1= new Commande(200,3,m1);
		assertEquals(c1.calculerCoutLivraison(),200*0.1);
		Model2 m2= new Model2();
		Commande c2= new Commande(200,3,m2);
		assertEquals(c2.calculerCoutLivraison(),9);
	}

}
