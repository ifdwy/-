<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layui-table模块</title>
  <link rel="stylesheet" type="text/css" href="css/layui.css">
</head>
<body>

  <button class="layui-btn layui-btn-sm layui-btn-primary">
    <i class="layui-icon">&#xe608;</i> 添加
  </button>
  
  <table id="demo" lay-filter="test"></table>
 
<script type="text/javascript" src="js/layui.js"></script>
<script>
layui.use('table', function(){
  var table = layui.table;
  
  //第一个实例
  table.render({
    elem: '#demo'
    ,height: 312
    ,url: '/user/list' //数据接口
    ,page: true //开启分页
    //response此处可以不用写，只需在对应的serviceImpl里重新用map类型转化为符合要求的返回格式
    /* ,response: {
        statusName: 'code' //规定数据状态的字段名称，默认：code
        ,statusCode: 0 //规定成功的状态码，默认：0
        ,msgName: 'msg' //规定状态信息的字段名称，默认：msg
        ,countName: 'count' //规定数据总数的字段名称，默认：count
        ,dataName: 'data' //规定数据列表的字段名称，默认：data
      } */
    ,cols: [[ //表头
      {field: 'id', title: 'ID', width:80, fixed: 'left'}
      ,{field: 'username', title: '用户名', width:80}
      ,{field: 'sex', title: '性别', width:80}
      ,{field: 'classes', title: '课程', width:80} 
      ,{field: 'score', title: '评分', width: 80, sort: true}
    ]]
  });
  
});
</script>
</body>
</html>