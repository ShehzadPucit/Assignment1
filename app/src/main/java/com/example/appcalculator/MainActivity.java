package com.example.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btDot,btAdd,btMin,btMul,btDiv,btClear,btEqual;
    EditText e1;
    float result1, result2;
    Boolean Addition,Minus,Multi,Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt5=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);
        bt0=(Button)findViewById(R.id.bt0);
        btAdd=(Button)findViewById(R.id.btAdd);
        btMin=(Button)findViewById(R.id.btMin);
        btMul=(Button)findViewById(R.id.btMul);
        btDiv=(Button)findViewById(R.id.btDiv);
        btEqual=(Button)findViewById(R.id.btEqual);
        btDot=(Button)findViewById(R.id.btDot);
        btClear=(Button)findViewById(R.id.btClear);
        e1=(EditText)findViewById(R.id.e1);
        bt1.setOnClickListner(new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            e1.setText(e1.getText()+"1");
        }
        });

        bt2.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"2");
            }
        });

        bt3.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"3");
            }
        });
        bt4.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"4");
            }
        });
        bt5.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"5");
            }
        });
        bt6.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"6");
            }
        });
        bt7.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"7");
            }
        });
        bt8.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"8");
            }
        });
        bt9.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"9");
            }
        });
        bt0.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+"0");
            }
        });
        btDot.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText(e1.getText()+".");
            }
        });

        btAddition.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(e1==null)
                {
                    e1.setText(" 0");

                }
                else
                {
                    result1=Float.parseFloat(e1.getText()+" ");
                    Addition=true;
                    e1.setText(null);
                }

            }
        });

        btMin.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(e1==null)
                {
                    e1.setText(" 0");

                }

                /*r*/
                else
                {
                    result1=Float.parseFloat(e1.getText()+" ");
                    Minus=true;
                    e1.setText(null);
                }

            }
        });

        btMul.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(e1==null)
                {
                    e1.setText(" 0");

                }
                else
                {
                    result1=Float.parseFloat(e1.getText()+" ");
                    Multi=true;
                    e1.setText(null);
                }

            }
        });
        btDiv.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(e1==null)
                {
                    e1.setText(" 0");

                }
                else
                {
                    result1=Float.parseFloat(e1.getText()+" ");
                    Division=true;
                    e1.setText(null);
                }

            }
        });

        btDiv.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                result2=Float.parseFloat(e1.getText()+ " ");
                if(Addition==true)
                {
                    e1.setText(result1+result2+"");
                    Addition=false;
                }
                if(Minus==true)
                {
                    e1.setText(result1-result2+"");
                    Minus=false;
                }
                if(Multi==true)
                {
                    e1.setText(result1*result2+"");
                    Multi=false;
                }
                if(Division==true)
                {
                    e1.setText(result1/result2+"");
                    Division=false;
                }

            }
        });

        btClear.setOnClickListner(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                e1.setText("");

            }
        });
    }
}