package esprit.tn.examen2222.services;

import esprit.tn.examen2222.entities.Formateur;
import esprit.tn.examen2222.entities.Formation;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface IFormationService {
    void ajouterFormation(Formation formation);
    void ajouterEtAffecterFormationAFormateur(Formation formation, Integer idFormateur);

    void removeFormation(Integer idFormation);

    void affecterApprenantFormation (Integer idApprenant, Integer idFormation);

   /* List<Formation> SelectByDate (Date dateDebut, Date dateFin);
    */
   List<Formation> SelectByToWDates (Date dateDebut, Date dateFin);
}

