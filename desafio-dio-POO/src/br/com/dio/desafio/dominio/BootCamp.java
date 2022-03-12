package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String descricao;
    private final LocalDate dataiInit = LocalDate.now();
    private final LocalDate dataFim = dataiInit.plusDays(45);
    private Set<Dev> devsinscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataiInit() {
        return dataiInit;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDevsinscritos() {
        return devsinscritos;
    }

    public void setDevsinscritos(Set<Dev> devsinscritos) {
        this.devsinscritos = devsinscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataiInit, bootCamp.dataiInit) && Objects.equals(dataFim, bootCamp.dataFim) && Objects.equals(devsinscritos, bootCamp.devsinscritos) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataiInit, dataFim, devsinscritos, conteudos);
    }
}
