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
import io.akeyless.client.model.PathRule;
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
 * Rules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class Rules {
  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  @javax.annotation.Nullable
  private Boolean admin;

  public static final String SERIALIZED_NAME_PATH_RULES = "path_rules";
  @SerializedName(SERIALIZED_NAME_PATH_RULES)
  @javax.annotation.Nullable
  private List<PathRule> pathRules = new ArrayList<>();

  public Rules() {
  }

  public Rules admin(@javax.annotation.Nullable Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Is admin
   * @return admin
   */
  @javax.annotation.Nullable
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(@javax.annotation.Nullable Boolean admin) {
    this.admin = admin;
  }


  public Rules pathRules(@javax.annotation.Nullable List<PathRule> pathRules) {
    this.pathRules = pathRules;
    return this;
  }

  public Rules addPathRulesItem(PathRule pathRulesItem) {
    if (this.pathRules == null) {
      this.pathRules = new ArrayList<>();
    }
    this.pathRules.add(pathRulesItem);
    return this;
  }

  /**
   * The path the rules refers to
   * @return pathRules
   */
  @javax.annotation.Nullable
  public List<PathRule> getPathRules() {
    return pathRules;
  }

  public void setPathRules(@javax.annotation.Nullable List<PathRule> pathRules) {
    this.pathRules = pathRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rules rules = (Rules) o;
    return Objects.equals(this.admin, rules.admin) &&
        Objects.equals(this.pathRules, rules.pathRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, pathRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rules {\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    pathRules: ").append(toIndentedString(pathRules)).append("\n");
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
    openapiFields.add("admin");
    openapiFields.add("path_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Rules
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Rules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Rules is not found in the empty JSON string", Rules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Rules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Rules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("path_rules") != null && !jsonObj.get("path_rules").isJsonNull()) {
        JsonArray jsonArraypathRules = jsonObj.getAsJsonArray("path_rules");
        if (jsonArraypathRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("path_rules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `path_rules` to be an array in the JSON string but got `%s`", jsonObj.get("path_rules").toString()));
          }

          // validate the optional field `path_rules` (array)
          for (int i = 0; i < jsonArraypathRules.size(); i++) {
            PathRule.validateJsonElement(jsonArraypathRules.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Rules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Rules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Rules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Rules.class));

       return (TypeAdapter<T>) new TypeAdapter<Rules>() {
           @Override
           public void write(JsonWriter out, Rules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Rules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Rules given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Rules
   * @throws IOException if the JSON string is invalid with respect to Rules
   */
  public static Rules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Rules.class);
  }

  /**
   * Convert an instance of Rules to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

