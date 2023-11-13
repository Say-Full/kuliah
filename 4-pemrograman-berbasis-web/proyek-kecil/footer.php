<!-- Footer -->
<footer class="footer py-2 border shadow" style="background-color: AliceBlue; border-radius: 25px 25px 0px 0px; box-shadow: 3px 3px 10px red inset;">
    <div class="container">
        <div class="copyright text-center text-light font-weight-bold">
            <span style="color: DeepSkyBlue;">Copyright &copy; AyoBeli <?= date('Y'); ?></span>
        </div>
    </div>
</footer>
<!-- End of Footer -->

</div>
<!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Yakin ingin logout ?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Pilih "logout" untuk mengakhiri sesi</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="<?= $config['base_url'] ?>">Logout</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="<?= $config['base_url'] ?>vendor/jquery/jquery.min.js"></script>
<script src="<?= $config['base_url'] ?>vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="<?= $config['base_url'] ?>vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="<?= $config['base_url'] ?>js/sb-admin-2.min.js"></script>
<!-- Page level plugins -->
<script src="<?= $config['base_url'] ?>vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="<?= $config['base_url'] ?>js/chart-area.js"></script>


</body>

</html>