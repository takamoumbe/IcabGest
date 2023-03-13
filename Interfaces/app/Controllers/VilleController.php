<?php

namespace App\Controllers;

use CodeIgniter\RESTful\ResourcePresenter;
use CodeIgniter\API\ResponseTrait;
use App\Models\VilleModel;


class VilleController extends ResourcePresenter
{
    use ResponseTrait;

    #@-- 1 --> insertion des villes
    #- use: 
    #-
    public function ajoutVille()
    {
        $VilleModel = new VilleModel();

        // validation des champs
         $rules = [
            'nom'             => [
                'rules'             => 'required|min_length[4]|max_length[255]'
            ]
        ];  

        if ($this->validate($rules)) {
            // validation est bien passer
            $nom = $this->request->getVar('nom_ville');

            $data = [
                'nom_ville'     => $nom,
                'etat_ville'    => 0,
                'created_at'    => $date("Y-m-d H:m:s"),
                'updated_at'    => $date("Y-m-d H:m:s"),
            ];
            // ici ont envoie les donnees aux model pour inserer
            $verdic =  $VilleModel->insererVille($data);

            if ($verdic) {
                // insertion oui
                $response = [
                    'success' => true,
                    'status'  => 200,
                    'msg'     => "Insertion Réussir",
                ];
                return $this->respond($response);
            }else{
                // insertion non
                $response = [
                    'success' => false,
                    'status'  => 500,
                    'msg'     => "Echec Insertion",
                ];
                return $this->respond($response);
            }

        }else{
            // validation est mal passer
            $response = [
                'success' => false,
                'status'  => 500,
                'msg'     => "Champs Invalides",
                'error'   => $this->validator->getErrors()
            ];
            return $this->respond($response);
        }

    }
}

