package com.univ.Testing;

public class Compte {
	
	private float solde;
	
	/**
	 * Credite le compte du montant donné en argument.
	 * @param credit
	 * @throws Exception si credit <= 0
	 */
	void crediter(float credit) throws Exception{
	}

	float getSolde() {
		return 0;
	}

	/**
	 * Débite le compte de la valeur donnée en argument
	 * @param debit
	 * @return le montant demandé si le solde du compte est supérieur au montant demandé,
	 * retourne la valeur du solde si le solde est inférieur au montant demandé. 
	 * @throws Exception si debit < 20 ou si debit > 1000 euros.
	 */
	float debiter(float debit) throws Exception{
		return 0;
	}
	
	/**
	 * Reinitialise
	 * @param solde
	 * @throws Exception si solde <= 0
	 */
	void setSolde(float solde) throws Exception{
	}


}
