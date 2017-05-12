package BL;

import BL.Kompania;
import BL.Prodhuesi;
import BL.Produkti;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Blerjet.class)
public class Blerjet_ { 

    public static volatile CollectionAttribute<Blerjet, Prodhuesi> prodhuesiCollection;
    public static volatile SingularAttribute<Blerjet, Date> data;
    public static volatile SingularAttribute<Blerjet, Kompania> iDKompania;
    public static volatile SingularAttribute<Blerjet, Integer> iDBlerjet;
    public static volatile SingularAttribute<Blerjet, Integer> cmimi;
    public static volatile SingularAttribute<Blerjet, Produkti> iDProdukti;
    public static volatile SingularAttribute<Blerjet, Integer> sasia;

}