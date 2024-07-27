package org.quarkusOneToOne.Entity;

import jakarta.persistence.*;

@Entity
public class Aadhar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long aadharNumber;
    private String address;

    @OneToOne
    private Citizen citizen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(Long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
}
/*
package org.acme;

import io.quarkus.runtime.StartupEvent;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import jakarta.enterprise.event.Observes;


public class StaticResources {

    void installRoute(@Observes StartupEvent startupEvent, Router router) {
        router.route()
                .path("/static/*")
                .handler(StaticHandler.create("static/"));
    }
}
 */