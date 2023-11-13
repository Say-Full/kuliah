<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Ayo Beli</title>
    <link rel="shortcut icon" href="<?= $config['base_url'] ?>img/logo.png">

    <!-- Custom fonts for this template-->
    <link href="<?= $config['base_url'] ?>vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<?= $config['base_url'] ?>css/sb-admin-2.min.css" rel="stylesheet">
    <style>
        .blink {
            animation: blink-animation 1s steps(5, start) infinite;
            -webkit-animation: blink-animation 1s steps(5, start) infinite;
        }

        @keyframes blink-animation {
            to {
                visibility: hidden;
            }
        }

        @-webkit-keyframes blink-animation {
            to {
                visibility: hidden;
            }
        }
    </style>

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav sidebar accordion border font-weight-bold shadow" style="background-color: AliceBlue; border-radius:0px 50px 0px 0px;" id=" accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center mb-2" href="<?= $config['base_url'] ?>dashboard">
                <div class="sidebar-brand-icon">
                    <img src="<?= $config['base_url'] ?>img/logo.png" width="100px">
                </div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0 mb-2">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item mb-2">
                <a class="nav-link" href="<?= $config['base_url'] ?>dashboard">
                    <i class="fas fa-home" style="color: DeepSkyBlue;"></i>
                    <span style="color: DeepSkyBlue;">Home</span>
                </a>
            </li>

            <hr class="sidebar-divider my-0 mb-2">

            <li class="nav-item mb-2">
                <a class="nav-link" href="<?= $config['base_url'] ?>order">
                    <i class="fas fa-shopping-cart" style="color: DeepSkyBlue;"></i>
                    <span style="color: DeepSkyBlue;">Pembelian</span>
                </a>
            </li>

            <hr class="sidebar-divider my-0 mb-2">

            <li class="nav-item mb-2">
                <a class="nav-link" href="<?= $config['base_url'] ?>riwayat_pembelian">
                    <i class="fas fa-list" style="color: DeepSkyBlue;"></i>
                    <span style="color: DeepSkyBlue;">Riwayat Pembelian</span>
                </a>
            </li>

            <hr class="sidebar-divider my-0 mb-2">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle" style="background-color: DeepSkyBlue;"></button>
            </div>

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand topbar mb-4 static-top shadow" style="border-radius: 0px 0px  25px 25px; background-color:aliceblue;">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>

                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">
                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline small font-weight-bold" style="color: deepskyblue;">Muhammad Fazil</span>
                                <img class="img-profile rounded-circle" src="<?= $config['base_url'] ?>img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="<?= $config['base_url'] ?>" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->