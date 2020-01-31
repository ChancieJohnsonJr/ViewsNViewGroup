package com.example.viewsandviewgroup

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {


        data class Person(
            var firstName: String,
            var lastName: String,
            var streetAddress: String,
            var city: String,
            var state: String,
            var zip: String
        )

        val person = Person(etFirstName.text.toString(), etLastName.text.toString(), etStreetAddress.text.toString(), etCity.text.toString(), etState.text.toString(), etZip.text.toString())
        firstname.text = person.firstName
        lastname.text = person.lastName
        etstreetaddress.text = person.streetAddress
        etcity.text = person.city
        etstate.text = person.state
        etzip.text = person.zip


    }



}



