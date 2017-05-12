package BL;

import BL.Blerjet;
import BL.KontaktiProdhuesit;
import BL.Produkti;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Prodhuesi.class)
public class Prodhuesi_ { 

    public static volatile CollectionAttribute<Prodhuesi, Produkti> produktiCollection;
    public static volatile SingularAttribute<Prodhuesi, Integer> kodiPostar;
    public static volatile SingularAttribute<Prodhuesi, String> rruga;
    public static volatile CollectionAttribute<Prodhuesi, Blerjet> blerjetCollection;
    public static volatile SingularAttribute<Prodhuesi, String> emriProdhuesit;
    public static volatile SingularAttribute<Prodhuesi, String> shteti;
    public static volatile SingularAttribute<Prodhuesi, Integer> iDProdhuesi;
    public static volatile SingularAttribute<Prodhuesi, String> qyteti;
    public static volatile CollectionAttribute<Prodhuesi, KontaktiProdhuesit> kontaktiProdhuesitCollection;

}