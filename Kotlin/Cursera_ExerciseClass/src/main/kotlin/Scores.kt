class Scores (var BestPlayer: Player){
    var bestScoreGame: Int = 0
    fun BestScore(current: Int):Int{
        if(this.bestScoreGame<current){
            return current;
        }
        return this.bestScoreGame
    }
}