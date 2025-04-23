package Proyecto4;

import java.time.LocalDate;
import java.util.Objects;

public class Muestra {
    private int id;
    private String tipoAnalisis;
    private double valorNumerico;
    private LocalDate fechaToma;

    public Muestra(int id, String tipoAnalisis, double valorNumerico, LocalDate fechaToma) {
        this.id = id;
        this.tipoAnalisis = tipoAnalisis;
        this.valorNumerico = valorNumerico;
        this.fechaToma = fechaToma;
    }

    public int getId() {
        return id;
    }

    public String getTipoAnalisis() {
        return tipoAnalisis;
    }

    public LocalDate getFechaToma() {
        return fechaToma;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Muestra muestra = (Muestra) obj;
        return Objects.equals(id, muestra.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Muestra [ID=" + id + ", Tipo=" + tipoAnalisis + ", Valor=" + valorNumerico + ", Fecha=" + fechaToma + "]";
    }
}
