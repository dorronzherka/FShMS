package BL;

import BL.Bonuset;
import BL.Faktura;
import BL.KontaktiKlienti;
import BL.Shitje;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Klienti.class)
public class Klienti_ { 

    public static volatile SingularAttribute<Klienti, Integer> kodiPostar;
    public static volatile SingularAttribute<Klienti, Date> ditelindja;
    public static volatile SingularAttribute<Klienti, Character> gjinija;
    public static volatile CollectionAttribute<Klienti, Shitje> shitjeCollection;
    public static volatile SingularAttribute<Klienti, String> mbiemri;
    public static volatile CollectionAttribute<Klienti, Faktura> fakturaCollection;
    public static volatile CollectionAttribute<Klienti, KontaktiKlienti> kontaktiKlientiCollection;
    public static volatile SingularAttribute<Klienti, String> emri;
    public static volatile SingularAttribute<Klienti, String> rruga;
    public static volatile SingularAttribute<Klienti, String> shteti;
    public static volatile SingularAttribute<Klienti, Integer> iDKlienti;
    public static volatile SingularAttribute<Klienti, String> qyteti;
    public static volatile SingularAttribute<Klienti, Bonuset> bonuset;

}