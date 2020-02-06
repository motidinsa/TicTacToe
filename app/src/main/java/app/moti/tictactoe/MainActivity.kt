package app.moti.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    var playerOneMoves = ArrayList<Int>()
    var playerTwoMoves = ArrayList<Int>()

    var playerPointer: Int = 1

    fun HandleClick(view: View) {


        var gameOver: Boolean
        if (playerPointer == 1) {
            gameOver = GameOver(playerOneMoves)
        } else {
            gameOver = GameOver(playerTwoMoves)
        }

        if (!gameOver) {
            when (view) {
                findViewById<Button>(R.id.button) -> {

                    if (playerPointer == 1) {
                        playerOneMoves.add(1)
                        findViewById<Button>(R.id.button).text = "O"
                        playerPointer = 2
                        

                    } else {
                        playerTwoMoves.add(1)
                        findViewById<Button>(R.id.button).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button2) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(2)
                        findViewById<Button>(R.id.button2).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(2)
                        findViewById<Button>(R.id.button2).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button3) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(3)
                        findViewById<Button>(R.id.button3).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(3)
                        findViewById<Button>(R.id.button3).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button4) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(4)
                        findViewById<Button>(R.id.button4).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(4)
                        findViewById<Button>(R.id.button4).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button5) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(5)
                        findViewById<Button>(R.id.button5).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(5)
                        findViewById<Button>(R.id.button5).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button6) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(6)
                        findViewById<Button>(R.id.button6).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(6)
                        findViewById<Button>(R.id.button6).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button7) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(7)
                        findViewById<Button>(R.id.button7).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(7)
                        findViewById<Button>(R.id.button7).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button8) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(8)
                        findViewById<Button>(R.id.button8).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(8)
                        findViewById<Button>(R.id.button8).text = "X"
                        playerPointer = 1
                    }
                }
                findViewById<Button>(R.id.button9) -> {
                    if (playerPointer == 1) {
                        playerOneMoves.add(9)
                        findViewById<Button>(R.id.button9).text = "O"
                        playerPointer = 2

                    } else {
                        playerTwoMoves.add(9)
                        findViewById<Button>(R.id.button9).text = "X"
                        playerPointer = 1
                    }
                }
            }
        } else (
                Toast.makeText(this, "Player " + playerPointer + " wins", Toast.LENGTH_SHORT)
                )


    }

    fun GameOver(arrayList: ArrayList<Int>): Boolean {
        if (arrayList.size == 0) {
            return false
        } else {
            var i: Int = 0
            var ctr: Int = 0
            while (i < arrayList.size) {
                var ctr: Int = 0
                while (ctr < arrayList.size) {
                    if (arrayList.contains(1) && arrayList.contains(2) && arrayList.contains(3)) {
                        return true
                    } else if (arrayList.contains(4) && arrayList.contains(5) && arrayList.contains(
                            6
                        )
                    ) {
                        return true
                    } else if (arrayList.contains(7) && arrayList.contains(8) && arrayList.contains(
                            9
                        )
                    ) {
                        return true
                    } else if (arrayList.contains(1) && arrayList.contains(4) && arrayList.contains(
                            7
                        )
                    ) {
                        return true
                    } else if (arrayList.contains(2) && arrayList.contains(5) && arrayList.contains(
                            8
                        )
                    ) {
                        return true
                    } else if (arrayList.contains(3) && arrayList.contains(6) && arrayList.contains(
                            9
                        )
                    ) {
                        return true
                    } else if (arrayList.contains(1) && arrayList.contains(5) && arrayList.contains(
                            9
                        )
                    ) {
                        return true
                    } else if (arrayList.contains(3) && arrayList.contains(5) && arrayList.contains(
                            7
                        )
                    ) {
                        return true
                    }
                }
            }
            return false
        }
    }
}
