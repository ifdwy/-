/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-14 07:03:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <title>利用Layui 后台布局</title>\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\">\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("  <div class=\"layui-header\">\r\n");
      out.write("    <div class=\"layui-logo\">layui 后台布局</div>\r\n");
      out.write("    <!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("    <ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("      <li class=\"layui-nav-item\">\r\n");
      out.write("        <a href=\"javascript:;\">\r\n");
      out.write("          <img src=\"http://t.cn/RCzsdCq\" class=\"layui-nav-img\">\r\n");
      out.write("          ifdw\r\n");
      out.write("        </a>\r\n");
      out.write("        <dl class=\"layui-nav-child\">\r\n");
      out.write("          <dd><a href=\"\">基本资料</a></dd>\r\n");
      out.write("          <dd><a href=\"\">安全设置</a></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"\">退出</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-side layui-bg-black\">\r\n");
      out.write("    <div class=\"layui-side-scroll\">\r\n");
      out.write("      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("      <ul class=\"layui-nav layui-nav-tree\"  lay-filter=\"test\">\r\n");
      out.write("        <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("          <a class=\"\" href=\"javascript:;\">所有商品</a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd><a href=\"javascript:;\" data-id=\"1\" data-title=\"列表一\" data-url=\"list01\" class=\"site-demo-active\" data-type=\"tabAdd\">列表一</a></dd>\r\n");
      out.write("            \r\n");
      out.write("            <dd><a href=\"javascript:;\" data-id=\"2\" data-title=\"列表二\" data-url=\"list02\" class=\"site-demo-active\" data-type=\"tabAdd\">列表二</a></dd>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<dd><a href=\"javascript:;\" data-id=\"3\" data-title=\"列表三\" data-url=\"https://www.12306.cn/index/\" class=\"site-demo-active\" data-type=\"tabAdd\">列表三</a></dd>\r\n");
      out.write("\t\t\t\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"layui-nav-item\">\r\n");
      out.write("          <a href=\"javascript:;\" data-id=\"3\" data-title=\"云市场\" data-url=\"http://www.baidu.com\" class=\"site-demo-active\" data-type=\"tabAdd\">云市场</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"layui-nav-item\"><a href=\"\">发布商品</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("    <!-- 内容主体区域 -->\r\n");
      out.write("    <div class=\"layui-tab\" lay-filter=\"demo\" lay-allowclose=\"true\" style=\"margin-left: 200px;\">\r\n");
      out.write("        <ul class=\"layui-tab-title\"></ul>\r\n");
      out.write("        <div class=\"layui-tab-content\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-footer\">\r\n");
      out.write("    <!-- 底部固定区域 -->\r\n");
      out.write("    <p style=\"padding-left:38%;\">版权所有 © ifdw  2019-01-08</p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//JavaScript代码区域\r\n");
      out.write(" layui.use(['element', 'layer', 'jquery'], function () {\r\n");
      out.write("        var element = layui.element;\r\n");
      out.write("        // var layer = layui.layer;\r\n");
      out.write("        var $ = layui.$;\r\n");
      out.write("        // 配置tab实践在下面无法获取到菜单元素\r\n");
      out.write("        $('.site-demo-active').on('click', function () {\r\n");
      out.write("            var dataid = $(this);\r\n");
      out.write("            //这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目\r\n");
      out.write("            if ($(\".layui-tab-title li[lay-id]\").length <= 0) {\r\n");
      out.write("                //如果比零小，则直接打开新的tab项\r\n");
      out.write("                active.tabAdd(dataid.attr(\"data-url\"), dataid.attr(\"data-id\"), dataid.attr(\"data-title\"));\r\n");
      out.write("            } else {\r\n");
      out.write("                //否则判断该tab项是否以及存在\r\n");
      out.write("                var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有\r\n");
      out.write("                $.each($(\".layui-tab-title li[lay-id]\"), function () {\r\n");
      out.write("                    //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开\r\n");
      out.write("                    if ($(this).attr(\"lay-id\") == dataid.attr(\"data-id\")) {\r\n");
      out.write("                        isData = true;\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("                if (isData == false) {\r\n");
      out.write("                    //标志为false 新增一个tab项\r\n");
      out.write("                    active.tabAdd(dataid.attr(\"data-url\"), dataid.attr(\"data-id\"), dataid.attr(\"data-title\"));\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            //最后不管是否新增tab，最后都转到要打开的选项页面上\r\n");
      out.write("            active.tabChange(dataid.attr(\"data-id\"));\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var active = {\r\n");
      out.write("            //在这里给active绑定几项事件，后面可通过active调用这些事件\r\n");
      out.write("            tabAdd: function (url, id, name) {\r\n");
      out.write("                //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值\r\n");
      out.write("                //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分\r\n");
      out.write("                element.tabAdd('demo', {\r\n");
      out.write("                    title: name,\r\n");
      out.write("                    content: '<iframe data-frameid=\"' + id + '\" scrolling=\"auto\" frameborder=\"0\" src=\"' + url + '\" style=\"width:100%;height:99%;\"></iframe>',\r\n");
      out.write("                    id: id //规定好的id\r\n");
      out.write("                })\r\n");
      out.write("                FrameWH();  //计算ifram层的大小\r\n");
      out.write("            },\r\n");
      out.write("            tabChange: function (id) {\r\n");
      out.write("                //切换到指定Tab项\r\n");
      out.write("                element.tabChange('demo', id); //根据传入的id传入到指定的tab项\r\n");
      out.write("            },\r\n");
      out.write("            tabDelete: function (id) {\r\n");
      out.write("                element.tabDelete(\"demo\", id);//删除\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        function FrameWH() {\r\n");
      out.write("            var h = $(window).height();\r\n");
      out.write("            $(\"iframe\").css(\"height\",h+\"px\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
