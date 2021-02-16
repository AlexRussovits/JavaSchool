/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Product;
import entity.UserProducts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pupil
 */
@Stateless
public class UserProductsFacade extends AbstractFacade<UserProducts> {

    @PersistenceContext(unitName = "HouseHoldGoods_RussovitsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserProductsFacade() {
        super(UserProducts.class);
    }

    public void removeByProduct(Product deleteProduct) {
        em.createQuery("DELETE FROM UserProducts up WHERE up.product = :product").setParameter("product", deleteProduct).executeUpdate();
    }
    
}
