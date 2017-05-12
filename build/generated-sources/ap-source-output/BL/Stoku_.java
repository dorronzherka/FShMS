package BL;

import BL.Kompania;
import BL.Produkti;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T16:24:05")
@StaticMetamodel(Stoku.class)
public class Stoku_ { 

    public static volatile SingularAttribute<Stoku, String> emri;
    public static volatile CollectionAttribute<Stoku, Produkti> produktiCollection;
    public static volatile SingularAttribute<Stoku, Integer> iDStoku;
    public static volatile SingularAttribute<Stoku, Kompania> kompania;

}