package Proyecto4;

	import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


	public class Laboratorio {
	    private Set<Muestra> muestras;

	    public Laboratorio() {
	        this.muestras = new HashSet<>();
	    }

	    public boolean registrarMuestra(Muestra muestra) {
	        return muestras.add(muestra); // evita duplicado
	    }

	    public List<Muestra> consultarPorFecha(LocalDate fecha) {
	        List<Muestra> resultados = new ArrayList<>();
	        for (Muestra muestra : muestras) {
	            if (muestra.getFechaToma().equals(fecha)) {
	                resultados.add(muestra);
	            }
	        }
	        return resultados;
	    }

	    public List<Muestra> consultarPorTipo(String tipoAnalisis) {
	        List<Muestra> resultados = new ArrayList<>();
	        for (Muestra muestra : muestras) {
	            if (muestra.getTipoAnalisis().equalsIgnoreCase(tipoAnalisis)) {
	                resultados.add(muestra);
	            }
	        }
	        return resultados;
	    }
	}
