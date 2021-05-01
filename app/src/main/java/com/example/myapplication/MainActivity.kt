package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.View
import android.widget.*
import androidx.core.widget.doAfterTextChanged
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    private lateinit var enterName: EditText
    private lateinit var buyButton: Button
    private lateinit var AutoCompleteTextView: AutoCompleteTextView
    private lateinit var enterCard: TextView
    //private lateinit var enterCard: AutoCompleteTextView
    private lateinit var enterCardNumber: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val textView = findViewById(R.id.entercard) as AutoCompleteTextView
        //val cards: Array<out String> = resources.getStringArray(R.array.cards_array)
       // ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cards).also { adapter ->
           //textView.setAdapter(adapter)

            fun EditText.setMaxLength(maxLength: Int){
                filters = arrayOf<InputFilter>(InputFilter.LengthFilter(maxLength))
            }

        enterName = findViewById(R.id.entername)
        buyButton = findViewById(R.id.buynow)
        //mySpinner = findViewById(R.id.spinner)

        buyButton.setOnClickListener {
            val name: String = enterName.text.toString()
            //val type: String = spinner.toString()
            //val cardnumber: String = enterCardNumber.text.toString()


            if (name.isBlank()) {
                return@setOnClickListener (toast("გთხოვთ შეიყვანოთ სახელი და გვარი"))
            }
            else
                toast("გადახდა წარმატებით შესრულდა")


            // if (type == "Visa") {
            // enterCardNumber.setMaxLength(16)
            //}

            //enterCardNumber.doAfterTextChanged {
            //val content = it?.length.toString()
            //if (content.length <=16){
            //return@doAfterTextChanged (toast("ბარათი არის Visa"))



        }



            val spinner: Spinner = findViewById(R.id.spinner)
            ArrayAdapter.createFromResource(
                    this,
                    R.array.cards_array,
                    android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinner.adapter = adapter
                //spinner.onItemSelectedListener = object :
                      //  AdapterView.OnItemSelectedListener{
                   // override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                        }


                   // override fun onNothingSelected(parent: AdapterView<*>?) {

                   // }




           }








        }


