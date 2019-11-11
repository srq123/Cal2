package com.example.cal1;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import java.util.Stack;
public class MainActivity extends Activity{
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_0;
    private Button btn_dian;
    private Button btn_jia;
    private Button btn_jian;
    private Button btn_cheng;
    private Button btn_chu;
    private Button btn_deng;
    private Button backspace_btn1;
    private Button ce_btn2;
    private TextView edt1_show;
    private Button btn_sin;
    private Button btn_cos;
    private Button btn_tan;
    private Button btn_genhao;
    private Button btn_left;
    private Button btn_right;
    private Button btn_xx;
    private Button btn_3x;
    private Button btn_jin2;
    private Button btn_jin8;
    private Button btn_jin10;
    private Button btn_jin16;
    private Button btn_A;
    private Button btn_B;
    private Button btn_C;
    private Button btn_D;
    private Button btn_E;
    private Button btn_F;
    private Button btn_cm;
    private Button btn_m;
    private Button btn_cm3;
    private Button btn_dm3;
    boolean jinzhi2 = false;
    boolean jinzhi8 = false;
    boolean jinzhi10 = false;
    boolean jinzhi16 = false;
    boolean btncm = false;
    boolean btnm = false;
    boolean btncm3 = false;
    boolean btndm3= false;


    // 做一个清空的标记
    boolean flag;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
           getMenuInflater().inflate(R.menu.main,menu);
            return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_normal_1:
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent);
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //去掉状态栏
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使屏幕全屏
         //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        edt1_show = (TextView) findViewById(R.id.edt1_show);
        backspace_btn1 = (Button) findViewById(R.id.backspace_btn1);
        ce_btn2 = (Button) findViewById(R.id.ce_btn2);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_dian = (Button) findViewById(R.id.btn_dian);
        btn_jia = (Button) findViewById(R.id.btn_jia);
        btn_jian = (Button) findViewById(R.id.btn_jian);
        btn_cheng = (Button) findViewById(R.id.btn_cheng);
        btn_chu = (Button) findViewById(R.id.btn_chu);
        btn_deng = (Button) findViewById(R.id.btn_deng);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_tan = (Button) findViewById(R.id.btn_tan);
        btn_genhao = (Button) findViewById(R.id.btn_genhao);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);
        btn_xx = (Button) findViewById(R.id.btn_xx);
        btn_3x = (Button) findViewById(R.id.btn_3x);
        btn_cm = (Button)findViewById(R.id.btn_cm);
        btn_m = (Button)findViewById(R.id.btn_m);
        btn_cm3 = (Button)findViewById(R.id.btn_cm3);
        btn_dm3 = (Button)findViewById(R.id.btn_dm3);
        btn_A = (Button)findViewById(R.id.btn_A);
        btn_B = (Button)findViewById(R.id.btn_B);
        btn_C = (Button)findViewById(R.id.btn_C);
        btn_D = (Button)findViewById(R.id.btn_D);
        btn_E = (Button)findViewById(R.id.btn_E);
        btn_F = (Button)findViewById(R.id.btn_F);
        btn_jin2 = (Button)findViewById(R.id.btn_jin2);
        btn_jin8 = (Button)findViewById(R.id.btn_jin8);
        btn_jin10 = (Button)findViewById(R.id.btn_jin10);
        btn_jin16 = (Button)findViewById(R.id.btn_jin16);
        // 写单击事件

        // 一次删一个
        backspace_btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                if (edt1_show.getText().toString() == null
                        || (edt1_show.getText().toString()).equals("")) {
                    return;
                } else {
                    edt1_show.setText((edt1_show.getText().toString()).substring(0, (edt1_show.getText().toString()).length() - 1));
                }
            }
        });
        // 全部清空
        ce_btn2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                edt1_show.setText("");
                flag = false;
            }
        });
        btn_1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String one = edt1_show.getText().toString() + 1;

                edt1_show.setText(one);
            }
        });
        btn_2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String two = edt1_show.getText().toString() + 2;
                edt1_show.setText(two);
            }
        });
        btn_3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String three = edt1_show.getText().toString() + 3;
                edt1_show.setText(three);
            }
        });
        btn_4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String four = edt1_show.getText().toString() + 4;
                edt1_show.setText(four);
            }
        });
        btn_5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String five = edt1_show.getText().toString() + 5;

                edt1_show.setText(five);
            }
        });
        btn_6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String six = edt1_show.getText().toString() + 6;

                edt1_show.setText(six);
            }
        });
        btn_7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String seven = edt1_show.getText().toString() + 7;
                edt1_show.setText(seven);
            }

        });
        btn_8.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String eight = edt1_show.getText().toString() + 8;
                edt1_show.setText(eight);
            }
        });
        btn_9.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String nine = edt1_show.getText().toString() + 9;
                edt1_show.setText(nine);
            }
        });
        btn_0.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                String zero = edt1_show.getText().toString() + 0;

                edt1_show.setText(zero);
            }
        });


        btn_jia.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                if (flag) {
                    fourOperation();
                    String jia = edt1_show.getText().toString();
                    edt1_show.setText(jia.substring(0, jia.length())  + "+");
                } else {
                    String jia = edt1_show.getText().toString() +  "+";
                    edt1_show.setText(jia);
                    flag = true;
                }

            }
        });
        btn_jian.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    fourOperation();
                    String jian = edt1_show.getText().toString();
                    edt1_show.setText(jian.substring(0, jian.length())  + "-" );
                } else {
                    String jian = edt1_show.getText().toString()  + "-" ;
                    edt1_show.setText(jian);
                    flag = true;
                }
            }
        });

        btn_cheng.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                if (flag) {
                    fourOperation();
                    String xing = edt1_show.getText().toString();
                    edt1_show.setText(xing.substring(0, xing.length())  + "*" );
                } else {
                    String xing = edt1_show.getText().toString()  + "*" ;
                    edt1_show.setText(xing);
                    flag = true;
                }

            }
        });
        btn_chu.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                if (flag) {
                    fourOperation();
                    String chu = edt1_show.getText().toString();
                    edt1_show.setText(chu.substring(0, chu.length())  + "/" );
                } else {
                    String chu = edt1_show.getText().toString() + "/" ;
                    edt1_show.setText(chu);
                    flag = true;
                }

            }
        });
        btn_dian.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                String c = edt1_show.getText().toString() + ".";
                edt1_show.setText(c);
            }
        });
        btn_deng.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
