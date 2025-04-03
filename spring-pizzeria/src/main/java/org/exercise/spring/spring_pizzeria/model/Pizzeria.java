package org.exercise.spring.spring_pizzeria.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "pizze")
public class Pizzeria {

    // variabili d'istanza(colonne tabella)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    @Lob
    private String descrizione;

    @Lob
    private String foto;

    @NotBlank
    private BigDecimal prezzo;

    // getter e setter
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizionen(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                ", nome=" + getNome() +
                ", descrizione=" + getDescrizione() +
                ", foto=" + getFoto() +
                ", prezzo=" + getPrezzo();
    }

}
