package murraco.model.model_claim;


import murraco.model.model_claim.agency_location.Address;

/**
 * The type Communication.
 */
public class Communication {
    private Address mailingAddress;
    private String homePhone;
    private String email;

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

    /**
     * Gets home phone.
     *
     * @return the home phone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets home phone.
     *
     * @param homePhone the home phone
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
