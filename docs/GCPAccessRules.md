

# GCPAccessRules

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience** | **String** | The audience in the JWT |  [optional]
**boundLabels** | **Map&lt;String, String&gt;** | A map of GCP labels formatted as \&quot;key:value\&quot; strings that must be set on authorized GCE instances. TODO: Because GCP labels are not currently ACL&#39;d .... |  [optional]
**boundProjects** | **List&lt;String&gt;** | Human and Machine authentication section Array of GCP project IDs. Only entities belonging to any of the provided projects can authenticate. |  [optional]
**boundRegions** | **List&lt;String&gt;** | List of regions that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a regional group and the group must belong to this region. If bound_zones are provided, this attribute is ignored. |  [optional]
**boundServiceAccounts** | **List&lt;String&gt;** | &#x3D;&#x3D;&#x3D; Human authentication section &#x3D;&#x3D;&#x3D; List of service accounts the service account must be part of in order to be authenticated |  [optional]
**boundZones** | **List&lt;String&gt;** | &#x3D;&#x3D;&#x3D; Machine authentication section &#x3D;&#x3D;&#x3D; List of zones that a GCE instance must belong to in order to be authenticated. TODO: If bound_instance_groups is provided, it is assumed to be a zonal group and the group must belong to this zone. |  [optional]
**serviceAccount** | **String** | ServiceAccount holds the credentials file contents to be used by Akeyless to validate IAM (Human) and GCE (Machine) logins against GCP base64 encoded string |  [optional]
**type** | **String** |  |  [optional]



