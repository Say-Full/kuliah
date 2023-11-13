<?php
require("config.php");
include("header.php");

$result = mysqli_query($conn, "SELECT * FROM pembelian order by id desc");
?>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Riwayat Pembelian</h1>
    <p class="mb-4">Disini anda dapat melihat riwayat pembelian yang sudah dilakukan.</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id Transaksi</th>
                            <th>Nama Barang</th>
                            <th>Jumlah Barang</th>
                            <th>Total Harga</th>
                            <th>Status Pemesanan</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id Transaksi</th>
                            <th>Nama Barang</th>
                            <th>Jumlah Barang</th>
                            <th>Total Harga</th>
                            <th>Status Pemesanan</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <?php while ($result_pembelian = mysqli_fetch_assoc($result)) : ?>
                            <tr>
                                <td><?= $result_pembelian['id']; ?></td>
                                <td><?= $result_pembelian['deskripsi']; ?></td>
                                <td><?= $result_pembelian['jumlah']; ?></td>
                                <td><?= $result_pembelian['total_harga']; ?></td>
                                <td>
                                    <?php if ($result_pembelian['id_status'] == 1) { ?>
                                        <div class="text-center p-1 mx-2 bg-warning text-white rounded">Menunggu
                                            Pembayaran</div>
                                    <?php } else if ($result_pembelian['id_status'] == 2) { ?>
                                        <div class="text-center p-1 mx-2 bg-primary text-white rounded">Sedang Diproses</div>
                                    <?php } else if ($result_pembelian['id_status'] == 3) { ?>
                                        <div class="text-center p-1 mx-5 bg-success text-white rounded">Selesai</div>
                                    <?php } else { ?>
                                        <div class="text-center p-1 mx-5 bg-danger text-white rounded">Gagal</div>
                                    <?php } ?>
                                </td>
                            </tr>
                        <?php endwhile; ?>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->


</div>
<!-- End of Main Content -->

<?php include("footer.php"); ?>