using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            MusicGenres genres = new MusicGenres();

            int count = 0;
            while (count < 5) {
                genres[count] = Console.ReadLine();
                count++;
            }

            for (int i = 0; i < 5; i++) {
                Console.WriteLine("Following: " + genres[i]);
            }
        }
    }

    class MusicGenres {
        private string[] genres = new string[5];

        // declare an indexer
        public string this[int idx] {
            get { return genres[idx]; }
            set { genres[idx] = value; }
        }
    }
}