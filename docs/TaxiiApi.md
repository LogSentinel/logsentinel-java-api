# TaxiiApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCollectionObjects**](TaxiiApi.md#getCollectionObjects) | **GET** /api/taxii/collections/{id}/objects | getCollectionObjects
[**getCollections**](TaxiiApi.md#getCollections) | **GET** /api/taxii/collections | getCollections


<a name="getCollectionObjects"></a>
# **getCollectionObjects**
> Bundle getCollectionObjects(id)

getCollectionObjects

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.TaxiiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaxiiApi apiInstance = new TaxiiApi();
String id = "id_example"; // String | id
try {
    Bundle result = apiInstance.getCollectionObjects(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxiiApi#getCollectionObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**Bundle**](Bundle.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.oasis.stix+json

<a name="getCollections"></a>
# **getCollections**
> TaxiiCollections getCollections()

getCollections

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.TaxiiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TaxiiApi apiInstance = new TaxiiApi();
try {
    TaxiiCollections result = apiInstance.getCollections();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxiiApi#getCollections");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxiiCollections**](TaxiiCollections.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/vnd.oasis.taxii+json

