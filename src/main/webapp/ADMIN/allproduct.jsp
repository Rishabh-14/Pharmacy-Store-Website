<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>List Of All Products</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="https://www.javaguides.net" class="navbar-brand">List Of All Products </a>
                    </div>

                    <ul class="navbar-nav"style="margin-left:1050px;">
                        <li><a href="<%=request.getContextPath()%>/ADMIN/adminindex.jsp" class="nav-link">Home</a></li>
                    </ul>
                </nav>
            </header>
            <br>

            <div class="row">
                <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

                <div class="container">
                    <h3 class="text-center">List of Products</h3>
                    <hr>
                    <div class="container text-left">

                        <a href="<%=request.getContextPath()%>/ADMIN/addproduct.jsp" class="btn btn-success">Add
     New Product</a>
                    </div>
                    <br>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Product ID</th>
                                <th>Product Image</th>
                                <th>Product Name</th>
                                <th>Product Price</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="product" items="${listproduct}">

                                <tr>
                                    <td>
                                        <c:out value="${product.id}" />
                                    </td>
                                    <td>
                                        <c:out value="${product.name}" />
                                    </td>
                                    <td>
                                        <c:out value="${product.email}" />
                                    </td>
                                    <td>
                                        <c:out value="${product.country}" />
                                    </td>
                                    <td><a href="updateproduct.jsp"=<c:out value='${product.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="deleteProduct.jsp"=<c:out value='${product.id}' />">Delete</a></td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>

                    </table>
                </div>
            </div>
        </body>

        </html>