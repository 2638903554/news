<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/sell/css/style.css">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
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
                        01/04/2012
                    </td>
                    <td>
                        <a href="/news/admin/update?typeId=${type.typeId}">修改</a>
                    </td>
                    <td>
                        <a href="/news/admin/delete?typeId=${type.typeId}">删除</a>
                    </td>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>

