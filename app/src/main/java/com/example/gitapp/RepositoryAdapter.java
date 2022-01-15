package com.example.gitapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RepositoryAdapter extends ArrayAdapter<Repository> {

    public RepositoryAdapter(@NonNull Context context){
        super(context,0);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if(view==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.repositiry_items,parent,false);
        }
        TextView repoName=view.findViewById(R.id.repoName);
        TextView repoLang=view.findViewById(R.id.repoLang);
        TextView repoowner=view.findViewById(R.id.repoOwner);
        TextView repoStars=view.findViewById(R.id.repoStars);

        Repository currentRepository=getItem(position);
        repoName.setText(currentRepository.getName());
        repoLang.setText(currentRepository.getLanguage());
        repoowner.setText(currentRepository.getOwner());
        repoStars.setText(currentRepository.getStarsCount());

        Animation animation= AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
        view.startAnimation(animation);
        return view;


    }
}
