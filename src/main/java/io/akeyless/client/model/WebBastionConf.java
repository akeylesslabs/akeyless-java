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
import io.akeyless.client.model.WebBastionGuacamole;
import io.akeyless.client.model.WebBastionRdpRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebBastionConf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebBastionConf {
  public static final String SERIALIZED_NAME_GUACAMOLE = "guacamole";
  @SerializedName(SERIALIZED_NAME_GUACAMOLE)
  private WebBastionGuacamole guacamole;

  public static final String SERIALIZED_NAME_RDP_RECORD = "rdp_record";
  @SerializedName(SERIALIZED_NAME_RDP_RECORD)
  private WebBastionRdpRecord rdpRecord;

  public WebBastionConf() { 
  }

  public WebBastionConf guacamole(WebBastionGuacamole guacamole) {
    
    this.guacamole = guacamole;
    return this;
  }

   /**
   * Get guacamole
   * @return guacamole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebBastionGuacamole getGuacamole() {
    return guacamole;
  }


  public void setGuacamole(WebBastionGuacamole guacamole) {
    this.guacamole = guacamole;
  }


  public WebBastionConf rdpRecord(WebBastionRdpRecord rdpRecord) {
    
    this.rdpRecord = rdpRecord;
    return this;
  }

   /**
   * Get rdpRecord
   * @return rdpRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebBastionRdpRecord getRdpRecord() {
    return rdpRecord;
  }


  public void setRdpRecord(WebBastionRdpRecord rdpRecord) {
    this.rdpRecord = rdpRecord;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebBastionConf webBastionConf = (WebBastionConf) o;
    return Objects.equals(this.guacamole, webBastionConf.guacamole) &&
        Objects.equals(this.rdpRecord, webBastionConf.rdpRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guacamole, rdpRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebBastionConf {\n");
    sb.append("    guacamole: ").append(toIndentedString(guacamole)).append("\n");
    sb.append("    rdpRecord: ").append(toIndentedString(rdpRecord)).append("\n");
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

