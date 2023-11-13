<?php
session_start();
require "config.php";
include "header.php";


?>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h3 align="center">Check Out</h3>
    <div class="table-responsive">
        <table class="table table-bordered">
            <tr class="text-center">
                <th width="40%">Nama</th>
                <th width="10%">Jumlah</th>
                <th width="20%">Harga</th>
                <th width="15%">Total</th>
            </tr>
            <?php
            if (!empty($_SESSION["shopping_cart"])) {
                $total_harga = 0;
                foreach ($_SESSION["shopping_cart"] as $keys => $values) {
            ?>
                    <tr>
                        <td><?= $values["item_name"]; ?></td>
                        <td align="center"><?= $values["item_quantity"]; ?></td>
                        <td align="right">Rp <?= number_format($values["item_price"], 0, ",", "."); ?></td>
                        <td align="right">Rp <?= number_format($values["item_quantity"] * $values["item_price"], 0, ",", "."); ?></td>
                    </tr>
                <?php
                    $total_harga = $total_harga + ($values["item_quantity"] * $values["item_price"]);
                }
                ?>
                <tr>
                    <td colspan="3" align="right">Total</td>
                    <td align="right">Rp <?= number_format($total_harga, 0, ",", "."); ?></td>
                </tr>
            <?php
            } else {
                echo '
            <tr>
                <td colspan="5" align="center">No Item in Cart</td>
            </tr>
            ';
            }
            ?>
        </table>

        <?php if (!empty($_SESSION["shopping_cart"])) : ?>
            <form action="pembayaran" method="post">
                <div class="mx-5">
                    <label for="alamat">Alamat :</label><br>
                    <input class="form-control" type="text" name="alamat" id="alamat" placeholder="Masukkan Alamat" required><br>
                </div>
                <div class="text-right">
                    <input type="submit" class="btn btn-success" name="pembayaran" value="Pembayaran">
                </div>
            </form>
        <?php endif; ?>
    </div>
    <br>
</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->


<?php include "footer.php"; ?>