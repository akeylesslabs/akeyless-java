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

/**
 * GetPKICertificate
 */

public class GetPKICertificate {
  public static final String SERIALIZED_NAME_ALT_NAMES = "alt-names";
  @SerializedName(SERIALIZED_NAME_ALT_NAMES)
  private String altNames;

  public static final String SERIALIZED_NAME_CERT_ISSUER_NAME = "cert-issuer-name";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_NAME)
  private String certIssuerName;

  public static final String SERIALIZED_NAME_COMMON_NAME = "common-name";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  private String commonName;

  public static final String SERIALIZED_NAME_CSR_DATA_BASE64 = "csr-data-base64";
  @SerializedName(SERIALIZED_NAME_CSR_DATA_BASE64)
  private String csrDataBase64;

  public static final String SERIALIZED_NAME_EXTENDED_KEY_USAGE = "extended-key-usage";
  @SerializedName(SERIALIZED_NAME_EXTENDED_KEY_USAGE)
  private String extendedKeyUsage;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_DATA_BASE64 = "key-data-base64";
  @SerializedName(SERIALIZED_NAME_KEY_DATA_BASE64)
  private String keyDataBase64;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Long ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public static final String SERIALIZED_NAME_URI_SANS = "uri-sans";
  @SerializedName(SERIALIZED_NAME_URI_SANS)
  private String uriSans;


  public GetPKICertificate altNames(String altNames) {
    
    this.altNames = altNames;
    return this;
  }

   /**
   * The Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any DNS.* names are taken from it)
   * @return altNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any DNS.* names are taken from it)")

  public String getAltNames() {
    return altNames;
  }


  public void setAltNames(String altNames) {
    this.altNames = altNames;
  }


  public GetPKICertificate certIssuerName(String certIssuerName) {
    
    this.certIssuerName = certIssuerName;
    return this;
  }

   /**
   * The name of the PKI certificate issuer
   * @return certIssuerName
  **/
  @ApiModelProperty(required = true, value = "The name of the PKI certificate issuer")

  public String getCertIssuerName() {
    return certIssuerName;
  }


  public void setCertIssuerName(String certIssuerName) {
    this.certIssuerName = certIssuerName;
  }


  public GetPKICertificate commonName(String commonName) {
    
    this.commonName = commonName;
    return this;
  }

   /**
   * The common name to be included in the PKI certificate (if CSR is supplied this flag is ignored and the CSR subject CN is taken)
   * @return commonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The common name to be included in the PKI certificate (if CSR is supplied this flag is ignored and the CSR subject CN is taken)")

  public String getCommonName() {
    return commonName;
  }


  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }


  public GetPKICertificate csrDataBase64(String csrDataBase64) {
    
    this.csrDataBase64 = csrDataBase64;
    return this;
  }

   /**
   * Certificate Signing Request contents encoded in base64 to generate the certificate with
   * @return csrDataBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Certificate Signing Request contents encoded in base64 to generate the certificate with")

  public String getCsrDataBase64() {
    return csrDataBase64;
  }


  public void setCsrDataBase64(String csrDataBase64) {
    this.csrDataBase64 = csrDataBase64;
  }


  public GetPKICertificate extendedKeyUsage(String extendedKeyUsage) {
    
    this.extendedKeyUsage = extendedKeyUsage;
    return this;
  }

   /**
   * A comma-separated list of extended key usage requests which will be used for certificate issuance. Supported values: &#39;clientauth&#39;, &#39;serverauth&#39;.
   * @return extendedKeyUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of extended key usage requests which will be used for certificate issuance. Supported values: 'clientauth', 'serverauth'.")

  public String getExtendedKeyUsage() {
    return extendedKeyUsage;
  }


  public void setExtendedKeyUsage(String extendedKeyUsage) {
    this.extendedKeyUsage = extendedKeyUsage;
  }


  public GetPKICertificate json(Boolean json) {
    
    this.json = json;
    return this;
  }

   /**
   * Set output format to JSON
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set output format to JSON")

  public Boolean getJson() {
    return json;
  }


  public void setJson(Boolean json) {
    this.json = json;
  }


  public GetPKICertificate keyDataBase64(String keyDataBase64) {
    
    this.keyDataBase64 = keyDataBase64;
    return this;
  }

   /**
   * PKI key file contents. If this option is used, the certificate will be printed to stdout
   * @return keyDataBase64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PKI key file contents. If this option is used, the certificate will be printed to stdout")

  public String getKeyDataBase64() {
    return keyDataBase64;
  }


  public void setKeyDataBase64(String keyDataBase64) {
    this.keyDataBase64 = keyDataBase64;
  }


  public GetPKICertificate token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Authentication token (see `/auth` and `/configure`)")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public GetPKICertificate ttl(Long ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Updated certificate lifetime in seconds (must be less than the Certificate Issuer default TTL)
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Updated certificate lifetime in seconds (must be less than the Certificate Issuer default TTL)")

  public Long getTtl() {
    return ttl;
  }


  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  public GetPKICertificate uidToken(String uidToken) {
    
    this.uidToken = uidToken;
    return this;
  }

   /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The universal identity token, Required only for universal_identity authentication")

  public String getUidToken() {
    return uidToken;
  }


  public void setUidToken(String uidToken) {
    this.uidToken = uidToken;
  }


  public GetPKICertificate uriSans(String uriSans) {
    
    this.uriSans = uriSans;
    return this;
  }

   /**
   * The URI Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any URI.* names are taken from it)
   * @return uriSans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any URI.* names are taken from it)")

  public String getUriSans() {
    return uriSans;
  }


  public void setUriSans(String uriSans) {
    this.uriSans = uriSans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPKICertificate getPKICertificate = (GetPKICertificate) o;
    return Objects.equals(this.altNames, getPKICertificate.altNames) &&
        Objects.equals(this.certIssuerName, getPKICertificate.certIssuerName) &&
        Objects.equals(this.commonName, getPKICertificate.commonName) &&
        Objects.equals(this.csrDataBase64, getPKICertificate.csrDataBase64) &&
        Objects.equals(this.extendedKeyUsage, getPKICertificate.extendedKeyUsage) &&
        Objects.equals(this.json, getPKICertificate.json) &&
        Objects.equals(this.keyDataBase64, getPKICertificate.keyDataBase64) &&
        Objects.equals(this.token, getPKICertificate.token) &&
        Objects.equals(this.ttl, getPKICertificate.ttl) &&
        Objects.equals(this.uidToken, getPKICertificate.uidToken) &&
        Objects.equals(this.uriSans, getPKICertificate.uriSans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altNames, certIssuerName, commonName, csrDataBase64, extendedKeyUsage, json, keyDataBase64, token, ttl, uidToken, uriSans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPKICertificate {\n");
    sb.append("    altNames: ").append(toIndentedString(altNames)).append("\n");
    sb.append("    certIssuerName: ").append(toIndentedString(certIssuerName)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    csrDataBase64: ").append(toIndentedString(csrDataBase64)).append("\n");
    sb.append("    extendedKeyUsage: ").append(toIndentedString(extendedKeyUsage)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyDataBase64: ").append(toIndentedString(keyDataBase64)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uriSans: ").append(toIndentedString(uriSans)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

