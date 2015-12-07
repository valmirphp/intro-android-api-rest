package br.com.gdgfoz.apirest.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.gdgfoz.apirest.R;
import br.com.gdgfoz.apirest.Utils;
import br.com.gdgfoz.apirest.models.Person;

public class PersonShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_show);

        Bundle data = getIntent().getExtras();

        if( data.('id') ){
            requestPerson(1);
        }else{
            populateView( (Person) data.get(Utils.PERSON_KEY) );
        }

    }

    protected Person requestPerson(Integer id)
    {

    }

    protected void populateView(Person person)
    {
        TextView txtNamePerson = (TextView) findViewById(R.id.txt_name_person);
        TextView txtDatePerson = (TextView) findViewById(R.id.txt_date_person);

        txtDatePerson.setText(person.getDataDes());
        txtNamePerson.setText(person.getNome());
    }

}
