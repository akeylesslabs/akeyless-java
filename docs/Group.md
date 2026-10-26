

# Group


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**grantedRoles** | [**List&lt;GrantedRole&gt;**](GrantedRole.md) | GrantedRoles are the roles a member of this group gets at login, through the group&#39;s akeyless_groups claim. Read-only, and filled only for the SCIM bearer that owns the group: a group name on its own says nothing about the access it carries, which is what a reviewer certifying the entitlement has to judge. |  [optional] |
|**grantedRolesKnown** | **Boolean** | GrantedRolesKnown is set when GrantedRoles was computed, so an empty list means \&quot;grants no role\&quot; rather than \&quot;not computed\&quot; (another caller, or an older UAM). |  [optional] |
|**groupAlias** | **String** |  |  [optional] |
|**groupId** | **String** |  |  [optional] |
|**groupName** | **String** |  |  [optional] |
|**isSubclaimsWithOperator** | **Boolean** |  |  [optional] |
|**modificationDate** | **OffsetDateTime** |  |  [optional] |
|**scimExternalId** | **String** |  |  [optional] |
|**scimManaged** | **Boolean** |  |  [optional] |
|**scimProvisionedAccessId** | **String** |  |  [optional] |
|**userAssignments** | [**List&lt;AccessPermissionAssignment&gt;**](AccessPermissionAssignment.md) |  |  [optional] |
|**version** | **String** | Version identifies the member assignments this group was read with. Pass it back as UpdateGroupInput.ExpectedVersion to make the update conditional. |  [optional] |



