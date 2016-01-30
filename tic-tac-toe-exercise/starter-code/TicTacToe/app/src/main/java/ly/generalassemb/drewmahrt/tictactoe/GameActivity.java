package ly.generalassemb.drewmahrt.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    String winner = "Received";
    TextView gameMsgText, board1, board2, board3,board4,board5,board6,board7,board8,board9;
    String currentPlayer, playerOneName, playerTwoName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Intent receivedIntent = getIntent();
        playerOneName = receivedIntent.getStringExtra("PLAYER_ONE_NAME");
        playerTwoName = receivedIntent.getStringExtra("PLAYER_TWO_NAME");
        String[] playerNames = new String[]{playerOneName,playerTwoName};
        currentPlayer = playerOneName;

        gameMsgText = (TextView)findViewById(R.id.game_message_text);
        gameMsgText.setText(playerOneName+"'s turn!");

        board1 = (TextView)findViewById(R.id.textView);
        board2 = (TextView)findViewById(R.id.textView2);
        board3 = (TextView)findViewById(R.id.textView3);
        board4 = (TextView)findViewById(R.id.textView4);
        board5 = (TextView)findViewById(R.id.textView5);
        board6 = (TextView)findViewById(R.id.textView6);
        board7 = (TextView)findViewById(R.id.textView7);
        board8 = (TextView)findViewById(R.id.textView8);
        board9 = (TextView)findViewById(R.id.textView9);

        board1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board1.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board1.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board2.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board2.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board3.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board3.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board4.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board4.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board5.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board5.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board6.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board6.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board7.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board7.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board8.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board8.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
        board9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPlayer.equals(playerOneName)){
                    board9.setText("X");
                    currentPlayer = playerTwoName;
                }else{
                    board9.setText("O");
                    currentPlayer = playerOneName;
                }
                gameMsgText.setText(currentPlayer+"'s turn!");
                checktTheWinner();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPref = getSharedPreferences("SHAREDPREF", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("WINNER", winner);
        editor.commit();

    }


    public void checktTheWinner(){

        String boardOneText = board1.getText().toString();
        String boardTwoText = board2.getText().toString();
        String boardThreeText = board3.getText().toString();
        String boardFourText = board4.getText().toString();
        String boardFiveText = board5.getText().toString();
        String boardSixText = board6.getText().toString();
        String boardSevenText = board7.getText().toString();
        String boardEightText = board8.getText().toString();
        String boardNineText = board9.getText().toString();

        if((boardOneText.equals("X")&&boardTwoText.equals("X")&&boardThreeText.equals("X"))||
                (boardFourText.equals("X")&&boardFiveText.equals("X")&&boardSixText.equals("X")) ||
                (boardSevenText.equals("X")&&boardEightText.equals("X")&&boardNineText.equals("X")) ||
                (boardOneText.equals("X")&&boardFourText.equals("X")&&boardSevenText.equals("X")) ||
                (boardTwoText.equals("X")&&boardFiveText.equals("X")&&boardEightText.equals("X")) ||
                (boardThreeText.equals("X")&&boardSixText.equals("X")&&boardNineText.equals("X")) ||
                (boardOneText.equals("X")&&boardFiveText.equals("X")&&boardNineText.equals("X")) ||
                (boardThreeText.equals("X")&&boardFiveText.equals("X")&&boardSevenText.equals("X"))){
            gameMsgText.setText(playerOneName+" wins!");
            winner = playerOneName;
            disableButtons();
        } else if((boardOneText.equals("O")&&boardTwoText.equals("O")&&boardThreeText.equals("O"))||
                (boardFourText.equals("O")&&boardFiveText.equals("O")&&boardSixText.equals("O"))||
                (boardSevenText.equals("O")&&boardEightText.equals("O")&&boardNineText.equals("O"))||
                (boardOneText.equals("O")&&boardFourText.equals("O")&&boardSevenText.equals("O"))||
                (boardTwoText.equals("O")&&boardFiveText.equals("O")&&boardEightText.equals("O"))||
                (boardThreeText.equals("O")&&boardSixText.equals("O")&&boardNineText.equals("O"))||
                (boardOneText.equals("O")&&boardFiveText.equals("O")&&boardNineText.equals("O"))||
                (boardThreeText.equals("O")&&boardFiveText.equals("O")&&boardSevenText.equals("O"))){
            gameMsgText.setText(playerTwoName+" wins!");
            winner = playerTwoName;
            disableButtons();
        }
    }


    public void disableButtons(){
        board1.setOnClickListener(null);
        board2.setOnClickListener(null);
        board3.setOnClickListener(null);
        board4.setOnClickListener(null);
        board5.setOnClickListener(null);
        board6.setOnClickListener(null);
        board7.setOnClickListener(null);
        board8.setOnClickListener(null);
        board9.setOnClickListener(null);
    }


}
