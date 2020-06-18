package it.dstech.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Digimon implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int vita;
	private double attacco;
	private double difesa;
	private double resistenza;
	private String evoluzione;

	public Digimon() {
	}

	public Digimon(Long id, String nome, int vita, double attacco, double difesa, double resistenza,
			String evoluzione) {
		this.id = id;
		this.nome = nome;
		this.vita = vita;
		this.attacco = attacco;
		this.difesa = difesa;
		this.resistenza = resistenza;
		this.evoluzione = evoluzione;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}

	public double getAttacco() {
		return attacco;
	}

	public void setAttacco(double attacco) {
		this.attacco = attacco;
	}

	public double getDifesa() {
		return difesa;
	}

	public void setDifesa(double difesa) {
		this.difesa = difesa;
	}

	public double getResistenza() {
		return resistenza;
	}

	public void setResistenza(double resistenza) {
		this.resistenza = resistenza;
	}

	public String getEvoluzione() {
		return evoluzione;
	}

	public void setEvoluzione(String evoluzione) {
		this.evoluzione = evoluzione;
	}
		

	
	
	}