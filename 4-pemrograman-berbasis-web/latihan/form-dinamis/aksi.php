<?php

// print_r($_POST); // untuk debugging, aktifkan console.log(response) di ajax di file index.html
/**
 * 
 * Mengirimkan 1 item:
 * Array
 * (
 *     [product_name] => Array
 *         (
 *             [0] => item1
 *         )
 * 
 *     [product_price] => Array
 *         (
 *             [0] => 99
 *         )
 * 
 *     [product_quantity] => Array
 *         (
 *             [0] => 2
 *         )
 * 
 * )
 * Berhasil menambahkan item
 * 
 * 
 * Mengirimkan 2 item:
 * Array
 * (
 *     [product_name] => Array
 *         (
 *             [0] => item2
 *             [1] => item1
 *         )
 * 
 *     [product_price] => Array
 *         (
 *             [0] => 10
 *             [1] => 99
 *         )
 * 
 *     [product_quantity] => Array
 *         (
 *             [0] => 5
 *             [1] => 2
 *         )
 * 
 * )
 * Berhasil menambahkan item

 * $_POST['product_name'], $_POST['product_price'], $_POST['product_quantity'] disesuaikan dengan name di tag input
 * 
 */

$conn = new PDO('mysql:host=localhost;dbname=dynamic_item', 'root', '');

// Trace (jejaki) salah satu dari $_POST['product_name'], $_POST['product_price'], $_POST['product_quantity']
foreach($_POST['product_name'] as $key => $value) {
    /**
     * 
     * "nama", "harga", dan "jumlah" disesuaikan dengan field tabel items di database dynamic_item
     * ":nama, :harga, :jumlah" adalah metode binding yang isi datanya akan diproses di bagian $stmt->execute()
     * 
     */
    $sql = "INSERT INTO items(nama, harga, jumlah) VALUES (:nama, :harga, :jumlah)";
    
    $stmt = $conn->prepare($sql);
    $stmt->execute([
        'nama' => $value, // $value = $_POST['product_name'][$key] = item1, item2
        'harga' => $_POST['product_price'][$key], // = 10, 99
        'jumlah' => $_POST['product_quantity'][$key] // = 5, 2
    ]);
}

echo 'Berhasil menambahkan item';
