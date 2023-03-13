<?php

namespace App\Models;

use CodeIgniter\Model;

class VilleModel extends Model
{
    protected $DBGroup          = 'default';
    protected $table            = 'ville';
    protected $primaryKey       = 'id_ville';
    protected $useAutoIncrement = true;
    protected $insertID         = 0;
    protected $returnType       = 'array';
    protected $useSoftDeletes   = false;
    protected $protectFields    = true;
    protected $allowedFields    = [
        'id_ville',
        'nom_ville',
        'etat_ville',
        'created_at',
        'updated_at',
        'deleted_at'
    ];

    // Dates
    protected $useTimestamps = true;
    protected $dateFormat    = 'datetime';
    protected $createdField  = 'created_at';
    protected $updatedField  = 'updated_at';
    protected $deletedField  = 'deleted_at';

    // Validation
    protected $validationRules      = [];
    protected $validationMessages   = [];
    protected $skipValidation       = false;
    protected $cleanValidationRules = true;

    // Callbacks
    protected $allowCallbacks = true;
    protected $beforeInsert   = [];
    protected $afterInsert    = [];
    protected $beforeUpdate   = [];
    protected $afterUpdate    = [];
    protected $beforeFind     = [];
    protected $afterFind      = [];
    protected $beforeDelete   = [];
    protected $afterDelete    = [];

    #@-- 1 --> insertion des villes
    #- use: 
    #-
    function insererVille($data){

        $builder = $this->bd->table('ville');

        $verdic = $builder->insert($data);

        return $verdic;
    }
}
