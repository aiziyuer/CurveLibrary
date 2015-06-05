<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html lang="zh">
<head>

    <title>
        <tiles:insertAttribute name="title"/>
    </title>

    <tiles:insertAttribute name="header"/>
</head>
<body>
    <tiles:insertAttribute name="nav"/>

    <tiles:insertAttribute name="body"/>

    <tiles:insertAttribute name="footer"/>
</body>
</html>
