/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.akeyless.client.model.CustomerFragmentConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CustomerFragmentsConfigJson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomerFragmentsConfigJson {
  public static final String SERIALIZED_NAME_CUSTOMER_FRAGMENTS = "customer_fragments";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRAGMENTS)
  private List<CustomerFragmentConfig> customerFragments = null;

  public CustomerFragmentsConfigJson() { 
  }

  public CustomerFragmentsConfigJson customerFragments(List<CustomerFragmentConfig> customerFragments) {
    
    this.customerFragments = customerFragments;
    return this;
  }

  public CustomerFragmentsConfigJson addCustomerFragmentsItem(CustomerFragmentConfig customerFragmentsItem) {
    if (this.customerFragments == null) {
      this.customerFragments = new ArrayList<CustomerFragmentConfig>();
    }
    this.customerFragments.add(customerFragmentsItem);
    return this;
  }

   /**
   * Get customerFragments
   * @return customerFragments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomerFragmentConfig> getCustomerFragments() {
    return customerFragments;
  }


  public void setCustomerFragments(List<CustomerFragmentConfig> customerFragments) {
    this.customerFragments = customerFragments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerFragmentsConfigJson customerFragmentsConfigJson = (CustomerFragmentsConfigJson) o;
    return Objects.equals(this.customerFragments, customerFragmentsConfigJson.customerFragments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerFragments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerFragmentsConfigJson {\n");
    sb.append("    customerFragments: ").append(toIndentedString(customerFragments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

