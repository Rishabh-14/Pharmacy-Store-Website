<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Add New Product</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="#" class="navbar-brand">Add New Product</a>
                    </div>

                    <ul class="navbar-nav" style="margin-left:1050px;">
                        <li><a href="<%=request.getContextPath()%>/ADMIN/adminindex.jsp" class="nav-link">Home</a></li>
                    </ul>
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${product != null}">
                            <form action="update" method="post">
                        </c:if>
                        <c:if test="${product == null}">
                            <form action="insert" method="post">
                        </c:if>

                        <caption>
                            <h2>
                                <c:if test="${product != null}">
                                    Edit Product
                                </c:if>
                                <c:if test="${product == null}">
                                    Add New Product
                                </c:if>
                            </h2>
                        </caption>

                        <c:if test="${product != null}">
                            <input type="hidden" name="id" value="<c:out value='${product.id}' />" />
                        </c:if>

                        <fieldset class="form-group">
                            <label>Product Name</label> <input type="text" value="<c:out value='${product.name}' />" class="form-control" name="name" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Product Price</label> <input type="text" value="<c:out value='${product.price}' />" class="form-control" name="price">
                        </fieldset>

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>