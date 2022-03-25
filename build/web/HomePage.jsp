
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css"
            />
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/reset.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        <style>
            .col-sm-8 p{
                overflow: hidden;
                display: -webkit-box;
                -webkit-line-clamp: 3;
                -webkit-box-orient: vertical;
            }
        </style>

        <jsp:useBean id="a" class="dao.DAO" scope="request"></jsp:useBean>
        </head>
        <body>
            <div class="container">
                <!--begin of menu-->
            <jsp:include page="Header.jsp"/>
            <jsp:include page="Banner.jsp"/>

            <form action="search" method="post" class="form-inline my-2 my-lg-0">
                <div class="search active">
                    <input name="txt" type="text" class="input" placeholder="Search...">
                    <button type="submit" class="search-button">
                        <i class="fas fa-search"></i>
                    </button>
                </div> 
            </form>         


            <!--end of menu-->
            <!--begin of list article-->
            <section class="feature">
                <div class="container">
                    <c:forEach items="${listP}" var ="o">
                        <div class="feature__item">
                            <div class="feature__image">
                                <img src="${o.image}" alt="">
                            </div>
                            <div class="feature__info">
                                <h3 class="feature__title">
                                    ${o.title}
                                </h3>
                                <p class="info">
                                    ${o.description}
                                </p>
                                <a href="#" class="btn visit">Visit Now</a>
                            </div>
                        </div>
                    </c:forEach>


                </div>
            </section>
            <nav style="margin: 20px auto; width: 500px" aria-label="...">
                <ul class="pagination pagination-lg">
                    <c:forEach begin="1" end="${a.totalPage()}" var="i">
                        <li class="page-item"><a class="page-link" href="paging?index=${i}">${i}</a></li>
                        </c:forEach>
                </ul>
            </nav>
            <!--end of list article-->
        </div>
        <jsp:include page="Footer.jsp"/>
        <script src="js/script.js"></script> 

    </body>
</html>
