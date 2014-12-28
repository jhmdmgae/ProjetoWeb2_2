package Model;

import java.io.Serializable;
import java.util.Date;
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
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="FUNCIONARIO_ID")
    private Long id;
    
    @Column(name = "MATRICULA", nullable = false, length = 20)
    private String matricula;
    
    @Column(name = "NOME", nullable = false, length = 255)
    private String  nome;
    
    @Column(name = "TEL_RESIDENCIAL", nullable = false, length = 20)
    private String tel_residencial;
    
    @Column(name = "TEL_CELULAR", nullable = false, length = 20)
    private String tel_celular;
    
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
    
    @Column(name = "RG", nullable = false, length = 255)
    private String rg;
    
    @Column(name = "CPF", nullable = false, length = 255)
    private String cpf;
    
    @Column(name = "SEXO", nullable = false)
    private boolean sexo;
    
    @Temporal(TemporalType.DATE)
    private Date data_contratacao;
    
    @Column(name = "CARGO", nullable = false, length = 255)
    private String cargo;
    
    @Column(name = "TIPO_CONTRATO", nullable = false, length = 255)
    private String tipo_contrato;
    
    @Column(name = "TURNO", nullable = false, length = 255)
    private String turno;
    
    @Column(name = "FOTO", nullable = false, length = 255)
    private String foto;
    
    @Column(name = "OBSERVACAO", nullable = false)
    private String observacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel_residencial() {
        return tel_residencial;
    }

    public void setTel_residencial(String tel_residencial) {
        this.tel_residencial = tel_residencial;
    }

    public String getTel_celular() {
        return tel_celular;
    }

    public void setTel_celular(String tel_celular) {
        this.tel_celular = tel_celular;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Date getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Funcionario[ id=" + id + " ]";
    }
    
}
