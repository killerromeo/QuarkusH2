package org.quarkusOneToOne.Resources;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.quarkusOneToOne.Entity.Citizen;

@ApplicationScoped
public class CitizenResource implements PanacheRepository<Citizen> {

}
/*

quarkus.datasource.db-kind = mysql
quarkus.datasource.username = root
quarkus.datasource.password = RajlocalhosT@79
quarkus.datasource.jdbc.url = jdbc:mysql://localhost:3306/quarkusonetoone
quarkus.hibernate-orm.database.generation =drop-and-create
#quarkus.hibernate-orm.database.generation=none
quarkus.hibernate-orm.log.sql=true

 */
