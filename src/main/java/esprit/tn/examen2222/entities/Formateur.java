package esprit.tn.examen2222.entities;

import javax.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Formateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idFormateur;
    @NonNull
    String nom;
    @NonNull
    String prenom;
    @NonNull
    Integer tarifHoraire;
    @NonNull
    String email;
    @OneToMany(mappedBy = "formateur")
    Set<Formation> formations;



}