//                getResult();
                Log.e("xxxxxx",edt1_show.getText().toString());
                edt1_show.setText(Count(edt1_show));

            }
        });

        Configuration mConfiguration = this.getResources().getConfiguration();
        int ori = mConfiguration.orientation;
        if (ori == mConfiguration.ORIENTATION_LANDSCAPE) {
            btn_A.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {

                    String A = edt1_show.getText().toString() + "A";
                    edt1_show.setText(A);
                }

            });
            btn_B.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {

                    String B = edt1_show.getText().toString() + "B";
                    edt1_show.setText(B);
                }

            });
            btn_C.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {

                    String C = edt1_show.getText().toString() + "C";
                    edt1_show.setText(C);
                }

            });
            btn_D.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {

                    String D = edt1_show.getText().toString() + "D";
                    edt1_show.setText(D);
                }

            });
            btn_E.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {

                    String E = edt1_show.getText().toString() + "E";
                    edt1_show.setText(E);
                }

            });
            btn_F.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {

                    String F = edt1_show.getText().toString() + "F";
                    edt1_show.setText(F);
                }

            });
            btn_jin2.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View aarg0) {
                    if(jinzhi10){
                        System.out.println(jinzhi10);
                        String result = edt1_show.getText().toString();
                        double result1 = new Double(result);
                        String str = Integer.toBinaryString((int)result1);
                        edt1_show.setText(str);
                        jinzhi10 = false;
                    }
                    else if(jinzhi8){
                        String str = Integer.toBinaryString(Integer.parseInt(edt1_show.getText().toString(), 8));
                        edt1_show.setText(str);
                        jinzhi8 = false;
                    }
                    else if(jinzhi16){
                        String str = Integer.toBinaryString(Integer.parseInt(edt1_show.getText().toString(), 16));
                        edt1_show.setText(str);
                        jinzhi16 = false;
                    }
                    else
                        jinzhi2 = true;

                }
            });

            btn_jin8.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(jinzhi10){
                        String result = edt1_show.getText().toString();
                        double result1 = new Double(result);
                        String str = Integer.toOctalString((int)result1);
                        edt1_show.setText(str);
                        jinzhi10 = false;
                    }
                    else if(jinzhi2){
                        String str = Integer.toOctalString(Integer.parseInt(edt1_show.getText().toString(), 2));
                        edt1_show.setText(str);
                        jinzhi2 = false;
                    }
                    else if(jinzhi16){
                        String str = Integer.toOctalString(Integer.parseInt(edt1_show.getText().toString(), 16));
                        edt1_show.setText(str);
                        jinzhi16 = false;
                    }
                    else
                        jinzhi8 = true;
                }
            });

            btn_jin10.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(jinzhi2){
                        String str = String.valueOf(Integer.parseInt(edt1_show.getText().toString(), 2));
                        edt1_show.setText(str);
                        jinzhi2 = false;

                    }
                    else if(jinzhi16){
                        System.out.println(edt1_show.getText().toString());
                        String str = String.valueOf(Integer.parseInt(edt1_show.getText().toString(), 16));
                        edt1_show.setText(str);
                        jinzhi16 = false;
                    }
                    else if(jinzhi8){
                        String str = String.valueOf(Integer.parseInt(edt1_show.getText().toString(), 8));
                        edt1_show.setText(str);
                        jinzhi8 = false;
                    }
                    else
                        jinzhi10 = true;
                }
            });

            btn_jin16.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(jinzhi10){
                        String result = edt1_show.getText().toString();
                        double result1 = new Double(result);
                        String str = Integer.toHexString((int)result1);
                        edt1_show.setText(str);
                        jinzhi10 = false;
                    }
                    else if(jinzhi2){
                        String str = Integer.toHexString(Integer.parseInt(edt1_show.getText().toString(), 2));
                        edt1_show.setText(str);
                        jinzhi10 = false;
                    }
                    else if(jinzhi8){
                        String str = Integer.toHexString(Integer.parseInt(edt1_show.getText().toString(), 8));
                        edt1_show.setText(str);
                        jinzhi8 = false;
                    }
                    else
                        jinzhi16 = true;
                }
            });
            btn_jia.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (flag) {
                        String jia = edt1_show.getText().toString();
                        edt1_show.setText(jia.substring(0, jia.length())  + "+" );
                    } else {
                        String jia = edt1_show.getText().toString()  + "+" ;
                        edt1_show.setText(jia);
                        flag = true;
                    }

                }
            });
            btn_jian.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (flag) {
                        String jian = edt1_show.getText().toString();
                        edt1_show.setText(jian.substring(0, jian.length() )  + "-" );
                    } else {
                        String jian = edt1_show.getText().toString()  + "-" ;
                        edt1_show.setText(jian);
                        flag = true;
                    }
                }
            });

            btn_cheng.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (flag) {
                        String xing = edt1_show.getText().toString();
                        edt1_show.setText(xing.substring(0, xing.length()) + "*" );
                    } else {
                        String xing = edt1_show.getText().toString()  + "*" ;
                        edt1_show.setText(xing);
                        flag = true;
                    }

                }
            });
            btn_chu.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (flag) {
                        String chu = edt1_show.getText().toString();
                        edt1_show.setText(chu.substring(0, chu.length())  + "/" );
                    } else {
                        String chu = edt1_show.getText().toString()  + "/" ;
                        edt1_show.setText(chu);
                        flag = true;
                    }

                }
            });
            btn_left.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    edt1_show.setText(edt1_show.getText() + "(");
                }
            });
            btn_right.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    edt1_show.setText(edt1_show.getText() + ")");
                }
            });
            btn_genhao.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    String genhao = edt1_show.getText().toString();
                    double genhao1 = new Double(genhao);
                    double genhao2 = Math.sqrt(genhao1);
                    String genhao3 = String.valueOf(genhao2);
                    edt1_show.setText(genhao3);
                }

            });
            btn_sin.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    String sin = edt1_show.getText().toString();
                    double sin1 = new Double(sin);
                    sin1 = Math.toRadians(sin1);
                    double sin2 = Math.sin(sin1);
                    String sin3 = String.valueOf(sin2);
                    edt1_show.setText(sin3);
                }
            });
            btn_cos.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    String cos = edt1_show.getText().toString();
                    double cos1 = new Double(cos);
                    cos1 = Math.toRadians(cos1);
                    double cos2 = Math.cos(cos1);
                    String cos3 = String.valueOf(cos2);
                    edt1_show.setText(cos3);
                }
            });
            btn_tan.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    String tan = edt1_show.getText().toString();
                    double tan1 = new Double(tan);
                    tan1 = Math.toRadians(tan1);
                    double tan2 = Math.tan(tan1);
                    String tan3 = String.valueOf(tan2);
                    edt1_show.setText(tan3);
                }
            });
            btn_xx.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    String xx = edt1_show.getText().toString();
                    double xx1 = new Double(xx);
                    double xx2 = Math.pow(xx1, 2);
                    String xx3 = String.valueOf(xx2);
                    edt1_show.setText(xx3);
                }
            });
            btn_3x.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    String x3 = edt1_show.getText().toString();
                    double x31 = new Double(x3);
                    double x32 = Math.pow(x31, 3);
                    String x33 = String.valueOf(x32);
                    edt1_show.setText(x33);
                }
            });
            btn_cm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (btnm) {
                        String result = edt1_show.getText().toString();
                        double result1 = new Double(result) * 100;
                        edt1_show.setText(String.valueOf(result1) + "cm");
                        btnm = false;
                    } else {
                        btnm = true;
                    }
                }
            });

            btn_m.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(btncm){
                        String result = edt1_show.getText().toString();
                        double result1 = new Double(result)/100;
                        edt1_show.setText(String.valueOf(result1) + "m");
                        btncm = false;
                    }
                    else {
                        btncm = true;
                    }
                }
            });
            btn_cm3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (btndm3) {
                        String result = edt1_show.getText().toString();
                        double result1 = new Double(result) * 1000;
                        edt1_show.setText(String.valueOf(result1) + "  cm3/mL");
                        btndm3 = false;
                    } else {
                        btndm3 = true;
                    }
                }
            });
            btn_dm3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (btncm3) {
                        String result = edt1_show.getText().toString();
                        double result1 = new Double(result) / 1000;
                        edt1_show.setText(String.valueOf(result1) + "  dm3/L");
                        btncm3 = false;
                    } else {
                        btncm3 = true;
                    }
                }
            });
        }
    }


    // 写等号的方法
