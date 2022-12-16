
type Rock = "A" | "X"
type Paper = "B" | "Y"
type Scissors = "C" | "Z"
type Play = Rock | Paper | Scissors

type Win = "Z"
type Draw = "Y"
type Lose = "X"
type Result = Win | Draw | Lose


def playToScore(a: Play): Int =
    a match {
        case _ : Rock => 1
        case _ : Paper => 2
        case _ : Scissors => 3
    }

var winScore = 6
var drawScore = 3
var lostScore = 0

def parseInput1(xs: Seq[String]): Seq[(Play,Play)] =
    xs.map(x => x.split(" ") match {
        case Array(a: Play, b: Play) => (a,b)
        case _ => throw new Exception("can't parse play " + x)
    })

def solvePlay1(a: Play, b: Play): Int = 
    (a, b) match {
        case (_: Rock, b: Rock) => drawScore + playToScore(b)
        case (_: Rock, b: Paper) => winScore + playToScore(b)
        case (_: Rock, b: Scissors) => lostScore + playToScore(b)

        case (_: Paper, b: Rock) =>  lostScore + playToScore(b)
        case (_: Paper, b: Paper) => drawScore + playToScore(b)
        case (_: Paper, b: Scissors) => winScore + playToScore(b)

        case (_: Scissors, b: Rock) => winScore + playToScore(b)
        case (_: Scissors, b: Paper) =>  lostScore + playToScore(b)
        case (_: Scissors, b: Scissors) => drawScore + playToScore(b)
    }

def parseInput2(xs: Seq[String]): Seq[(Play, Result)] =
    xs.map(x => x.split(" ") match {
        case Array(a: Play, b: Result) => (a,b)
        case _ => throw new Exception("can't parse play " + x)
    })

def solvePlay2(a: Play, b: Result): Int = 
    (a, b) match {
        case (_: Rock, b: Win) => winScore + playToScore("Y": Paper)
        case (_: Rock, b: Lose) => lostScore + playToScore("Z": Scissors)
        case (_: Rock, b: Draw) => drawScore + playToScore("X": Rock)

        case (_: Paper, b: Win) =>  winScore + playToScore("Z": Scissors)
        case (_: Paper, b: Lose) => lostScore + playToScore("X": Rock)
        case (_: Paper, b: Draw) => drawScore + playToScore("Y": Paper)

        case (_: Scissors, b: Win) => winScore + playToScore("X": Rock)
        case (_: Scissors, b: Lose) =>  lostScore + playToScore("Y": Paper)
        case (_: Scissors, b: Draw) => drawScore + playToScore("Z": Scissors)
    }


def solveDay2Part1(xs: Seq[String]): Int =
    parseInput1(xs)
        .map(solvePlay1)
        .reduce(_+_)

def solveDay2Part2(xs: Seq[String]): Int =
    parseInput2(xs)
        .map(solvePlay2)
        .reduce(_+_)