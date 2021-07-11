package net.ufjnet.gestaoobra.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "PROPRIETARIOS")
public class Proprietario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_prop")
	private Integer codigo ;
	
	
	@Column(name = "nome_prop", nullable = false)
	private String nome;
	
	
	@Column(name = "cpf_prop", nullable = false)
	private String cpf;
	
	
	@Column(name = "email_prop", nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "proprietario")
	private List<Obra> obras = new ArrayList<>();
	
	
	public Proprietario(Integer codigo, String nome, String cpf, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		
	}
	
}