package id.ac.unikom.blueish;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
//Divian Ajie Permana
//10116551
//AKB-12
//5 Mei 2019
public class ProfileFragment extends Fragment {

    public ProfileFragment() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, null);

    }

    public void onViewCreated(View view, Bundle savedInstanceState) {

        ImageView ImgFb = view.findViewById(R.id.imgFb);
        ImageView ImgIg = view.findViewById(R.id.imgIg);
        ImageView ImgMp = view.findViewById(R.id.imgMap);

        ImgFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.facebook.com/divian.ajie");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });

        ImgIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.instagram.com/divianajie");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);

            }
        });

        ImgMp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.google.co.id/maps/place/Jl.+Aisyah,+Rancanumpang,+Gedebage,+Kota+Bandung,+Jawa+Barat+40292/@-6.9575262,107.7086876,19z/data=!3m1!4b1!4m5!3m4!1s0x2e68c2fb73fd6055:0x613015a5023c222e!8m2!3d-6.9575232!4d107.7092309");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });

    }

}

