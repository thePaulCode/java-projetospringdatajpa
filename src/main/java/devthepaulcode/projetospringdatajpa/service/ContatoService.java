package devthepaulcode.projetospringdatajpa.service;

import devthepaulcode.projetospringdatajpa.entity.Contato;
import devthepaulcode.projetospringdatajpa.repository.ContatoRepository;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;


@Service
public class ContatoService {
    
    @Autowired
    private ContatoRepository repository;
    
    public void salvar(Contato contato){
        repository.save(contato);
    }

    public Optional<Contato> buscarPorId(Long id){
        return repository.findById(id);
    }

    public List<Contato> buscarTodos(){
        return repository.findAll();
    }

    // Using QueryByExample and ExampleMatcher
    public List<Contato> buscarPorIdadeQBE(Integer idade){
        Contato contato = new Contato();
        contato.setIdade(idade);
        Example<Contato> example = Example.of(contato);

        return repository.findAll(example);
    }

    public List<Contato> buscarPorNomeQBE(String nome){

        Contato contato = new Contato();
        contato.setNome(nome);

        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.ENDING);
        Example<Contato> example = Example.of(contato, matcher);

        return repository.findAll(example);
    }

    // Pageable
    public Page<Contato> paginarResultados(){

        return repository.findAll(
                PageRequest.of(0,
                                  3,
                        Sort.by(Sort.Direction.ASC,
                                "nome"))
        );
    }

}
