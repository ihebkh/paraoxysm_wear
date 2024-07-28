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
public class Produit {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id_produit;
    String Refernce_Produit ;
    String image_produit ;
    Long Quantite_produit;
    String Description_produit;
}
