//Exercise: determine whether each of these files will compile. If they won't compile, how would you fix them?

//A
//não compila, pois a variável song não foi inicializada

// class StreamingSong{

//     String title;
//     String artist;
//     int duration;

//     void play(){
//         System.out.println("Playing song");
//     }

//     void printDetails(){
//        System.out.println("This is " + title + " by " + artist); 
//     }
// }

// class StreamingSongTestDrive{
//     public static void main(String[] args){

//         StreamingSong song = new StreamingSong();
//         song.artist = "The Beatles";
//         song.title = "Come Together";
//         song.play();
//         song.printDetails();
//     }
// }

//B
//não compila, pois o método play não existe na classe Episode	

// class Episode{

//     int seriesNumber;
//     int episodeNumber;

//     void skipIntro(){
//         System.out.println("Skipping intro...");
//     }

//     void skipToNext(){
//         System.out.println("Loading next episode...");
//     }

//     void play(){
//         System.out.println("Playing episode " + episodeNumber);
//     }
// }

// class EpisodeTestDrive{
//     public static void main(String[] args){

//         Episode episode = new Episode();
//         episode.seriesNumber = 4;
//         episode.play();
//         episode.skipIntro();
//     }
// }