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
 * createKey is a command that creates a new key. [Deprecated: Use command create-dfc-key]
 */
@ApiModel(description = "createKey is a command that creates a new key. [Deprecated: Use command create-dfc-key]")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateKey {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_CERTIFICATE_COMMON_NAME = "certificate-common-name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_COMMON_NAME)
  private String certificateCommonName;

  public static final String SERIALIZED_NAME_CERTIFICATE_COUNTRY = "certificate-country";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_COUNTRY)
  private String certificateCountry;

  public static final String SERIALIZED_NAME_CERTIFICATE_DIGEST_ALGO = "certificate-digest-algo";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DIGEST_ALGO)
  private String certificateDigestAlgo;

  public static final String SERIALIZED_NAME_CERTIFICATE_LOCALITY = "certificate-locality";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_LOCALITY)
  private String certificateLocality;

  public static final String SERIALIZED_NAME_CERTIFICATE_ORGANIZATION = "certificate-organization";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ORGANIZATION)
  private String certificateOrganization;

  public static final String SERIALIZED_NAME_CERTIFICATE_PROVINCE = "certificate-province";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PROVINCE)
  private String certificateProvince;

  public static final String SERIALIZED_NAME_CERTIFICATE_TTL = "certificate-ttl";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_TTL)
  private Long certificateTtl;

  public static final String SERIALIZED_NAME_CUSTOMER_FRG_ID = "customer-frg-id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRG_ID)
  private String customerFrgId;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_GENERATE_SELF_SIGNED_CERTIFICATE = "generate-self-signed-certificate";
  @SerializedName(SERIALIZED_NAME_GENERATE_SELF_SIGNED_CERTIFICATE)
  private Boolean generateSelfSignedCertificate;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private Boolean json = false;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPLIT_LEVEL = "split-level";
  @SerializedName(SERIALIZED_NAME_SPLIT_LEVEL)
  private Long splitLevel = 3l;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private List<String> tag = null;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  private String uidToken;

  public CreateKey() { 
  }

  public CreateKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, AES128CBC, AES256CBC, RSA1024, RSA2048, RSA3072, RSA4096]
   * @return alg
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, AES128CBC, AES256CBC, RSA1024, RSA2048, RSA3072, RSA4096]")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public CreateKey certificateCommonName(String certificateCommonName) {
    
    this.certificateCommonName = certificateCommonName;
    return this;
  }

   /**
   * Common name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateCommonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Common name for the generated certificate. Relevant only for generate-self-signed-certificate.")

  public String getCertificateCommonName() {
    return certificateCommonName;
  }


  public void setCertificateCommonName(String certificateCommonName) {
    this.certificateCommonName = certificateCommonName;
  }


  public CreateKey certificateCountry(String certificateCountry) {
    
    this.certificateCountry = certificateCountry;
    return this;
  }

   /**
   * Country name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country name for the generated certificate. Relevant only for generate-self-signed-certificate.")

  public String getCertificateCountry() {
    return certificateCountry;
  }


  public void setCertificateCountry(String certificateCountry) {
    this.certificateCountry = certificateCountry;
  }


  public CreateKey certificateDigestAlgo(String certificateDigestAlgo) {
    
    this.certificateDigestAlgo = certificateDigestAlgo;
    return this;
  }

   /**
   * Digest algorithm to be used for the certificate key signing. Currently, we support only \&quot;sha256\&quot; so we hide this option for CLI.
   * @return certificateDigestAlgo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Digest algorithm to be used for the certificate key signing. Currently, we support only \"sha256\" so we hide this option for CLI.")

  public String getCertificateDigestAlgo() {
    return certificateDigestAlgo;
  }


  public void setCertificateDigestAlgo(String certificateDigestAlgo) {
    this.certificateDigestAlgo = certificateDigestAlgo;
  }


  public CreateKey certificateLocality(String certificateLocality) {
    
    this.certificateLocality = certificateLocality;
    return this;
  }

   /**
   * Locality for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateLocality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locality for the generated certificate. Relevant only for generate-self-signed-certificate.")

  public String getCertificateLocality() {
    return certificateLocality;
  }


  public void setCertificateLocality(String certificateLocality) {
    this.certificateLocality = certificateLocality;
  }


  public CreateKey certificateOrganization(String certificateOrganization) {
    
    this.certificateOrganization = certificateOrganization;
    return this;
  }

   /**
   * Organization name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organization name for the generated certificate. Relevant only for generate-self-signed-certificate.")

  public String getCertificateOrganization() {
    return certificateOrganization;
  }


  public void setCertificateOrganization(String certificateOrganization) {
    this.certificateOrganization = certificateOrganization;
  }


  public CreateKey certificateProvince(String certificateProvince) {
    
    this.certificateProvince = certificateProvince;
    return this;
  }

   /**
   * Province name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Province name for the generated certificate. Relevant only for generate-self-signed-certificate.")

  public String getCertificateProvince() {
    return certificateProvince;
  }


  public void setCertificateProvince(String certificateProvince) {
    this.certificateProvince = certificateProvince;
  }


  public CreateKey certificateTtl(Long certificateTtl) {
    
    this.certificateTtl = certificateTtl;
    return this;
  }

   /**
   * TTL in days for the generated certificate. Required only for generate-self-signed-certificate.
   * @return certificateTtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TTL in days for the generated certificate. Required only for generate-self-signed-certificate.")

  public Long getCertificateTtl() {
    return certificateTtl;
  }


  public void setCertificateTtl(Long certificateTtl) {
    this.certificateTtl = certificateTtl;
  }


  public CreateKey customerFrgId(String customerFrgId) {
    
    this.customerFrgId = customerFrgId;
    return this;
  }

   /**
   * The customer fragment ID that will be used to create the key (if empty, the key will be created independently of a customer fragment)
   * @return customerFrgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer fragment ID that will be used to create the key (if empty, the key will be created independently of a customer fragment)")

  public String getCustomerFrgId() {
    return customerFrgId;
  }


  public void setCustomerFrgId(String customerFrgId) {
    this.customerFrgId = customerFrgId;
  }


  public CreateKey deleteProtection(String deleteProtection) {
    
    this.deleteProtection = deleteProtection;
    return this;
  }

   /**
   * Protection from accidental deletion of this item [true/false]
   * @return deleteProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protection from accidental deletion of this item [true/false]")

  public String getDeleteProtection() {
    return deleteProtection;
  }


  public void setDeleteProtection(String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public CreateKey description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the object
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the object")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateKey generateSelfSignedCertificate(Boolean generateSelfSignedCertificate) {
    
    this.generateSelfSignedCertificate = generateSelfSignedCertificate;
    return this;
  }

   /**
   * Whether to generate a self signed certificate with the key. If set, --certificate-ttl must be provided.
   * @return generateSelfSignedCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to generate a self signed certificate with the key. If set, --certificate-ttl must be provided.")

  public Boolean getGenerateSelfSignedCertificate() {
    return generateSelfSignedCertificate;
  }


  public void setGenerateSelfSignedCertificate(Boolean generateSelfSignedCertificate) {
    this.generateSelfSignedCertificate = generateSelfSignedCertificate;
  }


  public CreateKey json(Boolean json) {
    
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


  public CreateKey metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Deprecated - use description
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated - use description")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public CreateKey name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Key name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Key name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateKey splitLevel(Long splitLevel) {
    
    this.splitLevel = splitLevel;
    return this;
  }

   /**
   * The number of fragments that the item will be split into (not includes customer fragment)
   * @return splitLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of fragments that the item will be split into (not includes customer fragment)")

  public Long getSplitLevel() {
    return splitLevel;
  }


  public void setSplitLevel(Long splitLevel) {
    this.splitLevel = splitLevel;
  }


  public CreateKey tag(List<String> tag) {
    
    this.tag = tag;
    return this;
  }

  public CreateKey addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<String>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * List of the tags attached to this key
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the tags attached to this key")

  public List<String> getTag() {
    return tag;
  }


  public void setTag(List<String> tag) {
    this.tag = tag;
  }


  public CreateKey token(String token) {
    
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


  public CreateKey uidToken(String uidToken) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKey createKey = (CreateKey) o;
    return Objects.equals(this.alg, createKey.alg) &&
        Objects.equals(this.certificateCommonName, createKey.certificateCommonName) &&
        Objects.equals(this.certificateCountry, createKey.certificateCountry) &&
        Objects.equals(this.certificateDigestAlgo, createKey.certificateDigestAlgo) &&
        Objects.equals(this.certificateLocality, createKey.certificateLocality) &&
        Objects.equals(this.certificateOrganization, createKey.certificateOrganization) &&
        Objects.equals(this.certificateProvince, createKey.certificateProvince) &&
        Objects.equals(this.certificateTtl, createKey.certificateTtl) &&
        Objects.equals(this.customerFrgId, createKey.customerFrgId) &&
        Objects.equals(this.deleteProtection, createKey.deleteProtection) &&
        Objects.equals(this.description, createKey.description) &&
        Objects.equals(this.generateSelfSignedCertificate, createKey.generateSelfSignedCertificate) &&
        Objects.equals(this.json, createKey.json) &&
        Objects.equals(this.metadata, createKey.metadata) &&
        Objects.equals(this.name, createKey.name) &&
        Objects.equals(this.splitLevel, createKey.splitLevel) &&
        Objects.equals(this.tag, createKey.tag) &&
        Objects.equals(this.token, createKey.token) &&
        Objects.equals(this.uidToken, createKey.uidToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, certificateCommonName, certificateCountry, certificateDigestAlgo, certificateLocality, certificateOrganization, certificateProvince, certificateTtl, customerFrgId, deleteProtection, description, generateSelfSignedCertificate, json, metadata, name, splitLevel, tag, token, uidToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKey {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    certificateCommonName: ").append(toIndentedString(certificateCommonName)).append("\n");
    sb.append("    certificateCountry: ").append(toIndentedString(certificateCountry)).append("\n");
    sb.append("    certificateDigestAlgo: ").append(toIndentedString(certificateDigestAlgo)).append("\n");
    sb.append("    certificateLocality: ").append(toIndentedString(certificateLocality)).append("\n");
    sb.append("    certificateOrganization: ").append(toIndentedString(certificateOrganization)).append("\n");
    sb.append("    certificateProvince: ").append(toIndentedString(certificateProvince)).append("\n");
    sb.append("    certificateTtl: ").append(toIndentedString(certificateTtl)).append("\n");
    sb.append("    customerFrgId: ").append(toIndentedString(customerFrgId)).append("\n");
    sb.append("    deleteProtection: ").append(toIndentedString(deleteProtection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    generateSelfSignedCertificate: ").append(toIndentedString(generateSelfSignedCertificate)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    splitLevel: ").append(toIndentedString(splitLevel)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
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

