package com.company.controllers;

//import the paths to the classes
import com.company.entities.Acquest;
import com.company.repositories.interfaces.IAcquestRepository;

import java.util.List;

public class AcquestController {
    private final IAcquestRepository repo;

    /**
     * Parameterized constructor
     */
    public AcquestController(IAcquestRepository repo) {
        this.repo = repo;
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String createAcquest(String Acquest_date, int Acquest_number, int customer_id) {
        Acquest Acquest = new Acquest(Acquest_date, Acquest_number, customer_id);
        boolean created = repo.createAcquest(Acquest);
        return (created ? "Acquest creation was failed!" : "Acquest was created!");
    }

    /**
     * Overloaded method with default parameter values
     * @return String value
     */
    public String getAcquest(int customer_id) {
        Acquest acquest = repo.getAcquest(customer_id);
        return (acquest == null ? "Acquest was not found!" : acquest.toString());
    }

    /**
     * Method, which returns all middle level executivesMethod, which returns all middle level executives
     * @return String value
     */
    public String getAllAcquestеs() {
        List<Acquest> acquest = repo.getAllAcquests();
        return acquest.toString();
    }
}