public class ratingfilm {

    public static void main(String[] args) {
        // Array untuk menyimpan rating
        int[][] rating = new int[3][4];

        // Mengisi nilai rating
        rating[0][0] = 4;
        rating[0][1] = 3;
        rating[0][2] = 4;
        rating[0][3] = 4;

        rating[1][0] = 1;
        rating[1][1] = 1;
        rating[1][2] = 2;
        rating[1][3] = 3;

        rating[2][0] = 1;
        rating[2][1] = 2;
        rating[2][2] = 3;
        rating[2][3] = 4;

        // Menghitung rata-rata rating setiap film
        float[] rataRataFilm = new float[4];
        for (int i = 0; i < rating[0].length; i++) {
            float totalRating = 0;
            for (int j = 0; j < rating.length; j++) {
                totalRating += rating[j][i];
            }
            rataRataFilm[i] = totalRating / rating.length;
        }

        // Menentukan rating film tertinggi dan terendah
        int filmTertinggi = 0;
        int filmTerendah = 0;
        for (int i = 1; i < rataRataFilm.length; i++) {
            if (rataRataFilm[i] > rataRataFilm[filmTertinggi]) {
                filmTertinggi = i;
            } else if (rataRataFilm[i] < rataRataFilm[filmTerendah]) {
                filmTerendah = i;
            }
        }

        // Menampilkan hasil
        for (int i = 0; i < rating.length; i++) {
            System.out.print("Baris " + (i + 1) + ": ");
            for (int j = 0; j < rating[0].length; j++) {
                System.out.print(rating[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < rataRataFilm.length; i++) {
            System.out.println("Rata-rata film " + (i + 1) + ": " + rataRataFilm[i]);
        }

        System.out.println();

        System.out.println("Film dengan rating tertinggi: Film " + (filmTertinggi + 1));
        System.out.println("Film dengan rating terendah: Film " + (filmTerendah + 1));
    }
}
