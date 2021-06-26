package net.ufjnet.gestaoobra.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "SUBITENS")
public class SubItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_subitem")
	private Integer codigo ;
	
	
	@Column(name = "descricao_subitem", nullable = false)
	private String descricao;
	
		
	@Column(name = "complemento_subitem")
	private String complemento;
	
	
	@ManyToOne()
	private Item item;
	
	@OneToMany(mappedBy = "subitem")
	private Set<Lancamento> lancamentos;

	public SubItem(Integer codigo, String descricao, String complemento, Item item) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.complemento = complemento;
		this.item = item;
	}
	
	
	
}