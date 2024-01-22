class hewan {

    String jenis;

    //konstruktor kelas dasar

    public hewan(String jenis) {
        this.jenis = jenis;
    }

    //metode kelas dasar

    void bersuara() {
        System.out.println("Sebuah hewan bersuara");

    }
}
//kelas turunan atau subclass

class kucing extends hewan {
    //konstruktor kelas turunan

    public kucing(String jenis) {
        super(jenis);
    } // memanggil kontruktor kelas dasar

    //metode kelas turunan yang meng-override metode kelas dasar

    @Override
    void bersuara() {
        System.out.println("Meow");

    }

    //metode kelas turunan tambahan
    
    void tidur() {
        System.out.println("kucing tidur...");}
}

class ContohPewarisan {
    public static void main(String[] args){

        //membuat objek dari kelas turunan
        kucing kucing = new kucing( "Persia");

        //mengakses atribut dari kelas dasar
        System.out.println("jenis kucing: " + kucing.jenis);

        //memanggil metode tambahan dari kelas turunan
        kucing.bersuara();
        //memanggil metode tambahan dari kelas turunan
        kucing.tidur();
    }
}
