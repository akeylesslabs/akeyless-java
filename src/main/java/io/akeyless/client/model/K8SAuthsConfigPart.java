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
import io.akeyless.client.model.K8SAuth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * K8SAuthsConfigPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class K8SAuthsConfigPart {
  public static final String SERIALIZED_NAME_K8S_AUTHS = "k8s_auths";
  @SerializedName(SERIALIZED_NAME_K8S_AUTHS)
  private List<K8SAuth> k8sAuths = null;

  public K8SAuthsConfigPart() { 
  }

  public K8SAuthsConfigPart k8sAuths(List<K8SAuth> k8sAuths) {
    
    this.k8sAuths = k8sAuths;
    return this;
  }

  public K8SAuthsConfigPart addK8sAuthsItem(K8SAuth k8sAuthsItem) {
    if (this.k8sAuths == null) {
      this.k8sAuths = new ArrayList<K8SAuth>();
    }
    this.k8sAuths.add(k8sAuthsItem);
    return this;
  }

   /**
   * Get k8sAuths
   * @return k8sAuths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<K8SAuth> getK8sAuths() {
    return k8sAuths;
  }


  public void setK8sAuths(List<K8SAuth> k8sAuths) {
    this.k8sAuths = k8sAuths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    K8SAuthsConfigPart k8SAuthsConfigPart = (K8SAuthsConfigPart) o;
    return Objects.equals(this.k8sAuths, k8SAuthsConfigPart.k8sAuths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(k8sAuths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8SAuthsConfigPart {\n");
    sb.append("    k8sAuths: ").append(toIndentedString(k8sAuths)).append("\n");
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

