package org.generation.farmacia.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;


	/**
	 * @author BabiLuna
	 * @since 1.1
	 */


	@Entity
	@Table(name = "tb_categoria")
	public class CategoriaModel {

	   
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank
		@Size(min = 2, max = 100)
		private String categoria;
		
		@NotBlank
		@Size(min = 2, max = 500)
		private String descricao;
		
		@NotBlank
		@Size(min = 2, max = 100)
		private String formaPagamento;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getFormaPagamento() {
			return formaPagamento;
		}

		public void setFormaPagamento(String formaPagamento) {
			this.formaPagamento = formaPagamento;
		}
		
		

}
