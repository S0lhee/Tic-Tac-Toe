package tictactoe

import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)

    var finished = true
    var oWins = false
    var xWins = false
    var draw = false
    var impossible = false
    var oCount = 0
    var xCount = 0
    var newStr = ""
    var currPlayer = 1 // 1 : X , -1 : O
    var player :Char

    var statusString = "_________"


    printStatus(statusString)

    while (!oWins && !xWins && !draw) {
        if (currPlayer == 1) {
            player = 'X'
        } else {
            player = 'O'
        }


        val inputToArray = statusString.toCharArray()


        val matrix = arrayOf(
            CharArray(3),
            CharArray(3),
            CharArray(3)
        )

        for (i: Int in 0..8) {
            matrix[i / 3][i % 3] = statusString[i]
        }


        var validInput = false
        while (!validInput) {
            print("Enter the coordinates: ")
            if (scanner.hasNextInt()) {
                val row = scanner.nextInt()
                val col = scanner.nextInt()

                if (row in 1..3 && col in 1..3) {
                    if (matrix[row - 1][col - 1] == '_') {
                        matrix[row - 1][col - 1] = player
                        inputToArray[(row - 1) * 3 + (col - 1)] = player
                        statusString = inputToArray.joinToString("")
                        validInput = true
                    } else {
                        println("This cell is occupied! Choose another one!")
                    }

                } else {
                    println("Coordinates should be 1 to 3!")
                }
            } else {
                println("You should enter numbers!")
            }
        }


        // Check Vertical $ Horizontal
        for (i in 0..2) {
            if (matrix[i][0] == 'O' && matrix[i][1] == 'O' && matrix[i][2] == 'O') {
                oWins = true
            }
            if (matrix[0][i] == 'O' && matrix[1][i] == 'O' && matrix[2][i] == 'O') {
                oWins = true
            }
            if (matrix[i][0] == 'X' && matrix[i][1] == 'X' && matrix[i][2] == 'X') {
                xWins = true
            }
            if (matrix[0][i] == 'X' && matrix[1][i] == 'X' && matrix[2][i] == 'X') {
                xWins = true
            }
        }
        // Check diagonal
        if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] ) {
            if (matrix[0][0] == 'O') {
                oWins = true
            } else if (matrix[0][0] == 'X') {
                xWins = true
            }
        }
        if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            if (matrix[0][2] == 'O') {
                oWins = true
            } else if (matrix[0][2] == 'X') {
                xWins = true
            }
        }

        finished = true
        for (row in 0..2) {
            for (col in 0..2) {
                if (matrix[row][col] == '_') {
                    finished = false
                }
            }
        }

/*
        if (abs(oCount - xCount) > 1) impossible = true
        if (oWins && xWins) impossible = true


        if (impossible) {
            println("Impossible")
        } else

 */
        printStatus(statusString)

        if (oWins) {
            println("O wins")
        } else if (xWins) {
            println("X wins")
        } else if (finished) {
            draw = true
            println("Draw")
        }

        // switch player
        currPlayer *= -1
    }


}

fun printStatus(inputString: String) {
    println("---------")
    println("| ${inputString[0]} ${inputString[1]} ${inputString[2]} |")
    println("| ${inputString[3]} ${inputString[4]} ${inputString[5]} |")
    println("| ${inputString[6]} ${inputString[7]} ${inputString[8]} |")
    println("---------")
}

