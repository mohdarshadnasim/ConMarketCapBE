package com.backend.runner;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BackEndTask_2 {

    @Test
    public void currencyInfoAPIVerification(){

        given()

                /*Retrieve the Ethereum (ID 1027) technical documentation website from
                the cryptocurrency/info call.
                */
                .header("X-CMC_PRO_API_KEY", "3a452e95-acf9-482e-8964-3b7d1643ea60")
                .param("id","1027")
                .when()
                .get("https://pro-api.coinmarketcap.com/v1/cryptocurrency/info?id=1027")
                .then()
                .assertThat()
                .statusCode(200)
                //2
                .body("data.1027.logo", equalTo("https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png"))
                //3
                .body("data.1027.urls.technical_doc[0]", equalTo("https://github.com/ethereum/wiki/wiki/White-Paper"))
                //4
                .body("data.1027.symbol", equalTo("ETH"))
                //5
                .body("data.1027.date_added", equalTo("2015-08-07T00:00:00.000Z"))
                //6
                .body("data.1027.platform", is(nullValue()))
                //7
                .body("data.1027.tags[0]", equalTo("mineable"));

    }
}
