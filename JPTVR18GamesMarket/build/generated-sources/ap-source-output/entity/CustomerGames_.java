package entity;

import entity.Customer;
import entity.Game;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-16T11:18:53")
@StaticMetamodel(CustomerGames.class)
public class CustomerGames_ { 

    public static volatile SingularAttribute<CustomerGames, Date> date;
    public static volatile SingularAttribute<CustomerGames, Game> game;
    public static volatile SingularAttribute<CustomerGames, Long> id;
    public static volatile SingularAttribute<CustomerGames, Customer> customer;

}