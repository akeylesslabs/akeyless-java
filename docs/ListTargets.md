

# ListTargets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **String** | Filter by auth method name or part of it |  [optional]
**json** | **Boolean** | Set output format to JSON |  [optional]
**paginationToken** | **String** | Next page reference |  [optional]
**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional]
**type** | **List&lt;String&gt;** | The target types list . In case it is empty, all types of targets will be returned. options: [hanadb cassandra aws ssh gke eks mysql mongodb snowflake mssql redshift artifactory azure rabbitmq k8s venafi gcp oracle dockerhub ldap github chef web salesforce postgres] |  [optional]
**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional]



