package com.example.cal1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import  android.content.DialogInterface;
public class MainActivity extends Activity {

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
    private EditText edt1_show;
    private Button btn_sin;
    private Button btn_cos;
    private Button btn_tan;
    private Button btn_genhao;
    private Button btn_left;
    private Button btn_right;
    private Button btn_xx;
    private Button btn_3x;


    // 做一个清空的标记
    boolean flag;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("帮助");
        dialog.setMessage("这是一个活动");
        dialog.show();
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //去掉状态栏
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使屏幕全屏
        // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        edt1_show = (EditText) findViewById(R.id.edt1_show);
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
        // 写单击事件

        // 一次删一个
        backspace_btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
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
            public void onClick(View arg0) {
                edt1_show.setText("");
                flag = false;
            }
        });
        btn_1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String one = edt1_show.getText().toString() + 1;

                edt1_show.setText(one);
            }
        });
        btn_2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String two = edt1_show.getText().toString() + 2;
                edt1_show.setText(two);
            }
        });
        btn_3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String three = edt1_show.getText().toString() + 3;
                edt1_show.setText(three);
            }
        });
        btn_4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String four = edt1_show.getText().toString() + 4;
                edt1_show.setText(four);
            }
        });
        btn_5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String five = edt1_show.getText().toString() + 5;

                edt1_show.setText(five);
            }
        });
        btn_6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String six = edt1_show.getText().toString() + 6;

                edt1_show.setText(six);
            }
        });
        btn_7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String seven = edt1_show.getText().toString() + 7;
                edt1_show.setText(seven);
            }

        });
        btn_8.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String eight = edt1_show.getText().toString() + 8;
                edt1_show.setText(eight);
            }
        });
        btn_9.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String nine = edt1_show.getText().toString() + 9;
                edt1_show.setText(nine);
            }
        });
        btn_0.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String zero = edt1_show.getText().toString() + 0;

                edt1_show.setText(zero);
            }
        });

        btn_jia.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (flag) {
                    fourOperation();
                    String jia = edt1_show.getText().toString();
                    edt1_show.setText(jia.substring(0, jia.length() - 1) + " "
                            + "+" + " ");
                } else {
                    String jia = edt1_show.getText().toString() + " " + "+"
                            + " ";
                    edt1_show.setText(jia);
                    flag = true;
                }

            }
        });
        btn_jian.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (flag) {
                    fourOperation();
                    String jian = edt1_show.getText().toString();
                    edt1_show.setText(jian.substring(0, jian.length() - 1)
                            + " " + "-" + " ");
                } else {
                    String jian = edt1_show.getText().toString() + " " + "-" + " ";
                    edt1_show.setText(jian);
                    flag = true;
                }

            }
        });


        btn_cheng.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (flag) {
                    fourOperation();
                    String xing = edt1_show.getText().toString();
                    edt1_show.setText(xing.substring(0, xing.length() - 1) + " " + "*" + " ");
                } else {
                    String xing = edt1_show.getText().toString() + " " + "*" + " ";
                    edt1_show.setText(xing);
                    flag = true;
                }

            }
        });
        btn_chu.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (flag) {
                    fourOperation();
                    String chu = edt1_show.getText().toString();
                    edt1_show.setText(chu.substring(0, chu.length() - 1) + " "
                            + "/" + " ");
                } else {
                    String chu = edt1_show.getText().toString() + " " + "/"
                            + " ";
                    edt1_show.setText(chu);
                    flag = true;
                }

            }
        });
        btn_dian.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String c = edt1_show.getText().toString() + ".";
                edt1_show.setText(c);
            }
        });
        btn_deng.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                getResult();
            }
        });

        Configuration mConfiguration = this.getResources().getConfiguration();
        int ori = mConfiguration.orientation;
        if (ori == mConfiguration.ORIENTATION_LANDSCAPE) {
            btn_genhao.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    String genhao = edt1_show.getText().toString();
                    double genhao1 = new Double(genhao);
                    double genhao2 = Math.sqrt(genhao1);
                    String genhao3 = String.valueOf(genhao2);
                    edt1_show.setText(genhao3);
                }

            });
            btn_sin.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
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
                public void onClick(View arg0) {
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
                public void onClick(View arg0) {
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
                public void onClick(View arg0) {
                    String xx = edt1_show.getText().toString();
                    double xx1 = new Double(xx);
                    double xx2 = Math.pow(xx1, 2);
                    String xx3 = String.valueOf(xx2);
                    edt1_show.setText(xx3);
                }
            });
            btn_3x.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    String x3 = edt1_show.getText().toString();
                    double x31 = new Double(x3);
                    double x32 = Math.pow(x31, 3);
                    String x33 = String.valueOf(x32);
                    edt1_show.setText(x33);
                }
            });
        }
    }


    // 写等号的方法
    private void getResult() {
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
                    edt1_show.setText(result + "");
                } else {
                    edt1_show.setText(r + "");
                }

            } else {
                edt1_show.setText(result + "");
            }
            // 进行判断是否为一个数时点击等号和为0时的情况
        } else if (!s1.equals("") && s2.equals("")) {

            edt1_show.setText(edt1_show.getText().toString());
        } else if (s1.equals("") && !s2.equals("")) {
            double d2 = Double.parseDouble(s2);
            if (op.equals("+")) {
                result = 0 + d2;
            } else if (op.equals("-")) {
                result = 0 - d2;
            } else if (op.equals("*")) {
                result = 0;
            } else if (op.equals("/")) {
                result = 0;
            }
            if (!s1.contains(".") && !s2.contains(".")) {
                int r = (int) result;
                edt1_show.setText(r + "");
            } else {
                edt1_show.setText(result + "");
            }
        } else {
            edt1_show.setText(" ");
        }
    }

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


}
