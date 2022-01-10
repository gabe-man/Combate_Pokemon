package models;

import enums.Categoria;

public class Combate {
	private Entrenador entrenador1;
	private Entrenador entrenador2;
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	
	
	
	public Combate(Pokemon pokemon1, Pokemon pokemon2) {
		super();
		this.pokemon1 = pokemon1;
		this.pokemon2 = pokemon2;
		this.entrenador1=null;
		this.entrenador2=null;
	}
	
	

	public Pokemon getPokemon1() {
		return pokemon1;
	}



	public Pokemon getPokemon2() {
		return pokemon2;
	}



	public Pokemon primeroEnTurno()
	{
		if(pokemon1.getSpeed()>=pokemon2.getSpeed())
		{
			return pokemon1;
		}
		else
		{
			return pokemon2;
		}
	}
	
	public Pokemon segundoEnTurno()
	{
		if(pokemon1.getSpeed()>=pokemon2.getSpeed())
		{
			return pokemon2;
		}
		else
		{
			return pokemon1;
		}
	}
	
	public void aplicarMovimiento(Movimiento movimiento, Pokemon usuario, Pokemon objetivo)
	{
		double daño=0;
		double Stab=1;
		double burn=1;
		if (movimiento.getTipo().equals(usuario.getTipo1())||movimiento.getTipo().equals(usuario.getTipo2()))
		{
			Stab=1.5;
		}
		if(usuario.getEstado().getNombre().equals("quemado"))
		{
			burn=0.5;
		}
		if(movimiento.getDamage()==0)
		{
			daño=0;
		}
		else
		{
			if(movimiento.getCategoria().equals(Categoria.Fisico))
			{
				daño=(((2*usuario.getLevel()/5+2)*movimiento.getDamage()*(usuario.getAttack()/objetivo.getDefense()))/50+2)*Stab*objetivo.getTipo1().getEfectividad(movimiento.getTipo())*objetivo.getTipo2().getEfectividad(movimiento.getTipo())*burn;
			}
			else if(movimiento.getCategoria().equals(Categoria.Especial))
			{
				daño=(((2*usuario.getLevel()/5+2)*movimiento.getDamage()*(usuario.getSpecialAttack()/objetivo.getSpecialDeffense()))/50+2)*Stab*objetivo.getTipo1().getEfectividad(movimiento.getTipo())*objetivo.getTipo2().getEfectividad(movimiento.getTipo())*burn;
			}
		}
		objetivo.setActualHP(objetivo.getActualHP()-daño);
		if(objetivo.getActualHP()<0)
		{
			objetivo.setActualHP(0);
		}
		objetivo.setAttack(objetivo.getAttack()*movimiento.getCambiaAttack());
		objetivo.setDefense(objetivo.getDefense()*movimiento.getCambiaDef());
		objetivo.setEstado(movimiento.getAplicaEstado());
		objetivo.setSpecialAttack(objetivo.getSpecialAttack()*movimiento.getCambiaSpAttack());
		objetivo.setSpecialDeffense(objetivo.getSpecialDeffense()*movimiento.getCambiaspDef());
		objetivo.setSpeed(objetivo.getSpeed()*movimiento.getCambiaSpeed());
	}
	
	public boolean isFinished()
	{
		if(pokemon1.getActualHP()==0 || pokemon2.getActualHP()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
