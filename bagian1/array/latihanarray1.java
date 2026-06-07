package bagian1.array;

public class latihanarray1 {
    public static void main(String[] args) {

        double[] suhu = {31.5, 29.0, 33.0, 28.5, 32.0, 30.5};

        double max = suhu[0];
        double min = suhu[0];

        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }

        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah : " + min);
    }
}