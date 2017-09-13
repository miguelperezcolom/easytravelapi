package org.easytravelapi;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.BookActivityRQ;
import io.swagger.client.model.BookActivityRS;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        DefaultApi apiInstance = new DefaultApi();

        apiInstance.getApiClient().setBasePath("http://localhost:8080/easytravelapi/rest");

        BookActivityRQ body = new BookActivityRQ(); // BookActivityRQ |
        try {
            BookActivityRS result = apiInstance.bookActivity(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bookActivity");
            e.printStackTrace();
        }


        System.out.println( "Hello World!" );
    }
}
