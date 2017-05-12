package BL;

import BL.Blerjet;
import BL.Ngjyra;
import BL.Prodhuesi;
import BL.Shitje;
import BL.Stoku;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Produkti.class)
public class Produkti_ { 

    public static volatile SingularAttribute<Produkti, String> emri;
    public static volatile SingularAttribute<Produkti, Stoku> iDStoku;
    public static volatile CollectionAttribute<Produkti, Blerjet> blerjetCollection;
    public static volatile SingularAttribute<Produkti, String> madhesia;
    public static volatile SingularAttribute<Produkti, Character> gjinija;
    public static volatile SingularAttribute<Produkti, Ngjyra> iDNgjyra;
    public static volatile CollectionAttribute<Produkti, Shitje> shitjeCollection;
    public static volatile SingularAttribute<Produkti, Prodhuesi> iDProdhuesi;
    public static volatile SingularAttribute<Produkti, Integer> barkodi;
    public static volatile SingularAttribute<Produkti, Integer> cmimi;
    public static volatile SingularAttribute<Produkti, Integer> iDProdukti;
    public static volatile SingularAttribute<Produkti, Integer> sasia;

}