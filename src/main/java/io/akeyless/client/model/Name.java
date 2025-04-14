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
import io.akeyless.client.model.AttributeTypeAndValue;
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
 * Name represents an X.509 distinguished name. This only includes the common elements of a DN. Note that Name is only an approximation of the X.509 structure. If an accurate representation is needed, asn1.Unmarshal the raw subject or issuer as an [RDNSequence].
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Name {
  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private List<String> country = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXTRA_NAMES = "ExtraNames";
  @SerializedName(SERIALIZED_NAME_EXTRA_NAMES)
  @javax.annotation.Nullable
  private List<AttributeTypeAndValue> extraNames = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCALITY = "Locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  @javax.annotation.Nullable
  private List<String> locality = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAMES = "Names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  @javax.annotation.Nullable
  private List<AttributeTypeAndValue> names = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  @javax.annotation.Nullable
  private String serialNumber;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "StreetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  @javax.annotation.Nullable
  private List<String> streetAddress = new ArrayList<>();

  public Name() {
  }

  public Name country(@javax.annotation.Nullable List<String> country) {
    this.country = country;
    return this;
  }

  public Name addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<>();
    }
    this.country.add(countryItem);
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public List<String> getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable List<String> country) {
    this.country = country;
  }


  public Name extraNames(@javax.annotation.Nullable List<AttributeTypeAndValue> extraNames) {
    this.extraNames = extraNames;
    return this;
  }

  public Name addExtraNamesItem(AttributeTypeAndValue extraNamesItem) {
    if (this.extraNames == null) {
      this.extraNames = new ArrayList<>();
    }
    this.extraNames.add(extraNamesItem);
    return this;
  }

  /**
   * ExtraNames contains attributes to be copied, raw, into any marshaled distinguished names. Values override any attributes with the same OID. The ExtraNames field is not populated when parsing, see Names.
   * @return extraNames
   */
  @javax.annotation.Nullable
  public List<AttributeTypeAndValue> getExtraNames() {
    return extraNames;
  }

  public void setExtraNames(@javax.annotation.Nullable List<AttributeTypeAndValue> extraNames) {
    this.extraNames = extraNames;
  }


  public Name locality(@javax.annotation.Nullable List<String> locality) {
    this.locality = locality;
    return this;
  }

  public Name addLocalityItem(String localityItem) {
    if (this.locality == null) {
      this.locality = new ArrayList<>();
    }
    this.locality.add(localityItem);
    return this;
  }

  /**
   * Get locality
   * @return locality
   */
  @javax.annotation.Nullable
  public List<String> getLocality() {
    return locality;
  }

  public void setLocality(@javax.annotation.Nullable List<String> locality) {
    this.locality = locality;
  }


  public Name names(@javax.annotation.Nullable List<AttributeTypeAndValue> names) {
    this.names = names;
    return this;
  }

  public Name addNamesItem(AttributeTypeAndValue namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Names contains all parsed attributes. When parsing distinguished names, this can be used to extract non-standard attributes that are not parsed by this package. When marshaling to RDNSequences, the Names field is ignored, see ExtraNames.
   * @return names
   */
  @javax.annotation.Nullable
  public List<AttributeTypeAndValue> getNames() {
    return names;
  }

  public void setNames(@javax.annotation.Nullable List<AttributeTypeAndValue> names) {
    this.names = names;
  }


  public Name serialNumber(@javax.annotation.Nullable String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(@javax.annotation.Nullable String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public Name streetAddress(@javax.annotation.Nullable List<String> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  public Name addStreetAddressItem(String streetAddressItem) {
    if (this.streetAddress == null) {
      this.streetAddress = new ArrayList<>();
    }
    this.streetAddress.add(streetAddressItem);
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
   */
  @javax.annotation.Nullable
  public List<String> getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(@javax.annotation.Nullable List<String> streetAddress) {
    this.streetAddress = streetAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.country, name.country) &&
        Objects.equals(this.extraNames, name.extraNames) &&
        Objects.equals(this.locality, name.locality) &&
        Objects.equals(this.names, name.names) &&
        Objects.equals(this.serialNumber, name.serialNumber) &&
        Objects.equals(this.streetAddress, name.streetAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, extraNames, locality, names, serialNumber, streetAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    extraNames: ").append(toIndentedString(extraNames)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
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
    openapiFields.add("Country");
    openapiFields.add("ExtraNames");
    openapiFields.add("Locality");
    openapiFields.add("Names");
    openapiFields.add("SerialNumber");
    openapiFields.add("StreetAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Name
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Name.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Name is not found in the empty JSON string", Name.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Name.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Name` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull() && !jsonObj.get("Country").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Country` to be an array in the JSON string but got `%s`", jsonObj.get("Country").toString()));
      }
      if (jsonObj.get("ExtraNames") != null && !jsonObj.get("ExtraNames").isJsonNull()) {
        JsonArray jsonArrayextraNames = jsonObj.getAsJsonArray("ExtraNames");
        if (jsonArrayextraNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ExtraNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ExtraNames` to be an array in the JSON string but got `%s`", jsonObj.get("ExtraNames").toString()));
          }

          // validate the optional field `ExtraNames` (array)
          for (int i = 0; i < jsonArrayextraNames.size(); i++) {
            AttributeTypeAndValue.validateJsonElement(jsonArrayextraNames.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Locality") != null && !jsonObj.get("Locality").isJsonNull() && !jsonObj.get("Locality").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Locality` to be an array in the JSON string but got `%s`", jsonObj.get("Locality").toString()));
      }
      if (jsonObj.get("Names") != null && !jsonObj.get("Names").isJsonNull()) {
        JsonArray jsonArraynames = jsonObj.getAsJsonArray("Names");
        if (jsonArraynames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Names").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Names` to be an array in the JSON string but got `%s`", jsonObj.get("Names").toString()));
          }

          // validate the optional field `Names` (array)
          for (int i = 0; i < jsonArraynames.size(); i++) {
            AttributeTypeAndValue.validateJsonElement(jsonArraynames.get(i));
          };
        }
      }
      if ((jsonObj.get("SerialNumber") != null && !jsonObj.get("SerialNumber").isJsonNull()) && !jsonObj.get("SerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SerialNumber").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("StreetAddress") != null && !jsonObj.get("StreetAddress").isJsonNull() && !jsonObj.get("StreetAddress").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `StreetAddress` to be an array in the JSON string but got `%s`", jsonObj.get("StreetAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Name.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Name' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Name> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Name.class));

       return (TypeAdapter<T>) new TypeAdapter<Name>() {
           @Override
           public void write(JsonWriter out, Name value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Name read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Name given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Name
   * @throws IOException if the JSON string is invalid with respect to Name
   */
  public static Name fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Name.class);
  }

  /**
   * Convert an instance of Name to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

