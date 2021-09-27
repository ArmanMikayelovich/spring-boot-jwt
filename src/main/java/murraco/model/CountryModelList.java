package murraco.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Country model list.
 */
public class CountryModelList {
    private List<CountryModel> countryModelList = new ArrayList<>();


    /**
     * Gets country model list.
     *
     * @return the country model list
     */
    public List<CountryModel> getCountryModelList() {
        return countryModelList;
    }

    /**
     * Sets country model list.
     *
     * @param countryModelList the country model list
     */
    public void setCountryModelList(List<CountryModel> countryModelList) {
        this.countryModelList = countryModelList;
    }
}
