package esprit.tn.examen2222.repositories;

import esprit.tn.examen2222.entities.Apprenant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IApprenantRepository extends CrudRepository<Apprenant, Integer> {
    List<Apprenant> findByIdApprenant(Integer idApprenant);
}
