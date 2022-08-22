package murraco.model.person_data;

import java.io.Serializable;
import java.util.List;

/**
 * The type Person data.
 */
public class PersonData implements Serializable {
    private String id;
    private String status;
    private Double balance;
    private String name;
    private String email;
    private String phone;
    private String address;
    private List<String> tags;

    /**
     * Gets id.
     *
     * @return the id
     */
    private List<Friend> friends;


    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * Gets full name.
     *
     * @return the full name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets full name.
     *
     * @param name the full name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets tags.
     *
     * @return the tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * Sets tags.
     *
     * @param tags the tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Gets friends.
     *
     * @return the friends
     */
    public List<Friend> getFriends() {
        return friends;
    }

    /**
     * Sets friends.
     *
     * @param friends the friends
     */
    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    private static class Friend {
        private Integer id;
        private String name;

        /**
         * Gets id.
         *
         * @return the id
         */
        public Integer getId() {
            return id;
        }

        /**
         * Sets id.
         *
         * @param id the id
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * Gets name.
         *
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * Sets name.
         *
         * @param name the name
         */
        public void setName(String name) {
            this.name = name;
        }
    }
}
