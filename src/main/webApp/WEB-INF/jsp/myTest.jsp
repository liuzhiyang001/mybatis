<%--
  Created by IntelliJ IDEA.
  User: lzy
  Date: 2018/11/23
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <script src="../jquery/jquery.min.js" type="text/javascript"></script>
    <script src="../jquery/jquery.easyui.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="../jquery/themes/default/easyui.css">
    <link rel="stylesheet" href="../jquery/themes/icon.css">
<link rel="stylesheet" href="../jquery/locale/easyui-lang-zh_CN.js">
<html>
    <script type="text/javascript">
        $(function(){
           // alert(123);
            $('#dg').datagrid({
                url:'/food/getAll',
                pageNumber:1,
                pageSize:20,
                pageList:[10,20,30,40,50],
                pagination:true,
                displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',
                columns:[[
                    {field:'id',title:'编号',width:200},
                    {field:'food_name',title:'名称',width:200},
                    {field:'food_taste',title:'味道',width:200},
                    {field:'food_price',title:'价格',width:200},
                    {field:'food_description',title:'描述',width:200,align:'left'}
                ]]
            });
        });
    </script>
<head>
    <title>Title</title>
</head>
<body>
    <table id="dg" title="My Users" style="width:1000px;height:600px"
           toolbar="#toolbar" idField="id"
           rownumbers="true" fitColumns="true" singleSelect="true"></table>
    <div id="toolbar">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:$('#dg').edatagrid('addRow')">New</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:$('#dg').edatagrid('destroyRow')">Destroy</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:$('#dg').edatagrid('saveRow')">Save</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="javascript:$('#dg').edatagrid('cancelRow')">Cancel</a>
    </div>
</body>
</html>
