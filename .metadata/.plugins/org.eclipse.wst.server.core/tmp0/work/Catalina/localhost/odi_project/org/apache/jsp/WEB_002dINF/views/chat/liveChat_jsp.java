/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2024-01-12 00:17:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.chat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import odi_project.member.model.vo.Member;
import odi_project.chat.model.vo.Chat;
import java.util.List;

public final class liveChat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1705018028913L));
    _jspx_dependants.put("jar:file:/C:/Users/pkw85/Documents/WebProjectServlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/odi_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("odi_project.member.model.vo.Member");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("odi_project.chat.model.vo.Chat");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("    \r\n");
      out.write("    \r\n");

	Member loginUser = (Member) request.getAttribute("loginUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  \r\n");
      out.write("  <!-- 파비콘 -->\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"./images/tomorrow1.gif\">\r\n");
      out.write("  <title>Odigaji</title>\r\n");
      out.write("\r\n");
      out.write("  <!--브라우저 스타일 초기화-->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css\" />\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap\" rel=\"stylesheet\" />\r\n");
      out.write("  <!--Google Material Icons-->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" />\r\n");
      out.write("  <!-- sidebar open/close Icon -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("  <!-- login icon -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("  <!-- my page icon -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0\" />\r\n");
      out.write("  <!-- heart icon -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("  <!-- chat icon -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("  <!-- chat group icon -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./source/style/css/ejun.css/liveChat.css\">\r\n");
      out.write("      <script src=\"./source/js/ejun.js/liveChat.js\"></script>\r\n");
      out.write("  <script defer ></script>\r\n");
      out.write("  <!-- jquery -->\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("  <!-- js -->\r\n");
      out.write("  <script defer src=\"js/liveChat.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!--HEADER-->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!--LEFT SIDEBAR 채팅창-->\r\n");
      out.write("	<div class=\"inner\">\r\n");
      out.write("		<div class=\"left-sidebar\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- main chat 채팅방 목록 -->\r\n");
      out.write("	<div class=\"inner\">\r\n");
      out.write("		<div class=\"page-name\">실시간 채팅</div>\r\n");
      out.write("		<div class=\"main-chat-area\">\r\n");
      out.write("\r\n");
      out.write("			<div>\r\n");
      out.write("			");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/ChatInfo\"\r\n");
      out.write("				method=\"post\" id='chatForm'>\r\n");
      out.write("				<input type=\"hidden\" name='chatKey' value=\"\"> <input\r\n");
      out.write("					type=\"hidden\" name='chatName' value=\"\"> <input\r\n");
      out.write("					type=\"hidden\" name='memberName' value=\"\">\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("			<script>\r\n");
      out.write("	function openLiveChatRoom(chatKey, chatName, memberName) {\r\n");
      out.write("        // AJAX를 통해 서버로 해당 채팅의 정보를 요청\r\n");
      out.write("        \r\n");
      out.write("        [...document.querySelector(\"#chatForm\").children].forEach((e)=> {\r\n");
      out.write("        	if(e.name == 'chatKey') e.value = chatKey\r\n");
      out.write("        	else if(e.name == 'chatName')  e.value = chatName\r\n");
      out.write("        	else if(e.name == 'memberName') e.value = memberName\r\n");
      out.write("        })\r\n");
      out.write("        document.querySelector(\"#chatForm\").submit();        \r\n");
      out.write("    }\r\n");
      out.write("    // 스크롤 동작을 변경하지 않고 추가된 채팅방이 보일 수 있도록 마지막 채팅방으로 이동\r\n");
      out.write("    function scrollToLastChat() {\r\n");
      out.write("      var mainChatArea = document.getElementById('main-chat');\r\n");
      out.write("      var lastChat = mainChatArea.lastElementChild;\r\n");
      out.write("      lastChat.scrollIntoView({ behavior: \"smooth\", block: \"end\" });\r\n");
      out.write("    }\r\n");
      out.write("    // DOMContentLoaded 이벤트 발생 시 새로운 채팅방으로 이동\r\n");
      out.write("    document.addEventListener('DOMContentLoaded', scrollToLastChat);\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- main-chat-area -->\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- inner -->\r\n");
      out.write("  	\r\n");
      out.write("  	\r\n");
      out.write("	<div class=\"inner\"><button class=\"create-chat-room\" type=\"button\" id=\"create-chat-room\" onclick=\"createChatRoom()\"> 채팅방 생성 </button></div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("  	<div class=\"inner\">\r\n");
      out.write("  		<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/chat.me\" method=\"post\">\r\n");
      out.write("    	<div class=\"create-chat-box\" style=\"display:none;\" id=\"create-chat-box\">\r\n");
      out.write("      	<p>채팅방 이름</p>\r\n");
      out.write("      	<input type=\"text\" id=\"chatName\" name=\"chatName\">\r\n");
      out.write("      	<button class=\"create-chat\" name=\"\" type=\"submit\" id=\"create-chat\">생성</button>\r\n");
      out.write("      	<button class=\"cancel\" name=\"\" id=\"cancel\" onclick=\"  \">취소</button>\r\n");
      out.write("      	</div>\r\n");
      out.write("      	</form>\r\n");
      out.write("    </div> 																			<!-- create-chat-box -->\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("                                                                              \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!--FOOTER-->\r\n");
      out.write("  <footer>\r\n");
      out.write("    <div class=\"inner\">\r\n");
      out.write("      <div class=\"items\">\r\n");
      out.write("        <div class=\"item\"> <!--회사 설명-->\r\n");
      out.write("          <p>회사 설명</p>\r\n");
      out.write("          <p>asdsad</p>\r\n");
      out.write("          <p>asdad</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item\"> <!--회사 정보-->\r\n");
      out.write("          <p>회사 정보</p>\r\n");
      out.write("          <p>asda</p>\r\n");
      out.write("          <p>sadsadasdsada</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <p>근무 시간 정보</p> <!--근무시간 정보-->\r\n");
      out.write("          <p>sada</p>\r\n");
      out.write("          <p>adssad</p>\r\n");
      out.write("          <p>asdsad</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/chat/liveChat.jsp(65,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("chat");
      // /WEB-INF/views/chat/liveChat.jsp(65,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/chat/liveChat.jsp(65,3) '${chatList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${chatList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("				<div class=\"chat-room\" name=\"chatKey\"\r\n");
            out.write("					onclick=\"openLiveChatRoom(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chat.chatKey}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(',');
            out.write(' ');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chat.chatName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("', '");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chat.memberName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("')\">\r\n");
            out.write("					<span class=\"material-symbols-outlined\">group</span>\r\n");
            out.write("					<div class=\"chat-room-name\" name=\"chatName\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chat.chatName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("					<div class=\"new\" name=\"memberName\" style=\"display: block;\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chat.memberName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</div>\r\n");
            out.write("				</div>\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
