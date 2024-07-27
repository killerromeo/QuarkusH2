package org.quarkusOneToOne.Function;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.quarkusOneToOne.Entity.*;
import org.quarkusOneToOne.Resources.AadharResource;
import org.quarkusOneToOne.Resources.CitizenResource;

@Path("/")
public class CitizenFunction {

    @Inject
    private CitizenResource citizenResource;

    @Inject
    private AadharResource aadharResource;

    @GET
    @Path("/save")
    @Transactional
    public void saveCitizen(){
        Citizen citizen =new Citizen();
        citizen.setName("arunma");
        citizen.setAge(21);
        citizen.setGender("female");


        Aadhar aadhar = new Aadhar();
        aadhar.setAadharNumber(1235356L);
        aadhar.setAddress("Bangalore");
        aadhar.setCitizen(citizen);

    citizen.setAadhar(aadhar);
        citizenResource.persist(citizen);

    }


}
