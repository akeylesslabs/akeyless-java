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
import io.akeyless.client.model.CertificateExpirationEvent;
import io.akeyless.client.model.CertificateInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CertificateChainInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CertificateChainInfo {
  public static final String SERIALIZED_NAME_AUTO_RENEW_CERTIFICATE = "auto_renew_certificate";
  @SerializedName(SERIALIZED_NAME_AUTO_RENEW_CERTIFICATE)
  private Boolean autoRenewCertificate;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificate_chain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  private List<CertificateInfo> certificateChain = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_FORMAT = "certificate_format";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_FORMAT)
  private String certificateFormat;

  public static final String SERIALIZED_NAME_CERTIFICATE_HAS_PRIVATE_KEY = "certificate_has_private_key";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_HAS_PRIVATE_KEY)
  private Boolean certificateHasPrivateKey;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER_GW_CLUSTER_URL = "certificate_issuer_gw_cluster_url";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER_GW_CLUSTER_URL)
  private String certificateIssuerGwClusterUrl;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER_ITEM_ID = "certificate_issuer_item_id";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER_ITEM_ID)
  private Long certificateIssuerItemId;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER_NAME = "certificate_issuer_name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER_NAME)
  private String certificateIssuerName;

  public static final String SERIALIZED_NAME_CERTIFICATE_PEM = "certificate_pem";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PEM)
  private String certificatePem;

  public static final String SERIALIZED_NAME_CERTIFICATE_STATUS = "certificate_status";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_STATUS)
  private String certificateStatus;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_EXPIRATION_EVENTS = "expiration_events";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_EVENTS)
  private List<CertificateExpirationEvent> expirationEvents = null;

  public static final String SERIALIZED_NAME_RENEW_BEFORE_EXPIRATION_IN_DAYS = "renew_before_expiration_in_days";
  @SerializedName(SERIALIZED_NAME_RENEW_BEFORE_EXPIRATION_IN_DAYS)
  private Long renewBeforeExpirationInDays;

  public CertificateChainInfo() { 
  }

  public CertificateChainInfo autoRenewCertificate(Boolean autoRenewCertificate) {
    
    this.autoRenewCertificate = autoRenewCertificate;
    return this;
  }

   /**
   * Get autoRenewCertificate
   * @return autoRenewCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoRenewCertificate() {
    return autoRenewCertificate;
  }


  public void setAutoRenewCertificate(Boolean autoRenewCertificate) {
    this.autoRenewCertificate = autoRenewCertificate;
  }


  public CertificateChainInfo certificateChain(List<CertificateInfo> certificateChain) {
    
    this.certificateChain = certificateChain;
    return this;
  }

  public CertificateChainInfo addCertificateChainItem(CertificateInfo certificateChainItem) {
    if (this.certificateChain == null) {
      this.certificateChain = new ArrayList<CertificateInfo>();
    }
    this.certificateChain.add(certificateChainItem);
    return this;
  }

   /**
   * Get certificateChain
   * @return certificateChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CertificateInfo> getCertificateChain() {
    return certificateChain;
  }


  public void setCertificateChain(List<CertificateInfo> certificateChain) {
    this.certificateChain = certificateChain;
  }


  public CertificateChainInfo certificateFormat(String certificateFormat) {
    
    this.certificateFormat = certificateFormat;
    return this;
  }

   /**
   * Get certificateFormat
   * @return certificateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateFormat() {
    return certificateFormat;
  }


  public void setCertificateFormat(String certificateFormat) {
    this.certificateFormat = certificateFormat;
  }


  public CertificateChainInfo certificateHasPrivateKey(Boolean certificateHasPrivateKey) {
    
    this.certificateHasPrivateKey = certificateHasPrivateKey;
    return this;
  }

   /**
   * Get certificateHasPrivateKey
   * @return certificateHasPrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCertificateHasPrivateKey() {
    return certificateHasPrivateKey;
  }


  public void setCertificateHasPrivateKey(Boolean certificateHasPrivateKey) {
    this.certificateHasPrivateKey = certificateHasPrivateKey;
  }


  public CertificateChainInfo certificateIssuerGwClusterUrl(String certificateIssuerGwClusterUrl) {
    
    this.certificateIssuerGwClusterUrl = certificateIssuerGwClusterUrl;
    return this;
  }

   /**
   * Get certificateIssuerGwClusterUrl
   * @return certificateIssuerGwClusterUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateIssuerGwClusterUrl() {
    return certificateIssuerGwClusterUrl;
  }


  public void setCertificateIssuerGwClusterUrl(String certificateIssuerGwClusterUrl) {
    this.certificateIssuerGwClusterUrl = certificateIssuerGwClusterUrl;
  }


  public CertificateChainInfo certificateIssuerItemId(Long certificateIssuerItemId) {
    
    this.certificateIssuerItemId = certificateIssuerItemId;
    return this;
  }

   /**
   * Get certificateIssuerItemId
   * @return certificateIssuerItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCertificateIssuerItemId() {
    return certificateIssuerItemId;
  }


  public void setCertificateIssuerItemId(Long certificateIssuerItemId) {
    this.certificateIssuerItemId = certificateIssuerItemId;
  }


  public CertificateChainInfo certificateIssuerName(String certificateIssuerName) {
    
    this.certificateIssuerName = certificateIssuerName;
    return this;
  }

   /**
   * Get certificateIssuerName
   * @return certificateIssuerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateIssuerName() {
    return certificateIssuerName;
  }


  public void setCertificateIssuerName(String certificateIssuerName) {
    this.certificateIssuerName = certificateIssuerName;
  }


  public CertificateChainInfo certificatePem(String certificatePem) {
    
    this.certificatePem = certificatePem;
    return this;
  }

   /**
   * Get certificatePem
   * @return certificatePem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificatePem() {
    return certificatePem;
  }


  public void setCertificatePem(String certificatePem) {
    this.certificatePem = certificatePem;
  }


  public CertificateChainInfo certificateStatus(String certificateStatus) {
    
    this.certificateStatus = certificateStatus;
    return this;
  }

   /**
   * Get certificateStatus
   * @return certificateStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateStatus() {
    return certificateStatus;
  }


  public void setCertificateStatus(String certificateStatus) {
    this.certificateStatus = certificateStatus;
  }


  public CertificateChainInfo errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CertificateChainInfo expirationEvents(List<CertificateExpirationEvent> expirationEvents) {
    
    this.expirationEvents = expirationEvents;
    return this;
  }

  public CertificateChainInfo addExpirationEventsItem(CertificateExpirationEvent expirationEventsItem) {
    if (this.expirationEvents == null) {
      this.expirationEvents = new ArrayList<CertificateExpirationEvent>();
    }
    this.expirationEvents.add(expirationEventsItem);
    return this;
  }

   /**
   * Get expirationEvents
   * @return expirationEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CertificateExpirationEvent> getExpirationEvents() {
    return expirationEvents;
  }


  public void setExpirationEvents(List<CertificateExpirationEvent> expirationEvents) {
    this.expirationEvents = expirationEvents;
  }


  public CertificateChainInfo renewBeforeExpirationInDays(Long renewBeforeExpirationInDays) {
    
    this.renewBeforeExpirationInDays = renewBeforeExpirationInDays;
    return this;
  }

   /**
   * Get renewBeforeExpirationInDays
   * @return renewBeforeExpirationInDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRenewBeforeExpirationInDays() {
    return renewBeforeExpirationInDays;
  }


  public void setRenewBeforeExpirationInDays(Long renewBeforeExpirationInDays) {
    this.renewBeforeExpirationInDays = renewBeforeExpirationInDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateChainInfo certificateChainInfo = (CertificateChainInfo) o;
    return Objects.equals(this.autoRenewCertificate, certificateChainInfo.autoRenewCertificate) &&
        Objects.equals(this.certificateChain, certificateChainInfo.certificateChain) &&
        Objects.equals(this.certificateFormat, certificateChainInfo.certificateFormat) &&
        Objects.equals(this.certificateHasPrivateKey, certificateChainInfo.certificateHasPrivateKey) &&
        Objects.equals(this.certificateIssuerGwClusterUrl, certificateChainInfo.certificateIssuerGwClusterUrl) &&
        Objects.equals(this.certificateIssuerItemId, certificateChainInfo.certificateIssuerItemId) &&
        Objects.equals(this.certificateIssuerName, certificateChainInfo.certificateIssuerName) &&
        Objects.equals(this.certificatePem, certificateChainInfo.certificatePem) &&
        Objects.equals(this.certificateStatus, certificateChainInfo.certificateStatus) &&
        Objects.equals(this.errorMessage, certificateChainInfo.errorMessage) &&
        Objects.equals(this.expirationEvents, certificateChainInfo.expirationEvents) &&
        Objects.equals(this.renewBeforeExpirationInDays, certificateChainInfo.renewBeforeExpirationInDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenewCertificate, certificateChain, certificateFormat, certificateHasPrivateKey, certificateIssuerGwClusterUrl, certificateIssuerItemId, certificateIssuerName, certificatePem, certificateStatus, errorMessage, expirationEvents, renewBeforeExpirationInDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateChainInfo {\n");
    sb.append("    autoRenewCertificate: ").append(toIndentedString(autoRenewCertificate)).append("\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    certificateFormat: ").append(toIndentedString(certificateFormat)).append("\n");
    sb.append("    certificateHasPrivateKey: ").append(toIndentedString(certificateHasPrivateKey)).append("\n");
    sb.append("    certificateIssuerGwClusterUrl: ").append(toIndentedString(certificateIssuerGwClusterUrl)).append("\n");
    sb.append("    certificateIssuerItemId: ").append(toIndentedString(certificateIssuerItemId)).append("\n");
    sb.append("    certificateIssuerName: ").append(toIndentedString(certificateIssuerName)).append("\n");
    sb.append("    certificatePem: ").append(toIndentedString(certificatePem)).append("\n");
    sb.append("    certificateStatus: ").append(toIndentedString(certificateStatus)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    expirationEvents: ").append(toIndentedString(expirationEvents)).append("\n");
    sb.append("    renewBeforeExpirationInDays: ").append(toIndentedString(renewBeforeExpirationInDays)).append("\n");
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

