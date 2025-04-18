

# ListItems


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessibility** | **String** | for personal password manager |  [optional] |
|**advancedFilter** | **String** | Filter by item name/username/website or part of it |  [optional] |
|**autoPagination** | **String** | Retrieve all items using pagination, when disabled retrieving only first 1000 items |  [optional] |
|**filter** | **String** | Filter by item name or part of it |  [optional] |
|**json** | **Boolean** | Set output format to JSON |  [optional] |
|**minimalView** | **Boolean** | Show only basic information of the items |  [optional] |
|**modifiedAfter** | **Long** | List only secrets modified after specified date (in unix time) |  [optional] |
|**paginationToken** | **String** | Next page reference |  [optional] |
|**path** | **String** | Path to folder |  [optional] |
|**sraOnly** | **Boolean** | Filter by items with SRA functionality enabled |  [optional] |
|**subTypes** | **List&lt;String&gt;** |  |  [optional] |
|**tag** | **String** | Filter by item tag |  [optional] |
|**token** | **String** | Authentication token (see &#x60;/auth&#x60; and &#x60;/configure&#x60;) |  [optional] |
|**type** | **List&lt;String&gt;** | The item types list of the requested items. In case it is empty, all types of items will be returned. options: [key, static-secret, dynamic-secret, classic-key] |  [optional] |
|**uidToken** | **String** | The universal identity token, Required only for universal_identity authentication |  [optional] |



