package br.com.salvina.controllers;

import br.com.salvina.entidades.Animal;
import br.com.salvina.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping()
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @PostMapping()
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findAllNotAdopted(){
        return repository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAllAdopted(){
        return repository.findAdopted();
    }

    @GetMapping("count-animals-by-recebedor/{dataInicio}/{dataFim}")
    private List<Object[]>  countAnimalsByRecebedor(@PathVariable("dataInicio") Date dataInicio,
                                            @PathVariable("dataFim") Date dataFim){
        return repository.countAnimalsByRecebedor(dataInicio, dataFim);
    }
}
