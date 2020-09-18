package com.universality.aacalculation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class AACalculation extends AppCompatActivity {

 public int name001out001 = 0;
    public int name001out002 = 0;
    public int name001out003 = 0;
    public int name001out004 = 0;
    public int name002out001 = 0;
    public int name002out002 = 0;
    public int name002out003 = 0;
    public int name002out004 = 0;
    public int name003out001 = 0;
    public int name003out002 = 0;
    public int name003out003 = 0;
    public int name003out004 = 0;
    public int name004out001 = 0;
    public int name004out002 = 0;
    public int name004out003 = 0;
    public int name004out004 = 0;
    public int name005out001 = 0;
    public int name005out002 = 0;
    public int name005out003 = 0;
    public int name005out004 = 0;
    public String Name001;
    public String Name002;
    public String Name003;
    public String Name004;
    public String Name005;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa_calculation);


        //*****************第一个人******************

        //第一个支出
        EditText EditTextName001Out001=(EditText)findViewById(R.id.name001spand001);
        EditTextName001Out001.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第二个支出
        EditText EditTextName001Out002 = (EditText)findViewById(R.id.name001spand002);
        EditTextName001Out002.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第三个支出
        EditText EditTextName001Out003 = (EditText)findViewById(R.id.name001spand003);
        EditTextName001Out003.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第四个支出
        EditText EditTextName001Out004 = (EditText)findViewById(R.id.name001spand004);
        EditTextName001Out004.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //*****************第二个人******************

        //第一个支出
        EditText EditTextName002Out001=(EditText)findViewById(R.id.name002spand001);
        EditTextName002Out001.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第二个支出
        EditText EditTextName002Out002 = (EditText)findViewById(R.id.name002spand002);
        EditTextName002Out002.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第三个支出
        EditText EditTextName002Out003 = (EditText)findViewById(R.id.name002spand003);
        EditTextName002Out003.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第四个支出
        EditText EditTextName002Out004 = (EditText)findViewById(R.id.name002spand004);
        EditTextName002Out004.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //*****************第三个人******************

        //第一个支出
        EditText EditTextName003Out001=(EditText)findViewById(R.id.name003spand001);
        EditTextName003Out001.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第二个支出
        EditText EditTextName003Out002 = (EditText)findViewById(R.id.name003spand002);
        EditTextName003Out002.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第三个支出
        EditText EditTextName003Out003 = (EditText)findViewById(R.id.name003spand003);
        EditTextName003Out003.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第四个支出
        EditText EditTextName003Out004 = (EditText)findViewById(R.id.name003spand004);
        EditTextName003Out004.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //*****************第四个人******************

        //第一个支出
        EditText EditTextName004Out001=(EditText)findViewById(R.id.name004spand001);
        EditTextName004Out001.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第二个支出
        EditText EditTextName004Out002 = (EditText)findViewById(R.id.name004spand002);
        EditTextName004Out002.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第三个支出
        EditText EditTextName004Out003 = (EditText)findViewById(R.id.name004spand003);
        EditTextName004Out003.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第四个支出
        EditText EditTextName004Out004 = (EditText)findViewById(R.id.name004spand004);
        EditTextName004Out004.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //*****************第五个人******************

        //第一个支出
        EditText EditTextName005Out001=(EditText)findViewById(R.id.name005spand001);
        EditTextName005Out001.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第二个支出
        EditText EditTextName005Out002 = (EditText)findViewById(R.id.name005spand002);
        EditTextName005Out002.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第三个支出
        EditText EditTextName005Out003 = (EditText)findViewById(R.id.name005spand003);
        EditTextName005Out003.setInputType(EditorInfo.TYPE_CLASS_PHONE);

        //第四个支出
        EditText EditTextName005Out004 = (EditText)findViewById(R.id.name005spand004);
        EditTextName005Out004.setInputType(EditorInfo.TYPE_CLASS_PHONE);


        //摁扭点击计算
        Button ButtonOut = (Button)findViewById(R.id.ButtonOut);
        ButtonOut.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                //得到数字

                //*******************第一个人******************
                //第一个
                EditText EditTextName001Out001=(EditText)findViewById(R.id.name001spand001);
                String StringName001Out001 = EditTextName001Out001.getText().toString();
                if(StringName001Out001.equals("")){}else{
                    name001out001 = Integer.parseInt(StringName001Out001);
                }

                //第二个
                EditText EditTextName001Out002 = (EditText)findViewById(R.id.name001spand002);
                String StringName001Out002 = EditTextName001Out002.getText().toString();
                if(StringName001Out002.equals("")){}else{
                    name001out002 = Integer.parseInt(StringName001Out002);
                }

                //第三个
                EditText EditTextName001Out003 = (EditText)findViewById(R.id.name001spand003);
                String StringName001Out003 = EditTextName001Out003.getText().toString();
                if(StringName001Out003.equals("")){}else{
                    name001out003 = Integer.parseInt(StringName001Out003);
                }

                //第四个
                EditText EditTextName001Out004 = (EditText)findViewById(R.id.name001spand004);
                String StringName001Out004 = EditTextName001Out004.getText().toString();
                if(StringName001Out004.equals("")){}else{
                    name001out004 = Integer.parseInt(StringName001Out004);
                }

                //*******************第二个人******************
                //第一个
                EditText EditTextName002Out001=(EditText)findViewById(R.id.name002spand001);
                String StringName002Out001 = EditTextName002Out001.getText().toString();
                if(StringName002Out001.equals("")){}else{
                    name002out001 = Integer.parseInt(StringName002Out001);
                }

                //第二个
                EditText EditTextName002Out002=(EditText)findViewById(R.id.name002spand002);
                String StringName002Out002 = EditTextName002Out002.getText().toString();
                if(StringName002Out002.equals("")){}else{
                    name002out002 = Integer.parseInt(StringName002Out002);
                }

                //第三个
                EditText EditTextName002Out003 = (EditText)findViewById(R.id.name002spand003);
                String StringName002Out003 = EditTextName002Out003.getText().toString();
                if(StringName002Out003.equals("")){}else{
                    name002out003 = Integer.parseInt(StringName002Out003);
                }

                //第四个
                EditText EditTextName002Out004 = (EditText)findViewById(R.id.name002spand004);
                String StringName002Out004 = EditTextName002Out004.getText().toString();
                if(StringName002Out004.equals("")){}else{
                    name002out004 = Integer.parseInt(StringName002Out004);
                }


                //*******************第三个人******************
                //第一个
                EditText EditTextName003Out001=(EditText)findViewById(R.id.name003spand001);
                String StringName003Out001 = EditTextName003Out001.getText().toString();
                if(StringName003Out001.equals("")){}else{
                    name003out001 = Integer.parseInt(StringName003Out001);
                }

                //第二个
                EditText EditTextName003Out002 = (EditText)findViewById(R.id.name003spand002);
                String StringName003Out002 = EditTextName003Out002.getText().toString();
                if(StringName003Out002.equals("")){}else{
                    name003out002 = Integer.parseInt(StringName003Out002);
                }

                //第三个
                EditText EditTextName003Out003 = (EditText)findViewById(R.id.name003spand003);
                String StringName003Out003 = EditTextName003Out003.getText().toString();
                if(StringName003Out003.equals("")){}else{
                    name003out003 = Integer.parseInt(StringName003Out003);
                }

                //第四个
                EditText EditTextName003Out004 = (EditText)findViewById(R.id.name003spand004);
                String StringName003Out004 = EditTextName003Out004.getText().toString();
                if(StringName003Out004.equals("")){}else{
                    name003out004 = Integer.parseInt(StringName003Out004);
                }

                //*******************第四个人******************
                //第一个
                EditText EditTextName004Out001=(EditText)findViewById(R.id.name004spand001);
                String StringName004Out001 = EditTextName004Out001.getText().toString();
                if(StringName004Out001.equals("")){}else{
                    name004out001 = Integer.parseInt(StringName004Out001);
                }

                //第二个
                EditText EditTextName004Out002 = (EditText)findViewById(R.id.name004spand002);
                String StringName004Out002 = EditTextName004Out002.getText().toString();
                if(StringName004Out002.equals("")){}else{
                    name004out002 = Integer.parseInt(StringName004Out002);
                }

                //第三个
                EditText EditTextName004Out003 = (EditText)findViewById(R.id.name004spand003);
                String StringName004Out003 = EditTextName004Out003.getText().toString();
                if(StringName004Out003.equals("")){}else{
                    name004out003 = Integer.parseInt(StringName004Out003);
                }

                //第四个
                EditText EditTextName004Out004 = (EditText)findViewById(R.id.name004spand004);
                String StringName004Out004 = EditTextName004Out004.getText().toString();
                if(StringName004Out004.equals("")){}else{
                    name004out004 = Integer.parseInt(StringName004Out004);
                }

                //*******************第五个人******************
                //第一个
                EditText EditTextName005Out001=(EditText)findViewById(R.id.name005spand001);
                String StringName005Out001 = EditTextName005Out001.getText().toString();
                if(StringName005Out001.equals("")){}else{
                    name005out001 = Integer.parseInt(StringName005Out001);
                }

                //第二个
                EditText EditTextName005Out002 = (EditText)findViewById(R.id.name005spand002);
                String StringName005Out002 = EditTextName005Out002.getText().toString();
                if(StringName005Out002.equals("")){}else{
                    name005out002 = Integer.parseInt(StringName005Out002);
                }

                //第三个
                EditText EditTextName005Out003 = (EditText)findViewById(R.id.name005spand003);
                String StringName005Out003 = EditTextName005Out003.getText().toString();
                if(StringName005Out003.equals("")){}else{
                    name005out003 = Integer.parseInt(StringName005Out003);
                }

                //第四个
                EditText EditTextName005Out004 = (EditText)findViewById(R.id.name005spand004);
                String StringName005Out004 = EditTextName005Out004.getText().toString();
                if(StringName005Out004.equals("")){}else{
                    name005out004 = Integer.parseInt(StringName005Out004);
                }



                //****************获取人名***********************
                //第一个人
                EditText EditTextName001 = (EditText)findViewById(R.id.name001);
                Name001 = EditTextName001.getText().toString();

                //第二个人
                EditText EditTextName002 = (EditText)findViewById(R.id.name002);
                Name002 = EditTextName002.getText().toString();

                //第三个人
                EditText EditTextName003 = (EditText)findViewById(R.id.name003);
                Name003 = EditTextName003.getText().toString();

                //第四个人
                EditText EditTextName004 = (EditText)findViewById(R.id.name004);
                Name004 = EditTextName004.getText().toString();

                //第五个人
                EditText EditTextName005 = (EditText)findViewById(R.id.name005);
                Name005 = EditTextName005.getText().toString();

                //************************计算**********************
                int all = name001out001 + name001out002 +name001out003 +name001out004+
                        name002out001 + name002out002 +name002out003 +name002out004+
                        name003out001 +name003out002 +name003out003 +name003out004+
                        name004out001 +name004out002 +name004out003 +name004out004+
                        name005out001 +name005out002 +name005out003 +name005out004 ;

                int Name001out = name001out001 + name001out002 +name001out003 +name001out004;

                int Name002out = name002out001 + name002out002 +name002out003 +name002out004;

                int Name003out = name003out001 +name003out002 +name003out003 +name003out004;

                int Name004out = name004out001 +name004out002 +name004out003 +name004out004;

                int Name005out = name005out001 +name005out002 +name005out003 +name005out004;


                //得到AA人数

                int number = 0 ;
                if (Name001.equals("")){}else{number = number +1 ;}
                if (Name002.equals("")){}else {number = number +1 ; }
                if (Name003.equals("")){}else{number = number +1 ;}
                if (Name004.equals("")){}else{number = number +1 ;}
                if (Name005.equals("")){}else {number = number +1 ;}

                //得到平均应付

                int AccountsPayable = all / number ;



                //得到每个人的±
                int Name001Payable = 0 ;
                int Name002Payable = 0 ;
                int Name003Payable = 0 ;
                int Name004Payable = 0 ;
                int Name005Payable = 0 ;
                //第一个人
                if (number > 0 ) {
                    Name001Payable = Name001out - AccountsPayable;
                    String LogName001Payable = Name001Payable + "";
                    Log.i("第一个人", LogName001Payable);
                }
                //第二个人
                if (number >1) {
                    Name002Payable = Name002out - AccountsPayable;
                    String LogName002Payable = Name002Payable + "";
                    Log.i("第二个人", LogName002Payable);
                }
                //第三个人
                if (number >2 ){
                    Name003Payable = Name003out - AccountsPayable;
                    String LogName003Payable = Name003Payable + "";
                    Log.i("第三个人", LogName003Payable);
                }
                //第四个人
                if (number >3){
                    Name004Payable = Name004out - AccountsPayable;
                    String LogName004Payable = Name004Payable + "";
                    Log.i("第四个人", LogName004Payable);
                }
                //第五个人
                if (number >4){
                    Name005Payable = Name005out - AccountsPayable;
                    String LogName005Payable = Name005Payable + "";
                    Log.i("第五个人", LogName005Payable);
                }

                //******************开始计算互相给钱******************

                //确认谁需要给钱
                boolean Name001Need = true ;
                boolean Name002Need = true ;
                boolean Name003Need = true ;
                boolean Name004Need = true ;
                boolean Name005Need = true ;

                if (number > 0){
                    if (Name001Payable >= 0 ){
                        Name001Need = false ;
                        String log = String.valueOf(Name001Need);
                        Log.i("Name001Need",log);
                    }else {
                        Name001Need = true;
                        String log = String.valueOf(Name001Need);
                        Log.i("Name001Need",log);
                    }
                }

                if (number > 1){
                    if (Name002Payable >= 0 ){
                        Name002Need = false;
                        String log = String.valueOf(Name002Need);
                        Log.i("Name002Need",log);
                    }else {
                        Name002Need = true ;
                        String log = String.valueOf(Name002Need);
                        Log.i("Name002Need",log);
                    }
                }

                if (number > 2){
                    if (Name003Payable >= 0 ){
                        Name003Need = false ;
                        String log = String.valueOf(Name003Need);
                        Log.i("Name003Need",log);
                    }else {
                        Name003Need = true ;
                        String log = String.valueOf(Name003Need);
                        Log.i("Name003Need",log);
                    }
                }

                if (number > 3){
                    if (Name004Payable >= 0 ){
                        Name004Need = false ;
                        String log = String.valueOf(Name004Need);
                        Log.i("Name004Need",log);
                    }else {
                        Name004Need = true ;
                        String log = String.valueOf(Name004Need);
                        Log.i("Name004Need",log);
                    }
                }

                if (number > 4){
                    if (Name005Payable >= 0){
                        Name005Need = false ;
                        String log = String.valueOf(Name005Need);
                        Log.i("Name005Need",log);
                    }else {
                        Name005Need = true ;
                        String log = String.valueOf(Name005Need);
                        Log.i("Name005Need",log);
                    }
                }

                //计算互相给钱
                String StatementOutput = new String();

