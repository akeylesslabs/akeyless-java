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
import java.io.IOException;
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
 * createKey is a command that creates a new key. [Deprecated: Use command create-dfc-key]
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateKey {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  @javax.annotation.Nonnull
  private String alg;

  public static final String SERIALIZED_NAME_CERTIFICATE_COMMON_NAME = "certificate-common-name";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_COMMON_NAME)
  @javax.annotation.Nullable
  private String certificateCommonName;

  public static final String SERIALIZED_NAME_CERTIFICATE_COUNTRY = "certificate-country";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_COUNTRY)
  @javax.annotation.Nullable
  private String certificateCountry;

  public static final String SERIALIZED_NAME_CERTIFICATE_DIGEST_ALGO = "certificate-digest-algo";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DIGEST_ALGO)
  @javax.annotation.Nullable
  private String certificateDigestAlgo;

  public static final String SERIALIZED_NAME_CERTIFICATE_LOCALITY = "certificate-locality";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_LOCALITY)
  @javax.annotation.Nullable
  private String certificateLocality;

  public static final String SERIALIZED_NAME_CERTIFICATE_ORGANIZATION = "certificate-organization";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ORGANIZATION)
  @javax.annotation.Nullable
  private String certificateOrganization;

  public static final String SERIALIZED_NAME_CERTIFICATE_PROVINCE = "certificate-province";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PROVINCE)
  @javax.annotation.Nullable
  private String certificateProvince;

  public static final String SERIALIZED_NAME_CERTIFICATE_TTL = "certificate-ttl";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_TTL)
  @javax.annotation.Nullable
  private Long certificateTtl;

  public static final String SERIALIZED_NAME_CONF_FILE_DATA = "conf-file-data";
  @SerializedName(SERIALIZED_NAME_CONF_FILE_DATA)
  @javax.annotation.Nullable
  private String confFileData;

  public static final String SERIALIZED_NAME_CUSTOMER_FRG_ID = "customer-frg-id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_FRG_ID)
  @javax.annotation.Nullable
  private String customerFrgId;

  public static final String SERIALIZED_NAME_DELETE_PROTECTION = "delete_protection";
  @SerializedName(SERIALIZED_NAME_DELETE_PROTECTION)
  @javax.annotation.Nullable
  private String deleteProtection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_GENERATE_SELF_SIGNED_CERTIFICATE = "generate-self-signed-certificate";
  @SerializedName(SERIALIZED_NAME_GENERATE_SELF_SIGNED_CERTIFICATE)
  @javax.annotation.Nullable
  private Boolean generateSelfSignedCertificate;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private String metadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SPLIT_LEVEL = "split-level";
  @SerializedName(SERIALIZED_NAME_SPLIT_LEVEL)
  @javax.annotation.Nullable
  private Long splitLevel = 3l;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  @javax.annotation.Nullable
  private List<String> tag = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public CreateKey() {
  }

  public CreateKey alg(@javax.annotation.Nonnull String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Key type; options: [AES128GCM, AES256GCM, AES128SIV, AES256SIV, AES128CBC, AES256CBC, RSA1024, RSA2048, RSA3072, RSA4096]
   * @return alg
   */
  @javax.annotation.Nonnull
  public String getAlg() {
    return alg;
  }

  public void setAlg(@javax.annotation.Nonnull String alg) {
    this.alg = alg;
  }


  public CreateKey certificateCommonName(@javax.annotation.Nullable String certificateCommonName) {
    this.certificateCommonName = certificateCommonName;
    return this;
  }

  /**
   * Common name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateCommonName
   */
  @javax.annotation.Nullable
  public String getCertificateCommonName() {
    return certificateCommonName;
  }

  public void setCertificateCommonName(@javax.annotation.Nullable String certificateCommonName) {
    this.certificateCommonName = certificateCommonName;
  }


  public CreateKey certificateCountry(@javax.annotation.Nullable String certificateCountry) {
    this.certificateCountry = certificateCountry;
    return this;
  }

  /**
   * Country name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateCountry
   */
  @javax.annotation.Nullable
  public String getCertificateCountry() {
    return certificateCountry;
  }

  public void setCertificateCountry(@javax.annotation.Nullable String certificateCountry) {
    this.certificateCountry = certificateCountry;
  }


  public CreateKey certificateDigestAlgo(@javax.annotation.Nullable String certificateDigestAlgo) {
    this.certificateDigestAlgo = certificateDigestAlgo;
    return this;
  }

  /**
   * Digest algorithm to be used for the certificate key signing. Currently, we support only \&quot;sha256\&quot; so we hide this option for CLI.
   * @return certificateDigestAlgo
   */
  @javax.annotation.Nullable
  public String getCertificateDigestAlgo() {
    return certificateDigestAlgo;
  }

  public void setCertificateDigestAlgo(@javax.annotation.Nullable String certificateDigestAlgo) {
    this.certificateDigestAlgo = certificateDigestAlgo;
  }


  public CreateKey certificateLocality(@javax.annotation.Nullable String certificateLocality) {
    this.certificateLocality = certificateLocality;
    return this;
  }

  /**
   * Locality for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateLocality
   */
  @javax.annotation.Nullable
  public String getCertificateLocality() {
    return certificateLocality;
  }

  public void setCertificateLocality(@javax.annotation.Nullable String certificateLocality) {
    this.certificateLocality = certificateLocality;
  }


  public CreateKey certificateOrganization(@javax.annotation.Nullable String certificateOrganization) {
    this.certificateOrganization = certificateOrganization;
    return this;
  }

  /**
   * Organization name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateOrganization
   */
  @javax.annotation.Nullable
  public String getCertificateOrganization() {
    return certificateOrganization;
  }

  public void setCertificateOrganization(@javax.annotation.Nullable String certificateOrganization) {
    this.certificateOrganization = certificateOrganization;
  }


  public CreateKey certificateProvince(@javax.annotation.Nullable String certificateProvince) {
    this.certificateProvince = certificateProvince;
    return this;
  }

  /**
   * Province name for the generated certificate. Relevant only for generate-self-signed-certificate.
   * @return certificateProvince
   */
  @javax.annotation.Nullable
  public String getCertificateProvince() {
    return certificateProvince;
  }

  public void setCertificateProvince(@javax.annotation.Nullable String certificateProvince) {
    this.certificateProvince = certificateProvince;
  }


  public CreateKey certificateTtl(@javax.annotation.Nullable Long certificateTtl) {
    this.certificateTtl = certificateTtl;
    return this;
  }

  /**
   * TTL in days for the generated certificate. Required only for generate-self-signed-certificate.
   * @return certificateTtl
   */
  @javax.annotation.Nullable
  public Long getCertificateTtl() {
    return certificateTtl;
  }

  public void setCertificateTtl(@javax.annotation.Nullable Long certificateTtl) {
    this.certificateTtl = certificateTtl;
  }


  public CreateKey confFileData(@javax.annotation.Nullable String confFileData) {
    this.confFileData = confFileData;
    return this;
  }

  /**
   * The csr config data in base64 encoding
   * @return confFileData
   */
  @javax.annotation.Nullable
  public String getConfFileData() {
    return confFileData;
  }

  public void setConfFileData(@javax.annotation.Nullable String confFileData) {
    this.confFileData = confFileData;
  }


  public CreateKey customerFrgId(@javax.annotation.Nullable String customerFrgId) {
    this.customerFrgId = customerFrgId;
    return this;
  }

  /**
   * The customer fragment ID that will be used to create the key (if empty, the key will be created independently of a customer fragment)
   * @return customerFrgId
   */
  @javax.annotation.Nullable
  public String getCustomerFrgId() {
    return customerFrgId;
  }

  public void setCustomerFrgId(@javax.annotation.Nullable String customerFrgId) {
    this.customerFrgId = customerFrgId;
  }


  public CreateKey deleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
    return this;
  }

  /**
   * Protection from accidental deletion of this object [true/false]
   * @return deleteProtection
   */
  @javax.annotation.Nullable
  public String getDeleteProtection() {
    return deleteProtection;
  }

  public void setDeleteProtection(@javax.annotation.Nullable String deleteProtection) {
    this.deleteProtection = deleteProtection;
  }


  public CreateKey description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the object
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public CreateKey generateSelfSignedCertificate(@javax.annotation.Nullable Boolean generateSelfSignedCertificate) {
    this.generateSelfSignedCertificate = generateSelfSignedCertificate;
    return this;
  }

  /**
   * Whether to generate a self signed certificate with the key. If set, --certificate-ttl must be provided.
   * @return generateSelfSignedCertificate
   */
  @javax.annotation.Nullable
  public Boolean getGenerateSelfSignedCertificate() {
    return generateSelfSignedCertificate;
  }

  public void setGenerateSelfSignedCertificate(@javax.annotation.Nullable Boolean generateSelfSignedCertificate) {
    this.generateSelfSignedCertificate = generateSelfSignedCertificate;
  }


  public CreateKey json(@javax.annotation.Nullable Boolean json) {
    this.json = json;
    return this;
  }

  /**
   * Set output format to JSON
   * @return json
   */
  @javax.annotation.Nullable
  public Boolean getJson() {
    return json;
  }

  public void setJson(@javax.annotation.Nullable Boolean json) {
    this.json = json;
  }


  public CreateKey metadata(@javax.annotation.Nullable String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Deprecated - use description
   * @return metadata
   */
  @javax.annotation.Nullable
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable String metadata) {
    this.metadata = metadata;
  }


  public CreateKey name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Key name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public CreateKey splitLevel(@javax.annotation.Nullable Long splitLevel) {
    this.splitLevel = splitLevel;
    return this;
  }

  /**
   * The number of fragments that the item will be split into (not includes customer fragment)
   * @return splitLevel
   */
  @javax.annotation.Nullable
  public Long getSplitLevel() {
    return splitLevel;
  }

  public void setSplitLevel(@javax.annotation.Nullable Long splitLevel) {
    this.splitLevel = splitLevel;
  }


  public CreateKey tag(@javax.annotation.Nullable List<String> tag) {
    this.tag = tag;
    return this;
  }

  public CreateKey addTagItem(String tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<>();
    }
    this.tag.add(tagItem);
    return this;
  }

  /**
   * List of the tags attached to this key
   * @return tag
   */
  @javax.annotation.Nullable
  public List<String> getTag() {
    return tag;
  }

  public void setTag(@javax.annotation.Nullable List<String> tag) {
    this.tag = tag;
  }


  public CreateKey token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;)
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public CreateKey uidToken(@javax.annotation.Nullable String uidToken) {
    this.uidToken = uidToken;
    return this;
  }

  /**
   * The universal identity token, Required only for universal_identity authentication
   * @return uidToken
   */
  @javax.annotation.Nullable
  public String getUidToken() {
    return uidToken;
  }

  public void setUidToken(@javax.annotation.Nullable String uidToken) {
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
        Objects.equals(this.confFileData, createKey.confFileData) &&
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
    return Objects.hash(alg, certificateCommonName, certificateCountry, certificateDigestAlgo, certificateLocality, certificateOrganization, certificateProvince, certificateTtl, confFileData, customerFrgId, deleteProtection, description, generateSelfSignedCertificate, json, metadata, name, splitLevel, tag, token, uidToken);
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
    sb.append("    confFileData: ").append(toIndentedString(confFileData)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("alg");
    openapiFields.add("certificate-common-name");
    openapiFields.add("certificate-country");
    openapiFields.add("certificate-digest-algo");
    openapiFields.add("certificate-locality");
    openapiFields.add("certificate-organization");
    openapiFields.add("certificate-province");
    openapiFields.add("certificate-ttl");
    openapiFields.add("conf-file-data");
    openapiFields.add("customer-frg-id");
    openapiFields.add("delete_protection");
    openapiFields.add("description");
    openapiFields.add("generate-self-signed-certificate");
    openapiFields.add("json");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("split-level");
    openapiFields.add("tag");
    openapiFields.add("token");
    openapiFields.add("uid-token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alg");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateKey
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateKey is not found in the empty JSON string", CreateKey.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateKey` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      if ((jsonObj.get("certificate-common-name") != null && !jsonObj.get("certificate-common-name").isJsonNull()) && !jsonObj.get("certificate-common-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-common-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-common-name").toString()));
      }
      if ((jsonObj.get("certificate-country") != null && !jsonObj.get("certificate-country").isJsonNull()) && !jsonObj.get("certificate-country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-country").toString()));
      }
      if ((jsonObj.get("certificate-digest-algo") != null && !jsonObj.get("certificate-digest-algo").isJsonNull()) && !jsonObj.get("certificate-digest-algo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-digest-algo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-digest-algo").toString()));
      }
      if ((jsonObj.get("certificate-locality") != null && !jsonObj.get("certificate-locality").isJsonNull()) && !jsonObj.get("certificate-locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-locality").toString()));
      }
      if ((jsonObj.get("certificate-organization") != null && !jsonObj.get("certificate-organization").isJsonNull()) && !jsonObj.get("certificate-organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-organization").toString()));
      }
      if ((jsonObj.get("certificate-province") != null && !jsonObj.get("certificate-province").isJsonNull()) && !jsonObj.get("certificate-province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-province").toString()));
      }
      if ((jsonObj.get("conf-file-data") != null && !jsonObj.get("conf-file-data").isJsonNull()) && !jsonObj.get("conf-file-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conf-file-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conf-file-data").toString()));
      }
      if ((jsonObj.get("customer-frg-id") != null && !jsonObj.get("customer-frg-id").isJsonNull()) && !jsonObj.get("customer-frg-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer-frg-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer-frg-id").toString()));
      }
      if ((jsonObj.get("delete_protection") != null && !jsonObj.get("delete_protection").isJsonNull()) && !jsonObj.get("delete_protection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delete_protection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delete_protection").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) && !jsonObj.get("metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull() && !jsonObj.get("tag").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be an array in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateKey.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateKey>() {
           @Override
           public void write(JsonWriter out, CreateKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateKey given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateKey
   * @throws IOException if the JSON string is invalid with respect to CreateKey
   */
  public static CreateKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateKey.class);
  }

  /**
   * Convert an instance of CreateKey to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

