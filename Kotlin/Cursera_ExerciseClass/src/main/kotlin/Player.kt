open class Player (val name: String, val surName: String) {

    var totalScore=0;
    var personalBestScore=0;


    fun fullName(){
        println("${this.name} ${this.surName}");
    }
}