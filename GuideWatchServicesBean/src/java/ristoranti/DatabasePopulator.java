package ristoranti;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DataSourceDefinition(
    className = "org.apache.derby.jdbc.EmbeddedDataSource",
    name = "jdbc/EsameDS",
    user = "APP",
    password = "APP",
    databaseName = "EsameDB",
    properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    @Inject
    private RistoranteEJB ristoranteEJB;
    private Ristorante r1, r2, r3, r4;
    
    @PostConstruct
    private void populateDB() {
        r1 = new Ristorante(1, "La Terrazza", "Napoli", "Italiana", "Michelin", "1 Stella", 2024, true);
        r2 = new Ristorante(2, "Le Trabe", "Paestum (SA)", "Campana", "Michelin", "1 Stella", 2026, true);
        r3 = new Ristorante(3, "VerdeVivo", "Benevento", "Vegana", "GamberoRosso", "2 Forchette", 2022, false);
        r4 = new Ristorante(4, "Lo Stuzzichino", "Sant'Agata sui Due Golfi (NA)", "Campana/Tradizionale", "Michelin", "Bib Gourmand", 2026, true);
        ristoranteEJB.creaRistorante(r1);
        ristoranteEJB.creaRistorante(r2);
        ristoranteEJB.creaRistorante(r3);
        ristoranteEJB.creaRistorante(r4);
    }
    
    @PreDestroy
    private void clearDB() {
        ristoranteEJB.eliminaRistorante(r1);
        ristoranteEJB.eliminaRistorante(r2);
        ristoranteEJB.eliminaRistorante(r3);
        ristoranteEJB.eliminaRistorante(r4);
    }
    
}
