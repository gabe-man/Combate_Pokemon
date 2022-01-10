package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {
	private int numero;
	private String nombre;
	private TipoPokemon tipo1;
	private TipoPokemon tipo2;
	private Estado estado;
	private double attack;
	private double defense;
	private double specialAttack;
	private double specialDeffense;
	private double speed;
	private ArrayList<Movimiento> movimientos;
	private int maxHP;
	private double actualHP;
	private int level;
	
	
	
	public Pokemon(int numero, String nombre, TipoPokemon tipo1, TipoPokemon tipo2, double attack, double defense,
			double specialAttack, double specialDeffense, double speed, ArrayList<Movimiento> movimientos, int maxHP,
			int level) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDeffense = specialDeffense;
		this.speed = speed;
		this.movimientos = movimientos;
		this.maxHP = maxHP;
		this.level = level;
		this.actualHP=this.maxHP;
		this.estado=new Estado("none");
	}



	public double getSpeed() {
		return speed;
	}
	
	

	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public double getAttack() {
		return attack;
	}



	public void setAttack(double attack) {
		this.attack = attack;
	}



	public double getDefense() {
		return defense;
	}



	public void setDefense(double defense) {
		this.defense = defense;
	}



	public double getSpecialAttack() {
		return specialAttack;
	}



	public void setSpecialAttack(double specialAttack) {
		this.specialAttack = specialAttack;
	}



	public double getSpecialDeffense() {
		return specialDeffense;
	}



	public void setSpecialDeffense(double specialDeffense) {
		this.specialDeffense = specialDeffense;
	}



	public double getActualHP() {
		return actualHP;
	}



	public void setActualHP(double actualHP) {
		this.actualHP = actualHP;
	}



	public String getNombre() {
		return nombre;
	}



	public TipoPokemon getTipo1() {
		return tipo1;
	}



	public TipoPokemon getTipo2() {
		return tipo2;
	}



	public int getMaxHP() {
		return maxHP;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}

	

	public int getLevel() {
		return level;
	}



	public  void mostrarMovimientos()
	{
		for (int i = 0; i < movimientos.size(); i++) {
			System.out.println((i+1)+". "+movimientos.get(i).getNombre());
		}
	}
	
	public Movimiento elegirMovimiento()
	{
		int eleccion=0;
		Scanner sc=new Scanner(System.in);
		do {
			mostrarMovimientos();
			System.out.println("¿Que movimiento desea utilizar?");
			eleccion=Integer.parseInt(sc.nextLine());
			if(eleccion<1 || eleccion>4)
			{
				System.out.println("No se encuentra disponible esa opción");
			}
			
		} while (eleccion<1 || eleccion>4);
		movimientos.get(eleccion-1).setActualPP(movimientos.get(eleccion-1).getActualPP()-1);
		return movimientos.get(eleccion-1);
	}
}
