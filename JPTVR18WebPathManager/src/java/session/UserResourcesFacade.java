/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Resource;
import entity.UserResources;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pupil
 */
@Stateless
public class UserResourcesFacade extends AbstractFacade<UserResources> {

    @PersistenceContext(unitName = "JPTVR18WebPathManagerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserResourcesFacade() {
        super(UserResources.class);
    }
    
    public void removeByResource(Resource deleteResource) {
        em.createQuery("DELETE FROM UserResources ur WHERE  ur.resource = :resource").setParameter("resource", deleteResource);
        em.flush();
    }  
}
