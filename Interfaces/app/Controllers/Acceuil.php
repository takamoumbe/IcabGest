<?php

namespace App\Controllers;

class Acceuil extends BaseController
{
    public function index()
    {
        return view('pages/acceuil');
    }
}
