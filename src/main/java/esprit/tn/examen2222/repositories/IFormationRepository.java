package esprit.tn.examen2222.repositories;

import esprit.tn.examen2222.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface IFormationRepository extends CrudRepository<Formation, Integer> {
    List<Formation> findByIdFormation(Integer idFormation);
    /*List<Formation> findByDate(Date dateDebut, Date dateFin );
*/
    @Query("select f from Formation f where ((f.dateDebut >= :dateDebut) and (f.dateFin <= :finDebut))")  //JPQL @between(c.dateDebutContrat, now-5, now, day, user_timezone)")
    List<Formation> selectByTwoDates(@Param("dateDebut") Date dateDebut , @Param("finDebut") Date finDebut);

}
