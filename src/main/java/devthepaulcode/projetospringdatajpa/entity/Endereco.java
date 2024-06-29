package devthepaulcode.projetospringdatajpa.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractPersistable<Long> {

    public enum TiposEnderecos {
        RESIDENCIAL, COMERCIAL;
    }

    @Column(name = "tipo_endereco", length = 50, nullable = false)
    @Enumerated(EnumType.STRING)
    private TiposEnderecos tipoEndereco;
    @Column(name = "logadouro", length = 50, nullable = false)
    private String logadouro;
    @Column(name = "cidade", length = 50, nullable = false)
    private String cidade;
    @Column(name = "estado", length = 50, nullable = false)
    private String estado;

    public void setId(Long id){
        super.setId(id);
    }

    public TiposEnderecos getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TiposEnderecos tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
