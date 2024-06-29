package devthepaulcode.projetospringdatajpa.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;


import java.util.Date;

@Entity
@Table(name = "CONTATOS")
public class Contato extends AbstractPersistable<Long> {
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "idade")
    private int idade;
    @Column(name = "data_cadastro")
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @Override
    public void setId(Long id){
        super.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
