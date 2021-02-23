

# SetRoleRule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capability** | **List&lt;String&gt;** | List of the approved/denied capabilities in the path options: [read, create, update, delete, list, deny] | 
**path** | **String** | The path the rule refers to | 
**roleName** | **String** | The role name to be updated | 
**ruleType** | **String** | item-rule, role-rule or auth-method-rule |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



