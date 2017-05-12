package BL;

import BL.Blerjet;
import BL.Faktura;
import BL.KontaktiKompania;
import BL.Mengajeri;
import BL.Stafi;
import BL.Stoku;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Kompania.class)
public class Kompania_ { 

    public static volatile SingularAttribute<Kompania, String> emri;
    public static volatile SingularAttribute<Kompania, Integer> kodiPostar;
    public static volatile SingularAttribute<Kompania, Stoku> iDStoku;
    public static volatile SingularAttribute<Kompania, String> rruga;
    public static volatile CollectionAttribute<Kompania, Stafi> stafiCollection;
    public static volatile SingularAttribute<Kompania, Mengajeri> iDMengajeri;
    public static volatile CollectionAttribute<Kompania, Blerjet> blerjetCollection;
    public static volatile SingularAttribute<Kompania, String> shteti;
    public static volatile SingularAttribute<Kompania, Integer> iDKompania;
    public static volatile CollectionAttribute<Kompania, Faktura> fakturaCollection;
    public static volatile SingularAttribute<Kompania, String> qyteti;
    public static volatile CollectionAttribute<Kompania, KontaktiKompania> kontaktiKompaniaCollection;

}