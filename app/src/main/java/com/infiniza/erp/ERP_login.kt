package com.infiniza.erp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_erp_login.*

class ERP_login : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_erp_login)

        login.setOnClickListener (this)   }


    override fun onClick(v: View?) {
//            val item_id= v!!.id
        when(v!!.id){
            R.id.login -> {Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            val intent= Intent(this, Dashboard::class.java)
            startActivity(intent)  }
        }

    }
}
