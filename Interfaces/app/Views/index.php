<!DOCTYPE html>
<html lang="en" class="body-full-height">
    <head>        
        <!-- META SECTION -->
        <title>ICAB - GEST</title>            
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        
        <link rel="icon" href="<?= base_url() ?>/favicon.ico" type="image/x-icon" />
        <!-- END META SECTION -->
        
        <!-- CSS INCLUDE -->        
        <link rel="stylesheet" type="text/css" id="theme" href="<?= base_url() ?>/css/theme-default.css"/>
        <!-- EOF CSS INCLUDE -->                                    
    </head>
    <body>
        
        <div class="login-container">
        
            <div class="login-box animated fadeInDown">
                <div class="login-logo"></div>
                <div class="login-body">
                    <div class="login-title"><label id="title"></label>  </div>
                    <form action="<?= base_url() ?>Dashboard" class="form-horizontal" method="post">
                    <div class="form-group">
                        <div class="col-md-12">
                            <input type="text" id="login" class="form-control" placeholder="Login"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-12">
                            <input type="password" id="pass" class="form-control" placeholder="Mot de Passe"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-6">
                            <a href="#" class="btn btn-link btn-block" id="forget-pass"></a>
                        </div>
                        <div class="col-md-6">
                            <button type="submit" class="btn btn-info btn-block" id="btn-log"></button>
                        </div>
                    </div>
                    </form>
                </div>
                <div class="login-footer">
                    <div class="pull-left">
                        <p id="footer"></p>
                    </div>
                    <div class="pull-right">
                        <a href="#" id="langue"></a> |
                        <a href="#" id="propos"> </a> |
                        <a href="#" id="contact"></a>  
                        
                    </div>
                </div>
            </div>

        </div>
        
        <script type="text/javascript" src="<?= base_url() ?>/js/login.js"></script>
        
    </body>
</html>






