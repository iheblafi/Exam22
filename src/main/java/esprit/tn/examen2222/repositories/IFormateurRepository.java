package esprit.tn.examen2222.repositories;

import esprit.tn.examen2222.entities.Formateur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IFormateurRepository extends CrudRepository<Formateur, Integer> {
    List<Formateur> findByIdFormateur(Integer idFormateur);


}
