package esprit.tn.examen2222.services;

import esprit.tn.examen2222.entities.Apprenant;
import esprit.tn.examen2222.entities.Formateur;
import esprit.tn.examen2222.entities.Formation;
import esprit.tn.examen2222.repositories.IApprenantRepository;
import esprit.tn.examen2222.repositories.IFormateurRepository;
import esprit.tn.examen2222.repositories.IFormationRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
//@RequiredArgsConstructor
@Service("formation")
@Slf4j
public class FormationServiceImpl implements IFormationService {

    final IFormationRepository iFormationRepository;
    final IFormateurRepository iFormateurRepository;
    final IApprenantRepository iApprenantRepository;

    @Autowired
    public FormationServiceImpl(IFormationRepository iFormationRepository, IFormateurRepository iFormateurRepository, IApprenantRepository iApprenantRepository) {
        this.iFormationRepository = iFormationRepository;
        this.iFormateurRepository = iFormateurRepository;
        this.iApprenantRepository = iApprenantRepository;
    }


    @Override
    public void ajouterFormation(Formation formation) {
    }

    @Override
    public void ajouterEtAffecterFormationAFormateur(Formation formation, Integer idFormateur) {

        formation = iFormationRepository.save(formation);
        Formateur formateur = iFormateurRepository.findById(idFormateur).orElse(null);
        formation.setFormateur(formateur);
        iFormationRepository.save(formation);
    }

    @Override
    public void removeFormation(Integer idFormation) {
        iFormationRepository.deleteById(idFormation);
    }

    @Override
    public void affecterApprenantFormation(Integer idApprenant, Integer idFormation) {
        Formation formation = iFormationRepository.findById(idFormation).orElse(null);
        Apprenant apprenant = iApprenantRepository.findById(idApprenant).orElse(null);

        if (formation.getApprenants() == null) {

            Set<Apprenant> apprenants = new HashSet<Apprenant>();
            apprenants.add(apprenant);
            formation.setApprenants(apprenants);
        } else {
            formation.getApprenants().add(apprenant);
        }
        iFormationRepository.save(formation);
    }

   /* @Override
    public List<Formation> SelectByDate(Date dateDebut, Date dateFin) {
        return iFormationRepository.findByDate(dateDebut, dateFin);
    }*/

    @Override
    public List<Formation> SelectByToWDates(Date dateDebut, Date dateFin) {
        return iFormationRepository.selectByTwoDates(dateDebut, dateFin);

//@Scheduled(cron = "*/15 * * * * *" )
    /*public void cronMethod() {

        Integer i =0;
        Integer s =0;

        Set<Apprenant> ApprenantList = new ArrayList<>();
        iFormationRepository.findAll().forEach(ApprenantList::add);
        for ( Apprenant apprenant : ApprenantList )  {
            if(formation.getTitre()=="Spring"){
            i++;
            }
            else {
                s++;
            }
        }

        System.out.println("La formation : Spring contient :" +i+ "apprenant" );
        System.out.println("La formation : Devops contient :" +s+ "apprenant" );
    }*/

        //@Scheduled(cron = "*/15 * * * * *" )
   /* public void cronMethod() {
    Integer nbrApprenent;
    List<Formation> formationList = new ArrayList<>();
        iFormationRepository.findAll().forEach(formationList::add);
    for(Formation formation :formationList)
    {
        nbrApprenent= formation.getApprenants().size();
        System.out.println("la Formation:"+formation.getTitre()+ "contient:" +nbrApprenent+ "Apprenent");

    }

    }*/


    }
}

    

