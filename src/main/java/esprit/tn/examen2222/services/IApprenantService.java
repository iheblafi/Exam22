package esprit.tn.examen2222.services;

import esprit.tn.examen2222.entities.Apprenant;
import esprit.tn.examen2222.entities.Formateur;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IApprenantService {
    void ajouterApprenant(Apprenant apprenant);


}
