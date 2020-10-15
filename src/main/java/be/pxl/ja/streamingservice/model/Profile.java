package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public int getAge() {
        return (Period.between(dateOfBirth, LocalDate.now())).getYears();
    }

    public boolean allowedToWatch(Content content) {
        if (dateOfBirth == null) {
            return false;
        }
        return content.getMaturityRating().getMinimumAge() <= getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
