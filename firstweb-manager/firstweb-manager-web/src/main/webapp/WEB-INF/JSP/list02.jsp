<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>第二个table列表的查询</title>
  <link rel="stylesheet" type="text/css" href="css/layui.css">
</head>
<body>

  <button class="layui-btn layui-btn-sm layui-btn-primary">
    <i class="layui-icon">&#xe608;</i> 添加
  </button>
  
  <button class="layui-btn layui-btn-sm layui-btn-primary">
    <i class="layui-icon">&#xe608;</i> 删除
  </button>
  
  <table id="demo" lay-filter="test"></table>
 
<script type="text/javascript" src="js/layui.js"></script>
<script>
layui.use('table', function(){
  var table = layui.table;
  
  //第二个实例
  table.render({
    elem: '#demo'
    ,height: 312
    ,url: '/student/list' //数据接口
    ,page: true //开启分页
    ,cols: [[ //表头
      {field: 'id', title: 'ID', width:80, fixed: 'left'}
      ,{field: 'studentNumble', title: '学号', width: 80, sort: true}
      ,{field: 'studentName', title: '学生名', width:80}
      ,{field: 'sex', title: '性别', width:80}
      ,{field: 'classesId', title: '班级', width:80} 
    ]]
  });
  
});
</script>
</body>
</html>