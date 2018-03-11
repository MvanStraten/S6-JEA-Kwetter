/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import domain.KwetterUser;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Marijn
 */
@Stateless
public class KwetterUserService {
    
    @Inject
    UserDao kwetterUserDao;
    
    public KwetterUserService(){}
    
    public List<KwetterUser> allUsers() {
        return kwetterUserDao.getAllUsers();
    }

    public KwetterUser findUser(Long id) {
        return kwetterUserDao.findUser(id);
    }
    
    public KwetterUser updateUser(KwetterUser newUser){
        return kwetterUserDao.updateUser(newUser);
    }
}