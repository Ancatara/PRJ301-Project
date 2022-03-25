<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<!-- /*------------------------Header-------------------------*/ -->
<div class="wrapper">
    <header class="header">
        <div class="container header__inner">

            <a href="paging" class="logo">
                <span class="logo__text">Easy</span>Baker
            </a>
            <nav class="header__menu">
                <ul class="header__menu-list">
                    <c:if test="${sessionScope.account == null}">


                        <li class="header__menu-item">
                            <a
                                href="Login.jsp"
                                class="header__menu-link btn "
                                >
                                Login
                            </a>
                        </li>



                    </c:if>
                    <c:if test="${sessionScope.account != null}">
                        <li class="header__menu-item">
                            <a href="Creator.jsp" class="header__menu-link">
                                Create
                            </a>
                        </li>
                        <li class="header__menu-item">
                            <a href="manager" class="header__menu-link">
                                Manage Post
                            </a>
                        </li>
                        <li class="header__menu-item">
                            <a href="#" class="header__menu-link">
                                About
                            </a>
                        </li>

                        <li class="header__menu-item">
                            <a
                                href="Login.jsp"
                                class="header__menu-link btn "
                                >
                                Login
                            </a>
                        </li>
                        <li class="header__menu-item">
                            <a
                                href="logout"
                                class="header__menu-link btn "
                                >
                                Logout
                            </a>
                        </li>
                    </c:if>



                    </form>
                </ul>
            </nav>
        </div>
    </header>
</div>