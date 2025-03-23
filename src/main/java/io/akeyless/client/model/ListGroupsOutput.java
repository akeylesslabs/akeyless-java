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
import io.akeyless.client.model.Group;
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
 * ListGroupsOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class ListGroupsOutput {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  @javax.annotation.Nullable
  private List<Group> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE = "next_page";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  @javax.annotation.Nullable
  private String nextPage;

  public ListGroupsOutput() {
  }

  public ListGroupsOutput groups(@javax.annotation.Nullable List<Group> groups) {
    this.groups = groups;
    return this;
  }

  public ListGroupsOutput addGroupsItem(Group groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  @javax.annotation.Nullable
  public List<Group> getGroups() {
    return groups;
  }

  public void setGroups(@javax.annotation.Nullable List<Group> groups) {
    this.groups = groups;
  }


  public ListGroupsOutput nextPage(@javax.annotation.Nullable String nextPage) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGroupsOutput listGroupsOutput = (ListGroupsOutput) o;
    return Objects.equals(this.groups, listGroupsOutput.groups) &&
        Objects.equals(this.nextPage, listGroupsOutput.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, nextPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGroupsOutput {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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
    openapiFields.add("groups");
    openapiFields.add("next_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListGroupsOutput
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListGroupsOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListGroupsOutput is not found in the empty JSON string", ListGroupsOutput.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListGroupsOutput.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListGroupsOutput` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            Group.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
      if ((jsonObj.get("next_page") != null && !jsonObj.get("next_page").isJsonNull()) && !jsonObj.get("next_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListGroupsOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListGroupsOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListGroupsOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListGroupsOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ListGroupsOutput>() {
           @Override
           public void write(JsonWriter out, ListGroupsOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListGroupsOutput read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListGroupsOutput given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListGroupsOutput
   * @throws IOException if the JSON string is invalid with respect to ListGroupsOutput
   */
  public static ListGroupsOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListGroupsOutput.class);
  }

  /**
   * Convert an instance of ListGroupsOutput to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

