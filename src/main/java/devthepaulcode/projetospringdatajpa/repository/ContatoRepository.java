package devthepaulcode.projetospringdatajpa.repository;

import devthepaulcode.projetospringdatajpa.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
