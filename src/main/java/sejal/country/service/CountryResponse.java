package sejal.country.service;

import java.util.Objects;

public class CountryResponse {
    public int getStatusCode() {
        return statusCode;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public CountryResponse(int statusCode, String status, String message) {

        this.statusCode = statusCode;
        this.status = status;
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryResponse that = (CountryResponse) o;
        return statusCode == that.statusCode &&
                Objects.equals(status, that.status) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, status, message);
    }

    private int statusCode;
    private String status;
    private String message;

}
