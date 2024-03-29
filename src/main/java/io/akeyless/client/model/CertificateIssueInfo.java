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
import io.akeyless.client.model.PKICertificateIssueDetails;
import io.akeyless.client.model.SSHCertificateIssueDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CertificateIssueInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CertificateIssueInfo {
  public static final String SERIALIZED_NAME_CERT_ISSUER_TYPE = "cert_issuer_type";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_TYPE)
  private String certIssuerType;

  public static final String SERIALIZED_NAME_MAX_TTL = "max_ttl";
  @SerializedName(SERIALIZED_NAME_MAX_TTL)
  private Long maxTtl;

  public static final String SERIALIZED_NAME_PKI_CERT_ISSUER_DETAILS = "pki_cert_issuer_details";
  @SerializedName(SERIALIZED_NAME_PKI_CERT_ISSUER_DETAILS)
  private PKICertificateIssueDetails pkiCertIssuerDetails;

  public static final String SERIALIZED_NAME_SSH_CERT_ISSUER_DETAILS = "ssh_cert_issuer_details";
  @SerializedName(SERIALIZED_NAME_SSH_CERT_ISSUER_DETAILS)
  private SSHCertificateIssueDetails sshCertIssuerDetails;

  public CertificateIssueInfo() { 
  }

  public CertificateIssueInfo certIssuerType(String certIssuerType) {
    
    this.certIssuerType = certIssuerType;
    return this;
  }

   /**
   * Get certIssuerType
   * @return certIssuerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertIssuerType() {
    return certIssuerType;
  }


  public void setCertIssuerType(String certIssuerType) {
    this.certIssuerType = certIssuerType;
  }


  public CertificateIssueInfo maxTtl(Long maxTtl) {
    
    this.maxTtl = maxTtl;
    return this;
  }

   /**
   * Get maxTtl
   * @return maxTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMaxTtl() {
    return maxTtl;
  }


  public void setMaxTtl(Long maxTtl) {
    this.maxTtl = maxTtl;
  }


  public CertificateIssueInfo pkiCertIssuerDetails(PKICertificateIssueDetails pkiCertIssuerDetails) {
    
    this.pkiCertIssuerDetails = pkiCertIssuerDetails;
    return this;
  }

   /**
   * Get pkiCertIssuerDetails
   * @return pkiCertIssuerDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PKICertificateIssueDetails getPkiCertIssuerDetails() {
    return pkiCertIssuerDetails;
  }


  public void setPkiCertIssuerDetails(PKICertificateIssueDetails pkiCertIssuerDetails) {
    this.pkiCertIssuerDetails = pkiCertIssuerDetails;
  }


  public CertificateIssueInfo sshCertIssuerDetails(SSHCertificateIssueDetails sshCertIssuerDetails) {
    
    this.sshCertIssuerDetails = sshCertIssuerDetails;
    return this;
  }

   /**
   * Get sshCertIssuerDetails
   * @return sshCertIssuerDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SSHCertificateIssueDetails getSshCertIssuerDetails() {
    return sshCertIssuerDetails;
  }


  public void setSshCertIssuerDetails(SSHCertificateIssueDetails sshCertIssuerDetails) {
    this.sshCertIssuerDetails = sshCertIssuerDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateIssueInfo certificateIssueInfo = (CertificateIssueInfo) o;
    return Objects.equals(this.certIssuerType, certificateIssueInfo.certIssuerType) &&
        Objects.equals(this.maxTtl, certificateIssueInfo.maxTtl) &&
        Objects.equals(this.pkiCertIssuerDetails, certificateIssueInfo.pkiCertIssuerDetails) &&
        Objects.equals(this.sshCertIssuerDetails, certificateIssueInfo.sshCertIssuerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certIssuerType, maxTtl, pkiCertIssuerDetails, sshCertIssuerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateIssueInfo {\n");
    sb.append("    certIssuerType: ").append(toIndentedString(certIssuerType)).append("\n");
    sb.append("    maxTtl: ").append(toIndentedString(maxTtl)).append("\n");
    sb.append("    pkiCertIssuerDetails: ").append(toIndentedString(pkiCertIssuerDetails)).append("\n");
    sb.append("    sshCertIssuerDetails: ").append(toIndentedString(sshCertIssuerDetails)).append("\n");
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

