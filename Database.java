package util;

import Modelo.Alumno;
import Modelo.Anio;
import Modelo.Curso;

public class Database {
	
	private Alumno [] Alumnos = new Alumno [5];
	private Curso ekis = null;
	private Anio este = null;

	 public Database(){
		 ekis = new Curso();
		 ekis.setNombre("codo a codo");
		 
		 este = new Anio();
		 este.setFecha("23/07/2017");
		 
		 Alumno Axell = new Alumno();
		 Axell.setAnio(este);
		 Axell.setCurso(ekis);
		 Axell.setNombre("Axell");
		 Axell.setEdad(33);
		 Axell.setMatricula(12345678);
		 
		 Alumno Joseph = new Alumno ();
		  Joseph.setAnio(este);
		 Joseph.setCurso(ekis);
		 Joseph.setNombre("Joseph");
		 Joseph.setEdad (33);
		 Joseph.setMatricula(12345678);
		 
		 Alumno tatiana = new tatiana ();
		  tatiana.setAnio(este);
		 tatiana.setCurso(ekis);
		 tatiana.setNombre("tatiana");
		 tatiana.setEdad (33);
		 tatiana.setMatricula(12345678);
		 
		 
		 Alumno Agustin = new Agustin ();
		 Agustin.setAnio(este);
		 Agustin.setCurso(ekis);
		 Agustin.setNombre("Agustin");
		 Agustin.setEdad (33);
		 Agustin.setMatricula(12345678);
		 
		 Alumno Alexis = new Alexis ();
		 Alexis.setAnio(este);
		 Alexis.setCurso(ekis);
		 Alexis.setNombre("Alexis");
		 Alexis.setEdad (33);
		 Alexis.setMatricula(12345678);
		 
		 

		  Alumnos[0] = Axell; 
		  Alumnos[1]= Joseph;
		  Alumnos[2] = tatiana;
		  Alumnos[3] = Agustin;
		  Alumnos[4] = Alexis;
			
	 }
}