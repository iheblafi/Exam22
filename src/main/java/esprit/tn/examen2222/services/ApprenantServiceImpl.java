package esprit.tn.examen2222.services;

import esprit.tn.examen2222.entities.Apprenant;
import esprit.tn.examen2222.repositories.IApprenantRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
//@RequiredArgsConstructor
@Service("apprenant")
public class ApprenantServiceImpl implements IApprenantService {


    final IApprenantRepository iApprenantRepository;

    @Autowired
    public ApprenantServiceImpl(IApprenantRepository iApprenantRepository) {
        this.iApprenantRepository = iApprenantRepository;
    }

    @Override
    public void ajouterApprenant(Apprenant apprenant) {  iApprenantRepository.save(apprenant);

    }
}
