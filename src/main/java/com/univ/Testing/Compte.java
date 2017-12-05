package com.univ.Testing;

public class Compte {
	
	private float solde;
	
	/**
	 * Credite le compte du montant transmis en argument.
	 * @param credit
	 * @throws Exception si credit <= 0
	 */
	void crediter(float credit) throws Exception{
	}

	float getSolde() {
		return 0;
	}

	/**
	 * Debite le compte de la valeur transmise en argument
	 * @param debit
	 * @return le montant demande si le solde du compte est superieur au montant demande,
	 * retourne la valeur du solde si le solde est inferieur au montant demande. 
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
