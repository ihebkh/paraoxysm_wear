package tn.clothes.proxywear.backend.Service;
import tn.clothes.proxywear.backend.Entity.Produit;

import java.util.List;

public interface IService {


    public Produit retrieveProduit(Long ProduitId);
    public Produit addProduit(Produit c);
    public List<Produit> retrieveAllProduits();
    public void removeProduit(Long produitId);
    public Produit modifyProduit(Produit produit);

}
