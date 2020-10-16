/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entity.Customer;
import entity.Game;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pupil
 */
@Stateless
public class GameFacade extends AbstractFacade<Game> {

    @PersistenceContext(unitName = "JPTVR18GamesMarketPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameFacade() {
        super(Game.class);
    }

    public List<Game> findByCustomer(Customer customer) {
        try {
            return em.createQuery("SELECT cg.game FROM CustomerGames cg WHERE cg.customer = :customer").setParameter("customer", customer).getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    
}
