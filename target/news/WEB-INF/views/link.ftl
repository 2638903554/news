<html>
    <head>
        <meta charset="utf-8">
        <title>卖家后端管理系统</title>
        <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="/sell/css/style.css">
    </head>
    <body>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-3 column">
                    <p>友情链接</p>
                    <ul class="nav nav-tabs nav-stacked">
                        <#list linkList as link>
                            <li>
                                <a href="${link.linkUrl}">${link.linkName}</a>
                            </li>
                        </#list>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>

