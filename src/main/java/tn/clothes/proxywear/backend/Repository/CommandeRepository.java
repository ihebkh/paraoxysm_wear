package tn.clothes.proxywear.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.clothes.proxywear.backend.Entity.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
