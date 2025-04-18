package org.exercise.spring.spring_pizzeria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pizze")
public class Pizza {

    // variabili d'istanza(colonne tabella)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Il campo nome non può essere vuoto")
    private String nome;

    @Lob
    private String descrizione;

    @Lob
    private String foto;

    @NotNull(message = "Il campo prezzo non può essere vuoto")
    private Integer prezzo;

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

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(Integer prezzo) {
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
