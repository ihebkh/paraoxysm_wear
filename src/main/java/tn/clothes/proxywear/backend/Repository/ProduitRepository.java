package tn.clothes.proxywear.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.clothes.proxywear.backend.Entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
