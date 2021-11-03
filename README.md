# SpringBoot Learning Notes

> Create Date: 2021-9-16

### 属性注入:
`[P09]8.属性注入`
为何需要属性注入: 
有的配置、值需要一次引入，其他地方都能够方便调用，所以需要注入这个属性， 其他Java代码不需要重复的定义这些参数，一来减少冗余代码，二来
可以避免重复修改同类型代码的问题，方便统一管理，统一维护。

参考`application.yml` 和 `InjectController` 