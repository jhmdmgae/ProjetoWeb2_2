/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author João Henrique 2
 */
@Entity
public class Apartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="APART_ID")
    private Long id;
    
    @Column(name = "NUMERO", nullable = false, length = 20)
    private int numero;
    
    @Column(name = "BLOCO", nullable = false, length = 20)
    private int bloco;
    
    @Column(name = "PROPRIETARIO", nullable = false, length = 255)
    private String proprietario;
    
    @Column(name = "LOCATARIO", nullable = false, length = 255)
    private String locatario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getLocatario() {
        return locatario;
    }

    public void setLocatario(String locatario) {
        this.locatario = locatario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + this.numero;
        hash = 71 * hash + this.bloco;
        hash = 71 * hash + Objects.hashCode(this.proprietario);
        hash = 71 * hash + Objects.hashCode(this.locatario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apartamento other = (Apartamento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.bloco != other.bloco) {
            return false;
        }
        if (!Objects.equals(this.proprietario, other.proprietario)) {
            return false;
        }
        if (!Objects.equals(this.locatario, other.locatario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Apartamento[ id=" + id + " ]";
    }
    
}
