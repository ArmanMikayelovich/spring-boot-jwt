package murraco.model;

import murraco.model.person_data.PersonData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Car model.
 */
public class CarModel implements Serializable {

    private List<String> countriesWhereTheCarWas = new ArrayList<>();

    private Integer year;

    private String brand;

    private String model;

    private String description;

    private Boolean onBoardComputer;


    private Boolean gasEquipment;

    private Boolean audioSystem;

    private Boolean autoDrive;


    private List<PersonData> drivers = new ArrayList<>();


    /**
     * Gets countries where the car was.
     *
     * @return the countries where the car was
     */
    public List<String> getCountriesWhereTheCarWas() {
        return countriesWhereTheCarWas;
    }

    /**
     * Sets countries where the car was.
     *
     * @param countriesWhereTheCarWas the countries where the car was
     */
    public void setCountriesWhereTheCarWas(List<String> countriesWhereTheCarWas) {
        this.countriesWhereTheCarWas = countriesWhereTheCarWas;
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
     * Gets brand.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets brand.
     *
     * @param brand the brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets on board computer.
     *
     * @return the on board computer
     */
    public Boolean getOnBoardComputer() {
        return onBoardComputer;
    }

    /**
     * Sets on board computer.
     *
     * @param onBoardComputer the on board computer
     */
    public void setOnBoardComputer(Boolean onBoardComputer) {
        this.onBoardComputer = onBoardComputer;
    }

    /**
     * Gets gas equipment.
     *
     * @return the gas equipment
     */
    public Boolean getGasEquipment() {
        return gasEquipment;
    }

    /**
     * Sets gas equipment.
     *
     * @param gasEquipment the gas equipment
     */
    public void setGasEquipment(Boolean gasEquipment) {
        this.gasEquipment = gasEquipment;
    }

    /**
     * Gets audio system.
     *
     * @return the audio system
     */
    public Boolean getAudioSystem() {
        return audioSystem;
    }

    /**
     * Sets audio system.
     *
     * @param audioSystem the audio system
     */
    public void setAudioSystem(Boolean audioSystem) {
        this.audioSystem = audioSystem;
    }

    /**
     * Gets auto drive.
     *
     * @return the auto drive
     */
    public Boolean getAutoDrive() {
        return autoDrive;
    }

    /**
     * Sets auto drive.
     *
     * @param autoDrive the auto drive
     */
    public void setAutoDrive(Boolean autoDrive) {
        this.autoDrive = autoDrive;
    }

    /**
     * Gets drivers.
     *
     * @return the drivers
     */
    public List<PersonData> getDrivers() {
        return drivers;
    }

    /**
     * Sets drivers.
     *
     * @param drivers the drivers
     */
    public void setDrivers(List<PersonData> drivers) {
        this.drivers = drivers;
    }
}
