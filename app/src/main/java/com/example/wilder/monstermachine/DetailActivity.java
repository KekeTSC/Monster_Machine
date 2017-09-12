package com.example.wilder.monstermachine;;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
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

        /* Get id from MainActivity **************************************/
        int monsterId ;

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            monsterId = bundle.getInt("monsterId");
        }else{monsterId=0;}

        final int nextMonsterId = (monsterId+1)%10;
        final int previousMonsterId;
        if(monsterId==0){
            previousMonsterId = 9;
        }else{
            previousMonsterId = monsterId-1;
        }


        /* Define all the dynamic data **************************************/
        // images
        ImageView evol0 = (ImageView) findViewById(R.id.evolution_0);
        ImageView evol1 = (ImageView) findViewById(R.id.evolution_1);
        ImageView evol2 = (ImageView) findViewById(R.id.evolution_2);
        ImageView evol3 = (ImageView) findViewById(R.id.evolution_3);
        ImageView elmt1 = (ImageView) findViewById(R.id.element_1);
        ImageView elmt2 = (ImageView) findViewById(R.id.element_2);
        ImageView skill = (ImageView) findViewById(R.id.skill);

        // Monster Name
        final TextView nomMonstre = (TextView) findViewById(R.id.Nom_monstre);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/UnZialish.ttf");
        nomMonstre.setTypeface(tf);

        // Set values
        TextView health = (TextView) findViewById(R.id.value_health);
        TextView force = (TextView) findViewById(R.id.value_force);
        TextView stamina = (TextView) findViewById(R.id.value_sta);
        TextView speed = (TextView) findViewById(R.id.value_speed);

        /* Assign values to each case **************************************/
        if(monsterId==0){
            evol0.setImageResource(R.drawable.sealion_0);
            evol1.setImageResource(R.drawable.sealion_1);
            evol2.setImageResource(R.drawable.sealion_2);
            evol3.setImageResource(R.drawable.sealion_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_sealion);
            nomMonstre.setText("Sealion");
            health.setText("225 - 1736");
            force.setText("50 - 6028");
            stamina.setText("200 - 1540");
            speed.setText("110");

        }else if(monsterId==1){
            evol0.setImageResource(R.drawable.chocobunny_0);
            evol1.setImageResource(R.drawable.chocobunny_1);
            evol2.setImageResource(R.drawable.chocobunny_2);
            evol3.setImageResource(R.drawable.chocobunny_3);
            elmt1.setImageResource(R.drawable.bte_dark);
            elmt2.setImageResource(R.drawable.bte_magic);
            skill.setImageResource(R.drawable.skill_chocobunny);
            nomMonstre.setText("ChocoBunny");
            health.setText("204 - 2650");
            force.setText("54 - 17122");
            stamina.setText("225 - 2930");
            speed.setText("130");

        }else if(monsterId==2){
            evol0.setImageResource(R.drawable.panda_claus_0);
            evol1.setImageResource(R.drawable.panda_claus_1);
            evol2.setImageResource(R.drawable.panda_claus_2);
            evol3.setImageResource(R.drawable.panda_claus_3);
            elmt1.setImageResource(R.drawable.bte_magic);
            elmt2.setImageResource(R.drawable.bte_legend);
            skill.setImageResource(R.drawable.skill_panda_claus);
            nomMonstre.setText("Panda Claus");
            health.setText("160 - 2464");
            force.setText("75 - 31667");
            stamina.setText("230 - 3542");
            speed.setText("140");

        }else if(monsterId==3){
            evol0.setImageResource(R.drawable.metaselach_0);
            evol1.setImageResource(R.drawable.metaselach_1);
            evol2.setImageResource(R.drawable.metaselach_2);
            evol3.setImageResource(R.drawable.metaselach_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_metaselash);
            nomMonstre.setText("Metaselash");
            health.setText("226 - 2303");
            force.setText("51 - 10391");
            stamina.setText("223 - 2278");
            speed.setText("120");

        }else if(monsterId==4){
            evol0.setImageResource(R.drawable.mechamancer_0);
            evol1.setImageResource(R.drawable.mechamancer_1);
            evol2.setImageResource(R.drawable.mechamancer_2);
            evol3.setImageResource(R.drawable.mechamancer_3);
            elmt1.setImageResource(R.drawable.bte_metal);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_mechamancer);
            nomMonstre.setText("Mechamancer");
            health.setText("216 - 3322");
            force.setText("55 - 23223");
            stamina.setText("224 - 3454");
            speed.setText("140");

        }else if(monsterId==5){
            evol0.setImageResource(R.drawable.komocat_0);
            evol1.setImageResource(R.drawable.komocat_1);
            evol2.setImageResource(R.drawable.komocat_2);
            evol3.setImageResource(R.drawable.komocat_3);
            elmt1.setImageResource(R.drawable.bte_water);
            elmt2.setImageResource(R.drawable.bte_nature);
            skill.setImageResource(R.drawable.skill_komocat);
            nomMonstre.setText("Komocat");
            health.setText("190 - 1938");
            force.setText("56 - 11413");
            stamina.setText("210 - 2142");
            speed.setText("120");

        }else if(monsterId==6){
            evol0.setImageResource(R.drawable.fenix_0);
            evol1.setImageResource(R.drawable.fenix_1);
            evol2.setImageResource(R.drawable.fenix_2);
            evol3.setImageResource(R.drawable.fenix_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_water);
            skill.setImageResource(R.drawable.skill_fenix);
            nomMonstre.setText("Fenix");
            health.setText("190 - 2470");
            force.setText("55 - 17611");
            stamina.setText("200 - 2600");
            speed.setText("130");

        }else if(monsterId==7){
            evol0.setImageResource(R.drawable.thunder_eagle_0);
            evol1.setImageResource(R.drawable.thunder_eagle_1);
            evol2.setImageResource(R.drawable.thunder_eagle_2);
            evol3.setImageResource(R.drawable.thunder_eagle_3);
            elmt1.setImageResource(R.drawable.bte_fire);
            elmt2.setImageResource(R.drawable.bte_magic);
            skill.setImageResource(R.drawable.skill_thunder_eagle);
            nomMonstre.setText("Thunder Eagle");
            health.setText("175 - 875");
            force.setText("50 - 2480");
            stamina.setText("250 - 1250");
            speed.setText("100");

        }else if(monsterId==8){
            evol0.setImageResource(R.drawable.pegasus_0);
            evol1.setImageResource(R.drawable.pegasus_1);
            evol2.setImageResource(R.drawable.pegasus_2);
            evol3.setImageResource(R.drawable.pegasus_3);
            elmt1.setImageResource(R.drawable.bte_nature);
            elmt2.setImageResource(R.drawable.bte_light);
            skill.setImageResource(R.drawable.skill_pegasus);
            nomMonstre.setText("Pegasus");
            health.setText("200 - 2600");
            force.setText("56 - 17855");
            stamina.setText("200 - 2600");
            speed.setText("130");

        }else if(monsterId==9){
            evol0.setImageResource(R.drawable.obsidia_0);
            evol1.setImageResource(R.drawable.obsidia_1);
            evol2.setImageResource(R.drawable.obsidia_2);
            evol3.setImageResource(R.drawable.obsidia_3);
            elmt1.setImageResource(R.drawable.bte_earth);
            elmt2.setImageResource(R.drawable.bte_dark);
            skill.setImageResource(R.drawable.skill_obsidia);
            nomMonstre.setText("Obsidia");
            health.setText("200 - 1540");
            force.setText("56 - 6795");
            stamina.setText("200 - 1540");
            speed.setText("110");

        }else{}


        /* Buttons **************************************/

        // Bouton Previous
        Button btnPrevious = (Button) findViewById(R.id.btnPrevious);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", previousMonsterId);
                startActivity(intent);
            }
        });
        // Bouton Next
        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", nextMonsterId);
                startActivity(intent);
            }
        });

        // Bouton Home
        ImageButton btnHome = (ImageButton) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this,   MainActivity.class);
                startActivity(intent);
            }
        });

        // Bouton Wiki
        ImageButton btnWiki = (ImageButton) findViewById(R.id.btnWiki);
        btnWiki.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent wikiIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.monster-wiki.com/monster/"+nomMonstre.getText()));
                startActivity(wikiIntent);
            }
        });

        /* Flipper **************************************/
        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);
        fade_in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();
    }
}