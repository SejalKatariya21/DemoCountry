package sejal.country.dto;

import java.util.Objects;


public class Country {

  private Integer id;
  private String countryName;

  public Country(Integer id, String countryName) {
    super();
    this.id = id;
    this.countryName = countryName;
  }

  @Override public String toString() {
    return "Country{" +
        "id=" + id +
        ", countryName='" + countryName + '\'' +
        '}';
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Country country = (Country) o;
    return Objects.equals(id, country.id) &&
        Objects.equals(countryName, country.countryName);
  }

  @Override public int hashCode() {
    return Objects.hash(id, countryName);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }



}
