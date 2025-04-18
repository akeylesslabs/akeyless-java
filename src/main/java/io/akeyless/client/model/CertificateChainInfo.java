/*
 * Akeyless API
 * The purpose of this application is to provide access to Akeyless API.
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@akeyless.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.akeyless.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.akeyless.client.model.CertificateExpirationEvent;
import io.akeyless.client.model.CertificateInfo;
import io.akeyless.client.model.NullString;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.akeyless.client.JSON;

/**
 * CertificateChainInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CertificateChainInfo {
  public static final String SERIALIZED_NAME_AUTO_RENEW_CERTIFICATE = "auto_renew_certificate";
  @SerializedName(SERIALIZED_NAME_AUTO_RENEW_CERTIFICATE)
  @javax.annotation.Nullable
  private Boolean autoRenewCertificate;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificate_chain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  @javax.annotation.Nullable
  private List<CertificateInfo> certificateChain = new ArrayList<>();

  public static final String SERIALIZED_NAME_CERTIFICATE_FORMAT = "certificate_format";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_FORMAT)
  @javax.annotation.Nullable
  private String certificateFormat;

  public static final String SERIALIZED_NAME_CERTIFICATE_HAS_PRIVATE_KEY = "certificate_has_private_key";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_HAS_PRIVATE_KEY)
  @javax.annotation.Nullable
  private Boolean certificateHasPrivateKey;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER_GW_CLUSTER_ID = "certificate_issuer_gw_cluster_id";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER_GW_CLUSTER_ID)
  @javax.annotation.Nullable
  private Long certificateIssuerGwClusterId;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER_GW_CLUSTER_URL = "certificate_issuer_gw_cluster_url";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER_GW_CLUSTER_URL)
  @javax.annotation.Nullable
  private String certificateIssuerGwClusterUrl;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER_ITEM_ID = "certificate_issuer_item_id";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER_ITEM_ID)
  @javax.annotation.Nullable
  private Long certificateIssuerItemId;

  public static final String SERIALIZED_NAME_CERTIFICATE_ISSUER_NAME = "certificate_issuer_name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ISSUER_NAME)
  @javax.annotation.Nullable
  private String certificateIssuerName;

  public static final String SERIALIZED_NAME_CERTIFICATE_PEM = "certificate_pem";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PEM)
  @javax.annotation.Nullable
  private String certificatePem;

  public static final String SERIALIZED_NAME_CERTIFICATE_STATUS = "certificate_status";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_STATUS)
  @javax.annotation.Nullable
  private String certificateStatus;

  public static final String SERIALIZED_NAME_COMMON_NAME = "common_name";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  @javax.annotation.Nullable
  private String commonName;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  @javax.annotation.Nullable
  private String errorMessage;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  @javax.annotation.Nullable
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_EXPIRATION_EVENTS = "expiration_events";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_EVENTS)
  @javax.annotation.Nullable
  private List<CertificateExpirationEvent> expirationEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTERNAL_CA_ID = "external_ca_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CA_ID)
  @javax.annotation.Nullable
  private NullString externalCaId;

  public static final String SERIALIZED_NAME_ISSUANCE_STATUS = "issuance_status";
  @SerializedName(SERIALIZED_NAME_ISSUANCE_STATUS)
  @javax.annotation.Nullable
  private String issuanceStatus;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "not_before";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  @javax.annotation.Nullable
  private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_RENEW_BEFORE_EXPIRATION_IN_DAYS = "renew_before_expiration_in_days";
  @SerializedName(SERIALIZED_NAME_RENEW_BEFORE_EXPIRATION_IN_DAYS)
  @javax.annotation.Nullable
  private Long renewBeforeExpirationInDays;

  public CertificateChainInfo() {
  }

  public CertificateChainInfo autoRenewCertificate(@javax.annotation.Nullable Boolean autoRenewCertificate) {
    this.autoRenewCertificate = autoRenewCertificate;
    return this;
  }

  /**
   * Get autoRenewCertificate
   * @return autoRenewCertificate
   */
  @javax.annotation.Nullable
  public Boolean getAutoRenewCertificate() {
    return autoRenewCertificate;
  }

  public void setAutoRenewCertificate(@javax.annotation.Nullable Boolean autoRenewCertificate) {
    this.autoRenewCertificate = autoRenewCertificate;
  }


  public CertificateChainInfo certificateChain(@javax.annotation.Nullable List<CertificateInfo> certificateChain) {
    this.certificateChain = certificateChain;
    return this;
  }

  public CertificateChainInfo addCertificateChainItem(CertificateInfo certificateChainItem) {
    if (this.certificateChain == null) {
      this.certificateChain = new ArrayList<>();
    }
    this.certificateChain.add(certificateChainItem);
    return this;
  }

  /**
   * Get certificateChain
   * @return certificateChain
   */
  @javax.annotation.Nullable
  public List<CertificateInfo> getCertificateChain() {
    return certificateChain;
  }

  public void setCertificateChain(@javax.annotation.Nullable List<CertificateInfo> certificateChain) {
    this.certificateChain = certificateChain;
  }


  public CertificateChainInfo certificateFormat(@javax.annotation.Nullable String certificateFormat) {
    this.certificateFormat = certificateFormat;
    return this;
  }

  /**
   * Get certificateFormat
   * @return certificateFormat
   */
  @javax.annotation.Nullable
  public String getCertificateFormat() {
    return certificateFormat;
  }

  public void setCertificateFormat(@javax.annotation.Nullable String certificateFormat) {
    this.certificateFormat = certificateFormat;
  }


  public CertificateChainInfo certificateHasPrivateKey(@javax.annotation.Nullable Boolean certificateHasPrivateKey) {
    this.certificateHasPrivateKey = certificateHasPrivateKey;
    return this;
  }

  /**
   * Get certificateHasPrivateKey
   * @return certificateHasPrivateKey
   */
  @javax.annotation.Nullable
  public Boolean getCertificateHasPrivateKey() {
    return certificateHasPrivateKey;
  }

  public void setCertificateHasPrivateKey(@javax.annotation.Nullable Boolean certificateHasPrivateKey) {
    this.certificateHasPrivateKey = certificateHasPrivateKey;
  }


  public CertificateChainInfo certificateIssuerGwClusterId(@javax.annotation.Nullable Long certificateIssuerGwClusterId) {
    this.certificateIssuerGwClusterId = certificateIssuerGwClusterId;
    return this;
  }

  /**
   * Get certificateIssuerGwClusterId
   * @return certificateIssuerGwClusterId
   */
  @javax.annotation.Nullable
  public Long getCertificateIssuerGwClusterId() {
    return certificateIssuerGwClusterId;
  }

  public void setCertificateIssuerGwClusterId(@javax.annotation.Nullable Long certificateIssuerGwClusterId) {
    this.certificateIssuerGwClusterId = certificateIssuerGwClusterId;
  }


  public CertificateChainInfo certificateIssuerGwClusterUrl(@javax.annotation.Nullable String certificateIssuerGwClusterUrl) {
    this.certificateIssuerGwClusterUrl = certificateIssuerGwClusterUrl;
    return this;
  }

  /**
   * Get certificateIssuerGwClusterUrl
   * @return certificateIssuerGwClusterUrl
   */
  @javax.annotation.Nullable
  public String getCertificateIssuerGwClusterUrl() {
    return certificateIssuerGwClusterUrl;
  }

  public void setCertificateIssuerGwClusterUrl(@javax.annotation.Nullable String certificateIssuerGwClusterUrl) {
    this.certificateIssuerGwClusterUrl = certificateIssuerGwClusterUrl;
  }


  public CertificateChainInfo certificateIssuerItemId(@javax.annotation.Nullable Long certificateIssuerItemId) {
    this.certificateIssuerItemId = certificateIssuerItemId;
    return this;
  }

  /**
   * Get certificateIssuerItemId
   * @return certificateIssuerItemId
   */
  @javax.annotation.Nullable
  public Long getCertificateIssuerItemId() {
    return certificateIssuerItemId;
  }

  public void setCertificateIssuerItemId(@javax.annotation.Nullable Long certificateIssuerItemId) {
    this.certificateIssuerItemId = certificateIssuerItemId;
  }


  public CertificateChainInfo certificateIssuerName(@javax.annotation.Nullable String certificateIssuerName) {
    this.certificateIssuerName = certificateIssuerName;
    return this;
  }

  /**
   * Get certificateIssuerName
   * @return certificateIssuerName
   */
  @javax.annotation.Nullable
  public String getCertificateIssuerName() {
    return certificateIssuerName;
  }

  public void setCertificateIssuerName(@javax.annotation.Nullable String certificateIssuerName) {
    this.certificateIssuerName = certificateIssuerName;
  }


  public CertificateChainInfo certificatePem(@javax.annotation.Nullable String certificatePem) {
    this.certificatePem = certificatePem;
    return this;
  }

  /**
   * Get certificatePem
   * @return certificatePem
   */
  @javax.annotation.Nullable
  public String getCertificatePem() {
    return certificatePem;
  }

  public void setCertificatePem(@javax.annotation.Nullable String certificatePem) {
    this.certificatePem = certificatePem;
  }


  public CertificateChainInfo certificateStatus(@javax.annotation.Nullable String certificateStatus) {
    this.certificateStatus = certificateStatus;
    return this;
  }

  /**
   * Get certificateStatus
   * @return certificateStatus
   */
  @javax.annotation.Nullable
  public String getCertificateStatus() {
    return certificateStatus;
  }

  public void setCertificateStatus(@javax.annotation.Nullable String certificateStatus) {
    this.certificateStatus = certificateStatus;
  }


  public CertificateChainInfo commonName(@javax.annotation.Nullable String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * Get commonName
   * @return commonName
   */
  @javax.annotation.Nullable
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(@javax.annotation.Nullable String commonName) {
    this.commonName = commonName;
  }


  public CertificateChainInfo errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CertificateChainInfo expirationDate(@javax.annotation.Nullable OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(@javax.annotation.Nullable OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public CertificateChainInfo expirationEvents(@javax.annotation.Nullable List<CertificateExpirationEvent> expirationEvents) {
    this.expirationEvents = expirationEvents;
    return this;
  }

  public CertificateChainInfo addExpirationEventsItem(CertificateExpirationEvent expirationEventsItem) {
    if (this.expirationEvents == null) {
      this.expirationEvents = new ArrayList<>();
    }
    this.expirationEvents.add(expirationEventsItem);
    return this;
  }

  /**
   * Get expirationEvents
   * @return expirationEvents
   */
  @javax.annotation.Nullable
  public List<CertificateExpirationEvent> getExpirationEvents() {
    return expirationEvents;
  }

  public void setExpirationEvents(@javax.annotation.Nullable List<CertificateExpirationEvent> expirationEvents) {
    this.expirationEvents = expirationEvents;
  }


  public CertificateChainInfo externalCaId(@javax.annotation.Nullable NullString externalCaId) {
    this.externalCaId = externalCaId;
    return this;
  }

  /**
   * Get externalCaId
   * @return externalCaId
   */
  @javax.annotation.Nullable
  public NullString getExternalCaId() {
    return externalCaId;
  }

  public void setExternalCaId(@javax.annotation.Nullable NullString externalCaId) {
    this.externalCaId = externalCaId;
  }


  public CertificateChainInfo issuanceStatus(@javax.annotation.Nullable String issuanceStatus) {
    this.issuanceStatus = issuanceStatus;
    return this;
  }

  /**
   * Get issuanceStatus
   * @return issuanceStatus
   */
  @javax.annotation.Nullable
  public String getIssuanceStatus() {
    return issuanceStatus;
  }

  public void setIssuanceStatus(@javax.annotation.Nullable String issuanceStatus) {
    this.issuanceStatus = issuanceStatus;
  }


  public CertificateChainInfo notBefore(@javax.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
    return this;
  }

  /**
   * Get notBefore
   * @return notBefore
   */
  @javax.annotation.Nullable
  public OffsetDateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(@javax.annotation.Nullable OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  public CertificateChainInfo renewBeforeExpirationInDays(@javax.annotation.Nullable Long renewBeforeExpirationInDays) {
    this.renewBeforeExpirationInDays = renewBeforeExpirationInDays;
    return this;
  }

  /**
   * Get renewBeforeExpirationInDays
   * @return renewBeforeExpirationInDays
   */
  @javax.annotation.Nullable
  public Long getRenewBeforeExpirationInDays() {
    return renewBeforeExpirationInDays;
  }

  public void setRenewBeforeExpirationInDays(@javax.annotation.Nullable Long renewBeforeExpirationInDays) {
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
        Objects.equals(this.certificateIssuerGwClusterId, certificateChainInfo.certificateIssuerGwClusterId) &&
        Objects.equals(this.certificateIssuerGwClusterUrl, certificateChainInfo.certificateIssuerGwClusterUrl) &&
        Objects.equals(this.certificateIssuerItemId, certificateChainInfo.certificateIssuerItemId) &&
        Objects.equals(this.certificateIssuerName, certificateChainInfo.certificateIssuerName) &&
        Objects.equals(this.certificatePem, certificateChainInfo.certificatePem) &&
        Objects.equals(this.certificateStatus, certificateChainInfo.certificateStatus) &&
        Objects.equals(this.commonName, certificateChainInfo.commonName) &&
        Objects.equals(this.errorMessage, certificateChainInfo.errorMessage) &&
        Objects.equals(this.expirationDate, certificateChainInfo.expirationDate) &&
        Objects.equals(this.expirationEvents, certificateChainInfo.expirationEvents) &&
        Objects.equals(this.externalCaId, certificateChainInfo.externalCaId) &&
        Objects.equals(this.issuanceStatus, certificateChainInfo.issuanceStatus) &&
        Objects.equals(this.notBefore, certificateChainInfo.notBefore) &&
        Objects.equals(this.renewBeforeExpirationInDays, certificateChainInfo.renewBeforeExpirationInDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenewCertificate, certificateChain, certificateFormat, certificateHasPrivateKey, certificateIssuerGwClusterId, certificateIssuerGwClusterUrl, certificateIssuerItemId, certificateIssuerName, certificatePem, certificateStatus, commonName, errorMessage, expirationDate, expirationEvents, externalCaId, issuanceStatus, notBefore, renewBeforeExpirationInDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateChainInfo {\n");
    sb.append("    autoRenewCertificate: ").append(toIndentedString(autoRenewCertificate)).append("\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    certificateFormat: ").append(toIndentedString(certificateFormat)).append("\n");
    sb.append("    certificateHasPrivateKey: ").append(toIndentedString(certificateHasPrivateKey)).append("\n");
    sb.append("    certificateIssuerGwClusterId: ").append(toIndentedString(certificateIssuerGwClusterId)).append("\n");
    sb.append("    certificateIssuerGwClusterUrl: ").append(toIndentedString(certificateIssuerGwClusterUrl)).append("\n");
    sb.append("    certificateIssuerItemId: ").append(toIndentedString(certificateIssuerItemId)).append("\n");
    sb.append("    certificateIssuerName: ").append(toIndentedString(certificateIssuerName)).append("\n");
    sb.append("    certificatePem: ").append(toIndentedString(certificatePem)).append("\n");
    sb.append("    certificateStatus: ").append(toIndentedString(certificateStatus)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expirationEvents: ").append(toIndentedString(expirationEvents)).append("\n");
    sb.append("    externalCaId: ").append(toIndentedString(externalCaId)).append("\n");
    sb.append("    issuanceStatus: ").append(toIndentedString(issuanceStatus)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("auto_renew_certificate");
    openapiFields.add("certificate_chain");
    openapiFields.add("certificate_format");
    openapiFields.add("certificate_has_private_key");
    openapiFields.add("certificate_issuer_gw_cluster_id");
    openapiFields.add("certificate_issuer_gw_cluster_url");
    openapiFields.add("certificate_issuer_item_id");
    openapiFields.add("certificate_issuer_name");
    openapiFields.add("certificate_pem");
    openapiFields.add("certificate_status");
    openapiFields.add("common_name");
    openapiFields.add("error_message");
    openapiFields.add("expiration_date");
    openapiFields.add("expiration_events");
    openapiFields.add("external_ca_id");
    openapiFields.add("issuance_status");
    openapiFields.add("not_before");
    openapiFields.add("renew_before_expiration_in_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CertificateChainInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CertificateChainInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateChainInfo is not found in the empty JSON string", CertificateChainInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CertificateChainInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateChainInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("certificate_chain") != null && !jsonObj.get("certificate_chain").isJsonNull()) {
        JsonArray jsonArraycertificateChain = jsonObj.getAsJsonArray("certificate_chain");
        if (jsonArraycertificateChain != null) {
          // ensure the json data is an array
          if (!jsonObj.get("certificate_chain").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `certificate_chain` to be an array in the JSON string but got `%s`", jsonObj.get("certificate_chain").toString()));
          }

          // validate the optional field `certificate_chain` (array)
          for (int i = 0; i < jsonArraycertificateChain.size(); i++) {
            CertificateInfo.validateJsonElement(jsonArraycertificateChain.get(i));
          };
        }
      }
      if ((jsonObj.get("certificate_format") != null && !jsonObj.get("certificate_format").isJsonNull()) && !jsonObj.get("certificate_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_format").toString()));
      }
      if ((jsonObj.get("certificate_issuer_gw_cluster_url") != null && !jsonObj.get("certificate_issuer_gw_cluster_url").isJsonNull()) && !jsonObj.get("certificate_issuer_gw_cluster_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_issuer_gw_cluster_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_issuer_gw_cluster_url").toString()));
      }
      if ((jsonObj.get("certificate_issuer_name") != null && !jsonObj.get("certificate_issuer_name").isJsonNull()) && !jsonObj.get("certificate_issuer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_issuer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_issuer_name").toString()));
      }
      if ((jsonObj.get("certificate_pem") != null && !jsonObj.get("certificate_pem").isJsonNull()) && !jsonObj.get("certificate_pem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_pem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_pem").toString()));
      }
      if ((jsonObj.get("certificate_status") != null && !jsonObj.get("certificate_status").isJsonNull()) && !jsonObj.get("certificate_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate_status").toString()));
      }
      if ((jsonObj.get("common_name") != null && !jsonObj.get("common_name").isJsonNull()) && !jsonObj.get("common_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `common_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("common_name").toString()));
      }
      if ((jsonObj.get("error_message") != null && !jsonObj.get("error_message").isJsonNull()) && !jsonObj.get("error_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_message").toString()));
      }
      if (jsonObj.get("expiration_events") != null && !jsonObj.get("expiration_events").isJsonNull()) {
        JsonArray jsonArrayexpirationEvents = jsonObj.getAsJsonArray("expiration_events");
        if (jsonArrayexpirationEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("expiration_events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `expiration_events` to be an array in the JSON string but got `%s`", jsonObj.get("expiration_events").toString()));
          }

          // validate the optional field `expiration_events` (array)
          for (int i = 0; i < jsonArrayexpirationEvents.size(); i++) {
            CertificateExpirationEvent.validateJsonElement(jsonArrayexpirationEvents.get(i));
          };
        }
      }
      // validate the optional field `external_ca_id`
      if (jsonObj.get("external_ca_id") != null && !jsonObj.get("external_ca_id").isJsonNull()) {
        NullString.validateJsonElement(jsonObj.get("external_ca_id"));
      }
      if ((jsonObj.get("issuance_status") != null && !jsonObj.get("issuance_status").isJsonNull()) && !jsonObj.get("issuance_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuance_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuance_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateChainInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateChainInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateChainInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateChainInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateChainInfo>() {
           @Override
           public void write(JsonWriter out, CertificateChainInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateChainInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CertificateChainInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CertificateChainInfo
   * @throws IOException if the JSON string is invalid with respect to CertificateChainInfo
   */
  public static CertificateChainInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateChainInfo.class);
  }

  /**
   * Convert an instance of CertificateChainInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

