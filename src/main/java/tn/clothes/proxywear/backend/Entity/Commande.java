package tn.clothes.proxywear.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Commande {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id_Commande;
    String Nom_Client ;
    String Prenom_client ;
    Long quantite_commande;

}
