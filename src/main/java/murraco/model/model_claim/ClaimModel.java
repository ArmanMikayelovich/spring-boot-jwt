package murraco.model.model_claim;

import com.fasterxml.jackson.annotation.JsonFormat;
import murraco.model.model_claim.agency_location.AgencyLocation;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


/**
 * The type Claim model.
 */
public class ClaimModel implements Serializable {
    private String state;

    private AgencyLocation agencyLocation;

    private List<Coverege> coverages;

    private String policyNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    private Date policyDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
    private Date effectiveDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
    private Date expirationDate;

    private String policyTerm;

    private String policyStatus;

    private Communication communication;

    private List<Human> insured;

    private List<Property> properties;

    private List<Human> excludedDrivers;

    private List<Question> questions;
    private String timezone;

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets agency location.
     *
     * @return the agency location
     */
    public AgencyLocation getAgencyLocation() {
        return agencyLocation;
    }

    /**
     * Sets agency location.
     *
     * @param agencyLocation the agency location
     */
    public void setAgencyLocation(AgencyLocation agencyLocation) {
        this.agencyLocation = agencyLocation;
    }

    /**
     * Gets coverages.
     *
     * @return the coverages
     */
    public List<Coverege> getCoverages() {
        return coverages;
    }

    /**
     * Sets coverages.
     *
     * @param coverages the coverages
     */
    public void setCoverages(List<Coverege> coverages) {
        this.coverages = coverages;
    }

    /**
     * Gets policy number.
     *
     * @return the policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets policy number.
     *
     * @param policyNumber the policy number
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Gets policy date.
     *
     * @return the policy date
     */
    public Date getPolicyDate() {
        return policyDate;
    }

    /**
     * Sets policy date.
     *
     * @param policyDate the policy date
     */
    public void setPolicyDate(Date policyDate) {
        this.policyDate = policyDate;
    }

    /**
     * Gets effective date.
     *
     * @return the effective date
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets effective date.
     *
     * @param effectiveDate the effective date
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * Gets expiration date.
     *
     * @return the expiration date
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets expiration date.
     *
     * @param expirationDate the expiration date
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Gets policy term.
     *
     * @return the policy term
     */
    public String getPolicyTerm() {
        return policyTerm;
    }

    /**
     * Sets policy term.
     *
     * @param policyTerm the policy term
     */
    public void setPolicyTerm(String policyTerm) {
        this.policyTerm = policyTerm;
    }

    /**
     * Gets policy status.
     *
     * @return the policy status
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * Sets policy status.
     *
     * @param policyStatus the policy status
     */
    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    /**
     * Gets communication.
     *
     * @return the communication
     */
    public Communication getCommunication() {
        return communication;
    }

    /**
     * Sets communication.
     *
     * @param communication the communication
     */
    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    /**
     * Gets insured.
     *
     * @return the insured
     */
    public List<Human> getInsured() {
        return insured;
    }

    /**
     * Sets insured.
     *
     * @param insured the insured
     */
    public void setInsured(List<Human> insured) {
        this.insured = insured;
    }

    /**
     * Gets properties.
     *
     * @return the properties
     */
    public List<Property> getProperties() {
        return properties;
    }

    /**
     * Sets properties.
     *
     * @param properties the properties
     */
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    /**
     * Gets excluded drivers.
     *
     * @return the excluded drivers
     */
    public List<Human> getExcludedDrivers() {
        return excludedDrivers;
    }

    /**
     * Sets excluded drivers.
     *
     * @param excludedDrivers the excluded drivers
     */
    public void setExcludedDrivers(List<Human> excludedDrivers) {
        this.excludedDrivers = excludedDrivers;
    }

    /**
     * Gets questions.
     *
     * @return the questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * Sets questions.
     *
     * @param questions the questions
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    /**
     * Gets timezone.
     *
     * @return the timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets timezone.
     *
     * @param timezone the timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
