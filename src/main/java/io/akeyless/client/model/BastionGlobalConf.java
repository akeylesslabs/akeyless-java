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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BastionGlobalConf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BastionGlobalConf {
  public static final String SERIALIZED_NAME_ALLOWED_BASTION_URLS = "allowed_bastion_urls";
  @SerializedName(SERIALIZED_NAME_ALLOWED_BASTION_URLS)
  private List<String> allowedBastionUrls = null;

  public static final String SERIALIZED_NAME_LEGACY_SIGNING_ALG = "legacy_signing_alg";
  @SerializedName(SERIALIZED_NAME_LEGACY_SIGNING_ALG)
  private Boolean legacySigningAlg;

  public static final String SERIALIZED_NAME_RDP_USERNAME_SUB_CLAIM = "rdp_username_sub_claim";
  @SerializedName(SERIALIZED_NAME_RDP_USERNAME_SUB_CLAIM)
  private String rdpUsernameSubClaim;

  public static final String SERIALIZED_NAME_SSH_USERNAME_SUB_CLAIM = "ssh_username_sub_claim";
  @SerializedName(SERIALIZED_NAME_SSH_USERNAME_SUB_CLAIM)
  private String sshUsernameSubClaim;

  public BastionGlobalConf() { 
  }

  public BastionGlobalConf allowedBastionUrls(List<String> allowedBastionUrls) {
    
    this.allowedBastionUrls = allowedBastionUrls;
    return this;
  }

  public BastionGlobalConf addAllowedBastionUrlsItem(String allowedBastionUrlsItem) {
    if (this.allowedBastionUrls == null) {
      this.allowedBastionUrls = new ArrayList<String>();
    }
    this.allowedBastionUrls.add(allowedBastionUrlsItem);
    return this;
  }

   /**
   * Get allowedBastionUrls
   * @return allowedBastionUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedBastionUrls() {
    return allowedBastionUrls;
  }


  public void setAllowedBastionUrls(List<String> allowedBastionUrls) {
    this.allowedBastionUrls = allowedBastionUrls;
  }


  public BastionGlobalConf legacySigningAlg(Boolean legacySigningAlg) {
    
    this.legacySigningAlg = legacySigningAlg;
    return this;
  }

   /**
   * Get legacySigningAlg
   * @return legacySigningAlg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLegacySigningAlg() {
    return legacySigningAlg;
  }


  public void setLegacySigningAlg(Boolean legacySigningAlg) {
    this.legacySigningAlg = legacySigningAlg;
  }


  public BastionGlobalConf rdpUsernameSubClaim(String rdpUsernameSubClaim) {
    
    this.rdpUsernameSubClaim = rdpUsernameSubClaim;
    return this;
  }

   /**
   * Get rdpUsernameSubClaim
   * @return rdpUsernameSubClaim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRdpUsernameSubClaim() {
    return rdpUsernameSubClaim;
  }


  public void setRdpUsernameSubClaim(String rdpUsernameSubClaim) {
    this.rdpUsernameSubClaim = rdpUsernameSubClaim;
  }


  public BastionGlobalConf sshUsernameSubClaim(String sshUsernameSubClaim) {
    
    this.sshUsernameSubClaim = sshUsernameSubClaim;
    return this;
  }

   /**
   * Get sshUsernameSubClaim
   * @return sshUsernameSubClaim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSshUsernameSubClaim() {
    return sshUsernameSubClaim;
  }


  public void setSshUsernameSubClaim(String sshUsernameSubClaim) {
    this.sshUsernameSubClaim = sshUsernameSubClaim;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BastionGlobalConf bastionGlobalConf = (BastionGlobalConf) o;
    return Objects.equals(this.allowedBastionUrls, bastionGlobalConf.allowedBastionUrls) &&
        Objects.equals(this.legacySigningAlg, bastionGlobalConf.legacySigningAlg) &&
        Objects.equals(this.rdpUsernameSubClaim, bastionGlobalConf.rdpUsernameSubClaim) &&
        Objects.equals(this.sshUsernameSubClaim, bastionGlobalConf.sshUsernameSubClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedBastionUrls, legacySigningAlg, rdpUsernameSubClaim, sshUsernameSubClaim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BastionGlobalConf {\n");
    sb.append("    allowedBastionUrls: ").append(toIndentedString(allowedBastionUrls)).append("\n");
    sb.append("    legacySigningAlg: ").append(toIndentedString(legacySigningAlg)).append("\n");
    sb.append("    rdpUsernameSubClaim: ").append(toIndentedString(rdpUsernameSubClaim)).append("\n");
    sb.append("    sshUsernameSubClaim: ").append(toIndentedString(sshUsernameSubClaim)).append("\n");
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

