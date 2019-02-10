package com.rr19.gateway.tests;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataModelSpec {

    @BeforeTest
    public void setup() {
    }

    @Test
    public void validateSchema() {

        assertThat(MOCK_DATA, matchesJsonSchemaInClasspath("dashboard.schema.json"));
    }

    private String get(String url) {
        try {
            return Unirest.get(url).header("Accept", "application/json").asString().getBody();
        } catch (UnirestException e) {
            throw new RuntimeException(String.format("the `get` call failed | url: %s returned this error %s ", url, e.toString()));
        }
    }

    /*
        if this was a real project, i would have either spin up a mock server to provide the data
        or used property files
        it is not my normal practice to have hard coded data inside of tests
     */
    private static String MOCK_DATA = "  [{\n" +
            "    \"title\": \"Tagtune\",\n" +
            "    \"division\": \"Accounting\",\n" +
            "    \"project_owner\": \"Kevin Snyder\",\n" +
            "    \"budget\": 20614.14,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"09/14/2015\",\n" +
            "    \"modified\": \"10/02/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Oyoyo\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Eugene Brown\",\n" +
            "    \"budget\": 22106.44,\n" +
            "    \"status\": \"new\",\n" +
            "    \"created\": \"07/17/2015\",\n" +
            "    \"modified\": null\n" +
            "  }, {\n" +
            "    \"title\": \"Lajo\",\n" +
            "    \"division\": \"Marketing\",\n" +
            "    \"project_owner\": \"Killgore Trout\",\n" +
            "    \"budget\": 15481.27,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"07/19/2015\",\n" +
            "    \"modified\": \"09/17/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Blognation\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Richard Henry\",\n" +
            "    \"budget\": 24017.98,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"08/03/2015\",\n" +
            "    \"modified\": \"09/17/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Vinte\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Michelle Webb\",\n" +
            "    \"budget\": 12935.84,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"08/05/2015\",\n" +
            "    \"modified\": \"09/15/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Aibox\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Killgore Trout\",\n" +
            "    \"budget\": 15991.78,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"09/03/2015\",\n" +
            "    \"modified\": \"10/02/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Buzzdog\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Michelle Webb\",\n" +
            "    \"budget\": 22610.09,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"07/26/2015\",\n" +
            "    \"modified\": \"10/01/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Plambee\",\n" +
            "    \"division\": \"Sales\",\n" +
            "    \"project_owner\": \"Michelle Webb\",\n" +
            "    \"budget\": 14229.02,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"09/14/2015\",\n" +
            "    \"modified\": \"10/01/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Photobug\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"James Holden\",\n" +
            "    \"budget\": 10959.29,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"09/03/2015\",\n" +
            "    \"modified\": \"09/18/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Quimm\",\n" +
            "    \"division\": \"Marketing\",\n" +
            "    \"project_owner\": \"James Holden\",\n" +
            "    \"budget\": 14139.38,\n" +
            "    \"status\": \"delivered\",\n" +
            "    \"created\": \"08/02/2015\",\n" +
            "    \"modified\": \"09/26/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Innojam\",\n" +
            "    \"division\": \"Sales\",\n" +
            "    \"project_owner\": \"Eugene Brown\",\n" +
            "    \"budget\": 24318.05,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"09/13/2015\",\n" +
            "    \"modified\": \"09/20/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Jaxworks\",\n" +
            "    \"division\": \"Production\",\n" +
            "    \"project_owner\": \"Michelle Webb\",\n" +
            "    \"budget\": 15054.27,\n" +
            "    \"status\": \"new\",\n" +
            "    \"created\": \"08/12/2015\",\n" +
            "    \"modified\": null\n" +
            "  }, {\n" +
            "    \"title\": \"Skyble\",\n" +
            "    \"division\": \"Accounting\",\n" +
            "    \"project_owner\": \"Richard Henry\",\n" +
            "    \"budget\": 13810.1,\n" +
            "    \"status\": \"delivered\",\n" +
            "    \"created\": \"07/12/2015\",\n" +
            "    \"modified\": \"09/21/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Photobean\",\n" +
            "    \"division\": \"Marketing\",\n" +
            "    \"project_owner\": \"Michelle Webb\",\n" +
            "    \"budget\": 12637.95,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"08/24/2015\",\n" +
            "    \"modified\": \"09/15/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Topicware\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Eugene Brown\",\n" +
            "    \"budget\": 9667.52,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"08/01/2015\",\n" +
            "    \"modified\": \"09/29/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Buzzster\",\n" +
            "    \"division\": \"Production\",\n" +
            "    \"project_owner\": \"Nicole Smith\",\n" +
            "    \"budget\": 14657.54,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"08/09/2015\",\n" +
            "    \"modified\": \"09/18/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Twinte\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Kevin Snyder\",\n" +
            "    \"budget\": 17729.37,\n" +
            "    \"status\": \"delivered\",\n" +
            "    \"created\": \"09/09/2015\",\n" +
            "    \"modified\": \"09/18/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Blognation\",\n" +
            "    \"division\": \"Production\",\n" +
            "    \"project_owner\": \"Eugene Brown\",\n" +
            "    \"budget\": 19540.82,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"07/21/2015\",\n" +
            "    \"modified\": \"09/22/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Flashdog\",\n" +
            "    \"division\": \"Production\",\n" +
            "    \"project_owner\": \"Michelle Webb\",\n" +
            "    \"budget\": 24870.61,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"07/05/2015\",\n" +
            "    \"modified\": \"10/02/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Yakijo\",\n" +
            "    \"division\": \"Accounting\",\n" +
            "    \"project_owner\": \"Killgore Trout\",\n" +
            "    \"budget\": 23533.54,\n" +
            "    \"status\": \"working\",\n" +
            "    \"created\": \"08/12/2015\",\n" +
            "    \"modified\": \"10/01/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Quatz\",\n" +
            "    \"division\": \"Sales\",\n" +
            "    \"project_owner\": \"Richard Henry\",\n" +
            "    \"budget\": 23639.65,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"07/19/2015\",\n" +
            "    \"modified\": \"09/19/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Dabjam\",\n" +
            "    \"division\": \"Marketing\",\n" +
            "    \"project_owner\": \"Kevin Snyder\",\n" +
            "    \"budget\": 14356.55,\n" +
            "    \"status\": \"new\",\n" +
            "    \"created\": \"08/22/2015\",\n" +
            "    \"modified\": null\n" +
            "  }, {\n" +
            "    \"title\": \"Meetz\",\n" +
            "    \"division\": \"Sales\",\n" +
            "    \"project_owner\": \"Kevin Snyder\",\n" +
            "    \"budget\": 13882.22,\n" +
            "    \"status\": \"delivered\",\n" +
            "    \"created\": \"08/26/2015\",\n" +
            "    \"modified\": \"10/01/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Flipopia\",\n" +
            "    \"division\": \"Marketing\",\n" +
            "    \"project_owner\": \"Eugene Brown\",\n" +
            "    \"budget\": 10306.87,\n" +
            "    \"status\": \"delivered\",\n" +
            "    \"created\": \"08/11/2015\",\n" +
            "    \"modified\": \"09/17/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Quaxo\",\n" +
            "    \"division\": \"Administration\",\n" +
            "    \"project_owner\": \"Nicole Smith\",\n" +
            "    \"budget\": 13945.69,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"07/13/2015\",\n" +
            "    \"modified\": \"09/21/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Trunyx\",\n" +
            "    \"division\": \"Production\",\n" +
            "    \"project_owner\": \"Nicole Smith\",\n" +
            "    \"budget\": 23136.21,\n" +
            "    \"status\": \"delivered\",\n" +
            "    \"created\": \"09/03/2015\",\n" +
            "    \"modified\": \"09/19/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Dabtype\",\n" +
            "    \"division\": \"Marketing\",\n" +
            "    \"project_owner\": \"Richard Henry\",\n" +
            "    \"budget\": 22000.98,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"08/26/2015\",\n" +
            "    \"modified\": \"09/28/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Meetz\",\n" +
            "    \"division\": \"Marketing\",\n" +
            "    \"project_owner\": \"Eugene Brown\",\n" +
            "    \"budget\": 17620.23,\n" +
            "    \"status\": \"new\",\n" +
            "    \"created\": \"09/08/2015\",\n" +
            "    \"modified\": null\n" +
            "  }, {\n" +
            "    \"title\": \"Kimia\",\n" +
            "    \"division\": \"Sales\",\n" +
            "    \"project_owner\": \"Richard Henry\",\n" +
            "    \"budget\": 12061.73,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"08/31/2015\",\n" +
            "    \"modified\": \"09/29/2015\"\n" +
            "  }, {\n" +
            "    \"title\": \"Dazzlesphere\",\n" +
            "    \"division\": \"Accounting\",\n" +
            "    \"project_owner\": \"Eugene Brown\",\n" +
            "    \"budget\": 21443.97,\n" +
            "    \"status\": \"archived\",\n" +
            "    \"created\": \"07/20/2015\",\n" +
            "    \"modified\": \"10/01/2015\"\n" +
            "  }]\n";
}