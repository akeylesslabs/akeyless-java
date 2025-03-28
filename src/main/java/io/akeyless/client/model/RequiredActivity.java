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
import java.util.HashMap;
import java.util.Map;

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
 * RequiredActivity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class RequiredActivity {
  public static final String SERIALIZED_NAME_MIGRATIONS_REQUIRED_ACTIVITY = "migrations_required_activity";
  @SerializedName(SERIALIZED_NAME_MIGRATIONS_REQUIRED_ACTIVITY)
  @javax.annotation.Nullable
  private Map<String, Boolean> migrationsRequiredActivity = new HashMap<>();

  public RequiredActivity() {
  }

  public RequiredActivity migrationsRequiredActivity(@javax.annotation.Nullable Map<String, Boolean> migrationsRequiredActivity) {
    this.migrationsRequiredActivity = migrationsRequiredActivity;
    return this;
  }

  public RequiredActivity putMigrationsRequiredActivityItem(String key, Boolean migrationsRequiredActivityItem) {
    if (this.migrationsRequiredActivity == null) {
      this.migrationsRequiredActivity = new HashMap<>();
    }
    this.migrationsRequiredActivity.put(key, migrationsRequiredActivityItem);
    return this;
  }

  /**
   * Get migrationsRequiredActivity
   * @return migrationsRequiredActivity
   */
  @javax.annotation.Nullable
  public Map<String, Boolean> getMigrationsRequiredActivity() {
    return migrationsRequiredActivity;
  }

  public void setMigrationsRequiredActivity(@javax.annotation.Nullable Map<String, Boolean> migrationsRequiredActivity) {
    this.migrationsRequiredActivity = migrationsRequiredActivity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiredActivity requiredActivity = (RequiredActivity) o;
    return Objects.equals(this.migrationsRequiredActivity, requiredActivity.migrationsRequiredActivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationsRequiredActivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiredActivity {\n");
    sb.append("    migrationsRequiredActivity: ").append(toIndentedString(migrationsRequiredActivity)).append("\n");
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
    openapiFields.add("migrations_required_activity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RequiredActivity
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RequiredActivity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequiredActivity is not found in the empty JSON string", RequiredActivity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RequiredActivity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequiredActivity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequiredActivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequiredActivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequiredActivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequiredActivity.class));

       return (TypeAdapter<T>) new TypeAdapter<RequiredActivity>() {
           @Override
           public void write(JsonWriter out, RequiredActivity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequiredActivity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RequiredActivity given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RequiredActivity
   * @throws IOException if the JSON string is invalid with respect to RequiredActivity
   */
  public static RequiredActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequiredActivity.class);
  }

  /**
   * Convert an instance of RequiredActivity to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

