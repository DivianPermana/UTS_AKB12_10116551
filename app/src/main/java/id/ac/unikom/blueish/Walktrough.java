package id.ac.unikom.blueish;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
//Divian Ajie Permana
//10116551
//AKB-12
//5 Mei 2019
public class Walktrough extends AppCompatActivity {

    private ViewPager eVpSlide;
    private LinearLayout eLinDots;
    private Button eBtnNext;
    private Button eBtnPrev;
    private int eCurrentPages;
    private TextView[] eDots;
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @SuppressLint("SetTextI18n")
        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            eCurrentPages = i;

            if (i == 0) {
                eBtnNext.setEnabled(true);
                eBtnPrev.setEnabled(false);
                eBtnPrev.setVisibility(View.INVISIBLE);

                eBtnNext.setText("Next");
                eBtnPrev.setText("");
            } else if (i == eDots.length - 1) {
                eBtnNext.setEnabled(true);
                eBtnPrev.setEnabled(true);
                eBtnPrev.setVisibility(View.VISIBLE);

                eBtnNext.setText("Finish");
                eBtnPrev.setText("Back");
            } else {

                eBtnNext.setEnabled(true);
                eBtnPrev.setEnabled(true);
                eBtnPrev.setVisibility(View.VISIBLE);

                eBtnNext.setText("Next");
                eBtnPrev.setText("Back");

            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walktrough);

        eVpSlide = findViewById(R.id.vpSlide);
        eLinDots = findViewById(R.id.dotsLayout);

        SlideAdapter slideAdapter = new SlideAdapter(this);

        eVpSlide.setAdapter(slideAdapter);

        addDotsIndicator(0);
        eVpSlide.addOnPageChangeListener(viewListener);

        //eBtnNext.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        eVpSlide.setCurrentItem(eCurrentPages + 1);
        //    }
       // });

        //eBtnPrev.setOnClickListener(new View.OnClickListener() {

          //  @Override
            //public void onClick(View v) {
             //   eVpSlide.setCurrentItem(eCurrentPages - 1);
            //}
        //});


    }

    public void addDotsIndicator(int position) {
        eDots = new TextView[3];

        for (int i = 0; i < eDots.length; i++) {

            eDots[i] = new TextView(this);
            eDots[i].setText(Html.fromHtml("&#8226;"));
            eDots[i].setTextSize(35);
            eDots[i].setTextColor(getResources().getColor(R.color.Cloud));

            eLinDots.addView(eDots[i]);
        }

        if (eDots.length > 0) {
            eDots[position].setTextColor(getResources().getColor(R.color.LynxWhite));
        }
    }


}
