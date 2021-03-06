package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by M on 27. 4. 2016.
 */
@Entity
public class Airport implements Serializable {

    private int idAirport;
    private String airportName;
    private String city;
    private String country;
    private String icao;
    private String iata;
    private Collection<Route> destinations;
    private Collection<Route> origins;

    public static Airport createAirport(String airportName, String city, String country, String icao, String iata) {
        Airport airport = new Airport();
        airport.setAirportName(airportName);
        airport.setCity(city);
        airport.setCountry(country);
        airport.setIcao(icao);
        airport.setIata(iata);
        airport.setDestinations(new ArrayList<>());
        airport.setOrigins(new ArrayList<>());
        return airport;
    }

    public void addDestination(Route route) {
        if (!destinations.contains(route)) {
            destinations.add(route);
        }
    }

    public void addOrigin(Route route) {
        if (!origins.contains(route)) {
            origins.add(route);
        }
    }

    @Override
    public String toString() {
        return String.valueOf("| AIRPORT | NAME : " + this.getAirportName()
                + " | CITY : " + this.getCity() + " | COUNTRY : " + this.getCountry()
                + " | ICAO : " + this.getIcao() + " | IATA : "
                + this.getIata() + " |");
    }

    @Id
    @GeneratedValue
    @Column(name = "id_airport", nullable = false, insertable = true, updatable = true)
    public int getIdAirport() {
        return idAirport;
    }

    public void setIdAirport(int idAirport) {
        this.idAirport = idAirport;
    }

    @Basic
    @Column(name = "city", nullable = false, insertable = true, updatable = true, length = 10000)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "airport_name", nullable = false, insertable = true, updatable = true, length = 10000)
    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    @Basic
    @Column(name = "icao", nullable = false, insertable = true, updatable = true, length = 4)
    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    @Basic
    @Column(name = "iata", nullable = false, insertable = true, updatable = true, length = 3)
    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    @Basic
    @Column(name = "country", nullable = false, insertable = true, updatable = true, length = 10000)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Airport airport = (Airport) o;

        if (idAirport != airport.idAirport) {
            return false;
        }
        if (city != null ? !city.equals(airport.city) : airport.city != null) {
            return false;
        }
        if (airportName != null ? !airportName.equals(airport.airportName) : airport.airportName != null) {
            return false;
        }
        if (icao != null ? !icao.equals(airport.icao) : airport.icao != null) {
            return false;
        }
        if (iata != null ? !iata.equals(airport.iata) : airport.iata != null) {
            return false;
        }
        if (country != null ? !country.equals(airport.country) : airport.country != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAirport;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (airportName != null ? airportName.hashCode() : 0);
        result = 31 * result + (icao != null ? icao.hashCode() : 0);
        result = 31 * result + (iata != null ? iata.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "destination")
    public Collection<Route> getDestinations() {
        return destinations;
    }

    public void setDestinations(Collection<Route> destinations) {
        this.destinations = destinations;
    }

    @OneToMany(mappedBy = "origin")
    public Collection<Route> getOrigins() {
        return origins;
    }

    public void setOrigins(Collection<Route> origins) {
        this.origins = origins;
    }

}
