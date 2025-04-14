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
 * GetPKICertificate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GetPKICertificate {
  public static final String SERIALIZED_NAME_ALT_NAMES = "alt-names";
  @SerializedName(SERIALIZED_NAME_ALT_NAMES)
  @javax.annotation.Nullable
  private String altNames;

  public static final String SERIALIZED_NAME_CERT_ISSUER_NAME = "cert-issuer-name";
  @SerializedName(SERIALIZED_NAME_CERT_ISSUER_NAME)
  @javax.annotation.Nonnull
  private String certIssuerName;

  public static final String SERIALIZED_NAME_COMMON_NAME = "common-name";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  @javax.annotation.Nullable
  private String commonName;

  public static final String SERIALIZED_NAME_CSR_DATA_BASE64 = "csr-data-base64";
  @SerializedName(SERIALIZED_NAME_CSR_DATA_BASE64)
  @javax.annotation.Nullable
  private String csrDataBase64;

  public static final String SERIALIZED_NAME_EXTENDED_KEY_USAGE = "extended-key-usage";
  @SerializedName(SERIALIZED_NAME_EXTENDED_KEY_USAGE)
  @javax.annotation.Nullable
  private String extendedKeyUsage;

  public static final String SERIALIZED_NAME_EXTRA_EXTENSIONS = "extra-extensions";
  @SerializedName(SERIALIZED_NAME_EXTRA_EXTENSIONS)
  @javax.annotation.Nullable
  private String extraExtensions;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  @javax.annotation.Nullable
  private Boolean json = false;

  public static final String SERIALIZED_NAME_KEY_DATA_BASE64 = "key-data-base64";
  @SerializedName(SERIALIZED_NAME_KEY_DATA_BASE64)
  @javax.annotation.Nullable
  private String keyDataBase64;

  public static final String SERIALIZED_NAME_MAX_PATH_LEN = "max-path-len";
  @SerializedName(SERIALIZED_NAME_MAX_PATH_LEN)
  @javax.annotation.Nullable
  private Long maxPathLen = -1l;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  @javax.annotation.Nullable
  private String ttl;

  public static final String SERIALIZED_NAME_UID_TOKEN = "uid-token";
  @SerializedName(SERIALIZED_NAME_UID_TOKEN)
  @javax.annotation.Nullable
  private String uidToken;

  public static final String SERIALIZED_NAME_URI_SANS = "uri-sans";
  @SerializedName(SERIALIZED_NAME_URI_SANS)
  @javax.annotation.Nullable
  private String uriSans;

  public GetPKICertificate() {
  }

  public GetPKICertificate altNames(@javax.annotation.Nullable String altNames) {
    this.altNames = altNames;
    return this;
  }

  /**
   * The Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any DNS.* names are taken from it)
   * @return altNames
   */
  @javax.annotation.Nullable
  public String getAltNames() {
    return altNames;
  }

  public void setAltNames(@javax.annotation.Nullable String altNames) {
    this.altNames = altNames;
  }


  public GetPKICertificate certIssuerName(@javax.annotation.Nonnull String certIssuerName) {
    this.certIssuerName = certIssuerName;
    return this;
  }

  /**
   * The name of the PKI certificate issuer
   * @return certIssuerName
   */
  @javax.annotation.Nonnull
  public String getCertIssuerName() {
    return certIssuerName;
  }

  public void setCertIssuerName(@javax.annotation.Nonnull String certIssuerName) {
    this.certIssuerName = certIssuerName;
  }


  public GetPKICertificate commonName(@javax.annotation.Nullable String commonName) {
    this.commonName = commonName;
    return this;
  }

  /**
   * The common name to be included in the PKI certificate (if CSR is supplied this flag is ignored and the CSR subject CN is taken)
   * @return commonName
   */
  @javax.annotation.Nullable
  public String getCommonName() {
    return commonName;
  }

  public void setCommonName(@javax.annotation.Nullable String commonName) {
    this.commonName = commonName;
  }


  public GetPKICertificate csrDataBase64(@javax.annotation.Nullable String csrDataBase64) {
    this.csrDataBase64 = csrDataBase64;
    return this;
  }

  /**
   * Certificate Signing Request contents encoded in base64 to generate the certificate with
   * @return csrDataBase64
   */
  @javax.annotation.Nullable
  public String getCsrDataBase64() {
    return csrDataBase64;
  }

  public void setCsrDataBase64(@javax.annotation.Nullable String csrDataBase64) {
    this.csrDataBase64 = csrDataBase64;
  }


  public GetPKICertificate extendedKeyUsage(@javax.annotation.Nullable String extendedKeyUsage) {
    this.extendedKeyUsage = extendedKeyUsage;
    return this;
  }

  /**
   * A comma-separated list of extended key usage requests which will be used for certificate issuance. Supported values: &#39;clientauth&#39;, &#39;serverauth&#39;. If critical is present the extension will be marked as critical
   * @return extendedKeyUsage
   */
  @javax.annotation.Nullable
  public String getExtendedKeyUsage() {
    return extendedKeyUsage;
  }

  public void setExtendedKeyUsage(@javax.annotation.Nullable String extendedKeyUsage) {
    this.extendedKeyUsage = extendedKeyUsage;
  }


  public GetPKICertificate extraExtensions(@javax.annotation.Nullable String extraExtensions) {
    this.extraExtensions = extraExtensions;
    return this;
  }

  /**
   * A json string that defines the requested extra extensions for the certificate
   * @return extraExtensions
   */
  @javax.annotation.Nullable
  public String getExtraExtensions() {
    return extraExtensions;
  }

  public void setExtraExtensions(@javax.annotation.Nullable String extraExtensions) {
    this.extraExtensions = extraExtensions;
  }


  public GetPKICertificate json(@javax.annotation.Nullable Boolean json) {
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


  public GetPKICertificate keyDataBase64(@javax.annotation.Nullable String keyDataBase64) {
    this.keyDataBase64 = keyDataBase64;
    return this;
  }

  /**
   * PKI key file contents. If this option is used, the certificate will be printed to stdout
   * @return keyDataBase64
   */
  @javax.annotation.Nullable
  public String getKeyDataBase64() {
    return keyDataBase64;
  }

  public void setKeyDataBase64(@javax.annotation.Nullable String keyDataBase64) {
    this.keyDataBase64 = keyDataBase64;
  }


  public GetPKICertificate maxPathLen(@javax.annotation.Nullable Long maxPathLen) {
    this.maxPathLen = maxPathLen;
    return this;
  }

  /**
   * The maximum path length for the generated certificate. -1, means unlimited unless the signing certificate has a maximum path length set
   * @return maxPathLen
   */
  @javax.annotation.Nullable
  public Long getMaxPathLen() {
    return maxPathLen;
  }

  public void setMaxPathLen(@javax.annotation.Nullable Long maxPathLen) {
    this.maxPathLen = maxPathLen;
  }


  public GetPKICertificate token(@javax.annotation.Nullable String token) {
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


  public GetPKICertificate ttl(@javax.annotation.Nullable String ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Updated certificate lifetime in seconds (must be less than the Certificate Issuer default TTL)
   * @return ttl
   */
  @javax.annotation.Nullable
  public String getTtl() {
    return ttl;
  }

  public void setTtl(@javax.annotation.Nullable String ttl) {
    this.ttl = ttl;
  }


  public GetPKICertificate uidToken(@javax.annotation.Nullable String uidToken) {
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


  public GetPKICertificate uriSans(@javax.annotation.Nullable String uriSans) {
    this.uriSans = uriSans;
    return this;
  }

  /**
   * The URI Subject Alternative Names to be included in the PKI certificate (in a comma-separated list) (if CSR is supplied this flag is ignored and any URI.* names are taken from it)
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
    GetPKICertificate getPKICertificate = (GetPKICertificate) o;
    return Objects.equals(this.altNames, getPKICertificate.altNames) &&
        Objects.equals(this.certIssuerName, getPKICertificate.certIssuerName) &&
        Objects.equals(this.commonName, getPKICertificate.commonName) &&
        Objects.equals(this.csrDataBase64, getPKICertificate.csrDataBase64) &&
        Objects.equals(this.extendedKeyUsage, getPKICertificate.extendedKeyUsage) &&
        Objects.equals(this.extraExtensions, getPKICertificate.extraExtensions) &&
        Objects.equals(this.json, getPKICertificate.json) &&
        Objects.equals(this.keyDataBase64, getPKICertificate.keyDataBase64) &&
        Objects.equals(this.maxPathLen, getPKICertificate.maxPathLen) &&
        Objects.equals(this.token, getPKICertificate.token) &&
        Objects.equals(this.ttl, getPKICertificate.ttl) &&
        Objects.equals(this.uidToken, getPKICertificate.uidToken) &&
        Objects.equals(this.uriSans, getPKICertificate.uriSans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altNames, certIssuerName, commonName, csrDataBase64, extendedKeyUsage, extraExtensions, json, keyDataBase64, maxPathLen, token, ttl, uidToken, uriSans);
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
    sb.append("    extraExtensions: ").append(toIndentedString(extraExtensions)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    keyDataBase64: ").append(toIndentedString(keyDataBase64)).append("\n");
    sb.append("    maxPathLen: ").append(toIndentedString(maxPathLen)).append("\n");
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
    openapiFields.add("alt-names");
    openapiFields.add("cert-issuer-name");
    openapiFields.add("common-name");
    openapiFields.add("csr-data-base64");
    openapiFields.add("extended-key-usage");
    openapiFields.add("extra-extensions");
    openapiFields.add("json");
    openapiFields.add("key-data-base64");
    openapiFields.add("max-path-len");
    openapiFields.add("token");
    openapiFields.add("ttl");
    openapiFields.add("uid-token");
    openapiFields.add("uri-sans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cert-issuer-name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetPKICertificate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetPKICertificate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetPKICertificate is not found in the empty JSON string", GetPKICertificate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetPKICertificate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetPKICertificate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetPKICertificate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("alt-names") != null && !jsonObj.get("alt-names").isJsonNull()) && !jsonObj.get("alt-names").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alt-names` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alt-names").toString()));
      }
      if (!jsonObj.get("cert-issuer-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert-issuer-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert-issuer-name").toString()));
      }
      if ((jsonObj.get("common-name") != null && !jsonObj.get("common-name").isJsonNull()) && !jsonObj.get("common-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `common-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("common-name").toString()));
      }
      if ((jsonObj.get("csr-data-base64") != null && !jsonObj.get("csr-data-base64").isJsonNull()) && !jsonObj.get("csr-data-base64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csr-data-base64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csr-data-base64").toString()));
      }
      if ((jsonObj.get("extended-key-usage") != null && !jsonObj.get("extended-key-usage").isJsonNull()) && !jsonObj.get("extended-key-usage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extended-key-usage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extended-key-usage").toString()));
      }
      if ((jsonObj.get("extra-extensions") != null && !jsonObj.get("extra-extensions").isJsonNull()) && !jsonObj.get("extra-extensions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra-extensions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra-extensions").toString()));
      }
      if ((jsonObj.get("key-data-base64") != null && !jsonObj.get("key-data-base64").isJsonNull()) && !jsonObj.get("key-data-base64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key-data-base64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key-data-base64").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
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
       if (!GetPKICertificate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetPKICertificate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetPKICertificate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetPKICertificate.class));

       return (TypeAdapter<T>) new TypeAdapter<GetPKICertificate>() {
           @Override
           public void write(JsonWriter out, GetPKICertificate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetPKICertificate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetPKICertificate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPKICertificate
   * @throws IOException if the JSON string is invalid with respect to GetPKICertificate
   */
  public static GetPKICertificate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetPKICertificate.class);
  }

  /**
   * Convert an instance of GetPKICertificate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

