<%-- 
    Document   : index1
    Created on : Feb 18, 2023, 6:25:27 PM
    Author     : Zoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alumni Home</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="Asset/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="Asset/vendor/aos/aos.css" rel="stylesheet">
        <link href="Asset/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="Asset/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="Asset/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="Asset/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="Asset/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="Asset/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="Asset/css/style.css" rel="stylesheet">
    </head>
    <body>
        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top d-flex align-items-center  header-transparent ">
            <div class="container d-flex align-items-center justify-content-between">

                <div class="logo">
                    <a href="index.jsp"><img src="Asset/img/anjuman-logo.jfif" alt="" class="img-fluid"><span class="h2 p-4 text-white">Anjuman Alumni</span></a>

                    <!-- <h1><a href="index.jsp">Anjuman Alumni</a></h1>-->
                    <!-- Uncomment below if you prefer to use an image logo -->
                </div>
                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
                        <li><a class="nav-link scrollto" href="#about">About</a></li>
                        <li><a class="nav-link scrollto" href="#events">Events</a></li>
                        <li><a class="nav-link scrollto" href="#cta">Departments</a></li>
                        <li><a class="nav-link scrollto" href="#contact">Contact</a></li>
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->
            </div>
        </header><!-- End Header -->

        <!-- ======= Hero Section ======= -->
        <section id="hero" class="d-flex flex-column justify-content-end align-items-center">
            <div id="heroCarousel" data-bs-interval="5000" class="container carousel carousel-fade" data-bs-ride="carousel">
                <!-- Slide 1 -->
                <div class="carousel-item active">
                    <div class="carousel-container">
                        <h2 class="animate__animated animate__fadeInDown">Welcome to <span>Anjuman Alumni</span></h2>
                        <p class="animate__animated fanimate__adeInUp">To be a centre of excellence for developing quality technocrats with moral and social ethics, to face the global challenges for the sustainable development of society.</p>
                        <div class="row">
                            <div class="col-lg-7">
                                <a href="registration.jsp" class="btn-get-started animate__animated animate__fadeInUp scrollto">Sign Up</a>
                            </div>
                            <div class="col-lg-5">
                                <a href="login.jsp" class="btn-get-started animate__animated animate__fadeInUp scrollto">Login</a>
                            </div>

                        </div>
                        <span class="h6 text-white">
                            ${param.message}
                        </span>
                    </div>
                </div>
            </div>
            <svg class="hero-waves" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" viewBox="0 24 150 28 " preserveAspectRatio="none">
            <defs>
            <path id="wave-path" d="M-160 44c30 0 58-18 88-18s 58 18 88 18 58-18 88-18 58 18 88 18 v44h-352z">
            </defs>
            <g class="wave1">
            <use xlink:href="#wave-path" x="50" y="3" fill="rgba(255,255,255, .1)">
            </g>
            <g class="wave2">
            <use xlink:href="#wave-path" x="50" y="0" fill="rgba(255,255,255, .2)">
            </g>
            <g class="wave3">
            <use xlink:href="#wave-path" x="50" y="9" fill="#fff">
            </g>
            </svg>
        </section><!-- End Hero -->
        <main id="main">
            <!-- ======= About Section ======= -->
            <section id="about" class="about">
                <div class="container" >
                    <div class="section-title" data-aos="zoom-out">
                        <h2>About</h2>
                        <p>Who we are</p>
                    </div>
                    <div class="row content" data-aos="fade-up">
                        <div class="col-lg-12">
                            The Anjuman College of Engineering and Technology [ A.C.E.T.] is managed by Anjuman Hami-E-Islam, Nagpur. It is a pioneer Educational Trust, serving the cause of education in the region. For well over 134 years. 
                            Irrespective of the considerations of the various caste and creed It has wide spread reputation in the field of education in Vidharbha and is currently running 20 educational Institutions. Anjuman Hami- E-Islam started an Engineering College from academic year 1999-2000 with three branches Mechanical , Electrical , Electronics and Telecommunication, two more branches viz. 
                            Computer Science & Engineering and Civil Engineering has been added. Also in order to meet Industry 4.0 challenges, Artificial intelligence and Data Science branch was introduced. Slowly and steadily the College has carved a niche for itself and has established itself as a name to be reckoned with providing quality Technical Education at a very affordable cost.
                        </div>
                    </div>
                </div>
            </section><!-- End About Section -->
            <hr>
            <section id="events">
                <div class="container">
                    <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="assets/images/myImg/alumni-1.jpg" class="d-block w-100 h-50" alt="...">
                            </div>
                            <div class="carousel-item">
                                <img src="assets/images/myImg/alumni-3.jpg" class="d-block w-100 h-50" alt="...">
                            </div>
                            <div class="carousel-item">
                                <img src="assets/images/myImg/alumni-4.jpg" class="d-block w-100 h-50" alt="...">
                            </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Next</span>
                        </button>
                    </div>
                </div>
            </section>
            <!-- ======= Cta Section ======= -->
            <section id="cta" class="cta">
                <div class="container">

                    <div class="row" data-aos="zoom-out">
                        <div class="col-lg-12 text-center text-lg-start">
                            <h3 class="text-center">Departments</h3>
                            <p class="text-center"> The Anjuman College of Engineering and Technology [ A.C.E.T.] is managed by Anjuman Hami-E-Islam, Nagpur. It is a pioneer Educational Trust, serving the cause of education in the region. 
                                For well over 125 years. Irrespective of the considerations of the various caste and creed It has wide spread reputation in the field of education in Vidharbha and is currently running 20 educational Institutions. 
                                Anjuman Hami-E-Islam started an Engineering College from academic year 1999-2000 with three branches Mechanical , Electrical , Electronics and Telecommunication, two more branches viz. Computer Science & Engineering and Civil Engineering has been added.  </p>
                        </div>
                        <hr>
                        <div class="col-lg-8 text-center text-lg-start mt-3 mb-3">
                            <h3>Civil Engineering :</h3>
                            <p> The Department of Civil Engineering was established in the year 2010 with an intake of 60. The department is well equipped with modern equipment’s and highly advanced laboratories. Department of Civil engineering is spearheaded by highly competent, dedicated,
                                well qualified and experienced faculties having roots with NIT. The department is providing avenues for the students to qualify themselves as good Civil Engineers and provide their contribution to the development of society and nation. We are giving best results in RTMNU examinations.
                                Miss Poonam Belekar stood 1st and recently received 6 Gold medals at 108 Convocation RTMNU. Keeping in view the fast changing scenario, it is essential to develop various extracurricular skills like administrative, managerial and social.  </p>
                        </div>
                        <div class="col-lg-4 cta-btn-container text-center mb-3">
                            <img src="Asset/img/civil.jpg" height="100%" width="100%" alt="HOD Profile">
                        </div>
                        <hr>
                        <div class="col-lg-4 cta-btn-container text-center mt-4 mb-3">
                            <img src="Asset/img/CSE_hod1.jpg" height="100%" width="100%" alt="HOD Profile">
                        </div>
                        <div class="col-lg-8 text-center text-lg-start mt-4 mb-3">
                            <h3>Computer Science And Engineering :</h3>
                            <p> Computer Science and Engineering Department was established in the year 2002 with a vision to achieve excellent standards of quality education in the field of computer science and engineering, aiming towards development of ethically strong technical experts contributing to the profession in the global society.
                                Department now has intake of 120 students supported by excellent infrastructure, well equipped labs with Computers of latest configuration, license software’s and applications which connects entire college on few clicks.
                                Highly Qualified and experienced Faculty with strong commitment and well planned teaching program leaves no stone unturned, giving best knowledge and latest technological trends. Our aim is to create outcome based education environment for learning and attaining career goals. Provide latest tools in a learning ambience to enhance innovations, problem solving skills, leadership qualities, team spirit and ethical. 
                            </p>
                        </div>
                        <hr>
                        <div class="col-lg-8 text-center text-lg-start mt-3 mb-3">
                            <h3>Electrical Engineering :</h3>
                            <p> The Department of Electrical Engineering has been established in the year 1999-2000. Since then Department of Electrical Engineering has made landmark contributions to the development of cutting edge technology. The department has well furnished and spacious laboratories as per AICTE norms with state of the art equipment in all the laboratories and dedicated 100 Mbps internet leased line. The teaching faculty is highly qualified, experienced and involved in research and development.
                                The department publishes News letter which provides panoramic retrospection of round the year activities of department has formed the student forum named PHOENIX. Under this banner student of the department conduct various technical and non-technical activities for their overall development. Also looking into the need of the day there is a Energy Conservation Cell in addition to PHOENIX.
                            </p>
                        </div>
                        <div class="col-lg-4 cta-btn-container text-center mb-3">
                            <img src="Asset/img/electrical.jpg" height="100%" width="100%" alt="HOD Profile">
                        </div>
                        <hr>
                        <div class="col-lg-4 cta-btn-container text-center mb-3">
                            <img src="Asset/img/electronics.jpg" height="70%" width="100%" alt="HOD Profile">
                        </div>
                        <div class="col-lg-8 text-center text-lg-start mt-5 mb-3">
                            <h3>Electronics & Telecommunication Engineering :</h3>
                            <p>  Electronics & Telecommunication Engineering is headed by Prof. Sanjay R. Ganar, Associate professor. He has done his BE in Electronics Engineering from RKNCE, Nagpur in 1993 and M.E in Electronics Engineering from VJTI, Mumbai in 1996 He has more than 24 years of teaching experience. During his curriculum Prof. Sanjay R. Ganar has guided many UG and PG Project with his potential in research & development and has published several research paper in national & international Journal & Conferences. 
                                Department of Electronics & Telecommunication Engineering was established in the year 1999 with intake 60. Then the intake was increased to 120, now the intake is reduced to 60 from session 2018-2019. Department also started a PG course, M-TECH (Electronics & Telecommunication Engineering) in 2014-15. The department possesses experienced and qualified teaching faculties. The Department came into existence with a mission of, “To provide value based technical education and to mould the character of the younger generation,
                                through synthesis of science and spirituality, so that their earnest Endeavour to achieve prosperity in life is matched by an ardent desire to extend selfless service to the society, each complementing the other, to prepare graduates who possess the necessary foundation required to take up gainful employment in core and allied sectors”. </p>
                        </div>
                        <hr>
                        <div class="col-lg-8 text-center text-lg-start mt-3 mb-3">
                            <h3> Mechanical  Engineering :</h3>
                            <p> The department was established in 1999. We offer Bachelors of Engineering (UG), Masters in Technology in Mechanical Engineering Design stream (PG) and Doctorate (Ph.D) in Mechanical Engineering. It’s approach is very student centric.
                                Our vision is to groom tomorrow’s critical problem solving engineers, helping them make successful careers in industry / research / higher studies and be competent in professional skills and ethics.
                                In addition to the regular academic activities, the department conducts plethora of extracurricular events. It also has students association MESA (Mechanical Engineering Students Association), student’s chapter of SAE India ‘Society of Automobile Engineers’ & ISHRAE ‘The Indian Society of Heating, Refrigerating and Air Conditioning Engineers’ to inculcate event management & entrepreneurial skills and providing exposure to industrial environment and thereby making Industry ready. 

                            </p>
                        </div>
                        <div class="col-lg-4 cta-btn-container text-center mb-3">
                            <img src="Asset/img/mechanical.jpg" height="90%" width="100%" alt="HOD Profile">
                        </div>
                    </div>
                </div>
            </section><!-- End Cta Section -->
            <!-- ======= Contact Section ======= -->
            <section id="contact" class="contact">
                <div class="container">
                    <div class="section-title" data-aos="zoom-out">
                        <h2>Contact</h2>
                        <p>Feedback</p>
                    </div>
                    <div class="row mt-5">
                        <div class="col-lg-4" data-aos="fade-right">
                            <div class="info">
                                <div class="address">
                                    <i class="bi bi-geo-alt"></i>
                                    <h4>Location:</h4>
                                    <p>Mangalwari Bazaar Road, Sadar, Nagpur - 440001</p>
                                </div>
                                <div class="email">
                                    <i class="bi bi-envelope"></i>
                                    <h4>Email:</h4>
                                    <p>eng_acet@rediffmail.com</p>
                                    <p>eng.acet@gmail.com</p>
                                </div>
                                <div class="phone">
                                    <i class="bi bi-phone"></i>
                                    <h4>Call:</h4>
                                    <p>+91712 2582749, 2583559, 5612827</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-8 mt-5 mt-lg-0" data-aos="fade-left">
                            <div class="text-end">
                                <span class="text-success">${param.message}</span>
                            </div>
                            <form action="FeedbackController" method="POST">
                                <input type="hidden" name="action" value="insert">
                                <div class="row">
                                    <div class="col-md-6 form-group">
                                        <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" required>
                                    </div>
                                    <div class="col-md-6 form-group mt-3 mt-md-0">
                                        <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" required>
                                    </div>
                                </div>
                                <div class="form-group mt-3">
                                    <textarea class="form-control" name="message" rows="5" placeholder="Message" required></textarea>
                                </div>
                                <div class="text-center mt-2"><button type="submit" class="btn btn-dark">Send Message</button></div>
                            </form>
                        </div>
                    </div>
                </div>
            </section><!-- End Contact Section -->

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer">
            <div class="container">
                <!--                <h3>Selecao</h3>
                                <p>Et aut eum quis fuga eos sunt ipsa nihil. Labore corporis magni eligendi fuga maxime saepe commodi placeat.</p>
                                <div class="social-links">
                                    <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                                    <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                                    <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                                    <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                                    <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                                </div>
                                <div class="copyright">
                                    &copy; Copyright <strong><span>Selecao</span></strong>. All Rights Reserved
                                </div>
                                <div class="credits">
                                     All the links in the footer should remain intact. 
                                     You can delete the links only if you purchased the pro version. 
                                     Licensing information: https://bootstrapmade.com/license/ 
                                     Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/selecao-bootstrap-template/ 
                                    Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
                                </div>-->
            </div>
        </footer><!-- End Footer -->

        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="Asset/vendor/aos/aos.js"></script>
        <script src="Asset/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="Asset/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="Asset/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="Asset/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="Asset/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="Asset/js/main.js"></script>
    </body>
</body>
</html>
