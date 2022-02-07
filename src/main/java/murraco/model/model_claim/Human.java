package murraco.model.model_claim;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * The type Human.
 */
public class Human implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private String relationship;
    private String licenseNumber;
    private String martialStatus;
    private String licenseState;
    private String gender;
    private boolean hasSr22Filing;



    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets date of birth.
     *
     * @return the date of birth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets date of birth.
     *
     * @param dateOfBirth the date of birth
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets relationship.
     *
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets relationship.
     *
     * @param relationship the relationship
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * Gets license number.
     *
     * @return the license number
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets license number.
     *
     * @param licenseNumber the license number
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * Gets martial status.
     *
     * @return the martial status
     */
    public String getMartialStatus() {
        return martialStatus;
    }

    /**
     * Sets martial status.
     *
     * @param martialStatus the martial status
     */
    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    /**
     * Gets license state.
     *
     * @return the license state
     */
    public String getLicenseState() {
        return licenseState;
    }

    /**
     * Sets license state.
     *
     * @param licenseState the license state
     */
    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Is has sr 22 filing boolean.
     *
     * @return the boolean
     */
    public boolean isHasSr22Filing() {
        return hasSr22Filing;
    }

    /**
     * Sets has sr 22 filing.
     *
     * @param hasSr22Filing the has sr 22 filing
     */
    public void setHasSr22Filing(boolean hasSr22Filing) {
        this.hasSr22Filing = hasSr22Filing;
    }

}
