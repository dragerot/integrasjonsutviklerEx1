<body>
<%@ page import="integrasjon.errorcodes.BusinessFaultCodes, integrasjon.errorcodes.SystemFaultCodes, java.util.Arrays" %>
<%@ page import="java.util.List" %>
<h2>webshop-finnno</h2>

<p>Business Faults</p>
<table border=1>
    <tr>
        <th>Code</th>
        <th>Message</th>
    </tr>

    <%
        List<BusinessFaultCodes> values = Arrays.asList(BusinessFaultCodes.values());
        for (BusinessFaultCodes businessFaultCodes : values){
    %>
    <tr>
        <td><%= businessFaultCodes.getCode() %></td>
        <td><%= businessFaultCodes.getMessage() %></td>
    </tr>
    <%
        }
    %>
</table>

<p>System Faults</p>
<table border=1>
    <tr>
        <th>Code</th>
        <th>Message</th>
    </tr>

    <%
        List<SystemFaultCodes> codeValues = Arrays.asList(SystemFaultCodes.values());
        for (SystemFaultCodes systemFaultCodes : codeValues){
    %>
    <tr>
        <td><%= systemFaultCodes.getCode() %></td>
        <td><%= systemFaultCodes.getMessage() %></td>
    </tr>
    <%
        }
    %>
</table>

</body>