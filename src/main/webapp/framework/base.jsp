<%@ page contentType="text/html;charset=utf-8" %>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta name=description content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>
        <s:i18n name="project">
            <s:text name="app.title"/>
        </s:i18n>
    </title>

    <tiles:insertAttribute name="header"/>
</head>
<body>
    <tiles:insertAttribute name="nav"/>

    <tiles:insertAttribute name="body"/>

    <tiles:insertAttribute name="footer"/>
</body>
</html>
