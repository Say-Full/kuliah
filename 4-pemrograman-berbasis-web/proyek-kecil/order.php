<?php
session_start();
require("config.php");
include("header.php");

$message = '';

if (isset($_POST["add_to_cart"])) {
    if (isset($_SESSION["shopping_cart"])) {
        $item_array_id = array_column($_SESSION["shopping_cart"], "item_id");
        if (!in_array($_GET["id"], $item_array_id)) {
            $count = count($_SESSION["shopping_cart"]);
            $item_array = array(
                'item_id'            =>    $_GET["id"],
                'item_name'            =>    $_POST["hidden_name"],
                'item_price'        =>    $_POST["hidden_price"],
                'item_quantity'        =>    $_POST["quantity"]
            );
            $_SESSION["shopping_cart"][$count] = $item_array;
            $message = '<div class="alert alert-success alert-dismissible">
	  	                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	  	                Produk Berhasil Ditambahkan
	                    </div>';
        } else {
            echo '<script>alert("Item Already Added")</script>';
        }
    } else {
        $item_array = array(
            'item_id'            =>    $_GET["id"],
            'item_name'            =>    $_POST["hidden_name"],
            'item_price'        =>    $_POST["hidden_price"],
            'item_quantity'        =>    $_POST["quantity"]
        );
        $_SESSION["shopping_cart"][0] = $item_array;
        $message = '<div class="alert alert-success alert-dismissible">
	  	            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
	  	            Produk Berhasil Ditambahkan
	                </div>';
    }
}

if (isset($_GET["action"])) {
    if ($_GET["action"] == "delete") {
        foreach ($_SESSION["shopping_cart"] as $keys => $values) {
            if ($values["item_id"] == $_GET["id"]) {
                unset($_SESSION["shopping_cart"][$keys]);
                $message = '<div class="alert alert-danger alert-dismissible">
		                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
		                    Produk Berhasil Dihapus
	                        </div>';
            }
        }
    }
}

if (isset($_GET["action"])) {
    if ($_GET["action"] == "deleteall") {
        unset($_SESSION["shopping_cart"]);
        $message = '<div class="alert alert-danger alert-dismissible">
		            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
		            Keranjang Belanjang Telah Dibersihkan
	                </div>';
    }
}

?>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <h3 align="center">Order Details</h3>
    <div class="table-responsive">
        <?= $message; ?>
        <div align="right">
            <a href="order?action=deleteall"><b>Clear Cart</b></a>
        </div>
        <table class="table table-bordered">
            <tr class="text-center">
                <th width="40%">Nama</th>
                <th width="10%">Jumlah</th>
                <th width="20%">Harga</th>
                <th width="15%">Total</th>
                <th width="5%">Action</th>
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
                        <td><a href="order?action=delete&id=<?= $values["item_id"]; ?>"><span class="text-danger">Remove</span></a></td>
                    </tr>
                <?php
                    $total_harga = $total_harga + ($values["item_quantity"] * $values["item_price"]);
                    $jumlah += $values["item_quantity"];
                    $deskripsi .= $values['item_name'] . " x " . $values["item_quantity"] . ", ";
                }
                $_SESSION["jumlah"] = $jumlah;
                $_SESSION["total_harga"] = $total_harga;
                $_SESSION["deskripsi"] = $deskripsi;
                ?>
                <tr>
                    <td colspan="3" align="right">Total</td>
                    <td align="right">Rp <?= number_format($total_harga, 0, ",", "."); ?></td>
                    <td></td>
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
            <div class="text-right">
                <button type="button" class="btn btn-success"><a href="checkout" class="text-light">Checkout</a></button>
            </div>
        <?php endif; ?>
    </div>
    <br>



    <h3 align="center">Product Catalog</h3>
    <hr>
    <div class="row d-flex justify-content-center">
        <?php $result = mysqli_query($conn, 'SELECT * FROM barang order by id ASC'); ?>
        <?php while ($barang = mysqli_fetch_assoc($result)) : ?>
            <div class="card m-2 text-center">
                <img class="card-img-top" src="img/order/<?= $barang['image']; ?>" style="max-width: 300px;">
                <div class="card-body" style="color: black;">
                    <h6 class="card-title"><?= $barang['nama']; ?></h6>
                    <?php $harga = number_format($barang['harga'], 0, ",", "."); ?>
                    <p class="mt-2 my-1" style="font-weight: bold;">Rp <?= $harga ?></p>
                    <div class="card-footer px-0">
                        <form method="post" action="order?action=add&id=<?= $barang["id"]; ?>">
                            <input type="text" name="quantity" value="1" class="form-control" />
                            <input type="hidden" name="hidden_name" value="<?php echo $barang["nama"]; ?>" />
                            <input type="hidden" name="hidden_price" value="<?php echo $barang["harga"]; ?>" />
                            <input type="submit" name="add_to_cart" style="margin-top:5px;" class="btn btn-success" value="Add to Cart" />
                        </form>
                    </div>
                </div>
            </div>
        <?php endwhile; ?>
    </div>



</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<?php include("footer.php"); ?>