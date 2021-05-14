package sejal.country.controller;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sejal.country.dto.Country;
import sejal.country.exception.CountryNotFoundException;
import sejal.country.service.CountryResponse;
import sejal.country.service.CountryService;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CountryController {

  @Autowired
  private CountryService countryService;

  @RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json" )
  public ResponseEntity<List<Country>> getCountries(){

    List<Country> listOfCountries = new ArrayList<Country>();
    listOfCountries=countryService.getCountries();

    if(listOfCountries.size()==0)
    {
        return new ResponseEntity(listOfCountries,HttpStatus.BAD_REQUEST);
    }
   return new ResponseEntity(listOfCountries,HttpStatus.OK);





  }

}
