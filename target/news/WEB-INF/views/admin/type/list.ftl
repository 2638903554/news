<html>
    <#include "../../common/head.ftl">
    <body>
        <div id="wrapper" class="toggled">
        <#--边栏sidebar-->
        <#include "../../common/nav.ftl">

        <#--主要内容区域-->
        <div id="page-content-wrapper">
            <#--fluid-流动布局-->
                <div class="container-fluid">
                    <div class="row clearfix">
                        <div class="col-md-12 column">
                            <h2>一级类别</h2>
                            <table class="table table-bordered">
                                <thead>
                                <tr class="success">
                                    <th>
                                        ID
                                    </th>
                                    <th>
                                        类别的名称
                                    </th>
                                    <th>
                                        类别建立的时间
                                    </th>
                                    <th colspan="2">
                                        操作
                                    </th>
                                </tr>
                                </thead>
                                <tbody>
                                <#list typeList as type>
                                <tr>
                                    <td>
                                        ${type.typeId}
                                    </td>
                                    <td>
                                        ${type.typeName}
                                    </td>
                                    <td>
                                        <#--${type.creatTime}-->
                                        <#--01/04/2012-->
                                    </td>
                                    <td>
                                        <a href="/news/admin/type/index?typeId=${type.typeId}">修改</a>
                                    </td>
                                    <td>
                                        <a href="/news/admin/type/delete?typeId=${type.typeId}">删除</a>
                                    </td>
                                </tr>
                                </#list>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
