package esprit.tn.examen2222.services;

import esprit.tn.examen2222.entities.Formateur;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface IFormateurService {
    void ajouterFormateur(Formateur formateur);

  /*  public Integer getFormateurRemunerationByDate(Integer idFormateur, Date dateDebut, Date dateFin);
*/
}
