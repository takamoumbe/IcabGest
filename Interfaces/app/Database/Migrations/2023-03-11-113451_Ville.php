<?php

namespace App\Database\Migrations;

use CodeIgniter\Database\Migration;

class Ville extends Migration
{
    public function up()
    {
        $this->forge->addField([
            'id_ville'          => [
                'type'              => 'INT',
                'auto_increment'    => true,
                'null'              => false
            ],
            'nom_ville'         => [
                'type'              => 'TEXT',
                'null'              => false
            ],
            'created_at'        => [
                'type'              => 'TIMESTAMP',
                'null'              => true
            ],
            'updated_at'        => [
                'type'              => 'TIMESTAMP',
                'null'              => true
            ],
            'deleted_at'        => [
                'type'              => 'TIMESTAMP',
                'null'              => true
            ],
            'etat_ville'        => [
                'type'              => 'INT',
            ]

        ]); 

        $this->forge->addPrimaryKey('id_ville');
        $this->forge->createTable('ville');
    }

    public function down()
    {
        $this->forge->dropTable('ville');
    }
}
