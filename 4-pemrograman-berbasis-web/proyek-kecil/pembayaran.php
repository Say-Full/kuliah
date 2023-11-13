<?php
session_start();
require "config.php";
include "header.php";

if (isset($_POST["alamat"])) {
    $_SESSION['alamat'] = $_POST["alamat"];
}

if (isset($_POST["pembayaran"])) {
    $id_user = 1;
    $jumlah = $_SESSION["jumlah"];
    $total_harga = $_SESSION["total_harga"];
    $alamat = $_SESSION["alamat"];
    $deskripsi = $_SESSION["deskripsi"];
    $waktu = $date . " " . $time;
    $id_status = 1;

    $querypembelian = "INSERT INTO pembelian (id, id_user, jumlah, total_harga, alamat, deskripsi, waktu, id_status) VALUES ('', '$id_user', '$jumlah', '$total_harga', '$alamat', '$deskripsi', '$waktu', '$id_status')";
    mysqli_query($conn, $querypembelian);
}

global $waktu;
$result = mysqli_query($conn, "SELECT * FROM pembelian where waktu = '$waktu'");
$result_pembelian = mysqli_fetch_assoc($result);
?>

<!-- Begin Page Content -->
<div class="container-fluid text-dark" style="background-color: aliceblue;">

    <h3>Pembayaran</h3>
    <div class="mt-2">
        <h3>#<?= $result_pembelian["id"] ?></h3><br>
        <h4>Total Pembayaran : Rp<span class="blink"><?= number_format($_SESSION["total_harga"], 0, ",", "."); ?></span></h4>
        <hr>
        <h5>Untuk melakukan pembayaran, harap melakukan transfer ke rekening berikut :</h5>
        <h5>BRI SYARIAH : 1044027751 A/N FIKRUL AKHYAR</h5>
        <hr>
    </div>
    <div class="mt-2">
        <ul>
            <li>Setelah melakukan transfer, harap mengirimkan bukti transfer <a class="btn btn-success" href="http://wa.me/6282144637249?text=Bukti%20Transfer%20Pembayaran%20Di%20AyoBeli%20Dengan%20Id%20Pembayaran%20<?= $result_pembelian['id'] ?>">Kesini</a></li>
            <li>Setelah kami mendapatkan bukti transfer tersebut, maka status pesanan anda akan kami ubah menjadi <strong class="text-primary">Sedang Diproses</strong></li>
            <li>Setelah itu pesanan anda akan kami proses, dan nomor resi pengiriman akan kami kirimkan melalui whatsapp tersebut</li>
        </ul>
    </div>
    <div class="text-center mt-5">
        <h5>Terimakasih (●'◡'●)</h5>
    </div>


</div>
</div>


<?php include "footer.php"; ?>