public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Double> mhs = new Mahasiswa<String, Double>("Taufik H", "Malingping", 1234.0);

        mhs.print();

        Libmath<Integer, Double> math = new Libmath<Integer, Double>(10, 20.0);
        System.out.println("Hasil penjumlahan: " + math.add());

        Libmath<Double, Double> math2 = new Libmath<Double, Double>(10.0, 20.0);
        System.out.println("Hasil pengurangan: " + math2.sub());

        Triangle.hitungLuas(10, 20);
        System.out.print(Triangle.hitungkeliling(10, 20));
    }
}
