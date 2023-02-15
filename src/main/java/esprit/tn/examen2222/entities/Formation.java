package esprit.tn.examen2222.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idFormation;
    @NonNull
    String titre;
    @Enumerated(EnumType.STRING)
    Niveau niveau;
    @NonNull
    Date dateDebut;
    @NonNull
    Date dateFin;
    @NonNull
    Integer nbrHeures;
    @NonNull
    Integer nbrMaxParticipant;
    @NonNull
    Integer frais;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Formateur formateur;

    @ManyToMany (cascade = CascadeType.PERSIST, fetch=FetchType.EAGER)
    Set<Apprenant> apprenants;


}
