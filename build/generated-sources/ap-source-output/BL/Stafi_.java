package BL;

import BL.Arka;
import BL.Kompania;
import BL.KontaktiStafit;
import BL.Mengajeri;
import BL.OrariStafi;
import BL.Puntori;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Stafi.class)
public class Stafi_ { 

    public static volatile SingularAttribute<Stafi, Integer> kodiPostar;
    public static volatile CollectionAttribute<Stafi, Mengajeri> mengajeriCollection;
    public static volatile SingularAttribute<Stafi, Character> gjinija;
    public static volatile SingularAttribute<Stafi, String> mbiemri;
    public static volatile CollectionAttribute<Stafi, KontaktiStafit> kontaktiStafitCollection;
    public static volatile SingularAttribute<Stafi, String> emri;
    public static volatile SingularAttribute<Stafi, String> rruga;
    public static volatile CollectionAttribute<Stafi, Arka> arkaCollection;
    public static volatile SingularAttribute<Stafi, String> shteti;
    public static volatile SingularAttribute<Stafi, Integer> iDStafi;
    public static volatile SingularAttribute<Stafi, Kompania> iDKompania;
    public static volatile SingularAttribute<Stafi, String> qyteti;
    public static volatile CollectionAttribute<Stafi, OrariStafi> orariStafiCollection;
    public static volatile SingularAttribute<Stafi, Integer> mosha;
    public static volatile SingularAttribute<Stafi, Puntori> puntori;

}