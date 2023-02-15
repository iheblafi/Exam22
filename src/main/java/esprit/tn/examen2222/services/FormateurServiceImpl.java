package esprit.tn.examen2222.services;

import esprit.tn.examen2222.entities.Formateur;
import esprit.tn.examen2222.entities.Formation;
import esprit.tn.examen2222.repositories.IFormateurRepository;
import esprit.tn.examen2222.repositories.IFormationRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
//@RequiredArgsConstructor
@Service("formateur")
public class FormateurServiceImpl implements IFormateurService{

    final IFormateurRepository iFormateurRepository;
    final IFormationRepository iFormationRepository;
    @Autowired
    public FormateurServiceImpl(IFormateurRepository iFormateurRepository, IFormationRepository iFormationRepository) {
        this.iFormateurRepository = iFormateurRepository;
        this.iFormationRepository = iFormationRepository;
    }

    @Override
    public void ajouterFormateur(Formateur formateur) {
        iFormateurRepository.save(formateur);

    }


    /*@Override
    public Integer getFormateurRemunerationByDate(Integer idFormateur, Date dateDebut, Date dateFin) {
        Formation formation= iFormationRepository.findByDate(dateDebut, dateFin).orElse(null);
        Formateur formateur= iFormateurRepository.findById(idFormateur).orElse(null);

        Integer nbr= formation.getNbrHeures();
        Integer nbrT= formateur.getTarifHoraire();
        return nbr*nbrT;
    }*/
}
