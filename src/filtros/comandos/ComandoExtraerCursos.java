package filtros.comandos;

import java.util.ArrayList;

import filtros.Filtros;
import util.GeneradorSQL;

public class ComandoExtraerCursos extends ComandoFiltro {

	public ComandoExtraerCursos(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String ejecutar(Filtros filtro) {
		ArrayList<String> cursos = filtro.extraerCursos();
		StringBuilder out = new StringBuilder();

		out.append(GeneradorSQL.comentar("Extracción de cursos"));
		out.append(GeneradorSQL.insertarCurso(cursos));

		return out.toString();
	}
}
