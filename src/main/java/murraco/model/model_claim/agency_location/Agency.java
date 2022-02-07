package murraco.model.model_claim.agency_location;

import java.io.Serializable;

/**
 * The type Agency.
 */
public class Agency implements Serializable {
    /**
     * Gets agency name.
     *
     * @return the agency name
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets agency name.
     *
     * @param agencyName the agency name
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    /**
     * Gets agency code.
     *
     * @return the agency code
     */
    public Integer getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets agency code.
     *
     * @param agencyCode the agency code
     */
    public void setAgencyCode(Integer agencyCode) {
        this.agencyCode = agencyCode;
    }

    private String agencyName;
    private Integer agencyCode;
}
