package br.com.dio.Desafio_api.Repository;

import br.com.dio.Desafio_api.Model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<PersonModel, Integer> {
}
