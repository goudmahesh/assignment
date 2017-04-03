<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>  
<hr/>  
  
  
<s:form action="loginprocess">  
<s:textfield name="username" label="Name"></s:textfield>  
<s:password name="userpass" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>  

</body>
</html>