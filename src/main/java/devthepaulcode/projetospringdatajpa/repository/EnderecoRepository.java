package devthepaulcode.projetospringdatajpa.repository;

import devthepaulcode.projetospringdatajpa.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
