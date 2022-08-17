<%@ page language="java"  contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<br>

<c:forEach items ="${countries}" var="country">
    <tr>

        Country Name : <c:out value="${country.name}"/><br/>
        Country Capital:<c:out value=" ${country.capital}"/><br/>
        Country Population: <c:out value="${country.population}"/><br/>
        Country Currencies: <br/>


    </tr>

</c:forEach>
</body>
</html>