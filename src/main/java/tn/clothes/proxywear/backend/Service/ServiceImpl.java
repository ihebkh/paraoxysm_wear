package tn.clothes.proxywear.backend.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.clothes.proxywear.backend.Entity.Produit;
import tn.clothes.proxywear.backend.Repository.CommandeRepository;
import tn.clothes.proxywear.backend.Repository.ProduitRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class ServiceImpl implements IService {
    CommandeRepository commandeRepository;
    ProduitRepository produitRepository;


    @Override
    public Produit retrieveProduit(Long ProduitId) {
        return produitRepository.findById(ProduitId).get();
    }

    @Override
    public Produit addProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public void removeProduit(Long produitId) {
        Optional<Produit> produit = produitRepository.findById(produitId);
        produit.ifPresent(produitRepository::delete);
    }

    @Override
    public Produit modifyProduit(Produit produit) {
        return produitRepository.save(produit);
    }


}