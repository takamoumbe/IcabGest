<?php

namespace App\Database\Migrations;

use CodeIgniter\Database\Migration;

class Structure extends Migration
{
    public function up()
    {
        $this->forge->addField([
            'id_struct'          => [
                'type'              => 'INT',
                'auto_increment'    => true,
                'null'              => false
            ],
            'nom_struct'         => [
                'type'              => 'TEXT',
                'null'              => false
            ],
            'numero'             => [
                'type'              => 'INT',
            ],
            'created_at'         => [
                'type'              => 'TIMESTAMP',
                'null'              => true
            ],
            'updated_at'         => [
                'type'              => 'TIMESTAMP',
                'null'              => true
            ],
            'deleted_at'         => [
                'type'              => 'TIMESTAMP',
                'null'              => true
            ],
            'etat_struct'        => [
                'type'              => 'INT',
            ],
            'id_ville'           => [
                'type'              => 'INT',
            ]

        ]); 

        $this->forge->addPrimaryKey('id_struct');
        $this->forge->addForeignKey('id_ville','ville','id_ville');
        $this->forge->createTable('structure');
    }

    public function down()
    {
        $this->forge->dropTable('structure');
    }
}
