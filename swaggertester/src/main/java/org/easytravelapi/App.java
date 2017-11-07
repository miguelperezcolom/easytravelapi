package org.easytravelapi;


import org.easytravelapi.swagger.client.ApiException;
import org.easytravelapi.swagger.client.api.DefaultApi;
import org.easytravelapi.swagger.client.model.BookActivityRQ;
import org.easytravelapi.swagger.client.model.BookActivityRS;

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
            BookActivityRS result = apiInstance.bookActivity("xxx", body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#bookActivity");
            e.printStackTrace();
        }


        System.out.println( "Hello World!" );
    }
}
