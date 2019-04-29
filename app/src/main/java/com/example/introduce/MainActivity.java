package com.example.introduce;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<CharSequence> yearSrc;
    ArrayAdapter<CharSequence> monthSrc;
    ArrayAdapter<CharSequence> daySrc;
    TextView hobbyResult;
    TextView nameResult;
    TextView ageResult;
    int selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1=(EditText)findViewById(R.id.editName);
        final EditText editText2=(EditText)findViewById(R.id.editAge);

        Button button = (Button)findViewById(R.id.bt_submit);
        final TextView textView1=(TextView)findViewById(R.id.txt_result_name);
        final TextView textView2=(TextView)findViewById(R.id.txt_result_age);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView1.setText(editText1.getText());
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textView2.setText(editText2.getText());
            }
        });

    }
}

/*  취미
        final Button bth = (Button) findViewById(R.id.bt_hobby);
        bth.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                hobbyResult = (TextView) findViewById(R.id.txt_result);

                final String[] versionArray = new String[]{"영화", "음악", "게임"};
                final boolean[] checkArray = new boolean[]{false, false, false};
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("취미를 선택해주세요.");
                dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        Toast.makeText(MainActivity.this, versionArray[which] + "선택", Toast.LENGTH_SHORT).show();
                        selectedItem = which;
                    }
                });
                dlg.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        hobbyResult.setText("취미는" +  versionArray[selectedItem] + "입니다.");
                    }
            });
                dlg.show();
            }
        });
*/
/*

//생년월일
        //객체화
        Spinner yearspiner = (Spinner) findViewById(R.id.spinner_year);
        yearSrc = ArrayAdapter.createFromResource(this, R.array.date_year, android.R.layout.simple_spinner_item);
        yearSrc.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        Spinner monthspiner = (Spinner) findViewById(R.id.spinner_month);
        monthSrc = ArrayAdapter.createFromResource(this, R.array.date_month, android.R.layout.simple_list_item_single_choice);
        monthSrc.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        Spinner daypiner = (Spinner) findViewById(R.id.spinner_day);
        daySrc = ArrayAdapter.createFromResource(this, R.array.date_day, android.R.layout.simple_list_item_single_choice);
        daySrc.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);



        //스피너객체->목록리소스 연결
        yearspiner.setAdapter(yearSrc);
        monthspiner.setAdapter(monthSrc);
        daypiner.setAdapter(daySrc);


        //년
        yearspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, yearSrc.getItem(position)+"선택!!",
                        Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?>parent) {
            }
        });

        //월
        monthspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, monthSrc.getItem(position)+"선택!!",
                        Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?>parent) {
            }
        });

        //일
        daypiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, daySrc.getItem(position)+"선택!!",
                        Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?>parent) {
            }
        });




    }

}
*/