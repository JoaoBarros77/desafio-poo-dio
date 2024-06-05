package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Mentoria extends Conteudo{

    private LocalDate data;
    private Set<Dev> devsInscritos = new HashSet<>();
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() +
                ", Descricao: " + getDescricao() +
                " data: " + data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return Objects.equals(data, mentoria.data) && Objects.equals(devsInscritos, mentoria.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, devsInscritos);
    }
}
