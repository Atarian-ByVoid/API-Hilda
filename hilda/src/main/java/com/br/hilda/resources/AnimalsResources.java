package com.br.hilda.resources;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.hilda.domain.Animals;
import com.br.hilda.repository.AnimalsRepository;

@RestController
@RequestMapping(value = "/animals")
public class AnimalsResources {
    @Autowired
    private AnimalsRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Animals> listar() {

        return repository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Animals buscaId(@PathVariable("id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void inserir(@RequestBody Animals animals) {

        repository.save(animals);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable("id") Long id) {

        repository.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void alterar(@RequestBody Animals animals, @PathVariable("id") Long id) {

        animals.setId(id);
        repository.save(animals);

    }

}
