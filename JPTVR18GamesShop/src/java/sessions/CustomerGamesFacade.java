/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entity.CustomerGames;
import entity.Game;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class CustomerGamesFacade extends AbstractFacade<CustomerGames> {

    @PersistenceContext(unitName = "JPTVR18GamesShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerGamesFacade() {
        super(CustomerGames.class);
    }

    public void removeByGame(Game deleteGame) {
       em.createQuery("DELETE FROM CustomerGames cg WHERE cg.game = :game").setParameter("game",deleteGame).executeUpdate();
    }
    
}
