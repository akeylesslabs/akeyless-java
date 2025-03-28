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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * GenerateCsr
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GenerateCsr {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  @javax.annotation.Nullable
  private String alg;

  public static final String SERIALIZED_NAME_ALT_NAMES = "alt-names";
  @SerializedName(SERIALIZED_NAME_ALT_NAMES)
  @javax.annotation.Nullable
  private String altNames;

  public static final String SERIALIZED_NAME_CERTIFICATE_TYPE = "certificate-type";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_TYPE)
  @javax.annotation.Nullable
  private String certificateType;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nullable
  private String city;

  public static final String SERIALIZED_NAME_COMMON_NAME = "common-name";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  @javax.annotation.Nonnull
  private String commonName;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_CRITICAL = "critical";
  @SerializedName(SERIALIZED_NAME_CRITICAL)
  @javax.annotation.Nullable
  private Boolean critical;

  public static final String SERIALIZED_NAME_DEP = "dep";
  @SerializedName(SERIALIZED_NAME_DEP)
  @javax.annotation.Nullable
  private String dep;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESSES = "email-addresses";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESSES)
  @javax.annotation.Nullable
  private String emailAddresses;

  public static final String SERIALIZED_NAME_EXPORT_PRIVATE_KEY = "export-private-key";
  @SerializedName(SERIALIZED_NAME_EXPORT_PRIVATE_KEY)
  @javax.annotation.Nullable
  private Boolean exportPrivateKey = false;

  public static final String SERIALIZED_NAME_GENERATE_KEY = "generate-key";
  @SerializedName(SERIALIZED_NAME_GENERATE_KEY)
  @javax.annotation.Nullable
  private Boolean generateKey;

  public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip-addresses";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
  @javax.annotation.Nullable
  private String ipAddresses;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_TYPE = "key-type";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  @javax.annotation.Nonnull
  private String keyType = "classic-key";

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  @javax.annotation.Nullable
  private String org;

  public static final String SERIALIZED_NAME_SPLIT_LEVEL = "split-level";
  @SerializedName(SERIALIZED_NAME_SPLIT_LEVEL)
  @javax.annotation.Nullable
  private Long splitLevel = 3l;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_URI_SANS = "uri-sans";
  @SerializedName(SERIALIZED_NAME_URI_SANS)
  @javax.annotation.Nullable
  private String uriSans;

  public GenerateCsr() {
  }

  public GenerateCsr alg(@javax.annotation.Nullable String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Get alg
   * @return alg
   */
  @javax.annotation.Nullable
  public String getAlg() {
    return alg;
  }

  public void setAlg(@javax.annotation.Nullable String alg) {
    this.alg = alg;
  }


  public GenerateCsr altNames(@javax.annotation.Nullable String altNames) {
    this.altNames = altNames;
    return this;
  }

  /**
   * A comma-separated list of dns alternative names
   * @return altNames
   */
  @javax.annotation.Nullable
  public String getAltNames() {
    return altNames;
  }

  public void setAltNames(@javax.annotation.Nullable String altNames) {
    this.altNames = altNames;
  }


  public GenerateCsr certificateType(@javax.annotation.Nullable String certificateType) {
    this.certificateType = certificateType;
    return this;
  }

  /**
   * The certificate type to be included in the CSR certificate (ssl-client/ssl-server/certificate-signing)
   * @return certificateType
   */
  @javax.annotation.Nullable
  public String getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(@javax.annotation.Nullable String certificateType) {
    this.certificateType = certificateType;
  }


  public GenerateCsr city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * The city to be included in the CSR certificate
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public GenerateCsr commonName(@javax.annotation.Nonnull String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * The common name to be included in the CSR certificate
   * @return commonName
   */
  @javax.annotation.Nonnull
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(@javax.annotation.Nonnull String commonName) {
    this.commonName = commonName;
  }


  public GenerateCsr country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country to be included in the CSR certificate
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public GenerateCsr critical(@javax.annotation.Nullable Boolean critical) {
    this.critical = critical;
    return this;
  }

  /**
   * Add critical to the key usage extension (will be false if not added)
   * @return critical
   */
  @javax.annotation.Nullable
  public Boolean getCritical() {
    return critical;
  }

  public void setCritical(@javax.annotation.Nullable Boolean critical) {
    this.critical = critical;
  }


  public GenerateCsr dep(@javax.annotation.Nullable String dep) {
    this.dep = dep;
    return this;
  }

  /**
   * The department to be included in the CSR certificate
   * @return dep
   */
  @javax.annotation.Nullable
  public String getDep() {
    return dep;
  }

  public void setDep(@javax.annotation.Nullable String dep) {
    this.dep = dep;
  }


  public GenerateCsr emailAddresses(@javax.annotation.Nullable String emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  /**
   * A comma-separated list of email addresses alternative names
   * @return emailAddresses
   */
  @javax.annotation.Nullable
  public String getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(@javax.annotation.Nullable String emailAddresses) {
    this.emailAddresses = emailAddresses;
  }


  public GenerateCsr exportPrivateKey(@javax.annotation.Nullable Boolean exportPrivateKey) {
    this.exportPrivateKey = exportPrivateKey;
    return this;
  }

  /**
   * The flag to indicate if the private key should be exported
   * @return exportPrivateKey
   */
  @javax.annotation.Nullable
  public Boolean getExportPrivateKey() {
    return exportPrivateKey;
  }

  public void setExportPrivateKey(@javax.annotation.Nullable Boolean exportPrivateKey) {
    this.exportPrivateKey = exportPrivateKey;
  }


  public GenerateCsr generateKey(@javax.annotation.Nullable Boolean generateKey) {
    this.generateKey = generateKey;
    return this;
  }

  /**
   * Generate a new classic key for the csr
   * @return generateKey
   */
  @javax.annotation.Nullable
  public Boolean getGenerateKey() {
    return generateKey;
  }

  public void setGenerateKey(@javax.annotation.Nullable Boolean generateKey) {
    this.generateKey = generateKey;
  }


  public GenerateCsr ipAddresses(@javax.annotation.Nullable String ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * A comma-separated list of ip addresses alternative names
   * @return ipAddresses
   */
  @javax.annotation.Nullable
  public String getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(@javax.annotation.Nullable String ipAddresses) {
    this.ipAddresses = ipAddresses;
  }


  public GenerateCsr json(@javax.annotation.Nullable Boolean json) {
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


  public GenerateCsr keyType(@javax.annotation.Nonnull String keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * The type of the key to generate (classic-key/dfc)
   * @return keyType
   */
  @javax.annotation.Nonnull
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(@javax.annotation.Nonnull String keyType) {
    this.keyType = keyType;
  }


  public GenerateCsr name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The key name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public GenerateCsr org(@javax.annotation.Nullable String org) {
    this.org = org;
    return this;
  }

  /**
   * The organization to be included in the CSR certificate
   * @return org
   */
  @javax.annotation.Nullable
  public String getOrg() {
    return org;
  }

  public void setOrg(@javax.annotation.Nullable String org) {
    this.org = org;
  }


  public GenerateCsr splitLevel(@javax.annotation.Nullable Long splitLevel) {
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


  public GenerateCsr state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The state to be included in the CSR certificate
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public GenerateCsr token(@javax.annotation.Nullable String token) {
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


  public GenerateCsr uidToken(@javax.annotation.Nullable String uidToken) {
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


  public GenerateCsr uriSans(@javax.annotation.Nullable String uriSans) {
    this.uriSans = uriSans;
    return this;
  }

  /**
   * A comma-separated list of uri alternative names
   * @return uriSans
   */
  @javax.annotation.Nullable
  public String getUriSans() {
    return uriSans;
  }

  public void setUriSans(@javax.annotation.Nullable String uriSans) {
    this.uriSans = uriSans;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateCsr generateCsr = (GenerateCsr) o;
    return Objects.equals(this.alg, generateCsr.alg) &&
        Objects.equals(this.altNames, generateCsr.altNames) &&
        Objects.equals(this.certificateType, generateCsr.certificateType) &&
        Objects.equals(this.city, generateCsr.city) &&
        Objects.equals(this.commonName, generateCsr.commonName) &&
        Objects.equals(this.country, generateCsr.country) &&
        Objects.equals(this.critical, generateCsr.critical) &&
        Objects.equals(this.dep, generateCsr.dep) &&
        Objects.equals(this.emailAddresses, generateCsr.emailAddresses) &&
        Objects.equals(this.exportPrivateKey, generateCsr.exportPrivateKey) &&
        Objects.equals(this.generateKey, generateCsr.generateKey) &&
        Objects.equals(this.ipAddresses, generateCsr.ipAddresses) &&
        Objects.equals(this.json, generateCsr.json) &&
        Objects.equals(this.keyType, generateCsr.keyType) &&
        Objects.equals(this.name, generateCsr.name) &&
        Objects.equals(this.org, generateCsr.org) &&
        Objects.equals(this.splitLevel, generateCsr.splitLevel) &&
        Objects.equals(this.state, generateCsr.state) &&
        Objects.equals(this.token, generateCsr.token) &&
        Objects.equals(this.uidToken, generateCsr.uidToken) &&
        Objects.equals(this.uriSans, generateCsr.uriSans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, altNames, certificateType, city, commonName, country, critical, dep, emailAddresses, exportPrivateKey, generateKey, ipAddresses, json, keyType, name, org, splitLevel, state, token, uidToken, uriSans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateCsr {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    altNames: ").append(toIndentedString(altNames)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    dep: ").append(toIndentedString(dep)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    exportPrivateKey: ").append(toIndentedString(exportPrivateKey)).append("\n");
    sb.append("    generateKey: ").append(toIndentedString(generateKey)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    splitLevel: ").append(toIndentedString(splitLevel)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uidToken: ").append(toIndentedString(uidToken)).append("\n");
    sb.append("    uriSans: ").append(toIndentedString(uriSans)).append("\n");
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
    openapiFields.add("alt-names");
    openapiFields.add("certificate-type");
    openapiFields.add("city");
    openapiFields.add("common-name");
    openapiFields.add("country");
    openapiFields.add("critical");
    openapiFields.add("dep");
    openapiFields.add("email-addresses");
    openapiFields.add("export-private-key");
    openapiFields.add("generate-key");
    openapiFields.add("ip-addresses");
    openapiFields.add("json");
    openapiFields.add("key-type");
    openapiFields.add("name");
    openapiFields.add("org");
    openapiFields.add("split-level");
    openapiFields.add("state");
    openapiFields.add("token");
    openapiFields.add("uid-token");
    openapiFields.add("uri-sans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("common-name");
    openapiRequiredFields.add("key-type");
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GenerateCsr
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateCsr.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateCsr is not found in the empty JSON string", GenerateCsr.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateCsr.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateCsr` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateCsr.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alg") != null && !jsonObj.get("alg").isJsonNull()) && !jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      if ((jsonObj.get("alt-names") != null && !jsonObj.get("alt-names").isJsonNull()) && !jsonObj.get("alt-names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alt-names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alt-names").toString()));
      }
      if ((jsonObj.get("certificate-type") != null && !jsonObj.get("certificate-type").isJsonNull()) && !jsonObj.get("certificate-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificate-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificate-type").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("common-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `common-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("common-name").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("dep") != null && !jsonObj.get("dep").isJsonNull()) && !jsonObj.get("dep").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dep` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dep").toString()));
      }
      if ((jsonObj.get("email-addresses") != null && !jsonObj.get("email-addresses").isJsonNull()) && !jsonObj.get("email-addresses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email-addresses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email-addresses").toString()));
      }
      if ((jsonObj.get("ip-addresses") != null && !jsonObj.get("ip-addresses").isJsonNull()) && !jsonObj.get("ip-addresses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip-addresses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip-addresses").toString()));
      }
      if (!jsonObj.get("key-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key-type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) && !jsonObj.get("org").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("uid-token") != null && !jsonObj.get("uid-token").isJsonNull()) && !jsonObj.get("uid-token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid-token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid-token").toString()));
      }
      if ((jsonObj.get("uri-sans") != null && !jsonObj.get("uri-sans").isJsonNull()) && !jsonObj.get("uri-sans").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri-sans` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri-sans").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateCsr.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateCsr' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateCsr> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateCsr.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateCsr>() {
           @Override
           public void write(JsonWriter out, GenerateCsr value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateCsr read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GenerateCsr given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GenerateCsr
   * @throws IOException if the JSON string is invalid with respect to GenerateCsr
   */
  public static GenerateCsr fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateCsr.class);
  }

  /**
   * Convert an instance of GenerateCsr to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

