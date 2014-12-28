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
public class Condominio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CONDOMINIO_ID")
    private Long id;
    
    @Column(name = "CNPJ", nullable = false, length = 255)
    private String cnpj;
    
    @Column(name = "NOME", nullable = false, length = 255)
    private String  nome;
    
    @Column(name = "CEP", nullable = false, length = 10)
    private String cep;
    
    @Column(name = "ENDERECO", nullable = false, length = 255)
    private String endereco;
    
    @Column(name = "NUMERO", nullable = false)
    private int numero;
    
    @Column(name = "COMPLEMENTO", nullable = false, length = 255)
    private String complemento;
    
    @Column(name = "BAIRRO", nullable = false, length = 255)
    private String bairro;
    
    @Column(name = "CIDADE", nullable = false, length = 255)
    private String cidade;
    
    @Column(name = "UF", nullable = false, length = 255)
    private String uf;
    
    @Column(name = "QUANT_BLOCOS", nullable = false)
    private int quant_blocos;
    
    @Column(name = "QUANT_APT", nullable = false)
    private int quant_apt;
    
    @Column(name = "FOTO", nullable = false, length = 255)
    private String foto;
    
    @Column(name = "TELEFONE", nullable = false, length = 20)
    private String telefone;
    
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getQuant_blocos() {
        return quant_blocos;
    }

    public void setQuant_blocos(int quant_blocos) {
        this.quant_blocos = quant_blocos;
    }

    public int getQuant_apt() {
        return quant_apt;
    }

    public void setQuant_apt(int quant_apt) {
        this.quant_apt = quant_apt;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.cnpj);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cep);
        hash = 97 * hash + Objects.hashCode(this.endereco);
        hash = 97 * hash + this.numero;
        hash = 97 * hash + Objects.hashCode(this.complemento);
        hash = 97 * hash + Objects.hashCode(this.bairro);
        hash = 97 * hash + Objects.hashCode(this.cidade);
        hash = 97 * hash + Objects.hashCode(this.uf);
        hash = 97 * hash + this.quant_blocos;
        hash = 97 * hash + this.quant_apt;
        hash = 97 * hash + Objects.hashCode(this.foto);
        hash = 97 * hash + Objects.hashCode(this.telefone);
        hash = 97 * hash + Objects.hashCode(this.email);
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
        final Condominio other = (Condominio) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (this.quant_blocos != other.quant_blocos) {
            return false;
        }
        if (this.quant_apt != other.quant_apt) {
            return false;
        }
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Condominio[ id=" + id + " ]";
    }
    
}
