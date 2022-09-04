package com.eminence.cx.ui;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eminence.cx.Dialog.BottomSheetDialog;
import com.eminence.cx.Dialog.BottomSheetLanguage;
import com.eminence.cx.Dialog.BottomSheetMatchSetting;
import com.eminence.cx.ICC_MAN_Ranking.IccMenRenkingActivity;
import com.eminence.cx.More.ContactUsActivity;
import com.eminence.cx.More.PremiumExchangeActivity;
import com.eminence.cx.Notifications.NotificationMoreActivity;
import com.eminence.cx.R;

import java.io.File;
import java.io.FileOutputStream;

public class MoreFragment extends Fragment {
    TextView icc_Men_Ranking;
    LinearLayout notifications, premiumNext, shareOptions, facebookFlow, instagramFlow, reportAProblem,
            language_show, changeTheme, match_setting;

    public MoreFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        icc_Men_Ranking = view.findViewById(R.id.icc_Men_Ranking);
        notifications = view.findViewById(R.id.notifications);
        premiumNext = view.findViewById(R.id.premiumNext);
        shareOptions = view.findViewById(R.id.shareOptions);
        facebookFlow = view.findViewById(R.id.facebookFlow);
        instagramFlow = view.findViewById(R.id.instagramFlow);
        reportAProblem = view.findViewById(R.id.reportAProblem);
        changeTheme = view.findViewById(R.id.changeTheme);
        language_show = view.findViewById(R.id.language_show);
        match_setting = view.findViewById(R.id.match_setting);


        language_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  showLanguage();
                language();
            }
        });


        changeTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.eminence.cx.Dialog.BottomSheetDialog bottomSheet = new BottomSheetDialog();
                bottomSheet.show(getChildFragmentManager(),
                        "ModalBottomSheet");
            }
        });

        match_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetMatchSetting bottomSheet = new BottomSheetMatchSetting();
                bottomSheet.show(getChildFragmentManager(),
                        "ModalBottomSheet");
            }
        });
        icc_Men_Ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), IccMenRenkingActivity.class);
                startActivity(intent);
            }
        });
        reportAProblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ContactUsActivity.class);
                startActivity(intent);
            }
        });
        premiumNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PremiumExchangeActivity.class);
                startActivity(intent);
            }
        });
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NotificationMoreActivity.class);
                startActivity(intent);
            }
        });
        shareOptions.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("IntentReset")
            @Override
            public void onClick(View v) {

                View content = view.findViewById(R.id.shareOptions);
                content.setDrawingCacheEnabled(true);
                Bitmap bitmap = content.getDrawingCache();
                File root = Environment.getExternalStorageDirectory();
                File cachePath = new File(root.getAbsolutePath() + "/DCIM/Camera/image.jpg");
                try
                {
                    root.createNewFile();
                    FileOutputStream ostream = new FileOutputStream(root);
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, ostream);
                    ostream.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }


                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                Uri phototUri = Uri.parse("/DCIM/Camera/image.jpg");
                shareIntent.setData(phototUri);
                shareIntent.setType("image/*");
                shareIntent.putExtra(Intent.EXTRA_STREAM, phototUri);
                startActivity(Intent.createChooser(shareIntent, "Share Via"));

            }



        });
        facebookFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String facebookId = "https://www.facebook.com/zulfikar.ansari.167/";
                String urlPage = "https://www.facebook.com/zulfikar.ansari.167/";

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(facebookId)));
                }catch (Exception e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                }
            }
        });

        instagramFlow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Performs action on click
                String instagramId = "https://www.instagram.com/CODEWITHBHAI/";
                String urlPage = "https://www.instagram.com/CODEWITHBHAI//";

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(instagramId)));
                }catch (Exception e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(urlPage)));
                }
            }
        });
        return view;
    }

    private void language() {
        BottomSheetLanguage bottomSheetLanguage = new BottomSheetLanguage();
        bottomSheetLanguage.show(getChildFragmentManager(), "");
    }

    private void showLanguage() {
        final Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.language_dialog_show);
        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }

}