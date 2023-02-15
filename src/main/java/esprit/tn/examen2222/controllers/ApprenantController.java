package esprit.tn.examen2222.controllers;

import esprit.tn.examen2222.entities.Apprenant;
import esprit.tn.examen2222.services.IApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("apprenant")
public class ApprenantController {
    final IApprenantService apprenantService;

    @Autowired
    public ApprenantController(@Qualifier("apprenant") IApprenantService apprenantService) {
        this.apprenantService = apprenantService;
    }

    @PostMapping("/add")
    void addEtudiant(@RequestBody Apprenant apprenant){
        apprenantService.ajouterApprenant(apprenant);
    }
}
