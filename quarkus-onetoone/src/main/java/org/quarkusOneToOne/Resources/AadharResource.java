package org.quarkusOneToOne.Resources;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.quarkusOneToOne.Entity.Aadhar;

@ApplicationScoped
public class AadharResource implements PanacheRepository<Aadhar> {

}