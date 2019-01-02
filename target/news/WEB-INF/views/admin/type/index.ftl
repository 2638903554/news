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
                    <h1>修改一级类别</h1>
                    <form role="form">
                        <div class="form-group">
                            <label>类别名称</label>
                            <input name="typeName" type="text" class="form-control" value="${type.typeName}" />
                        </div>
                        <input type="hidden" name="${type.typeId}" value="${(type.typeId)!''}">
                        <button type="submit" class="btn btn-default">确认修改</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>



