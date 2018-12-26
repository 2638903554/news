# 新闻发布系统项目--实训项目
使用maven搭建ssm框架,前端框架使用freemarker,使其高效开发.
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



