package tn.clothes.proxywear.backend.Controlleur;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.clothes.proxywear.backend.Entity.Produit;
import tn.clothes.proxywear.backend.Service.IService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Produit")
public class ProduitControlleur {
    IService iService;
    @PostMapping("/add-produit")
    public Produit addProduit(@RequestBody Produit produit) {
        Produit p = iService.addProduit(produit);
        return p;
    }
    @GetMapping("/retrieve-Produit/{Produit-id}")
    public Produit retrieveProduit(@PathVariable("Produit-id") Long ProduitId) {
        Produit produit = iService.retrieveProduit(ProduitId);
        return produit;
    }
    @GetMapping("/retrieve-all-produits")
    public List<Produit> getProduits() {
        List<Produit> listProduits = iService.retrieveAllProduits();
        return listProduits;
    }
    @DeleteMapping("/remove-Produit/{Produit-id}")
    public void removeProduit(@PathVariable("Produit-id") Long produitId) {
        iService.removeProduit(produitId);
    }
    @PutMapping("/modify-produit")
    public Produit modifyProduit(@RequestBody Produit p) {
        return iService.modifyProduit(p);
    }
}


