<?php
require("config.php");


?>


<!DOCTYPE html>
<html class="wide wow-animation" lang="en">

<head>
  <title>Ayo Beli</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <link rel="icon" type="image/x-icon" href="<?= $config['base_url'] ?>img/logo.png" />
  <link rel="stylesheet" type="text/css" href="//fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700,900">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
  <link rel="stylesheet" href="<?= $config['base_url'] ?>css/style_index.css">
  <!-- Font Awesome icons (free version)-->
  <script src="https://use.fontawesome.com/releases/v5.15.1/js/all.js" crossorigin="anonymous"></script>
  <!-- Google fonts-->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
  <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
  <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
  <!-- Core theme CSS (includes Bootstrap)-->
  <link href="<?= $config['base_url'] ?>css/styles.css" rel="stylesheet" />
  <style>
    .ie-panel {
      display: none;
      background: #212121;
      padding: 10px 0;
      box-shadow: 3px 3px 5px 0 rgba(0, 0, 0, .3);
      clear: both;
      text-align: center;
      position: relative;
      z-index: 1;
    }

    html.ie-10 .ie-panel,
    html.lt-ie-10 .ie-panel {
      display: block;
    }
  </style>
</head>

<body>

  <div class="preloader">
    <div class="loader">
      <div class="ball"></div>
      <div class="ball"></div>
      <div class="ball"></div>
    </div>
  </div>
  <div class="page">
    <div class="position-relative">
      <header class="section page-header" id="programs">
        <!--RD Navbar-->
        <div class="rd-navbar-wrap">
          <nav class="rd-navbar rd-navbar-classic context-dark" data-layout="rd-navbar-fixed" data-sm-layout="rd-navbar-fixed" data-md-layout="rd-navbar-fixed" data-lg-layout="rd-navbar-fixed" data-xl-layout="rd-navbar-static" data-xxl-layout="rd-navbar-static" data-md-device-layout="rd-navbar-fixed" data-lg-device-layout="rd-navbar-fixed" data-xl-device-layout="rd-navbar-static" data-xxl-device-layout="rd-navbar-static" data-lg-stick-up-offset="10px" data-xl-stick-up-offset="10px" data-xxl-stick-up-offset="10px" data-lg-stick-up="true" data-xl-stick-up="true" data-xxl-stick-up="true">
            <div class="rd-navbar-main-outer">
              <div class="rd-navbar-main">
                <!--RD Navbar Panel-->
                <div class="rd-navbar-panel">
                  <!--RD Navbar Toggle-->
                  <button class="rd-navbar-toggle" data-rd-navbar-toggle=".rd-navbar-nav-wrap"><span></span></button>
                  <!--RD Navbar Brand-->
                  <div class="rd-navbar-brand">
                    <!--Brand--><a class="brand" href="<?= $config['base_url'] ?>"><img class="brand-logo-dark" src="<?= $config['base_url'] ?>img/logo.png" alt="" width="181" height="50" /><img class="brand-logo-light" src="<?= $config['base_url'] ?>img/logo.png" alt="" width="100"></a>
                  </div>
                </div>
                <div class="rd-navbar-nav-wrap">
                  <ul class="rd-navbar-nav">
                    <li class="rd-nav-item"><a class="rd-nav-link" href="#deskripsi">Deskripsi</a>
                    </li>
                    <li class="rd-nav-item"><a class="rd-nav-link" href="#penawaran">Penawaran</a>
                    </li>
                    <li class="rd-nav-item"><a class="rd-nav-link" href="#tim">Tim</a>
                    </li>
                    <li class="rd-nav-item"><a class="rd-nav-link" href="<?= $config['base_url'] ?>login">Login</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </nav>
        </div>
      </header>
      <!--Swiper-->
      <section class="section swiper-container swiper-slider bg-primary" data-autoplay="3500" data-loop="false" data-simulate-touch="false" data-effect="circle-bg" data-speed="750" id="deskripsi">
        <div class="swiper-bg-text">Food</div>
        <div class="swiper-wrapper">
          <div class="swiper-slide" data-circle-cx=".855" data-circle-cy=".5" data-circle-r=".39">
            <div class="swiper-slide-caption section-md">
              <div class="container">
                <div class="row row-50 align-items-center swiper-custom-row">
                  <div class="col-lg-5">
                    <h3 class="subtitle" data-swiper-anime='{"animation":"swiperContentRide","duration":900,"delay":900}'>Welcome to
                      AyoBeli
                    </h3>
                    <p class="postitle" data-swiper-anime='{"animation":"swiperContentRide","duration":1200,"delay":1200}'>Website ini
                      adalah Website MarketPlace yang menjual banyak
                      keperluan masyarakat mulai dari pakaian, makanan, handphone hingga perabotan rumah</p>
                  </div>
                  <div class="box-round-wrap"><img src="<?= $config['base_url'] ?>img/logo.png" alt="" width="671" height="335" data-swiper-anime='{"animation":"swiperContentFade","duration":1000,"delay":1000}' />
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide" data-circle-cx=".855" data-circle-cy=".5" data-circle-r=".39">
            <div class="swiper-slide-caption section-md">
              <div class="container">
                <div class="row row-50 align-items-center swiper-custom-row">
                  <div class="col-lg-5">
                    <h3 class="subtitle" data-swiper-anime='{"animation":"swiperContentRide","duration":900,"delay":900}'>Melayani
                      Pengiriman Hingga ke Seluruh Indonesia</h3>
                    <p class="big" data-swiper-anime='{"animation":"swiperContentRide","duration":1100,"delay":1100}'>
                      Layanan pengiriman kami tersedia di lebih dari 200 kota untuk kenyamanan Anda.</p>
                  </div>
                  <div class="box-round-wrap"><img src="<?= $config['base_url'] ?>img/Map.png" alt="" width="671" height="335" data-swiper-anime='{"animation":"swiperContentFade","duration":1000,"delay":1000}' />
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="swiper-slide" data-circle-cx=".855" data-circle-cy=".5" data-circle-r=".39">
            <div class="swiper-slide-caption section-md">
              <div class="container">
                <div class="row row-50 align-items-center swiper-custom-row">
                  <div class="col-lg-5">
                    <h3 class="subtitle" data-swiper-anime='{"animation":"swiperContentRide","duration":900,"delay":900}'>Kategori yang
                      beragam</h3>
                    <p class="big" data-swiper-anime='{"animation":"swiperContentRide","duration":1100,"delay":1100}'>
                      Kategori yang tersedia adalah Fashion Pria, Fashion Wanita, Olahraga, Makanan & Minuman,
                      Handphone, Kesehatan & Kecantikan, Perabotan Rumah dan Ibu & Bayi</p>
                  </div>
                  <div class="box-round-wrap"><img src="<?= $config['base_url'] ?>img/img1.png" alt="" width="671" height="335" data-swiper-anime='{"animation":"swiperContentFade","duration":1000,"delay":1000}' />
                  </div>
                </div>
              </div>
            </div>
          </div>

          <!--Swiper Pagination-->
          <div class="swiper-pagination"></div>
      </section>
    </div>

    <!-- What we Offer-->
    <section class="section novi-bg novi-bg-img section-md-4 bg-primary" id="penawaran">
      <div class="container">
        <div class="text-center">
          <h3>What we Offer</h3>
          <h2>The Best Choice</h2>
        </div>
        <div class="row row-50 justify-content-center">
          <div class="col-xl-4 col-md-6">
            <!-- Product-->
            <div class="product novi-bg bg-default">
              <h3 class="product-title">Asus ROG </h3><img class="product-img" src="<?= $config['base_url'] ?>img/handphone/rog.png" alt="" width="140" height="80" />
              <div class="product-price">
                <div class="product-price-header">
                  <div class="product-price-currency">Rp</div>
                  <div style="font-size: 30px">16.000.000</div>
                </div>
                <div class="product-price-footer">per Unit</div>
              </div>
              <p class="product-text">The best choice for those of you who want a gaming laptop with high performance
                and support for almost all games</p><a class="button button-primary" href="<?= $config['base_url'] ?>login">Open Menu</a>
            </div>
          </div>
          <div class="col-xl-4 col-md-6">
            <!-- Product-->
            <div class="product novi-bg bg-default">
              <h3 class="product-title">Macbook</h3><img class="product-img" src="<?= $config['base_url'] ?>img/handphone/macbookpro.jpg" alt="" width="140" height="80" />
              <div class="product-price">
                <div class="product-price-header">
                  <div class="product-price-currency">Rp</div>
                  <div style="font-size: 30px">18.000.000</div>
                </div>
                <div class="product-price-footer">per unit</div>
              </div>
              <p class="product-text">The best choice for those of you who want to look trendy and stylish and be the
                center of attention wherever you are</p><a class="button button-primary" href="<?= $config['base_url'] ?>login">Open Menu</a>
            </div>
          </div>
          <div class="col-xl-4 col-md-6">
            <!-- Product-->
            <div class="product novi-bg bg-default">
              <h3 class="product-title">Iphone 12</h3><img class="product-img" src="<?= $config['base_url'] ?>img/handphone/iphone12.png" alt="" width="140" height="80" />
              <div class="product-price">
                <div class="product-price-header">
                  <div class="product-price-currency">Rp</div>
                  <div style="font-size: 30px">17.000.000</div>
                </div>
                <div class="product-price-footer">per Unit</div>
              </div>
              <p class="product-text">The best choice for those of you who want to own a Mobile with the latest
                features, trendy, stylish, and coveted by everyone</p><a class="button button-primary" href="<?= $config['base_url'] ?>login">Open Menu</a>
            </div>
          </div>
        </div>
      </div>
    </section>

    <!-- Team-->
    <section class="page-section bg-light" id="tim">
      <div class="container">
        <div class="text-center">
          <h2 class="section-heading text-uppercase">Our Amazing Team</h2>
          <h3 class="section-subheading text-muted">Tim yang Bekerja dalam Pembuatan Website ini</h3>
        </div>
        <div class="row">
          <div class="col-lg-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="<?= $config['base_url'] ?>img/tim/fikrul.jpeg" alt="" />
              <h4>Fikrul Akhyar</h4>
              <p class="text-muted">Leader</p>
              <a class="btn btn-dark btn-social mx-2" href="https://www.instagram.com/fikrul_akhyar18/"><i class="fab fa-instagram"></i></a>
              <a class="btn btn-dark btn-social mx-2" href="https://web.facebook.com/Fikrulakhyar18"><i class="fab fa-facebook-f"></i></a>
            </div>
          </div>
          <div class="col-lg-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="<?= $config['base_url'] ?>img/tim/saiful.jpeg" alt="" />
              <h4>M. Saifullah Sani</h4>
              <p class="text-muted">Deputy Leader</p>
              <a class="btn btn-dark btn-social mx-2" href="https://www.instagram.com/say_full02/"><i class="fab fa-instagram"></i></a>
              <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a>
            </div>
          </div>
          <div class="col-lg-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="<?= $config['base_url'] ?>img/tim/sufur.jpeg" alt="" />
              <h4>Sayidatul Sufur</h4>
              <p class="text-muted">Secretary</p>
              <a class="btn btn-dark btn-social mx-2" href="https://www.instagram.com/sayidatul_sufur/"><i class="fab fa-instagram"></i></a>
              <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a>
            </div>
          </div>
          <div class="col-lg-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="<?= $config['base_url'] ?>img/tim/nafis.jpeg" alt="" />
              <h4>Muhammad Nafis</h4>
              <p class="text-muted">Member</p>
              <a class="btn btn-dark btn-social mx-2" href="https://www.instagram.com/mhdnafiis/"><i class="fab fa-instagram"></i></a>
              <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a>
            </div>
          </div>
          <div class="col-lg-4">
            <div class="team-member">
              <img class="mx-auto rounded-circle" src="<?= $config['base_url'] ?>img/tim/Misbah.png" alt="" />
              <h4>M. Misbah Alvariz</h4>
              <p class="text-muted">Member</p>
              <a class="btn btn-dark btn-social mx-2" href="https://www.instagram.com/misbahalvariz/"><i class="fab fa-instagram"></i></a>
              <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a>
            </div>
          </div>
        </div>
      </div>
    </section>

    <!-- Footer-->
    <footer class="footer py-1" style="background-color:#71B85F;">
      <div class="container">
        <div class="text-center pt-3">
          <p>Copyright © AyoBeli 2021</p>
        </div>
      </div>
    </footer>

    <!-- Bootstrap core JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Third party plugin JS-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <!-- Core theme JS-->
    <script src="<?= $config['base_url'] ?>js/scripts.js"></script>
    <div class="snackbars" id="form-output-global"></div>
    <script src="<?= $config['base_url'] ?>js/core1.min.js"></script>
    <script src="<?= $config['base_url'] ?>js/script_index.js"></script>
</body>

</html>