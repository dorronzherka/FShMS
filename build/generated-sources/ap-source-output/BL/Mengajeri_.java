package BL;

import BL.Kompania;
import BL.MengajeriPK;
import BL.Puntori;
import BL.Stafi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Mengajeri.class)
public class Mengajeri_ { 

    public static volatile SingularAttribute<Mengajeri, MengajeriPK> mengajeriPK;
    public static volatile SingularAttribute<Mengajeri, Kompania> kompania;
    public static volatile SingularAttribute<Mengajeri, Stafi> stafi;
    public static volatile SingularAttribute<Mengajeri, String> sektori;
    public static volatile CollectionAttribute<Mengajeri, Puntori> puntoriCollection;

}