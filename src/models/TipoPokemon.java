package models;

public class TipoPokemon {
	//atributos
	private String nombre;
	
	
	public TipoPokemon(String nombre) {
		super();
		this.nombre = nombre;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}
	
	//metodos
	public double getEfectividad(TipoPokemon tipo)
	{
		double efectividad=1;
		if(tipo.getNombre().equals("acero"))
		{
			if(this.nombre.matches("acero|agua|el�ctrico|fuego"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("hada|hielo|roca"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("agua"))
		{
			if(this.nombre.matches("agua|drag�n|planta"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("fuego|roca|tierra"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("bicho"))
		{
			if(this.nombre.matches("acero|fantasma|fuego|hada|lucha|veneno|volador"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("planta|ps�quico|siniestro"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("drag�n"))
		{
			if(this.nombre.matches("acero"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("drag�n"))
			{
				efectividad= 2;
			}
			else if(this.nombre.matches("hada"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("el�ctrico"))
		{
			if(this.nombre.matches("drag�n|el�ctrico|planta"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("agua|volador"))
			{
				efectividad= 2;
			}
			else if(this.nombre.matches("tierra"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("fantasma"))
		{
			if(this.nombre.matches("siniestro"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("fantasma|ps�quico"))
			{
				efectividad= 2;
			}
			else if(this.nombre.matches("normal"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("fuego"))
		{
			if(this.nombre.matches("agua|drag�n|fuego|roca"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("acero|bicho|hielo|planta"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("hada"))
		{
			if(this.nombre.matches("acero|fuego|veneno"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("drag�n|lucha|siniestro"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("hielo"))
		{
			if(this.nombre.matches("acero|agua|fuego|hielo"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("drag�n|planta|tierra|volador"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("lucha"))
		{
			if(this.nombre.matches("bicho|hada|ps�quico|veneno|volador"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("acero|hielo|normal|roca|siniestro"))
			{
				efectividad= 2;
			}
			else if(this.nombre.matches("fantasma"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("normal"))
		{
			if(this.nombre.matches("acero|roca"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("fantasma"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("planta"))
		{
			if(this.nombre.matches("acero|bicho|drag�n|fuego|planta|veneno|volador"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("agua|roca|tierra"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("ps�quico"))
		{
			if(this.nombre.matches("aacero|ps�quico"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("lucha|veneno"))
			{
				efectividad= 2;
			}
			else if(this.nombre.matches("siniestro"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("roca"))
		{
			if(this.nombre.matches("acero|lucha|tierra"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("bicho|fuego|hielo|volador"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("siniestro"))
		{
			if(this.nombre.matches("hada|lucha|siniestro"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("fantasma|ps�quico"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("tierra"))
		{
			if(this.nombre.matches("bicho|planta"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("acero|el�ctrico|fuego|ps�quico|veneno"))
			{
				efectividad= 2;
			}
			else if(this.nombre.matches("volador"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("veneno"))
		{
			if(this.nombre.matches("fantasma|roca|tierra|veneno"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("hada|planta"))
			{
				efectividad= 2;
			}
			else if(this.nombre.matches("acero"))
			{
				efectividad= 0;
			}
			else
			{
				efectividad= 1;
			}
		}
		else if(tipo.getNombre().equals("volador"))
		{
			if(this.nombre.matches("acero|el�ctrico|roca"))
			{
				efectividad= 0.5;
			}
			else if(this.nombre.matches("bicho|lucha|planta"))
			{
				efectividad= 2;
			}
			else
			{
				efectividad= 1;
			}
		}
		else
		{
			efectividad=1;
		}
		return efectividad;
	}
}
