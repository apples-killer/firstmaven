<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/lib/jquery-3.1.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/lib/bootstrap.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/user/regist.js"></script>
<link href="${pageContext.request.contextPath}/css/lib/bootstrap.css"
	rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/css/user/regist.css"
	rel="stylesheet" type="text/css" />
<title>注册页面</title>
</head>
<body>
	<div class="regist-head">regist page</div>
	<br>
	<div class="row">


		<form class="form-horizontal col-sm-offset-2 col-sm-8" role="form" action="<%=request.getContextPath()%>/user/regist">
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">用户名：</label>
				<div class="col-sm-10">
					<input id="name" name="name" type="text" class="form-control"
						pleaceholder="用户名">
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">密码：</label>
				<div class="col-sm-10">
					<input id="password" name="password" type="password" class="form-control"
						pleaceholder="密码">
				</div>
			</div>
			<div class="form-group">
				<label for="password2" class="col-sm-2 control-label">确认密码：</label>
				<div class="col-sm-10">
					<input id="password2" name="password2" type="password" class="form-control"
						pleaceholder="确认密码">
				</div>
			</div>
			<div class="form-group">
				<label for="sex" class="col-sm-2 control-label">性别：</label>
				<div class="col-sm-10">
					<input id="sex" name="sex" type="text" class="form-control"
						pleaceholder="性别">
				</div>
			</div>
			<div class="form-group">
				<label for="age" class="col-sm-2 control-label">年龄：</label>
				<div class="col-sm-10">
					<input id="age" name="age" type="text" class="form-control"
						pleaceholder="年龄">
				</div>
			</div>
			<div class="form-group">
				<label for="phone" class="col-sm-2 control-label">手机号：</label>
				<div class="col-sm-10">
					<input id="phone" name="phone" type="text" class="form-control"
						pleaceholder="手机号">
				</div>
			</div>
			<div class="form-group">
				<label for="mail" class="col-sm-2 control-label">邮箱：</label>
				<div class="col-sm-10">
					<input id="mail" name="mail" type="text" class="form-control"
						pleaceholder="邮箱">
				</div>
			</div>
			<div class="form-group">
				<label for="verifyCode" class="col-sm-2 control-label">验证码：</label>
				<div class="col-sm-10">
					<input id="verifyCode" name="verifyCode" type="text" class="form-control"
						pleaceholder="验证码">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">注册</button>
					<button type="reset" class="btn btn-default">重置</button>
				</div>
			</div>


		</form>
	</div>
</body>
</html>