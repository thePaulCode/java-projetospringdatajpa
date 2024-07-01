package devthepaulcode.projetospringdatajpa.service;

import devthepaulcode.projetospringdatajpa.entity.Endereco;
import devthepaulcode.projetospringdatajpa.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public void salvar(Endereco endereco){
        repository.save(endereco);
    }

    public List<Endereco> buscarTodos(){
        return repository.findAll();
    }

    public Optional<Endereco> buscarPorId(Long id){
        return repository.findById(id);
    }

    public List<Endereco> buscarPorLogadouroQBE(String logadouro){
        Endereco endereco = new Endereco();
        endereco.setLogadouro(logadouro);

        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

        Example<Endereco> example = Example.of(endereco, matcher);

        return repository.findAll(example);
    }

    // TODO Paginar
    public Page<Endereco> paginarResultados(){

        return repository.findAll(
                PageRequest.of(0,
                                  10,
                        Sort.by(Sort.Direction.ASC))
        );
    }
}
