package models;

import enums.Categoria;

public class Movimiento {
	private String nombre;
	private TipoPokemon tipo;
	private int maxPP;
	private int actualPP;
	private int damage;
	private double cambiaAttack;
	private double cambiaDef;
	private double cambiaSpAttack;
	private double cambiaspDef;
	private double cambiaSpeed;
	private Estado aplicaEstado;
	private Categoria categoria;
	
	
	
	public Movimiento(String nombre, TipoPokemon tipo, int maxPP, int damage, double cambiaAttack, double cambiaDef,
			double cambiaSpAttack, double cambiaspDef, double cambiaSpeed, Estado aplicaEstado, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.maxPP = maxPP;
		this.damage = damage;
		this.cambiaAttack = cambiaAttack;
		this.cambiaDef = cambiaDef;
		this.cambiaSpAttack = cambiaSpAttack;
		this.cambiaspDef = cambiaspDef;
		this.cambiaSpeed = cambiaSpeed;
		this.aplicaEstado = aplicaEstado;
		this.categoria = categoria;
		this.actualPP=this.maxPP;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

	public int getMaxPP() {
		return maxPP;
	}

	public int getActualPP() {
		return actualPP;
	}

	public int getDamage() {
		return damage;
	}

	public double getCambiaAttack() {
		return cambiaAttack;
	}

	public double getCambiaDef() {
		return cambiaDef;
	}

	public double getCambiaSpAttack() {
		return cambiaSpAttack;
	}

	public double getCambiaspDef() {
		return cambiaspDef;
	}

	public double getCambiaSpeed() {
		return cambiaSpeed;
	}

	public Estado getAplicaEstado() {
		return aplicaEstado;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setActualPP(int actualPP) {
		this.actualPP = actualPP;
	}
	
	
}
