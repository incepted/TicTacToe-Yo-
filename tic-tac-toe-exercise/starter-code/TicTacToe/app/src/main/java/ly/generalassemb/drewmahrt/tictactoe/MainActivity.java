package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText playerOneEdit, playerTwoEdit;
    Button gameStartButton;
    TextView previousWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerOneEdit = (EditText)findViewById(R.id.player_one_name);
        playerTwoEdit = (EditText)findViewById(R.id.player_two_name);
        gameStartButton = (Button)findViewById(R.id.start_game_button);
        previousWinner = (TextView)findViewById(R.id.last_winner_text);

        gameStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerOne = playerOneEdit.getText().toString();
                String playerTwo = playerTwoEdit.getText().toString();

                if(playerOne.isEmpty()){
                    playerOneEdit.setError("Please enter a name");
                }
                if(playerTwo.isEmpty()){
                    playerTwoEdit.setError("Please enter a name");
                }else {
                    Intent intent = new Intent(MainActivity.this, GameActivity.class);
                    intent.putExtra("PLAYER_ONE_NAME", playerOne);
                    intent.putExtra("PLAYER_TWO_NAME", playerTwo);
                    startActivityForResult(intent, 0);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPref = getSharedPreferences("SHAREDPREF", Context.MODE_PRIVATE);
        if(sharedPref.getString("WINNER", "DEFAULT") != null) {
            String previouseWinner = sharedPref.getString("WINNER", "DEFAULT");
            previousWinner.setText("Previous winner : " + previouseWinner);
        }
    }
}
