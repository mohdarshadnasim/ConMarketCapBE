package com.backend.runner;

import com.currency.pojo.CurrencyPojo;
import com.currency.pojo.DataPojo;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;


public class BackEndTask_1 {


    @Test
    public void retrieveAndConvertCurrency() {
        String bitcoinId = null;
        String tetherID = null;
        String ethereumID = null;

        CurrencyPojo currencyPojo = given()
                .header("X-CMC_PRO_API_KEY", "3a452e95-acf9-482e-8964-3b7d1643ea60")
                .when()
                .get("https://pro-api.coinmarketcap.com/v1/cryptocurrency/map")
                .as(CurrencyPojo.class);

        /*
        * To get the Bitcoin ID and store in a bitcoinId variable
        * Print the ID in the console
        * */
        List<DataPojo> dataPojos = currencyPojo.getData();
        for (int i = 0; i < dataPojos.size(); i++) {
            if (dataPojos.get(i).getName().equals("Bitcoin")) {
                bitcoinId = dataPojos.get(i).getId();
            }
        }
        System.out.println("BitcoinID---->" + bitcoinId);

        /*
         * To get the Tether ID and store in a tetherID variable
         * Print the ID in the console
         * */
        for (int i = 0; i < dataPojos.size(); i++) {
            if (dataPojos.get(i).getName().equals("Tether")) {
                tetherID = dataPojos.get(i).getId();
            }
        }
        System.out.println("tetherID---->" + tetherID);


        /*
         * To get the Ethereum ID and store in a ethereumID variable
         * Print the ID in the console
         * */
        for (int i = 0; i < dataPojos.size(); i++) {
            if (dataPojos.get(i).getName().equals("Ethereum")) {
                ethereumID = dataPojos.get(i).getId();
            }
        }
        System.out.println("ethereumID---->" + ethereumID);

        /*
        * Converting 100 Bitcoin to Bolivian currency
        * */
        given()
                .header("X-CMC_PRO_API_KEY", "3a452e95-acf9-482e-8964-3b7d1643ea60")
                .param("amount", "100")
                .param("id", bitcoinId)
                .param("convert_id", "2832")
                .when()
                .get("https://pro-api.coinmarketcap.com/v1/tools/price-conversion")
                .then()
                .assertThat()
                .statusCode(200);

        /*
         * Converting 100 Tether to Bolivian currency
         * */
        given()
                .header("X-CMC_PRO_API_KEY", "3a452e95-acf9-482e-8964-3b7d1643ea60")
                .param("amount", "100")
                .param("id", tetherID)
                .param("convert_id", "2832")
                .when()
                .get("https://pro-api.coinmarketcap.com/v1/tools/price-conversion")
                .then()
                .assertThat()
                .statusCode(200);

        /*
         * Converting 100 Ethereum to Bolivian currency
         * */
        given()
                .header("X-CMC_PRO_API_KEY", "3a452e95-acf9-482e-8964-3b7d1643ea60")
                .param("amount", "100")
                .param("id", ethereumID)
                .param("convert_id", "2832")
                .when()
                .get("https://pro-api.coinmarketcap.com/v1/tools/price-conversion")
                .then()
                .assertThat()
                .statusCode(200);


    }

}

