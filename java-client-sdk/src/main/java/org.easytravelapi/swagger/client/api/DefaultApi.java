

package org.easytravelapi.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.BookActivityRQ;
import io.swagger.client.model.BookActivityRS;
import io.swagger.client.model.BookHotelRQ;
import io.swagger.client.model.BookHotelRS;
import io.swagger.client.model.BookTransferRQ;
import io.swagger.client.model.BookTransferRS;
import io.swagger.client.model.CancelBookingRS;
import io.swagger.client.model.ConfirmServicesRQ;
import io.swagger.client.model.ConfirmServicesRS;
import io.swagger.client.model.GetActivityPriceDetailsRS;
import io.swagger.client.model.GetAvailableActivitiesRS;
import io.swagger.client.model.GetAvailableHotelsRS;
import io.swagger.client.model.GetAvailableTransfersRS;
import io.swagger.client.model.GetBookingsRS;
import io.swagger.client.model.GetDataSheetRS;
import io.swagger.client.model.GetGrantedHotelsRS;
import io.swagger.client.model.GetHotelPriceDetailsRS;
import io.swagger.client.model.GetPortfolioRS;
import io.swagger.client.model.GetRoomingListRS;
import io.swagger.client.model.GetTransferPriceDetailsRS;
import io.swagger.client.model.UpdateRQ;
import io.swagger.client.model.UpdateRS;
import org.easytravelapi.swagger.client.Configuration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for bookActivity */
    private com.squareup.okhttp.Call bookActivityCall(String authtoken, BookActivityRQ body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling bookActivity(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/activity/booking".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Book an activity
     * Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return BookActivityRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BookActivityRS bookActivity(String authtoken, BookActivityRQ body) throws ApiException {
        ApiResponse<BookActivityRS> resp = bookActivityWithHttpInfo(authtoken, body);
        return resp.getData();
    }

    /**
     * Book an activity
     * Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return ApiResponse&lt;BookActivityRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BookActivityRS> bookActivityWithHttpInfo(String authtoken, BookActivityRQ body) throws ApiException {
        com.squareup.okhttp.Call call = bookActivityCall(authtoken, body, null, null);
        Type localVarReturnType = new TypeToken<BookActivityRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Book an activity (asynchronously)
     * Here you can confirm an activity booking. You must provide a price key and some additional data (lead name, comments, ...)
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bookActivityAsync(String authtoken, BookActivityRQ body, final ApiCallback<BookActivityRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = bookActivityCall(authtoken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BookActivityRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for bookHotel */
    private com.squareup.okhttp.Call bookHotelCall(String authtoken, BookHotelRQ body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling bookHotel(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/hotel/booking".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to confirm a hotel service
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return BookHotelRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BookHotelRS bookHotel(String authtoken, BookHotelRQ body) throws ApiException {
        ApiResponse<BookHotelRS> resp = bookHotelWithHttpInfo(authtoken, body);
        return resp.getData();
    }

    /**
     * Use this method to confirm a hotel service
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return ApiResponse&lt;BookHotelRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BookHotelRS> bookHotelWithHttpInfo(String authtoken, BookHotelRQ body) throws ApiException {
        com.squareup.okhttp.Call call = bookHotelCall(authtoken, body, null, null);
        Type localVarReturnType = new TypeToken<BookHotelRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to confirm a hotel service (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bookHotelAsync(String authtoken, BookHotelRQ body, final ApiCallback<BookHotelRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = bookHotelCall(authtoken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BookHotelRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for bookTransfer */
    private com.squareup.okhttp.Call bookTransferCall(String authtoken, BookTransferRQ body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling bookTransfer(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/transfer/booking".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to confirm a transfer service booking
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return BookTransferRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BookTransferRS bookTransfer(String authtoken, BookTransferRQ body) throws ApiException {
        ApiResponse<BookTransferRS> resp = bookTransferWithHttpInfo(authtoken, body);
        return resp.getData();
    }

    /**
     * Use this method to confirm a transfer service booking
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return ApiResponse&lt;BookTransferRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BookTransferRS> bookTransferWithHttpInfo(String authtoken, BookTransferRQ body) throws ApiException {
        com.squareup.okhttp.Call call = bookTransferCall(authtoken, body, null, null);
        Type localVarReturnType = new TypeToken<BookTransferRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to confirm a transfer service booking (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bookTransferAsync(String authtoken, BookTransferRQ body, final ApiCallback<BookTransferRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = bookTransferCall(authtoken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BookTransferRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for cancelBooking */
    private com.squareup.okhttp.Call cancelBookingCall(String authtoken, String bookingid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling cancelBooking(Async)");
        }
        
        // verify the required parameter 'bookingid' is set
        if (bookingid == null) {
            throw new ApiException("Missing the required parameter 'bookingid' when calling cancelBooking(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/commons/booking/{bookingid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()))
        .replaceAll("\\{" + "bookingid" + "\\}", apiClient.escapeString(bookingid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Method to cancel a service booking
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param bookingid The service booking id you want to cancel (required)
     * @return CancelBookingRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CancelBookingRS cancelBooking(String authtoken, String bookingid) throws ApiException {
        ApiResponse<CancelBookingRS> resp = cancelBookingWithHttpInfo(authtoken, bookingid);
        return resp.getData();
    }

    /**
     * Method to cancel a service booking
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param bookingid The service booking id you want to cancel (required)
     * @return ApiResponse&lt;CancelBookingRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CancelBookingRS> cancelBookingWithHttpInfo(String authtoken, String bookingid) throws ApiException {
        com.squareup.okhttp.Call call = cancelBookingCall(authtoken, bookingid, null, null);
        Type localVarReturnType = new TypeToken<CancelBookingRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Method to cancel a service booking (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param bookingid The service booking id you want to cancel (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelBookingAsync(String authtoken, String bookingid, final ApiCallback<CancelBookingRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = cancelBookingCall(authtoken, bookingid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CancelBookingRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for confirmServices */
    private com.squareup.okhttp.Call confirmServicesCall(String authtoken, ConfirmServicesRQ body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling confirmServices(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/channel/confirm".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to confirm or reject services
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return ConfirmServicesRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ConfirmServicesRS confirmServices(String authtoken, ConfirmServicesRQ body) throws ApiException {
        ApiResponse<ConfirmServicesRS> resp = confirmServicesWithHttpInfo(authtoken, body);
        return resp.getData();
    }

    /**
     * Use this method to confirm or reject services
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ConfirmServicesRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ConfirmServicesRS> confirmServicesWithHttpInfo(String authtoken, ConfirmServicesRQ body) throws ApiException {
        com.squareup.okhttp.Call call = confirmServicesCall(authtoken, body, null, null);
        Type localVarReturnType = new TypeToken<ConfirmServicesRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to confirm or reject services (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call confirmServicesAsync(String authtoken, ConfirmServicesRQ body, final ApiCallback<ConfirmServicesRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = confirmServicesCall(authtoken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ConfirmServicesRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getActivityPriceDetails */
    private com.squareup.okhttp.Call getActivityPriceDetailsCall(String authtoken, String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getActivityPriceDetails(Async)");
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling getActivityPriceDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/activity/pricedetails/{key}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()))
        .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get extra info
     * By passing a price key you get extra info
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The activity price key, as provided in the /activity/available step (required)
     * @return GetActivityPriceDetailsRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetActivityPriceDetailsRS getActivityPriceDetails(String authtoken, String key) throws ApiException {
        ApiResponse<GetActivityPriceDetailsRS> resp = getActivityPriceDetailsWithHttpInfo(authtoken, key);
        return resp.getData();
    }

    /**
     * Get extra info
     * By passing a price key you get extra info
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The activity price key, as provided in the /activity/available step (required)
     * @return ApiResponse&lt;GetActivityPriceDetailsRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetActivityPriceDetailsRS> getActivityPriceDetailsWithHttpInfo(String authtoken, String key) throws ApiException {
        com.squareup.okhttp.Call call = getActivityPriceDetailsCall(authtoken, key, null, null);
        Type localVarReturnType = new TypeToken<GetActivityPriceDetailsRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get extra info (asynchronously)
     * By passing a price key you get extra info
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The activity price key, as provided in the /activity/available step (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getActivityPriceDetailsAsync(String authtoken, String key, final ApiCallback<GetActivityPriceDetailsRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getActivityPriceDetailsCall(authtoken, key, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetActivityPriceDetailsRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAvailabeTransfers */
    private com.squareup.okhttp.Call getAvailabeTransfersCall(String authtoken, String from, String to, Integer pax, List<Integer> ages, Integer bikes, Integer golfs, Integer bigs, Integer wheelchairs, Integer incomingdate, Integer outgoingdate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getAvailabeTransfers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/transfer/available".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        if (to != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
        if (pax != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pax", pax));
        if (ages != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ages", ages));
        if (bikes != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bikes", bikes));
        if (golfs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "golfs", golfs));
        if (bigs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bigs", bigs));
        if (wheelchairs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "wheelchairs", wheelchairs));
        if (incomingdate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "incomingdate", incomingdate));
        if (outgoingdate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "outgoingdate", outgoingdate));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to know which transfers are available and their prices
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param from Transfer origin, as got in the getportfolio response (optional)
     * @param to Transfer destination, as got in the getportfolio response (optional)
     * @param pax Number of pax (optional)
     * @param ages Pax ages. If not present we will assume they are adults (optional)
     * @param bikes Number of bikes (optional)
     * @param golfs Number of golf baggages (optional)
     * @param bigs Number of big luggages not bikes neither golf baggages (optional)
     * @param wheelchairs Number of wheel chairs (optional)
     * @param incomingdate Locale date for the incoming side of the transfer, in YYYYMMDD format (optional)
     * @param outgoingdate Locale date for the outgoing / return side of the transfer, in YYYYMMDD format (optional)
     * @return GetAvailableTransfersRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAvailableTransfersRS getAvailabeTransfers(String authtoken, String from, String to, Integer pax, List<Integer> ages, Integer bikes, Integer golfs, Integer bigs, Integer wheelchairs, Integer incomingdate, Integer outgoingdate) throws ApiException {
        ApiResponse<GetAvailableTransfersRS> resp = getAvailabeTransfersWithHttpInfo(authtoken, from, to, pax, ages, bikes, golfs, bigs, wheelchairs, incomingdate, outgoingdate);
        return resp.getData();
    }

    /**
     * Use this method to know which transfers are available and their prices
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param from Transfer origin, as got in the getportfolio response (optional)
     * @param to Transfer destination, as got in the getportfolio response (optional)
     * @param pax Number of pax (optional)
     * @param ages Pax ages. If not present we will assume they are adults (optional)
     * @param bikes Number of bikes (optional)
     * @param golfs Number of golf baggages (optional)
     * @param bigs Number of big luggages not bikes neither golf baggages (optional)
     * @param wheelchairs Number of wheel chairs (optional)
     * @param incomingdate Locale date for the incoming side of the transfer, in YYYYMMDD format (optional)
     * @param outgoingdate Locale date for the outgoing / return side of the transfer, in YYYYMMDD format (optional)
     * @return ApiResponse&lt;GetAvailableTransfersRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAvailableTransfersRS> getAvailabeTransfersWithHttpInfo(String authtoken, String from, String to, Integer pax, List<Integer> ages, Integer bikes, Integer golfs, Integer bigs, Integer wheelchairs, Integer incomingdate, Integer outgoingdate) throws ApiException {
        com.squareup.okhttp.Call call = getAvailabeTransfersCall(authtoken, from, to, pax, ages, bikes, golfs, bigs, wheelchairs, incomingdate, outgoingdate, null, null);
        Type localVarReturnType = new TypeToken<GetAvailableTransfersRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to know which transfers are available and their prices (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param from Transfer origin, as got in the getportfolio response (optional)
     * @param to Transfer destination, as got in the getportfolio response (optional)
     * @param pax Number of pax (optional)
     * @param ages Pax ages. If not present we will assume they are adults (optional)
     * @param bikes Number of bikes (optional)
     * @param golfs Number of golf baggages (optional)
     * @param bigs Number of big luggages not bikes neither golf baggages (optional)
     * @param wheelchairs Number of wheel chairs (optional)
     * @param incomingdate Locale date for the incoming side of the transfer, in YYYYMMDD format (optional)
     * @param outgoingdate Locale date for the outgoing / return side of the transfer, in YYYYMMDD format (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAvailabeTransfersAsync(String authtoken, String from, String to, Integer pax, List<Integer> ages, Integer bikes, Integer golfs, Integer bigs, Integer wheelchairs, Integer incomingdate, Integer outgoingdate, final ApiCallback<GetAvailableTransfersRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAvailabeTransfersCall(authtoken, from, to, pax, ages, bikes, golfs, bigs, wheelchairs, incomingdate, outgoingdate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAvailableTransfersRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAvailableActivities */
    private com.squareup.okhttp.Call getAvailableActivitiesCall(String authtoken, Integer start, Integer end, String resourceid, Integer pax, List<Integer> ages, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getAvailableActivities(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/activity/available".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
        if (end != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end", end));
        if (resourceid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceid", resourceid));
        if (pax != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pax", pax));
        if (ages != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ages", ages));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get available activities
     * By passing a resort and holidays dates you get a list of the available activities
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param start Holidays start date in YYYYMMDD format (optional)
     * @param end Holidays end date in YYYYMMDD format (optional)
     * @param resourceid Resort ID. You can get it from commons/getportfolio (optional)
     * @param pax Number of pax (optional)
     * @param ages Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults (optional)
     * @return GetAvailableActivitiesRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAvailableActivitiesRS getAvailableActivities(String authtoken, Integer start, Integer end, String resourceid, Integer pax, List<Integer> ages) throws ApiException {
        ApiResponse<GetAvailableActivitiesRS> resp = getAvailableActivitiesWithHttpInfo(authtoken, start, end, resourceid, pax, ages);
        return resp.getData();
    }

    /**
     * Get available activities
     * By passing a resort and holidays dates you get a list of the available activities
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param start Holidays start date in YYYYMMDD format (optional)
     * @param end Holidays end date in YYYYMMDD format (optional)
     * @param resourceid Resort ID. You can get it from commons/getportfolio (optional)
     * @param pax Number of pax (optional)
     * @param ages Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults (optional)
     * @return ApiResponse&lt;GetAvailableActivitiesRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAvailableActivitiesRS> getAvailableActivitiesWithHttpInfo(String authtoken, Integer start, Integer end, String resourceid, Integer pax, List<Integer> ages) throws ApiException {
        com.squareup.okhttp.Call call = getAvailableActivitiesCall(authtoken, start, end, resourceid, pax, ages, null, null);
        Type localVarReturnType = new TypeToken<GetAvailableActivitiesRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get available activities (asynchronously)
     * By passing a resort and holidays dates you get a list of the available activities
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param start Holidays start date in YYYYMMDD format (optional)
     * @param end Holidays end date in YYYYMMDD format (optional)
     * @param resourceid Resort ID. You can get it from commons/getportfolio (optional)
     * @param pax Number of pax (optional)
     * @param ages Ages for the paxes. You can include just children ages. If not present all pax will be treated as adults (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAvailableActivitiesAsync(String authtoken, Integer start, Integer end, String resourceid, Integer pax, List<Integer> ages, final ApiCallback<GetAvailableActivitiesRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAvailableActivitiesCall(authtoken, start, end, resourceid, pax, ages, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAvailableActivitiesRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAvailableHotels */
    private com.squareup.okhttp.Call getAvailableHotelsCall(String authtoken, List<String> resorts, Integer checkin, Integer checkout, List<String> occupancies, Boolean includestaticinfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getAvailableHotels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/hotel/available".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (resorts != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "resorts", resorts));
        if (checkin != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkin", checkin));
        if (checkout != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkout", checkout));
        if (occupancies != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "occupancies", occupancies));
        if (includestaticinfo != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includestaticinfo", includestaticinfo));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to know which hotels are available and their prices
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param resorts The list of resorts you are interested in (optional)
     * @param checkin The locale checkin date in YYYYMMDD format (optional)
     * @param checkout The locale checkout date in YYYYMMDD format (optional)
     * @param occupancies List of occupancies you need (optional)
     * @param includestaticinfo Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter (optional)
     * @return GetAvailableHotelsRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetAvailableHotelsRS getAvailableHotels(String authtoken, List<String> resorts, Integer checkin, Integer checkout, List<String> occupancies, Boolean includestaticinfo) throws ApiException {
        ApiResponse<GetAvailableHotelsRS> resp = getAvailableHotelsWithHttpInfo(authtoken, resorts, checkin, checkout, occupancies, includestaticinfo);
        return resp.getData();
    }

    /**
     * Use this method to know which hotels are available and their prices
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param resorts The list of resorts you are interested in (optional)
     * @param checkin The locale checkin date in YYYYMMDD format (optional)
     * @param checkout The locale checkout date in YYYYMMDD format (optional)
     * @param occupancies List of occupancies you need (optional)
     * @param includestaticinfo Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter (optional)
     * @return ApiResponse&lt;GetAvailableHotelsRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetAvailableHotelsRS> getAvailableHotelsWithHttpInfo(String authtoken, List<String> resorts, Integer checkin, Integer checkout, List<String> occupancies, Boolean includestaticinfo) throws ApiException {
        com.squareup.okhttp.Call call = getAvailableHotelsCall(authtoken, resorts, checkin, checkout, occupancies, includestaticinfo, null, null);
        Type localVarReturnType = new TypeToken<GetAvailableHotelsRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to know which hotels are available and their prices (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param resorts The list of resorts you are interested in (optional)
     * @param checkin The locale checkin date in YYYYMMDD format (optional)
     * @param checkout The locale checkout date in YYYYMMDD format (optional)
     * @param occupancies List of occupancies you need (optional)
     * @param includestaticinfo Set to true if you want the response to include static info (hotel description, main hotel image, ...). If false (default value) static info will not be included in order to make the response lighter (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAvailableHotelsAsync(String authtoken, List<String> resorts, Integer checkin, Integer checkout, List<String> occupancies, Boolean includestaticinfo, final ApiCallback<GetAvailableHotelsRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAvailableHotelsCall(authtoken, resorts, checkin, checkout, occupancies, includestaticinfo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetAvailableHotelsRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getBookings */
    private com.squareup.okhttp.Call getBookingsCall(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getBookings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/commons/bookings".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (confirmedfrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confirmedfrom", confirmedfrom));
        if (confirmedto != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confirmedto", confirmedto));
        if (startingfrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startingfrom", startingfrom));
        if (startingto != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startingto", startingto));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Method to get a list of bookings
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param confirmedfrom Starting date you want service bookings confirmed from. In YYYYMMDD format (optional)
     * @param confirmedto Ending date you want service bookings confirmed to. In YYYYMMDD format (optional)
     * @param startingfrom Starting date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param startingto Ending date you want service bookings starting from. In YYYYMMDD format (optional)
     * @return GetBookingsRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetBookingsRS getBookings(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto) throws ApiException {
        ApiResponse<GetBookingsRS> resp = getBookingsWithHttpInfo(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);
        return resp.getData();
    }

    /**
     * Method to get a list of bookings
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param confirmedfrom Starting date you want service bookings confirmed from. In YYYYMMDD format (optional)
     * @param confirmedto Ending date you want service bookings confirmed to. In YYYYMMDD format (optional)
     * @param startingfrom Starting date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param startingto Ending date you want service bookings starting from. In YYYYMMDD format (optional)
     * @return ApiResponse&lt;GetBookingsRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetBookingsRS> getBookingsWithHttpInfo(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto) throws ApiException {
        com.squareup.okhttp.Call call = getBookingsCall(authtoken, confirmedfrom, confirmedto, startingfrom, startingto, null, null);
        Type localVarReturnType = new TypeToken<GetBookingsRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Method to get a list of bookings (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param confirmedfrom Starting date you want service bookings confirmed from. In YYYYMMDD format (optional)
     * @param confirmedto Ending date you want service bookings confirmed to. In YYYYMMDD format (optional)
     * @param startingfrom Starting date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param startingto Ending date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBookingsAsync(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto, final ApiCallback<GetBookingsRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getBookingsCall(authtoken, confirmedfrom, confirmedto, startingfrom, startingto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetBookingsRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getDataSheet */
    private com.squareup.okhttp.Call getDataSheetCall(String authtoken, String resourceid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getDataSheet(Async)");
        }
        
        // verify the required parameter 'resourceid' is set
        if (resourceid == null) {
            throw new ApiException("Missing the required parameter 'resourceid' when calling getDataSheet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/commons/datasheet/{resourceid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()))
        .replaceAll("\\{" + "resourceid" + "\\}", apiClient.escapeString(resourceid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Method to get a resource data sheet. E.g. descriptions, images, features
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param resourceid  (required)
     * @return GetDataSheetRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDataSheetRS getDataSheet(String authtoken, String resourceid) throws ApiException {
        ApiResponse<GetDataSheetRS> resp = getDataSheetWithHttpInfo(authtoken, resourceid);
        return resp.getData();
    }

    /**
     * Method to get a resource data sheet. E.g. descriptions, images, features
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param resourceid  (required)
     * @return ApiResponse&lt;GetDataSheetRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetDataSheetRS> getDataSheetWithHttpInfo(String authtoken, String resourceid) throws ApiException {
        com.squareup.okhttp.Call call = getDataSheetCall(authtoken, resourceid, null, null);
        Type localVarReturnType = new TypeToken<GetDataSheetRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Method to get a resource data sheet. E.g. descriptions, images, features (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param resourceid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDataSheetAsync(String authtoken, String resourceid, final ApiCallback<GetDataSheetRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDataSheetCall(authtoken, resourceid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetDataSheetRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getGrantedHotels */
    private com.squareup.okhttp.Call getGrantedHotelsCall(String authtoken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getGrantedHotels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/channel/granted".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @return GetGrantedHotelsRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetGrantedHotelsRS getGrantedHotels(String authtoken) throws ApiException {
        ApiResponse<GetGrantedHotelsRS> resp = getGrantedHotelsWithHttpInfo(authtoken);
        return resp.getData();
    }

    /**
     * Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @return ApiResponse&lt;GetGrantedHotelsRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetGrantedHotelsRS> getGrantedHotelsWithHttpInfo(String authtoken) throws ApiException {
        com.squareup.okhttp.Call call = getGrantedHotelsCall(authtoken, null, null);
        Type localVarReturnType = new TypeToken<GetGrantedHotelsRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to know which hotels are you allowed to update. It provides the ids to be used by the channel manager (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGrantedHotelsAsync(String authtoken, final ApiCallback<GetGrantedHotelsRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getGrantedHotelsCall(authtoken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetGrantedHotelsRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getHotelPriceDetails */
    private com.squareup.okhttp.Call getHotelPriceDetailsCall(String authtoken, String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getHotelPriceDetails(Async)");
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling getHotelPriceDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/hotel/pricedetails/{key}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()))
        .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this methos to guess cancellation costs and important remarks regarding a price
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The hotel price key, as provided in the /hotel/available step (required)
     * @return GetHotelPriceDetailsRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetHotelPriceDetailsRS getHotelPriceDetails(String authtoken, String key) throws ApiException {
        ApiResponse<GetHotelPriceDetailsRS> resp = getHotelPriceDetailsWithHttpInfo(authtoken, key);
        return resp.getData();
    }

    /**
     * Use this methos to guess cancellation costs and important remarks regarding a price
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The hotel price key, as provided in the /hotel/available step (required)
     * @return ApiResponse&lt;GetHotelPriceDetailsRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetHotelPriceDetailsRS> getHotelPriceDetailsWithHttpInfo(String authtoken, String key) throws ApiException {
        com.squareup.okhttp.Call call = getHotelPriceDetailsCall(authtoken, key, null, null);
        Type localVarReturnType = new TypeToken<GetHotelPriceDetailsRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this methos to guess cancellation costs and important remarks regarding a price (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The hotel price key, as provided in the /hotel/available step (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHotelPriceDetailsAsync(String authtoken, String key, final ApiCallback<GetHotelPriceDetailsRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHotelPriceDetailsCall(authtoken, key, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetHotelPriceDetailsRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPortfolio */
    private com.squareup.okhttp.Call getPortfolioCall(String authtoken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getPortfolio(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/commons/portfolio".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Method to get the whole product tree
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @return GetPortfolioRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPortfolioRS getPortfolio(String authtoken) throws ApiException {
        ApiResponse<GetPortfolioRS> resp = getPortfolioWithHttpInfo(authtoken);
        return resp.getData();
    }

    /**
     * Method to get the whole product tree
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @return ApiResponse&lt;GetPortfolioRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPortfolioRS> getPortfolioWithHttpInfo(String authtoken) throws ApiException {
        com.squareup.okhttp.Call call = getPortfolioCall(authtoken, null, null);
        Type localVarReturnType = new TypeToken<GetPortfolioRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Method to get the whole product tree (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPortfolioAsync(String authtoken, final ApiCallback<GetPortfolioRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPortfolioCall(authtoken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPortfolioRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getRoomingList */
    private com.squareup.okhttp.Call getRoomingListCall(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getRoomingList(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/channel/roominglist".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (confirmedfrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confirmedfrom", confirmedfrom));
        if (confirmedto != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "confirmedto", confirmedto));
        if (startingfrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startingfrom", startingfrom));
        if (startingto != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startingto", startingto));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to download the list of hotel bookings
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param confirmedfrom Starting date you want service bookings confirmed from. In YYYYMMDD format (optional)
     * @param confirmedto Ending date you want service bookings confirmed to. In YYYYMMDD format (optional)
     * @param startingfrom Starting date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param startingto Ending date you want service bookings starting from. In YYYYMMDD format (optional)
     * @return GetRoomingListRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetRoomingListRS getRoomingList(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto) throws ApiException {
        ApiResponse<GetRoomingListRS> resp = getRoomingListWithHttpInfo(authtoken, confirmedfrom, confirmedto, startingfrom, startingto);
        return resp.getData();
    }

    /**
     * Use this method to download the list of hotel bookings
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param confirmedfrom Starting date you want service bookings confirmed from. In YYYYMMDD format (optional)
     * @param confirmedto Ending date you want service bookings confirmed to. In YYYYMMDD format (optional)
     * @param startingfrom Starting date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param startingto Ending date you want service bookings starting from. In YYYYMMDD format (optional)
     * @return ApiResponse&lt;GetRoomingListRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetRoomingListRS> getRoomingListWithHttpInfo(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto) throws ApiException {
        com.squareup.okhttp.Call call = getRoomingListCall(authtoken, confirmedfrom, confirmedto, startingfrom, startingto, null, null);
        Type localVarReturnType = new TypeToken<GetRoomingListRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to download the list of hotel bookings (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param confirmedfrom Starting date you want service bookings confirmed from. In YYYYMMDD format (optional)
     * @param confirmedto Ending date you want service bookings confirmed to. In YYYYMMDD format (optional)
     * @param startingfrom Starting date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param startingto Ending date you want service bookings starting from. In YYYYMMDD format (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRoomingListAsync(String authtoken, Integer confirmedfrom, Integer confirmedto, Integer startingfrom, Integer startingto, final ApiCallback<GetRoomingListRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRoomingListCall(authtoken, confirmedfrom, confirmedto, startingfrom, startingto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetRoomingListRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getToken */
    private com.squareup.okhttp.Call getTokenCall(String authtoken, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getToken(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/commons/newtoken".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (user != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "user", user));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to get or renew your authentication token
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param user  (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getToken(String authtoken, String user) throws ApiException {
        ApiResponse<String> resp = getTokenWithHttpInfo(authtoken, user);
        return resp.getData();
    }

    /**
     * Use this method to get or renew your authentication token
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param user  (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getTokenWithHttpInfo(String authtoken, String user) throws ApiException {
        com.squareup.okhttp.Call call = getTokenCall(authtoken, user, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to get or renew your authentication token (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param user  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTokenAsync(String authtoken, String user, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTokenCall(authtoken, user, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTransferPriceDetails */
    private com.squareup.okhttp.Call getTransferPriceDetailsCall(String authtoken, String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling getTransferPriceDetails(Async)");
        }
        
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling getTransferPriceDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/transfer/pricedetails/{key}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()))
        .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to guess cancellation costs and important remarks
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The hotel price key, as provided in the /transfer/available step (required)
     * @return GetTransferPriceDetailsRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetTransferPriceDetailsRS getTransferPriceDetails(String authtoken, String key) throws ApiException {
        ApiResponse<GetTransferPriceDetailsRS> resp = getTransferPriceDetailsWithHttpInfo(authtoken, key);
        return resp.getData();
    }

    /**
     * Use this method to guess cancellation costs and important remarks
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The hotel price key, as provided in the /transfer/available step (required)
     * @return ApiResponse&lt;GetTransferPriceDetailsRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetTransferPriceDetailsRS> getTransferPriceDetailsWithHttpInfo(String authtoken, String key) throws ApiException {
        com.squareup.okhttp.Call call = getTransferPriceDetailsCall(authtoken, key, null, null);
        Type localVarReturnType = new TypeToken<GetTransferPriceDetailsRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to guess cancellation costs and important remarks (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param key The hotel price key, as provided in the /transfer/available step (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTransferPriceDetailsAsync(String authtoken, String key, final ApiCallback<GetTransferPriceDetailsRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTransferPriceDetailsCall(authtoken, key, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetTransferPriceDetailsRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for update */
    private com.squareup.okhttp.Call updateCall(String authtoken, UpdateRQ body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'authtoken' is set
        if (authtoken == null) {
            throw new ApiException("Missing the required parameter 'authtoken' when calling update(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/{authtoken}/channel/hotel/inventory".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "authtoken" + "\\}", apiClient.escapeString(authtoken.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Use this method to update hotel inventory
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return UpdateRS
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateRS update(String authtoken, UpdateRQ body) throws ApiException {
        ApiResponse<UpdateRS> resp = updateWithHttpInfo(authtoken, body);
        return resp.getData();
    }

    /**
     * Use this method to update hotel inventory
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @return ApiResponse&lt;UpdateRS&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateRS> updateWithHttpInfo(String authtoken, UpdateRQ body) throws ApiException {
        com.squareup.okhttp.Call call = updateCall(authtoken, body, null, null);
        Type localVarReturnType = new TypeToken<UpdateRS>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Use this method to update hotel inventory (asynchronously)
     * 
     * @param authtoken Auth token provided by your partner, and possibly renewed by using the /commons/newtoken method (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(String authtoken, UpdateRQ body, final ApiCallback<UpdateRS> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateCall(authtoken, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateRS>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
