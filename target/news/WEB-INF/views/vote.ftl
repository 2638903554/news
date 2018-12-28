<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/sell/css/style.css">
</head>
<body>
<div class="container">
    <#--<div class="row clearfix">-->
        <#--<div class="col-md-12 column">-->
            <#--<ul class="nav nav-pills">-->
            <#--<#list voteList as type>-->
                <#--<li>-->
                    <#--<a href="${type.typeId}">${type.typeName}</a>-->
                <#--</li>-->
            <#--</#list>-->
            <#--</ul>-->
        <#--</div>-->
    <#--</div>-->

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-striped table-hover">
                <thead>
                <tr class="info">
                    <th >
                        运动员
                    </th>
                    <th>
                        出生地
                    </th>
                    <th>
                        年龄
                    </th>
                    <th>
                        项目
                    </th>
                    <th>
                        简介
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <#list voteList as vote>
                <tr>
                    <th>
                        ${vote.voteName}
                    </th>
                    <th>
                        ${vote.voteAddress}
                    </th>
                    <th>
                        ${vote.voteAge}
                    </th>
                    <th>
                        ${vote.voteJob}
                    </th>
                    <th>
                        ${vote.voteRemark}
                    </th>
                    <th>
                        <a href="${vote.voteId}"><button>投票</button></a>
                    </th>
                </tr>
                </#list>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>

