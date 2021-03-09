package com.jackson.cursomc.domain.enums;



public enum EstadoPagamento {

	Pendente(1, "Pendente" ),
	Quitado(2, "Quitado"),
	Cancelado(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento (int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;

	}
   public int getcod() {
	   return cod;
	   
   }
   public String getdescricao() {
	   return descricao;
	   
   }
   public static EstadoPagamento toEnum(Integer cod) {
	   
	   if (cod == null) {
		   return null;
	   }
	   for (EstadoPagamento x : EstadoPagamento.values()) {
		   if (cod.equals(x.getcod())) {
			   return x;
			   
		   }
	   }
	   throw new IllegalArgumentException("Id inválido:" + cod);
   }
}
