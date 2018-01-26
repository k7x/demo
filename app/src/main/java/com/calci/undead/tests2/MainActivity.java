package com.calci.undead.tests2;

import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ans, delete, equalt, decimal, clear, per, sqrt;
    Button ln, log, seven, eight, nine, four, five, one, two, three, six, zero;
    Button pow, plus, minus, mul, div;
    String text = "";
    TextView tv1, tv2;
    String answer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);

        tv2 = (TextView) findViewById(R.id.tv2);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);

        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        clear = (Button) findViewById(R.id.clear);
        pow = (Button) findViewById(R.id.pow);
        sqrt = (Button) findViewById(R.id.sqrt);
        per = (Button) findViewById(R.id.per);
        ln = (Button) findViewById(R.id.ln);
        div = (Button) findViewById(R.id.div);
        log = (Button) findViewById(R.id.log);
        minus = (Button) findViewById(R.id.minus);
        ans = (Button) findViewById(R.id.answ);
        plus = (Button) findViewById(R.id.plus);
        delete = (Button) findViewById(R.id.delete);
        decimal = (Button) findViewById(R.id.decimal);
        equalt = (Button) findViewById(R.id.equalto);
        mul = (Button) findViewById(R.id.mul);

        View.OnClickListener myListener0 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "0";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        zero.setOnClickListener(myListener0);
        View.OnClickListener myListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "1";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        one.setOnClickListener(myListener1);
        View.OnClickListener myListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "2";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        two.setOnClickListener(myListener2);
        View.OnClickListener myListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "3";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        three.setOnClickListener(myListener3);
        View.OnClickListener myListener4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "4";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }

        };
        four.setOnClickListener(myListener4);
        View.OnClickListener myListenereq = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resti;
                try {
                    resti = expression(text);
                    answer=resti;
                    tv1.setText(resti);
                } catch (Exception e) {
                }
                ;

                tv1.setTextSize(41.0f);

            }
        };
        equalt.setOnClickListener(myListenereq);

        View.OnClickListener myListenerans = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text=text+answer;
                tv2.setText(text);
                tv1.setTextSize(41.0f);
                tv2.setTextSize(41.0f);

            }
        };
        ans.setOnClickListener(myListenerans);
        four.setOnClickListener(myListener4);
        View.OnClickListener myListener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "5";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        five.setOnClickListener(myListener5);
        View.OnClickListener myListener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "6";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        six.setOnClickListener(myListener6);
        View.OnClickListener myListener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "7";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        seven.setOnClickListener(myListener7);
        View.OnClickListener myListener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "8";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        eight.setOnClickListener(myListener8);
        View.OnClickListener myListener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = text + "9";
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        nine.setOnClickListener(myListener9);

        View.OnClickListener myListenerX = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (Character.isDigit(text.charAt(text.length() - 1)) || text.charAt(text.length() - 1) == ')') {
                        text = text + "x";
                    }
                    if (text.charAt(text.length() - 1) == '+' || text.charAt(text.length() - 1) == '-' || text.charAt(text.length() - 1) == '/' || text.charAt(text.length() - 1) == '%' || text.charAt(text.length() - 1) == '^') {
                        text = text.substring(0, text.length() - 1) + "x";
                    }
                } catch (Exception e) {
                }
                tv2.setTextSize(41.0f);
                tv2.setText(text);

            }
        };
        mul.setOnClickListener(myListenerX);

        View.OnClickListener myListenerP = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (Character.isDigit(text.charAt(text.length() - 1)) || text.charAt(text.length() - 1) == ')') {
                        text = text + "+";
                    }
                    if (text.charAt(text.length() - 1) == 'x' || text.charAt(text.length() - 1) == '-' || text.charAt(text.length() - 1) == '/' || text.charAt(text.length() - 1) == '%' || text.charAt(text.length() - 1) == '^') {
                        text = text.substring(0, text.length() - 1) + "+";
                    }
                } catch (Exception e) {
                }
                tv2.setTextSize(41.0f);
                tv2.setText(text);

            }
        };
        plus.setOnClickListener(myListenerP);
        View.OnClickListener myListenerD = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (Character.isDigit(text.charAt(text.length() - 1)) || text.charAt(text.length() - 1) == ')') {
                        text = text + "/";
                    }
                    if (text.charAt(text.length() - 1) == 'x' || text.charAt(text.length() - 1) == '-' || text.charAt(text.length() - 1) == '+' || text.charAt(text.length() - 1) == '%' || text.charAt(text.length() - 1) == '^') {
                        text = text.substring(0, text.length() - 1) + "/";
                    }
                } catch (Exception e) {
                }
                tv2.setTextSize(41.0f);
                tv2.setText(text);

            }
        };
        div.setOnClickListener(myListenerD);
        View.OnClickListener myListenerM = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (Character.isDigit(text.charAt(text.length() - 1)) || text.charAt(text.length() - 1) == ')') {
                        text = text + "-";
                    }
                    if (text.charAt(text.length() - 1) == 'x' || text.charAt(text.length() - 1) == '+' || text.charAt(text.length() - 1) == '/' || text.charAt(text.length() - 1) == '%' || text.charAt(text.length() - 1) == '^') {
                        text = text.substring(0, text.length() - 1) + "-";
                    }
                } catch (Exception e) {
                }
                tv2.setTextSize(41.0f);
                tv2.setText(text);

            }
        };
        minus.setOnClickListener(myListenerM);
        View.OnClickListener myListenerln = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.length() == 0) {
                    text = text + "ln";
                } else {
                    char chh = text.charAt(text.length() - 1);
                    if (chh == 'x' || chh == '/' || chh == '-' || chh == '+' || chh == 'g' || chh == 'n' || chh == '√') {
                        text = text + "ln";
                    }
                }
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        ln.setOnClickListener(myListenerln);
        View.OnClickListener myListenerlog = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text.length() == 0) {
                    text = text + "log";
                } else {
                    char chh = text.charAt(text.length() - 1);
                    if (chh == 'x' || chh == '/' || chh == '-' || chh == '+' || chh == 'g' || chh == 'n' || chh == '√') {
                        text = text + "log";
                    }
                }
                tv2.setText(text);
                tv2.setTextSize(41.0f);

            }
        };
        log.setOnClickListener(myListenerlog);
        View.OnClickListener myListenersq = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.length() == 0) {
                    text = text + "√";
                } else {
                    char chh = text.charAt(text.length() - 1);
                    if (chh == '+' || chh == '-' || chh == 'x' || chh == '/' || chh == '√' || chh == 'g' || chh == 'n' || chh == '^') {
                        text = text + "√";
                    }
                }
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        sqrt.setOnClickListener(myListenersq);
        View.OnClickListener myListenerpo = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    if (Character.isDigit(text.charAt(text.length() - 1))) {
                        text = text + "^";
                    } else if (text.charAt(text.length() - 1) == ')') {
                        text = text + "^";
                    } else if (text.charAt(text.length() - 1) == 'x' || text.charAt(text.length() - 1) == '-' || text.charAt(text.length() - 1) == '+' || text.charAt(text.length() - 1) == '%' || text.charAt(text.length() - 1) == '/') {
                        {
                            text = text.substring(0, text.length() - 1) + "^";
                        }

                    }
                } catch (Exception e) {
                }
                tv2.setTextSize(41.0f);
                tv2.setText(text);
            }
        };
        pow.setOnClickListener(myListenerpo);
        View.OnClickListener myListenerper = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int l = text.length() - 1;
                    if (Character.isDigit(text.charAt(l))) {

                        int s = l;
                        int f;
                        String res = "";
                        while (true) {
                            if (s < 0) {
                                f = 0;
                                break;
                            }
                            char ch = text.charAt(s);
                            if (Character.isDigit(ch) || ch == '.') {
                                res = ch + res;
                            }
                            if (ch == '+' || ch == '-' || ch == '/' || ch == 'x' || ch == '^') {
                                f = s;
                                break;
                            }

                            s--;
                        }
                        if (!(res.equals("0"))) {
                            if (f > 0) {
                                text = text.substring(0, f + 1) + "(-" + res + ")x";
                            } else if (f == 0) {
                                text = text.substring(0, f) + "(-" + res + ")x";
                            }
                        }
                    }
                } catch (Exception e) {
                }
                tv2.setTextSize(41.0f);
                tv2.setText(text);
            }
        };
        per.setOnClickListener(myListenerper);
        View.OnClickListener myListenede = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.length() == 0) {
                    text = "";
                } else {
                    char ch = text.charAt(text.length() - 1);
                    if (Character.isDigit(ch)) {
                        String res = "";
                        int s = text.length() - 1;
                        while ((Character.isDigit(text.charAt(s)) || text.charAt(s) == '.')) {


                            res = res + text.charAt(s);
                            s--;
                            if (s == -1) {
                                break;
                            }
                        }
                        if (res.indexOf('.') < 0) {
                            text = text + ".";
                        }
                    }
                }
                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        decimal.setOnClickListener(myListenede);
        View.OnClickListener myListenerclr = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text = "";
                tv2.setText("");
                tv2.setTextSize(41.0f);
                tv1.setText("");

            }
        };
        clear.setOnClickListener(myListenerclr);
        View.OnClickListener myListenerdel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (text.equals("")) {
                    tv2.setText(text);
                } else if (text.charAt(text.length() - 1) == ')') {
                    int ct;
                    int s = text.length() - 1;
                    while (text.charAt(s) != '(') {
                        s--;
                        ct = s;
                    }
                    text = text.substring(0, s);
                } else if (text.charAt(text.length() - 1) == 'n') {
                    text = text.substring(0, (text.length() - 2));
                } else if (text.charAt(text.length() - 1) == 'g') {
                    text = text.substring(0, (text.length() - 3));
                } else {
                    text = text.substring(0, (text.length() - 1));
                }

                tv2.setText(text);
                tv2.setTextSize(41.0f);


            }
        };
        delete.setOnClickListener(myListenerdel);


    }

    String lnsqlog(String res, int i) {
        String rest = "";
        if (res.charAt(i) == '√') {
            return ((Math.sqrt(Double.parseDouble(lnsqlog(res, i + 1)))) + "");

        } else if (res.charAt(i) == 'l' && res.charAt(i + 1) == 'n') {

            return ((Math.log(Double.parseDouble(lnsqlog(res, i + 2)))) + "");

        } else if (res.charAt(i) == 'l' && res.charAt(i + 1) == 'o') {

            return ((0.43429448190325182765 * (Math.log(Double.parseDouble(lnsqlog(res, i + 3))))) + "");

        }
        String numi = res.substring(i, res.length());
        return (numi);
    }

    String behind(String s, int i) {
        int j;
        String res = "";
        for (j = i - 1; j >= 0; j--) {
            if (j != 0) {
                if (s.charAt(j) == '^' || (s.charAt(j - 1) != '(' && s.charAt(j) == '-') || s.charAt(j) == '+' || s.charAt(j) == '/' || s.charAt(j) == 'x') {
                    break;
                }
                res = s.charAt(j) + res;
            } else {
                {
                    if (s.charAt(j) == '^' || s.charAt(j) == '-' || s.charAt(j) == '+' || s.charAt(j) == '/' || s.charAt(j) == 'x') {
                        break;
                    }
                    res = s.charAt(j) + res;
                }
            }
        }
        if (res.charAt(0) == '(') {
            return (res.substring(1, res.length() - 1));
        }
        ;
        if (res.charAt(0) == '(') {
            return (("" + res.substring(1, res.length() - 1)));
        }
        return (res);
    }

    String ahead(String s, int i) {
        int j;
        String res = "";
        for (j = i + 1; j < s.length(); j++) {
            if (s.charAt(j) == '^' || (s.charAt(j - 1) != '(' && s.charAt(j) == '-') || s.charAt(j) == '+' || s.charAt(j) == '/' || s.charAt(j) == 'x') {
                break;
            }
            res = res + s.charAt(j);
        }
        if (res.charAt(0) == '(') {
            return ("" + (res.substring(1, res.length() - 1)));
        }
        return (res);
    }


    String expression(String text) {
        int i, n;
        char ch;
        i = 0;
        n = 0;
        String res = "", s;
        s = "";
        while (true) {
            res = "";
            while (i < text.length() && !(text.charAt(i) == 'x' || text.charAt(i) == '/' || text.charAt(i) == '-' || text.charAt(i) == '+' || text.charAt(i) == '^'))

            {

                res = res + text.charAt(i);
                i++;
            }

            if (res.indexOf('√') >= 0 || res.indexOf('l') >= 0) {
                res = lnsqlog(res, 0);
                if (res.charAt(0) == '-') {
                    res = "(" + res + ")";
                }


            }
            if (i != text.length()) {
                s = s + res + text.charAt(i);
            } else {
                s = s + res;
            }
            i++;
            if (i >= text.length()) {
                break;
            }
        }
        i = 0;
        String s3, s1, s2, s4;
        while (s.indexOf('^') >= 0 && (i < s.length())) {
            if (s.charAt(i) == '^') {
                s1 = ahead(s, i);
                s2 = behind(s, i);
                s3 = (Math.pow(Double.parseDouble(s2), Double.parseDouble(s1))) + "";
                int k1 = s1.length();
                int k2 = s2.length();
                if(s3.charAt(0)=='-'){s3="("+s3+")";}
                if (s.charAt(i - 1) == ')') {
                    k2 += 2;
                }
                if (s.charAt(i + 1) == '(') {
                    k1 += 2;
                }
                s = s.substring(0, (i - k2)) + s3 + s.substring(i + 1 + k1);


            }
            i++;
        }
        i = 0;
        while (s.indexOf('/') >= 0 && (i < s.length())) {
            if (s.charAt(i) == '/') {
                s1 = ahead(s, i);
                s2 = behind(s, i);
                s3 = Double.parseDouble(s2) / Double.parseDouble(s1) + "";
                int k1 = s1.length();
                int k2 = s2.length();
                if(s3.charAt(0)=='-'){s3="("+s3+")";}
                if (s.charAt(i - 1) == ')') {
                    k2 += 2;
                }
                if (s.charAt(i + 1) == '(') {
                    k1 += 2;
                }
                s = s.substring(0, (i - k2)) + s3 + s.substring(i + 1 + k1);


            }
            i++;
        }

        i = 0;
        while (s.indexOf('x') >= 0 && (i < s.length())) {
            if (s.charAt(i) == 'x') {
                s1 = ahead(s, i);
                s2 = behind(s, i);

                s3 = Double.parseDouble(s2) * Double.parseDouble(s1) + "";
                int k1 = s1.length();
                int k2 = s2.length();
                if(s3.charAt(0)=='-'){s3="("+s3+")";}
                if (s.charAt(i - 1) == ')') {
                    k2 += 2;
                }
                if (s.charAt(i + 1) == '(') {
                    k1 += 2;
                }
                s = s.substring(0, (i - k2)) + s3 + s.substring(i + 1 + k1);
            }

            i++;
        }

        i = 0;
        s = s.replace("(", "");
        s = s.replace(")", "");
        if (s.indexOf("--") >= 0) {
            s = s.replace("--", "+");
        }
        if (s.indexOf("+-") >= 0) {
            s = s.replace("+-", "-");
        }
        if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        i = 1;
        int pi = 0;
        if (s.charAt(0) != '-') {
            s = " " + s;
        }
        String ress = "";
        double sum = 0.0;
        while (i < s.length()) {

            if (i == s.length() - 1)

            {
                if (s.charAt(pi) == '-') {
                    ress = s.substring(pi, i + 1);

                    sum = sum + Double.parseDouble(ress);

                } else {
                    ress = s.substring(pi + 1, i + 1);
                    System.out.println(res);
                    sum = sum + Double.parseDouble(ress);

                }
            }
            if (s.charAt(i) == '-' &&s.charAt(i-1)!='E'|| s.charAt(i) == '+') {
                if (s.charAt(pi) == '-') {
                    ress = s.substring(pi, i);
                    pi = i;
                    sum = sum + Double.parseDouble(ress);

                } else {
                    ress = s.substring(pi + 1, i);
                    pi = i;
                    sum = sum + Double.parseDouble(ress);

                }
            }

            i++;
        }


        return sum + "";

    }
}