package br.com.dio.Desafio_api.Controller;


import br.com.dio.Desafio_api.Model.PersonModel;
import br.com.dio.Desafio_api.Repository.PersonRepository;
import br.com.dio.Desafio_api.Services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices services;
    @Autowired
    private PersonRepository repository;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PersonModel obj){
        return services.create (obj);
    }
    @GetMapping("/list")
    public Iterable<PersonModel> lista(){
        Iterable<PersonModel> person = repository.findAll();
        return person;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        return services.delete (id);
    }
    @PutMapping("/edit")
    public ResponseEntity<?> edit(@RequestBody PersonModel obj){
        return services.edit (obj);
    }
}