//    private void getResult() {
//        String deng = edt1_show.getText().toString();
//        // 判断单击等号时编辑框的内容是否为空
//        if (deng == null || deng.equals("")) {
//            return;
//        }
//        if (!deng.contains(" ")) {
//            return;
//        }
//        double result = 0;
//        // 截取加号两边的字符及获得加号
//        String s1 = deng.substring(0, deng.indexOf(" "));// 运算符前面的字符
//        String op = deng.substring(deng.indexOf(" ") + 1, deng.indexOf(" ") + 2);
//        String s2 = deng.substring(deng.indexOf(" ") + 3);
//        // s1和s2不为空的情况下进行判断运算
//        if (!s1.equals("") && !s2.equals("")) {
//            double d1 = Double.parseDouble(s1);
//            double d2 = Double.parseDouble(s2);
//            if (op.equals("+")) {
//                result = d1 + d2;
//            } else if (op.equals("-")) {
//                result = d1 - d2;
//            } else if (op.equals("*")) {
//                result = d1 * d2;
//            } else if (op.equals("/")) {
//                if (d2 == 0) {
//                    result = 0;
//                } else {
//                    result = d1 / d2;
//                }
//            }
//            // 判断s1和s2中是否有小数点
//            if (!s1.contains(".") && !s2.contains(".")) {
//                int r = (int) result;
//                if (op.equals("/")) {
//                    edt1_show.setText(result + "");
//                } else {
//                    edt1_show.setText(r + "");
//                }
//
//            } else {
//                edt1_show.setText(result + "");
//            }
//            // 进行判断是否为一个数时点击等号和为0时的情况
//        } else if (!s1.equals("") && s2.equals("")) {
//
//            edt1_show.setText(edt1_show.getText().toString());
//        } else if (s1.equals("") && !s2.equals("")) {
//            double d2 = Double.parseDouble(s2);
//            if (op.equals("+")) {
//                result = 0 + d2;
//            } else if (op.equals("-")) {
//                result = 0 - d2;
//            } else if (op.equals("*")) {
//                result = 0;
//            } else if (op.equals("/")) {
//                result = 0;
//            }
//            if (!s1.contains(".") && !s2.contains(".")) {
//                int r = (int) result;
//                edt1_show.setText(r + "");
//            } else {
//                edt1_show.setText(result + "");
//            }
//        } else {
//            edt1_show.setText(" ");
//        }
//    }

    // 写一个加减乘除的方法
    private void fourOperation() {
        String deng = edt1_show.getText().toString();
        // 判断单击等号时编辑框的内容是否为空
        if (deng == null || deng.equals("")) {
            return;
        }
        if (!deng.contains(" ")) {
            return;
        }
        double result = 0;
        // 截取加号两边的字符及获得加号
        String s1 = deng.substring(0, deng.indexOf(" "));// 运算符前面的字符
        String op = deng
                .substring(deng.indexOf(" ") + 1, deng.indexOf(" ") + 2);
        String s2 = deng.substring(deng.indexOf(" ") + 3);

        // s1和s2不为空的情况下进行判断运算
        if (!s1.equals("") && !s2.equals("")) {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {
                result = d1 + d2;
            } else if (op.equals("-")) {
                result = d1 - d2;
            } else if (op.equals("*")) {
                result = d1 * d2;
            } else if (op.equals("/")) {
                if (d2 == 0) {
                    result = 0;
                } else {
                    result = d1 / d2;
                }
            }
            // 判断s1和s2中是否有小数点
            if (!s1.contains(".") && !s2.contains(".")) {
                int r = (int) result;
                if (op.equals("/")) {
                    edt1_show.setText(result + " ");
                } else {
                    if (op.equals("+")) {
                        edt1_show.setText(r + " ");
                    } else if (op.equals("-")) {
                        edt1_show.setText(r + " ");
                    } else if (op.equals("*")) {
                        edt1_show.setText(r + " ");
                    } else {
                        edt1_show.setText(r + " ");
                    }
                }

            } else {
                if (op.equals("+")) {
                    edt1_show.setText(result + " ");
                } else if (op.equals("-")) {
                    edt1_show.setText(result + " ");
                } else if (op.equals("*")) {
                    edt1_show.setText(result + " ");
                } else {
                    edt1_show.setText(result + " ");
                }
            }
            // 判断式子子右边是否为空
        } else if (!s1.equals("") && s2.equals("")) {
            if (op.equals("+")) {
                edt1_show.setText(result + " ");
            } else if (op.equals("-")) {
                edt1_show.setText(result + " ");
            } else if (op.equals("*")) {
                edt1_show.setText(result + " ");
            } else {
                edt1_show.setText(result + " ");
            }
        }
    }
    public String Count(TextView textView){
        textView.append("#");
        System.out.println(textView.length());
        String str = textView.getText().toString();
        Stack<String> stack1 = new Stack<String>(); //运算符栈
        Stack<Double> stack2 = new Stack<Double>();// 操作数栈
        Double m = new Double(0);
        stack2.push(m);
        stack1.push("#");
        int i = 0;

        while( str.charAt(i) != '#' || !stack1.peek().equals("#")){
            System.out.println(i);
            if(!isOperate(str.charAt(i))){
                double value1 = 0.0;
                double value2 = 0.0;
                int flag = 1;
                while(str.charAt(i) == '.' || !isOperate(str.charAt(i))) {
                    if (str.charAt(i) == '.') {
                        flag = -1;
                        i++;
                        continue;
                    }
                    else if (flag == 1) {
                        value1 = value1 * 10 + str.charAt(i) - '0';
                        System.out.println(value1);
                    } else {
                        value2 = value2 + Math.pow(10, flag) * (str.charAt(i) - '0');
                        System.out.println(value2);
                        flag--;
                    }
                    i++;
                }
                stack2.push(value1 + value2);
            }
            else{
                System.out.println(i);
                switch (precede(stack1.peek(), str.charAt(i))) {
                    case '<':
                        stack1.push(String.valueOf(str.charAt(i)));
                        i++;
                        break;
                    case '=':
                        stack1.pop();
                        i++;
                        break;
                    case '>':
                        String theta = stack1.pop();
                        double a = stack2.pop();
                        double b = stack2.pop();
                        stack2.push(operate(b, theta, a));
                        System.out.println(operate(b, theta, a));
                        break;
                    default:
                        break;
                }
            }

        }

        double result = stack2.pop();
        return String.format("%.2f", result);
    }
    double operate(double a, String str, double b) {//计算数字栈顶的两个数;
        char c = str.charAt(0);
        switch (c)
        {
            case'+':
                return a + b;

            case'-':
                return a - b;
            case'*':
                return a * b;
            case'/':
                return a / b;
            default:
                break;
        }
        return 0;
    }
    char precede(String str,char s) {//构建运算符优先级数组,并判别两个运算符的优先级
        char[][] list = new char[7][7];
        int[] arr = { 1,1,2,2,3,0,-1 };
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0;j<7;j++)
            {
                if((i == 4 && j == 5) || (i == 6 && j == 6))
                    list[i][j] = '=';
                else
                {
                    if (arr[i] >= arr[j])
                        list[i][j] = '>';
                    else if (arr[i] <= arr[j])
                        list[i][j] = '<';
                }
            }
        }
        for (int i = 0; i < 5; i++)
            list[4][i] = '<';
        for (int i = 0; i < 5; i++)
            list[5][i] = '>';

        //for (int i = 0; i < 7; i++) {
        //	for (int j = 0; j < 7; j++)
        //		cout << list[i][j] << " ";
        //	cout << endl;
        //}//验证运算符优先级的构造是否正确
        String st = String.valueOf(s);
        System.out.println(str);
        System.out.println(st);
        char a = list[getOperateIndex(str)][getOperateIndex(st)];
        System.out.println(a);
        return a;
    }
    public boolean isOperate(char c){//判断字符串是否是运算符
        char a[] = { '+','-','*', '/','(',')', '#'};
        for (int i = 0; i < 7; i++) {
            if (c == a[i]) {
                return true;
            }
        }
        return false;
    }

    int getOperateIndex(String s) {//返回运算符的序号

        char[] a = { '+','-','*', '/','(',')', '#' };
        char c = s.charAt(0);
        for (int i = 0; i < 7; i++) {
            if (c == a[i])
                return i;
        }
        return 100;
    }
}
