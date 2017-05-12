package BL;

import BL.Klienti;
import BL.Kompania;
import BL.Shitje;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Faktura.class)
public class Faktura_ { 

    public static volatile SingularAttribute<Faktura, Integer> iDFaktura;
    public static volatile SingularAttribute<Faktura, Integer> cmimiTotal;
    public static volatile SingularAttribute<Faktura, Kompania> iDKompania;
    public static volatile CollectionAttribute<Faktura, Shitje> shitjeCollection;
    public static volatile SingularAttribute<Faktura, Klienti> iDKlienti;

}