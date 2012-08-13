<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spr" tagdir="/WEB-INF/tags/"%>

<spr:page isgwt="false">
	<form:form name="f" action="/j_spring_security_check" method="POST"
		cssClass="box login">
		<fieldset class="boxBody">
			<label class="error"> <c:if test="${not empty failure}">
					<spring:message code="${failure}" />
				</c:if> </label> <label>Username</label><input type="text" tabindex="1"
				name='j_username' required="required" placeholder="abc@example.com"></input>
			<label>Password</label> <input type="password" name='j_password'
				required="required"></input>
		</fieldset>
		<footer> <label><a
			href='<c:out value="/registration"></c:out>' class="rLink">Sign
				up !</a> </label> <input type="submit" class="btnLogin" value="Login"
			tabindex="4"></footer>
	</form:form>
	<div class="clear"></div>
	<footer id="main">&copy; Vault | 2012 </footer>
</spr:page>
