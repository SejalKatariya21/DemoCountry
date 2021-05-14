package sejal.country.exception;

public class CountryNotFoundException extends RuntimeException {

  public CountryNotFoundException(String message) {
    super("Country Not Found");
  }
}
