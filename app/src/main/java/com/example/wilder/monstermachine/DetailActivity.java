package com.example.wilder.monstermachine;;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class DetailActivity extends AppCompatActivity {

    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        // Hide action bar
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        // Get id from MainActivity
        int monsterId ;

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            monsterId = bundle.getInt("monsterId");
        }else{monsterId=0;}

        // Define all the dynamic data
        // images
        ImageView evol0 = (ImageView) findViewById(R.id.evolution_0);
        ImageView evol1 = (ImageView) findViewById(R.id.evolution_1);
        ImageView evol2 = (ImageView) findViewById(R.id.evolution_2);
        ImageView evol3 = (ImageView) findViewById(R.id.evolution_3);
        ImageView elmt1 = (ImageView) findViewById(R.id.element_1);
        ImageView elmt2 = (ImageView) findViewById(R.id.element_2);
        ImageView skill = (ImageView) findViewById(R.id.skill);


        // Monster Name
        TextView nomMonstre = (TextView) findViewById(R.id.Nom_monstre);


        // Set values

        if(monsterId==0){
            evol0.setImageResource(R.drawable.sealion_0);
            evol1.setImageResource(R.drawable.sealion_1);
            evol2.setImageResource(R.drawable.sealion_2);
            evol3.setImageResource(R.drawable.sealion_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_sealion);
            nomMonstre.setText("Sealion");

        }else if(monsterId==1){
            evol0.setImageResource(R.drawable.chocobunny_0);
            evol1.setImageResource(R.drawable.chocobunny_1);
            evol2.setImageResource(R.drawable.chocobunny_2);
            evol3.setImageResource(R.drawable.chocobunny_3);
            elmt1.setImageResource(R.drawable.bte_dark);
            elmt2.setImageResource(R.drawable.bte_magic);
            skill.setImageResource(R.drawable.skill_chocobunny);
            nomMonstre.setText("Choco Bunny");

        }else if(monsterId==2){
            evol0.setImageResource(R.drawable.panda_claus_0);
            evol1.setImageResource(R.drawable.panda_claus_1);
            evol2.setImageResource(R.drawable.panda_claus_2);
            evol3.setImageResource(R.drawable.panda_claus_3);
            elmt1.setImageResource(R.drawable.bte_magic);
            elmt2.setImageResource(R.drawable.bte_legend);
            skill.setImageResource(R.drawable.skill_panda_claus);
            nomMonstre.setText("Panda Claus");

        }else if(monsterId==3){
            evol0.setImageResource(R.drawable.metaselach_0);
            evol1.setImageResource(R.drawable.metaselach_1);
            evol2.setImageResource(R.drawable.metaselach_2);
            evol3.setImageResource(R.drawable.metaselach_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_metaselash);
            nomMonstre.setText("Metaselash");

        }else if(monsterId==4){
            evol0.setImageResource(R.drawable.mechamancer_0);
            evol1.setImageResource(R.drawable.mechamancer_1);
            evol2.setImageResource(R.drawable.mechamancer_2);
            evol3.setImageResource(R.drawable.mechamancer_3);
            elmt1.setImageResource(R.drawable.bte_metal);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_mechamancer);
            nomMonstre.setText("Mechamancer");

        }else if(monsterId==5){
            evol0.setImageResource(R.drawable.komocat_0);
            evol1.setImageResource(R.drawable.komocat_1);
            evol2.setImageResource(R.drawable.komocat_2);
            evol3.setImageResource(R.drawable.komocat_3);
            elmt1.setImageResource(R.drawable.bte_water);
            elmt2.setImageResource(R.drawable.bte_nature);
            skill.setImageResource(R.drawable.skill_komocat);
            nomMonstre.setText("Komocat");

        }else if(monsterId==6){
            evol0.setImageResource(R.drawable.fenix_0);
            evol1.setImageResource(R.drawable.fenix_1);
            evol2.setImageResource(R.drawable.fenix_2);
            evol3.setImageResource(R.drawable.fenix_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_fenix);
            nomMonstre.setText("Fenix");

        }else if(monsterId==7){
            evol0.setImageResource(R.drawable.thunder_eagle_0);
            evol1.setImageResource(R.drawable.thunder_eagle_1);
            evol2.setImageResource(R.drawable.thunder_eagle_2);
            evol3.setImageResource(R.drawable.thunder_eagle_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_magic);
            skill.setImageResource(R.drawable.skill_thunder_eagle);
            nomMonstre.setText("Thunder Eagle");

        }else if(monsterId==8){
            evol0.setImageResource(R.drawable.pegasus_0);
            evol1.setImageResource(R.drawable.pegasus_1);
            evol2.setImageResource(R.drawable.pegasus_2);
            evol3.setImageResource(R.drawable.pegasus_3);
            elmt1.setImageResource(R.drawable.bte_nature);
            elmt2.setImageResource(R.drawable.bte_light);
            skill.setImageResource(R.drawable.skill_pegasus);
            nomMonstre.setText("Pegasus");

        }else if(monsterId==9){
            evol0.setImageResource(R.drawable.obsidia_0);
            evol1.setImageResource(R.drawable.obsidia_1);
            evol2.setImageResource(R.drawable.obsidia_2);
            evol3.setImageResource(R.drawable.obsidia_3);
            elmt1.setImageResource(R.drawable.bte_earth);
            elmt2.setImageResource(R.drawable.bte_dark);
            skill.setImageResource(R.drawable.skill_obsidia);
            nomMonstre.setText("Obsidia");

        }else{}

        // Flipper
        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);
        fade_in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();

    }
}