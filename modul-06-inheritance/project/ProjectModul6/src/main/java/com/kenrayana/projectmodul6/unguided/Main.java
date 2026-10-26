public class Main {
    public static void main(String[] args) {

        ModelRegresi regresi = new ModelRegresi(
                "Regresi Linier", 500, 4);

        ModelKlasifikasi klasifikasi = new ModelKlasifikasi(
                "Decision Tree", 800, 3);

        ModelDeepLearning deepLearning = new ModelDeepLearning(
                "Neural Network", 1000, 5, 3);

        ModelML[] daftarModel = {
            regresi,
            klasifikasi,
            deepLearning
        };

        int totalBiaya = 0;

        for (ModelML model : daftarModel) {
            model.tampilkanInfo();

            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println();

            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        System.out.println("Biaya 10 epoch (Neural Network): "
                + daftarModel[2].hitungBiaya(10));

        System.out.println("Biaya 10 epoch (Regresi Linier): "
                + daftarModel[0].hitungBiaya(10));

        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): "
                + regresi.hitungBiaya(10, 50));
    }
}
