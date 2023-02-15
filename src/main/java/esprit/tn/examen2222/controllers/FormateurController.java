package esprit.tn.examen2222.controllers;

import esprit.tn.examen2222.entities.Apprenant;
import esprit.tn.examen2222.entities.Formateur;
import esprit.tn.examen2222.services.IFormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping("formateur")
public class FormateurController {

    final IFormateurService iFormateurService;

    @Autowired
    public FormateurController(@Qualifier("formateur") IFormateurService iFormateurService) {
        this.iFormateurService = iFormateurService;
    }


   /* @PostMapping("/add")
    void addFormateur(@RequestBody Formateur formateur){
        iFormateurService.ajouterFormateur(formateur);
    }

    public Integer getFormateurRemunerationByDate(
            @PathVariable("idFormateur") Integer idFormateur,
            @PathVariable("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,
            @PathVariable("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin
    )*/

}
