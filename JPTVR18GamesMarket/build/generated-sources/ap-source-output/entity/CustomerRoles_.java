package entity;

import entity.Customer;
import entity.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-16T11:18:53")
@StaticMetamodel(CustomerRoles.class)
public class CustomerRoles_ { 

    public static volatile SingularAttribute<CustomerRoles, Role> role;
    public static volatile SingularAttribute<CustomerRoles, Long> id;
    public static volatile SingularAttribute<CustomerRoles, Customer> customer;

}