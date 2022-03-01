<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Pharmative &mdash; Colorlib Template</title>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />

    <link
      href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;700&display=swap"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="<c:url value="/resources/fonts/icomoon/style.css"/>" />

    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/fonts/flaticon/font/flaticon.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/magnific-popup.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/jquery-ui.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/owl.carousel.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/owl.theme.default.min.css"/>" />

    <link rel="stylesheet" href="<c:url value="/resources/css/aos.css"/>" />

    <link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>" />
    <style>
ul {
  list-style: none;
  padding: 0;
  margin: 0;
  background: #ffffff;
}

ul li {
  display: block;
  position: relative;
  float: left;
  background: #ffffff;
}

/* This hides the dropdowns */


li ul { display: none; }

ul li a {
  display: block;
  padding: 1em;
  text-decoration: none;
  white-space: nowrap;
  color: #fff;
}

ul li a:hover { background:#ffffff; }

/* Display the dropdown */


li:hover > ul {
  display: block;
  position: absolute;
}

li:hover li { float: none; }

li:hover a { background:#ffffff; }

li:hover li a:hover { background:#ffffff; }

.main-navigation li ul li { border-top: 0; }

/* Displays second level dropdowns to the right of the first level dropdown */


ul ul ul {
  left: 100%;
  top: 0;
}

/* Simple clearfix */



ul:before,
ul:after {
  content: " "; /* 1 */
  display: table; /* 2 */
}

ul:after { clear: both; }
</style>
  </head>

  <body>
    <div class="site-wrap">
      <div class="site-navbar py-2">
        <div class="search-wrap">
          <div class="container">
            <a href="#" class="search-close js-search-close"
              ><span class="icon-close2"></span
            ></a>
            <form action="#" method="post">
              <input
                type="text"
                class="form-control"
                placeholder="Search keyword and hit enter..."
              />
            </form>
          </div>
        </div>

        <div class="container">
          <div class="d-flex align-items-center justify-content-between">
            <div class="logo">
              <div class="site-logo">
                <a href="index.jsp" class="js-logo-clone"
                  ><strong class="text-primary">Pharma</strong>tive</a
                >
              </div>
            </div>
            <div class="main-nav d-none d-lg-block" style="margin-left: 450px">
              <nav
                class="site-navigation text-right text-md-center"
                role="navigation"
              >
               <ul class="site-menu js-clone-nav d-none d-lg-block">
                  <li class="active"><a href="adminindex.jsp">Home</a></li>
                  <li><a href="adminshop.jsp">Store</a></li>
                  <li class="has-children">
                    <a href="#">Products</a>
                    <ul class="dropdown">
                      <li><a href="addproduct.jsp">Add Product</a></li>
                      <li><a href="deleteProduct.jsp">Delete Product</a></li>
                      <li><a href="updateproduct.jsp">Update Product</a></li>
                      <li><a href="allproduct.jsp">All Products</a></li>
                    </ul> 
                     <li class="has-children">
                        <a href="#">Sign-up</a>
                        <ul class="dropdown">
                          <li><a href="adminLogin.jsp">Login</a></li>
                          <!--<li><a href="register.jsp">Registration</a></li>--->
                        </ul>
                      </li>
                    </li>
                  </li>
                  <!-- <li><a href="about.jsp">About</a></li>
                  <li><a href="contact.jsp">Contact</a></li> -->
                </ul>

              </nav>
            </div>
            <div class="icons">
              <a href="#" class="icons-btn d-inline-block js-search-open"
                ><span class="icon-search"></span
              ></a>
              <a href="cart.jsp" class="icons-btn d-inline-block bag">
                <span class="icon-shopping-bag"></span>
                <span class="number">2</span>
              </a>
              <a
                href="#"
                class="site-menu-toggle js-menu-toggle ml-3 d-inline-block d-lg-none"
                ><span class="icon-menu"></span
              ></a>
            </div>
          </div>
        </div>
      </div>

      <div class="owl-carousel owl-single px-0">
        <div class="site-blocks-cover overlay" 
        style="background-image: url('<c:url value="http://localhost:8081/PharmacyStore/resources/images/hero_bg.jpg"/>')">
          <div class="container">
            <div class="row">
              <div class="col-lg-12 mx-auto align-self-center">
                <div class="site-block-cover-content text-center">
                  <h1 class="mb-0">
                    <strong class="text-primary">Pharmative</strong> Opens 24
                    Hours
                  </h1>

                  <div class="row justify-content-center mb-5">
                    <div class="col-lg-6 text-center">
                      <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing
                        elit. Facilis ex perspiciatis non quibusdam vel quidem.
                      </p>
                    </div>
                  </div>

                  <p>
                    <a href="#" class="btn btn-primary px-5 py-3">Shop Now</a>
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div
          class="site-blocks-cover overlay"
          style="background-image: url('<c:url value="http://localhost:8081/PharmacyStore/resources/images/hero_bg_2.jpg"/>')"
        >
          <div class="container">
            <div class="row">
              <div class="col-lg-12 mx-auto align-self-center">
                <div class="site-block-cover-content text-center">
                  <h1 class="mb-0">
                    New Medicine <strong class="text-primary">Everyday</strong>
                  </h1>
                  <div class="row justify-content-center mb-5">
                    <div class="col-lg-6 text-center">
                      <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing
                        elit. Facilis ex perspiciatis non quibusdam vel quidem.
                      </p>
                    </div>
                  </div>
                  <p>
                    <a href="#" class="btn btn-primary px-5 py-3">Shop Now</a>
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="site-section py-5">
        <div class="container">
          <div class="row">
            <div class="col-lg-4">
              <div class="feature">
                <span class="wrap-icon flaticon-24-hours-drugs-delivery"></span>
                <h3><a href="#">Free Delivery</a></h3>
                <p>
                  Lorem ipsum dolor sit amet consectetur adipisicing elit. Culpa
                  laborum voluptates excepturi neque labore .
                </p>
                <p>
                  <a href="#" class="d-flex align-items-center"
                    ><span class="mr-2">Learn more</span>
                    <span class="icon-keyboard_arrow_right"></span
                  ></a>
                </p>
              </div>
            </div>
            <div class="col-lg-4">
              <div class="feature">
                <span class="wrap-icon flaticon-medicine"></span>
                <h3><a href="#">New Medicine Everyday</a></h3>
                <p>
                  Lorem ipsum dolor sit amet consectetur adipisicing elit. Culpa
                  laborum voluptates excepturi neque labore .
                </p>
                <p>
                  <a href="#" class="d-flex align-items-center"
                    ><span class="mr-2">Learn more</span>
                    <span class="icon-keyboard_arrow_right"></span
                  ></a>
                </p>
              </div>
            </div>
            <div class="col-lg-4">
              <div class="feature">
                <span class="wrap-icon flaticon-test-tubes"></span>
                <h3><a href="#">Medicines Guaranteed</a></h3>
                <p>
                  Lorem ipsum dolor sit amet consectetur adipisicing elit. Culpa
                  laborum voluptates excepturi neque labore .
                </p>
                <p>
                  <a href="#" class="d-flex align-items-center"
                    ><span class="mr-2">Learn more</span>
                    <span class="icon-keyboard_arrow_right"></span
                  ></a>
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="site-section bg-light">
        <div class="container">
          <div class="row">
            <div class="title-section text-center col-12">
              <h2>Pharmacy <strong class="text-primary">Products</strong></h2>
            </div>
          </div>
          <div class="row">
            <div class="col-md-12 block-3 products-wrap">
              <div class="nonloop-block-3 owl-carousel">
                <div class="text-center item mb-4 item-v2">
                  <span class="onsale">Sale</span>
                  <a href="shop-single.jsp">
                    <img src="resources/images/product_03.png" alt="Image"
                  /></a>
                  <h3 class="text-dark">
                    <a href="shop-single.jsp">Umcka Cold Care</a>
                  </h3>
                  <p class="price">$120.00</p>
                </div>

                <div class="text-center item mb-4 item-v2">
                  <a href="shop-single.jsp">
                    <img src="resources/images/product_01.png" alt="Image"
                  /></a>
                  <h3 class="text-dark">
                    <a href="shop-single.jsp">Umcka Cold Care</a>
                  </h3>
                  <p class="price">$120.00</p>
                </div>

                <div class="text-center item mb-4 item-v2">
                  <span class="onsale">Sale</span>
                  <a href="shop-single.jsp">
                    <img src="resources/images/product_02.png" alt="Image"
                  /></a>
                  <h3 class="text-dark">
                    <a href="shop-single.jsp">Umcka Cold Care</a>
                  </h3>
                  <p class="price">$120.00</p>
                </div>

                <div class="text-center item mb-4 item-v2">
                  <a href="shop-single.jsp">
                    <img src="resources/images/product_04.png" alt="Image"
                  /></a>
                  <h3 class="text-dark">
                    <a href="shop-single.jsp">Umcka Cold Care</a>
                  </h3>
                  <p class="price">$120.00</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div
        class="site-section bg-image overlay"
        style="background-image: url('resources/images/hero_bg_2.jpg')"
      >
    
      </div>

            <footer
        style="
          padding: 10px 10px 10px 10px;
          margin-left: 480px;
          color: black;
          font-weight: bold;
        "
      >
        Project created by Group 1 &copy;
      </footer>
    </div>

    <script src="<c:url value="/resources/js/jquery-3.3.1.min.js"/>"></script>
    <script src="<c:url value="/resources/js/jquery-ui.js"/>"></script>
    <script src="<c:url value="/resources/js/popper.min.js"/>"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resources/js/owl.carousel.min.js"/>"></script>
    <script src="<c:url value="/resources/js/jquery.magnific-popup.min.js"/>"></script>
    <script src="<c:url value="/resources/js/aos.js"/>"></script>

    <script src="<c:url value="/resources/js/main.js"/>"></script>
    
 <script>
$(document).ready(function(){
  $('.has-children a.test').on("click", function(e){
    $(this).next('ul').toggle();
    e.stopPropagation();
    e.preventDefault();
  });
});
</script>
  </body>
</html>