//                if (Name001Need = false){}else{
//                    if (Name002Need = false){}else{
//                        if (- Name002Payable > Name001Payable){
//                            StatementOutput = StatementOutput + Name002 + "给" + Name001 + Name001Payable + "元" + "，" ;
//                            Name002Payable = Name002Payable + Name001Payable ;
//                        }else{
//                            //第二个人给完了
//                            StatementOutput = StatementOutput + Name002 + "给" + Name001 + -Name002Payable + "元" + "，" ;
//                            Name002Payable = 0 ;
//                            Name001Payable =  Name001Payable + Name002Payable ;
//
//                            //第三个人给
//                            if (Name003Need = false){}else {
//                                if (- Name003Payable > Name001Payable ){
//                                    StatementOutput = StatementOutput + Name003 + "给" + Name001 + Name001Payable + "元" + "，" ;
//                                    Name003Payable = 0 ;
//                                    Name001Payable =  Name001Payable + Name003Payable ;
//                                }else{
//                                    //第三个人给完了
//                                    StatementOutput = StatementOutput + Name003 + "给" + Name001 + -Name003Payable + "元" + "，" ;
//                                    Name003Payable = 0 ;
//                                    Name001Payable =  Name001Payable + Name003Payable ;
//
//                                    //第四个人给
//                                    if (Name004Need = false){}else {
//                                        if (- Name004Payable > Name001Payable){
//                                            StatementOutput = StatementOutput + Name004 + "给" + Name001 + Name001Payable + "元" + "，" ;
//                                            Name004Payable = 0 ;
//                                            Name001Payable =  Name001Payable + Name004Payable ;
//                                        }else {
//                                            //第四个人给完了
//
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//
//                }


                //第一个人
                if (Name001Need == true){
                    Log.i("第一个人给钱步骤","跳过");
                }else {
                    Log.i("第一个人给钱步骤","第二个人给第一个");

                    if (number > 1 ) {
                        if (Name002Need == false) {
                        } else {
                            if (-Name002Payable > Name001Payable) {
                                StatementOutput = StatementOutput + Name002 + "给" + Name001 + Name001Payable + "元" + "，";
                                Name002Payable = Name002Payable + Name001Payable;
                                Log.i("第二个人给第一个人", "第二个人还需要给别人");
                            } else {
                                //第二个人给完了
                                StatementOutput = StatementOutput + Name002 + "给" + Name001 + -Name002Payable + "元" + "，";
                                Name001Payable = Name001Payable + Name002Payable;
                                Name002Payable = 0;
                                Log.i("第二个人给第一个人", "第二个人全给出去了");
                            }
                        }
                    }

                    if (number > 2) {
                        if (Name001Payable > 0) {
                            if (Name003Need == false ) {
                            } else {
                                if (-Name003Payable > Name001Payable) {
                                    StatementOutput = StatementOutput + Name003 + "给" + Name001 + Name001Payable + "元" + "，";
                                    Name003Payable = Name003Payable + Name001Payable;
                                } else {
                                    //第三个人给完了
                                    StatementOutput = StatementOutput + Name003 + "给" + Name001 + -Name003Payable + "元" + "，";
                                    Name001Payable = Name001Payable + Name003Payable;
                                    Name003Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 3) {
                        if (Name001Payable > 0) {
                            if (Name004Need == false) {
                            } else {
                                if (-Name004Payable > Name001Payable) {
                                    StatementOutput = StatementOutput + Name004 + "给" + Name001 + Name001Payable + "元" + "，";
                                    Name004Payable = Name004Payable + Name001Payable;
                                } else {
                                    //第四个人给完了
                                    StatementOutput = StatementOutput + Name004 + "给" + Name001 + -Name004Payable + "元" + "，";
                                    Name001Payable = Name001Payable + Name004Payable;
                                    Name004Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 4) {
                        if (Name001Payable > 0) {
                            if (Name005Need == false) {
                            } else {
                                if (-Name005Payable > Name001Payable) {
                                    StatementOutput = StatementOutput + Name005 + "给" + Name001 + Name001Payable + "元" + "，";
                                    Name005Payable = Name005Payable + Name001Payable;
                                } else {
                                    //第五个人给完了
                                    StatementOutput = StatementOutput + Name005 + "给" + Name001 + -Name005Payable + "元" + "，";
                                    Name005Payable = Name001Payable + Name005Payable;
                                    Name005Payable = 0;
                                }
                            }
                        }
                    }

                }

                //第二个人
                if (Name002Need == true){
                    Log.i("第二个人给钱步骤","跳过");
                }else {
                    Log.i("第二个人给钱步骤","第一个人给第二个");

                    if (number > 1 ) {
                        if (Name001Need == false) {
                        } else {
                            if (-Name001Payable > Name002Payable) {
                                StatementOutput = StatementOutput + Name001 + "给" + Name002 + Name002Payable + "元" + "，";
                                Name001Payable = Name001Payable + Name002Payable;
                            } else {
                                //第一个人给完了
                                StatementOutput = StatementOutput + Name001 + "给" + Name002 + -Name001Payable + "元" + "，";
                                Name002Payable = Name002Payable + Name001Payable;
                                Name001Payable = 0;
                            }
                        }
                    }

                    if (number > 2) {
                        if (Name002Payable > 0) {
                            if (Name003Need == false ) {
                            } else {
                                if (-Name003Payable > Name002Payable) {
                                    StatementOutput = StatementOutput + Name003 + "给" + Name002 + Name002Payable + "元" + "，";
                                    Name003Payable = Name003Payable + Name002Payable;
                                } else {
                                    //第三个人给完了
                                    StatementOutput = StatementOutput + Name003 + "给" + Name002 + -Name003Payable + "元" + "，";
                                    Name002Payable = Name002Payable + Name003Payable;
                                    Name003Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 3) {
                        if (Name002Payable > 0) {
                            if (Name004Need == false) {
                            } else {
                                if (-Name004Payable > Name002Payable) {
                                    StatementOutput = StatementOutput + Name004 + "给" + Name002 + Name002Payable + "元" + "，";
                                    Name004Payable = Name004Payable + Name002Payable;
                                } else {
                                    //第四个人给完了
                                    StatementOutput = StatementOutput + Name004 + "给" + Name002 + -Name004Payable + "元" + "，";
                                    Name002Payable = Name002Payable + Name004Payable;
                                    Name004Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 4) {
                        if (Name002Payable > 0) {
                            if (Name005Need == false) {
                            } else {
                                if (-Name005Payable > Name002Payable) {
                                    StatementOutput = StatementOutput + Name005 + "给" + Name002 + Name002Payable + "元" + "，";
                                    Name005Payable = Name005Payable + Name002Payable;
                                } else {
                                    //第五个人给完了
                                    StatementOutput = StatementOutput + Name005 + "给" + Name002 + -Name005Payable + "元" + "，";
                                    Name005Payable = Name002Payable + Name005Payable;
                                    Name005Payable = 0;
                                }
                            }
                        }
                    }

                }

                //第三个人
                if (Name003Need == true){
                    Log.i("第三个人给钱步骤","跳过");
                }else {
                    Log.i("第三个人给钱步骤","第一个人给第三个");

                    if (number > 1 ) {
                        if (Name001Need == false) {
                        } else {
                            if (-Name001Payable > Name003Payable) {
                                StatementOutput = StatementOutput + Name001 + "给" + Name003 + Name003Payable + "元" + "，";
                                Name001Payable = Name001Payable + Name003Payable;
                            } else {
                                //第一个人给完了
                                StatementOutput = StatementOutput + Name001 + "给" + Name003 + -Name001Payable + "元" + "，";
                                Name003Payable = Name003Payable + Name001Payable;
                                Name001Payable = 0;
                            }
                        }
                    }

                    if (number > 2) {
                        if (Name003Payable > 0) {
                            if (Name002Need == false ) {
                            } else {
                                if (-Name002Payable > Name003Payable) {
                                    StatementOutput = StatementOutput + Name002 + "给" + Name003 + Name003Payable + "元" + "，";
                                    Name002Payable = Name002Payable + Name003Payable;
                                } else {
                                    //第二个人给完了
                                    StatementOutput = StatementOutput + Name002 + "给" + Name003 + -Name002Payable + "元" + "，";
                                    Name003Payable = Name003Payable + Name002Payable;
                                    Name002Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 3) {
                        if (Name003Payable > 0) {
                            if (Name004Need == false) {
                            } else {
                                if (-Name004Payable > Name003Payable) {
                                    StatementOutput = StatementOutput + Name004 + "给" + Name003 + Name003Payable + "元" + "，";
                                    Name004Payable = Name004Payable + Name003Payable;
                                } else {
                                    //第四个人给完了
                                    StatementOutput = StatementOutput + Name004 + "给" + Name003 + -Name004Payable + "元" + "，";
                                    Name003Payable = Name003Payable + Name004Payable;
                                    Name004Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 4) {
                        if (Name003Payable > 0) {
                            if (Name005Need == false) {
                            } else {
                                if (-Name005Payable > Name003Payable) {
                                    StatementOutput = StatementOutput + Name005 + "给" + Name003 + Name003Payable + "元" + "，";
                                    Name005Payable = Name005Payable + Name003Payable;
                                } else {
                                    //第五个人给完了
                                    StatementOutput = StatementOutput + Name005 + "给" + Name003 + -Name005Payable + "元" + "，";
                                    Name005Payable = Name003Payable + Name005Payable;
                                    Name005Payable = 0;
                                }
                            }
                        }
                    }
                }

                //第四个人
                if (Name004Need == true){
                    Log.i("第四个人给钱步骤","跳过");
                }else {
                    Log.i("第四个人给钱步骤","第一个人给第四个");

                    if (number > 1 ) {
                        if (Name001Need == false) {
                        } else {
                            if (-Name001Payable > Name004Payable) {
                                StatementOutput = StatementOutput + Name001 + "给" + Name004 + Name004Payable + "元" + "，";
                                Name001Payable = Name001Payable + Name004Payable;
                            } else {
                                //第一个人给完了
                                StatementOutput = StatementOutput + Name001 + "给" + Name004 + -Name001Payable + "元" + "，";
                                Name004Payable = Name004Payable + Name001Payable;
                                Name001Payable = 0;
                            }
                        }
                    }

                    if (number > 2) {
                        if (Name004Payable > 0) {
                            if (Name002Need == false ) {
                            } else {
                                if (-Name002Payable > Name004Payable) {
                                    StatementOutput = StatementOutput + Name002 + "给" + Name004 + Name004Payable + "元" + "，";
                                    Name002Payable = Name002Payable + Name004Payable;
                                } else {
                                    //第二个人给完了
                                    StatementOutput = StatementOutput + Name002 + "给" + Name004 + -Name002Payable + "元" + "，";
                                    Name004Payable = Name004Payable + Name002Payable;
                                    Name002Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 3) {
                        if (Name004Payable > 0) {
                            if (Name003Need == false) {
                            } else {
                                if (-Name003Payable > Name004Payable) {
                                    StatementOutput = StatementOutput + Name003 + "给" + Name004 + Name004Payable + "元" + "，";
                                    Name003Payable = Name003Payable + Name004Payable;
                                } else {
                                    //第三个人给完了
                                    StatementOutput = StatementOutput + Name003 + "给" + Name004 + -Name003Payable + "元" + "，";
                                    Name004Payable = Name004Payable + Name003Payable;
                                    Name003Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 4) {
                        if (Name004Payable > 0) {
                            if (Name005Need == false) {
                            } else {
                                if (-Name005Payable > Name004Payable) {
                                    StatementOutput = StatementOutput + Name005 + "给" + Name004 + Name004Payable + "元" + "，";
                                    Name005Payable = Name005Payable + Name004Payable;
                                } else {
                                    //第五个人给完了
                                    StatementOutput = StatementOutput + Name005 + "给" + Name004 + -Name005Payable + "元" + "，";
                                    Name004Payable = Name004Payable + Name005Payable;
                                    Name005Payable = 0;
                                }
                            }
                        }
                    }
                }

                //第五个人
                if (Name005Need == true){
                    Log.i("第五个人给钱步骤","跳过");
                }else {
                    Log.i("第五个人给钱步骤","第一个人给第五个");

                    if (number > 1 ) {
                        if (Name001Need == false) {
                        } else {
                            if (-Name001Payable > Name005Payable) {
                                StatementOutput = StatementOutput + Name001 + "给" + Name005 + Name005Payable + "元" + "，";
                                Name001Payable = Name001Payable + Name005Payable;
                            } else {
                                //第一个人给完了
                                StatementOutput = StatementOutput + Name001 + "给" + Name005 + -Name001Payable + "元" + "，";
                                Name005Payable = Name005Payable + Name001Payable;
                                Name001Payable = 0;
                            }
                        }
                    }

                    if (number > 2) {
                        if (Name005Payable > 0) {
                            if (Name002Need == false ) {
                            } else {
                                if (-Name002Payable > Name005Payable) {
                                    StatementOutput = StatementOutput + Name002 + "给" + Name005 + Name005Payable + "元" + "，";
                                    Name002Payable = Name002Payable + Name005Payable;
                                } else {
                                    //第二个人给完了
                                    StatementOutput = StatementOutput + Name002 + "给" + Name005 + -Name002Payable + "元" + "，";
                                    Name005Payable = Name005Payable + Name002Payable;
                                    Name002Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 3) {
                        if (Name005Payable > 0) {
                            if (Name003Need == false) {
                            } else {
                                if (-Name003Payable > Name005Payable) {
                                    StatementOutput = StatementOutput + Name003 + "给" + Name005 + Name005Payable + "元" + "，";
                                    Name003Payable = Name003Payable + Name005Payable;
                                } else {
                                    //第三个人给完了
                                    StatementOutput = StatementOutput + Name003 + "给" + Name005 + -Name003Payable + "元" + "，";
                                    Name005Payable = Name005Payable + Name003Payable;
                                    Name003Payable = 0;
                                }
                            }
                        }
                    }

                    if (number > 4) {
                        if (Name005Payable > 0) {
                            if (Name004Need == false) {
                            } else {
                                if (-Name004Payable > Name005Payable) {
                                    StatementOutput = StatementOutput + Name004 + "给" + Name005 + Name004Payable + "元" + "，";
                                    Name005Payable = Name004Payable + Name005Payable;
                                } else {
                                    //第四个人给完了
                                    StatementOutput = StatementOutput + Name004 + "给" + Name005 + -Name004Payable + "元" + "，";
                                    Name005Payable = Name005Payable + Name004Payable;
                                    Name004Payable = 0;
                                }
                            }
                        }
                    }
                }









                //输出结果
                TextView out =(TextView)findViewById(R.id.AACalculationOut);
                String StringOut = StatementOutput;
                out.setText(StringOut);

                if (StringOut.equals("")){
                    out.setText("不需要互相给钱。");
                }

            }
        });

        //************************重新编辑摁扭***********************
        Button ButtonAgain = (Button)findViewById(R.id.ButtonAgain);
        ButtonAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent() ;
                intent.setClass(AACalculation.this , AACalculation.class);
                startActivity(intent);
            }
        });







    }
}
