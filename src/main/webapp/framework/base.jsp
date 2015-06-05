<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="zh">
<head>

    <title>
        <tiles:insertAttribute name="title"/>
    </title>

    <meta charset="UTF-8">
    <meta name=description content="">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <tiles:insertAttribute name="header"/>
</head>
<body>
    <tiles:insertAttribute name="nav"/>

    <tiles:insertAttribute name="body"/>

    <tiles:insertAttribute name="footer"/>
</body>
</html>
