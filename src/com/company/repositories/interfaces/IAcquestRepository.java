package com.company.repositories.interfaces;

//import the path to the class

import com.company.entities.Acquest;

import java.util.List;

/**
 * IAcquestRepository interface class that has createAcquest, getAcquest, getAllAcquests methods
 */
public interface IAcquestRepository {
    //createAcquest is used to create a new acquest in database
    boolean createAcquest(Acquest acquest);
    //getAcquest is used for getting selected acquest from database
    Acquest getAcquest(int Acquest_id);
    //getAllAcquests is used to get all acquests from database
    List<Acquest> getAllAcquests();
}

