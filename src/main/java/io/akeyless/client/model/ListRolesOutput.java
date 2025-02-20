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
import io.akeyless.client.model.Role;
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
 * ListRolesOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ListRolesOutput {
  public static final String SERIALIZED_NAME_NEXT_PAGE = "next_page";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  @javax.annotation.Nullable
  private String nextPage;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  @javax.annotation.Nullable
  private List<Role> roles = new ArrayList<>();

  public ListRolesOutput() {
  }

  public ListRolesOutput nextPage(@javax.annotation.Nullable String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * Get nextPage
   * @return nextPage
   */
  @javax.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(@javax.annotation.Nullable String nextPage) {
    this.nextPage = nextPage;
  }


  public ListRolesOutput roles(@javax.annotation.Nullable List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public ListRolesOutput addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(@javax.annotation.Nullable List<Role> roles) {
    this.roles = roles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRolesOutput listRolesOutput = (ListRolesOutput) o;
    return Objects.equals(this.nextPage, listRolesOutput.nextPage) &&
        Objects.equals(this.roles, listRolesOutput.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPage, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRolesOutput {\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
    openapiFields.add("next_page");
    openapiFields.add("roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListRolesOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListRolesOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListRolesOutput is not found in the empty JSON string", ListRolesOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListRolesOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListRolesOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("next_page") != null && !jsonObj.get("next_page").isJsonNull()) && !jsonObj.get("next_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page").toString()));
      }
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
        if (jsonArrayroles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
          }

          // validate the optional field `roles` (array)
          for (int i = 0; i < jsonArrayroles.size(); i++) {
            Role.validateJsonElement(jsonArrayroles.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListRolesOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListRolesOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListRolesOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListRolesOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListRolesOutput>() {
           @Override
           public void write(JsonWriter out, ListRolesOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListRolesOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListRolesOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListRolesOutput
   * @throws IOException if the JSON string is invalid with respect to ListRolesOutput
   */
  public static ListRolesOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListRolesOutput.class);
  }

  /**
   * Convert an instance of ListRolesOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

