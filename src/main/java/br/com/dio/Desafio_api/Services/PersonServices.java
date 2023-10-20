package br.com.dio.Desafio_api.Services;

import br.com.dio.Desafio_api.Model.PersonModel;
import br.com.dio.Desafio_api.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {

    @Autowired
    private PersonRepository repository;

    public ResponseEntity<?> create(PersonModel obj){
        return new ResponseEntity<> (repository.save (obj), HttpStatus.CREATED);
    }
    public ResponseEntity<?> delete(int id){
        if (repository.existsById (id)){
            repository.deleteById (id);
            return new ResponseEntity<> (HttpStatus.OK);
        }else{
            return new ResponseEntity<> (HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<?> edit(PersonModel obj){
        return new ResponseEntity<> (repository.save (obj), HttpStatus.OK);
    }
}
