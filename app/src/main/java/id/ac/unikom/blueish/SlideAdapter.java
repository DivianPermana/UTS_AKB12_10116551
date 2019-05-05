package id.ac.unikom.blueish;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
//Divian Ajie Permana
//10116551
//AKB-12
//5 Mei 2019
public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_background = {

            R.drawable.splashbg,
            R.drawable.walkbg2,
            R.drawable.walkbg3

    };

    public String[] slide_headings = {

            "1",
            "2",
            "3"

    };

    public String[] slide_desc = {

            "Hi!\\nWelcome To My Application",
            "This App can Play Music",
            "Let's Get Started"

    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView eSlideBg = (ImageView) view.findViewById(R.id.walkImg);
        TextView eTextPage = (TextView) view.findViewById(R.id.walkPage);
        TextView eTextDesc = (TextView) view.findViewById(R.id.walkDesc);

        eSlideBg.setImageResource(slide_background[position]);
        eTextPage.setText(slide_headings[position]);
        eTextDesc.setText(slide_desc[position]);

        container.addView(view);

        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
