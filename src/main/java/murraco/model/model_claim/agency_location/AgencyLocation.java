package murraco.model.model_claim.agency_location;

import java.io.Serializable;

/**
 * The type Agency location.
 */
public class AgencyLocation implements Serializable {
    private String agencyLocationName;
    private Agency agency;
    private Address mailingAddress;

    /**
     * Gets agency location name.
     *
     * @return the agency location name
     */
    public String getAgencyLocationName() {
        return agencyLocationName;
    }

    /**
     * Sets agency location name.
     *
     * @param agencyLocationName the agency location name
     */
    public void setAgencyLocationName(String agencyLocationName) {
        this.agencyLocationName = agencyLocationName;
    }

    /**
     * Gets agency.
     *
     * @return the agency
     */
    public Agency getAgency() {
        return agency;
    }

    /**
     * Sets agency.
     *
     * @param agency the agency
     */
    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    /**
     * Gets mailing address.
     *
     * @return the mailing address
     */
    public Address getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets mailing address.
     *
     * @param mailingAddress the mailing address
     */
    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}
