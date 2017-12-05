package com.univ.Testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCreationCompte() {
		Compte compte = new Compte();
		float solde = compte.getSolde();
		Assert.assertTrue(solde == 0);
	}

}
