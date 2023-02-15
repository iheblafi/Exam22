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
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idApprenant;
    @NonNull
    String nom;
    @NonNull
    String prenom;
    @NonNull
    Integer telephone;
    @NonNull
    String email;

    @ManyToMany(mappedBy = "apprenants")
    Set<Formation> formations;
}
