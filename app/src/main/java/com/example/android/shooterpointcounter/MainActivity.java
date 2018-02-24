package com.example.android.shooterpointcounter;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    int PierwszaFirst = 0;
    int DrugaFirst = 0;

    int PierwszaSecond = 0;
    int DrugaSecond = 0;

    int NumberOfGames1 = 1;
    int NumberOfGames2 = 1;

    TextView changegun1;
    TextView changegun2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void ChangeGun1(View view) {
        NumberOfGames1 = NumberOfGames1 + 1;
    }

    public void displayForChangeGun1(int score1) {
        changegun1 = (TextView) findViewById(R.id.changegun1);
        changegun1.setText(String.valueOf(score1));
    }

    public void ChangeGun2(View view) {
        NumberOfGames2 = NumberOfGames2 + 1;
    }

    public void displayForChangeGun2(int score2) {
        changegun2 = (TextView) findViewById(R.id.changegun2);
        changegun2.setText(String.valueOf(score2));
    }


    public void TenPointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 10;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 10;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void NinePointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 9;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 9;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void EightPointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 8;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 8;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void SevenPointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 7;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 7;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void SixPointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 6;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 6;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void FivePointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 5;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 5;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void FourPointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 4;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 4;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void ThreePointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 3;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 3;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void TwoPointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 2;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 2;
            displayForDrugaFirst(DrugaFirst);
        }
    }

    public void OnePointsForFirst(View view) {
        if (NumberOfGames1 == 1) {
            PierwszaFirst = PierwszaFirst + 1;
            displayForPierwszaFirst(PierwszaFirst);
        }
        if (NumberOfGames1 == 2) {
            DrugaFirst = DrugaFirst + 1;
            displayForDrugaFirst(DrugaFirst);
        }
    }



    public void TenPointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 10;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 10;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void NinePointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 9;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 9;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void EightPointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 8;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 8;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void SevenPointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 7;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 7;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void SixPointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 6;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 6;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void FivePointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 5;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 5;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void FourPointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 4;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 4;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void ThreePointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 3;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 3;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void TwoPointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 2;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 2;
            displayForDrugaSecond(DrugaSecond);
        }
    }

    public void OnePointsForSecond(View view) {
        if (NumberOfGames2 == 1) {
            PierwszaSecond = PierwszaSecond + 1;
            displayForPierwszaSecond(PierwszaSecond);
        }
        if (NumberOfGames2 == 2) {
            DrugaSecond = DrugaSecond + 1;
            displayForDrugaSecond(DrugaSecond);
        }
    }


    public void reset(View v) {
        PierwszaFirst = 0;
        DrugaFirst = 0;

        PierwszaSecond = 0;
        DrugaSecond = 0;

        NumberOfGames1 = 1;
        NumberOfGames2 = 1;

        displayForPierwszaFirst(PierwszaFirst);
        displayForDrugaFirst(DrugaFirst);
        displayForPierwszaSecond(PierwszaSecond);
        displayForDrugaSecond(DrugaSecond);
    }

    private void displayForPierwszaFirst(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PierwszaFirst);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForDrugaFirst(int score) {
        TextView scoreView = (TextView) findViewById(R.id.DrugaFirst);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForPierwszaSecond(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PierwszaSecond);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForDrugaSecond(int score) {
        TextView scoreView = (TextView) findViewById(R.id.DrugaSecond);
        scoreView.setText(String.valueOf(score));
    }
}

