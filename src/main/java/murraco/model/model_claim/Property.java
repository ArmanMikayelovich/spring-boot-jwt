package murraco.model.model_claim;

import murraco.model.model_claim.agency_location.Address;

import java.io.Serializable;
import java.util.List;

/**
 * The type Property.
 */
public class Property implements Serializable {
    private List<Coverege> coverages;

    private Address address;

    private Integer year;
    private String make;
    private String model;
    private String style;
    private String vehicleUse;

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
     * Gets address.
     *
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets year.
     *
     * @param year the year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Gets make.
     *
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets make.
     *
     * @param make the make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets model.
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets model.
     *
     * @param model the model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets style.
     *
     * @return the style
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets style.
     *
     * @param style the style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Gets vehicle use.
     *
     * @return the vehicle use
     */
    public String getVehicleUse() {
        return vehicleUse;
    }

    /**
     * Sets vehicle use.
     *
     * @param vehicleUse the vehicle use
     */
    public void setVehicleUse(String vehicleUse) {
        this.vehicleUse = vehicleUse;
    }
}

