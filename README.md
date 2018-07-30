# drgw

### 基于spring boot的模块化项目

暂分3个模块：
common模块，所有共用的持久化和业务代码
ums模块，账户体系的对外api和业务代码
oms模块，订单体系的带外api和业务代码

启动方式：
在父项目中运行clean，再运行package
启动时，分别启动UMSApplication和OMSApplication

项目已加mysql，mongodb和redis依赖，mysql需新建数据库dida，用户mysql/mysql
启动项目前需启动数据库及mongodb

浏览器直接浏览localhost:8081和localhost:8082，有成功提示则运行成功
