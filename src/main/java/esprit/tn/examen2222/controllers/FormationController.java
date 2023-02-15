package esprit.tn.examen2222.controllers;

import esprit.tn.examen2222.entities.Formateur;
import esprit.tn.examen2222.entities.Formation;
import esprit.tn.examen2222.services.IFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Component
@RestController
@RequestMapping("formation")
public class FormationController {

    final IFormationService iFormationService;

    @Autowired
    public FormationController(@Qualifier("formation") IFormationService iFormationService) {
        this.iFormationService = iFormationService;
    }


    @PostMapping("/add/{id}")
    void addFormationToFormateur(@RequestBody Formation formation, @PathVariable("id") Integer idFormateur){
        iFormationService. ajouterEtAffecterFormationAFormateur(formation, idFormateur);
    }

    @DeleteMapping("/delete/{id}")
    void deleteFormation(@PathVariable("id") Integer idFormation){
        iFormationService.removeFormation(idFormation);
    }

    @PostMapping("assignapprenantFormation/{idApprenant}/{idFormation}")
    public void AssignApprenantToFormation(@PathVariable("idApprenant")Integer idApprenant
            ,@PathVariable("idFormation")Integer idFormation )
    {
        iFormationService.affecterApprenantFormation (idApprenant, idFormation);
    }

    @GetMapping("/iheb/{Date}/{date2}")
    public List SelectByTwoDates(@PathVariable("Date") Date dateDebut, @PathVariable("date2") Date dateFin)
    {
       return iFormationService.selectByTwoDates(dateDebut, dateFin);
    }




}

