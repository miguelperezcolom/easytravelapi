package org.easytravelapi.hotel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.easytravelapi.common.AbstractRS;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 26/7/17.
 */
@ApiModel(description = "Container for the getavailability response")
public class GetHotelRatesRS extends AbstractRS {

    @ApiModelProperty(value = "Currency iso code for all rates")
    private String currencyIsoCode;

    @ApiModelProperty(value = "List of occupancies with available rates and supplements")
    private List<Allocation> rates = new ArrayList<Allocation>();

    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }

    public List<Allocation> getRates() {
        return rates;
    }

    public void setRates(List<Allocation> rates) {
        this.rates = rates;
    }

}
