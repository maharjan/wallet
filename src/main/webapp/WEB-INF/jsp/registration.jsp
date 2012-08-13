<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spr" tagdir="/WEB-INF/tags/"%>

<spr:page isgwt="false">
	<form:form action="/register" method="POST" modelAttribute="user"
		cssClass="box registration">
		<fieldset class="boxBody">
			<c:if test="${not empty success}">
				<div style="color: #9ACA3E; padding-left: 5px;">
					<spring:message code="${success}" />
				</div>
			</c:if>
			<c:if test="${not empty failure}">
				<div style="color: #ff0000; padding-left: 5px;">
					<spring:message code="${failure}" />
				</div>
			</c:if>

			<label>Username : </label><input type="text" name="username"
				required="true" placeholder="abc@example.com"></input> <label
				class="error"><form:errors path="username"
					cssStyle="color:#ff0000;" /> </label> <label>Password : </label> <input
				type="password" name="password" required="true"></input> <label
				class="error"><form:errors path="password"
					cssStyle="color:#ff0000;" /> </label> <label>Confirm Password : </label> <input
				type="password" name="confirmPassword" required="true"></input> <label
				class="error"><form:errors path="confirmPassword"
					cssStyle="color:#ff0000;" /> </label>
		</fieldset>

		<footer>
<%-- 		<a href='<c:out value="/"></c:out>'>Home</a>  --%>
		<a href='<c:out value="/"></c:out>'><img
		src="/images/home.png" title="Wallet" /></a><input
			type="submit" value="Register" class="btnLogin"></input> </footer>

	</form:form>
	<div class="clear"></div>
	<footer id="main">&copy; Vault | 2012 </footer>
</spr:page>