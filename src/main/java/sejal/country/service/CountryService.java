package sejal.country.service;

import org.springframework.stereotype.Component;
import sejal.country.dto.Country;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryService {

  public List<Country> getCountries() {
    ArrayList<Country> countries = new ArrayList<>();
    countries.add(new Country(1, "India"));
    countries.add(new Country(2, "Germany"));

    return countries;
   // CountryResponse resp ;
   // resp = new CountryResponse(200,"Success","Message received");
   // return resp;


  }
}
