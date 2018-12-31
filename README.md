# 新闻发布系统项目--实训项目
使用maven搭建ssm框架,前端框架使用freemarker,使其高效开发.
项目架构
## 前后端分离
后端负责业务逻辑/业务接口，前端负责展现/交互逻辑，前后端开发并行且独立。
对于同一套接口，可以定制多个客户端，例如web、微信公众号、微信小程序，甚者app也可以。
### 如何实现前后端分离
在该项目中，后端采用SSM架构，对数据进行处理后返回接口给前端，接口数据为JSON数据。前端使用vue+axios负责发起请求和渲染页面。

### dao
dao层负责做数据持久层的工作，其中dao层的数据源配置可参考spring-dao.xml文件
### service
service层负责业务模块的应用逻辑，需要先设计接口(xxxxService.java),再设计实现类(xxxxServiceImpl.java).
其中service层的配置文件可参考spring-service.xml.
### controller
controller层负责具体的业务模块流程的控制，在此层要调用service层的接口来控制业务流程.
其中controller的配置文件可参考spring-mvc.xml
### po
表示数据库中的表格映射成java对象.PO仅仅表示数据,没有任何数据操作,相当于JavaBean作用.
### dto
数据传输对象，比如一张表有５０个字段,那么对应的PO就有50个字段，但是我们页面可能只需要显示10个字段，这时候就可以创建一个dto对象，来存储这10个字段，这样就不会暴露服务端结构．
### vo
前端界面展示，主要对应界面显示的数据对象．用一个VO对象显示对应页面的数值/数据元素.

##遇到的问题
###  表单的数据以json格式提交失败
后端代码
```
@PostMapping(value = "/register")
public ResultVO register(User user){
        ...
}
```
接收参数的代码是(User user)，经过测试，这样的写法接收不了json数组的参数，这样的写法是接收Content-Type:application/x-www-form-urlencoded类型。
由于我的项目是采用vue+axios来实现表单提交，对vue不熟悉，尝试了很多状态码一直是405。

后面查了一下文档，才知道springmvc接收json参数的写法如下所示。
```
@PostMapping(value = "/register")
public ResultVO register(@RequestBody User user){
    ...
}
```
修改了后端接口后，才实现了在前端使用json参数发起请求。


### 跨域

### 单点登录
