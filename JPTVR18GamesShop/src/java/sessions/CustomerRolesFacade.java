/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entity.CustomerRoles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class CustomerRolesFacade extends AbstractFacade<CustomerRoles> {

    @PersistenceContext(unitName = "JPTVR18GamesShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerRolesFacade() {
        super(CustomerRoles.class);
    }
    
}
